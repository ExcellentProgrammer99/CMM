import java.util.HashSet;
import java.util.HashMap;
import java.util.Stack;

enum VarType {
   INT, DBL, UNKNOWN
}

class Value {
   public String name;
   public VarType type;

   public Value(String name, VarType type) {
      this.name = name;
      this.type = type;
   }
}

public class LLVMActions extends CMMBaseListener {

   Stack<Value> stack = new Stack<Value>();
   HashMap<String, VarType> variables = new HashMap<String, VarType>();
   HashSet<String> globalnames = new HashSet<String>();
   HashSet<String> functions = new HashSet<String>();
   HashSet<String> localnames = new HashSet<String>();
   String value;
   String function;
   Boolean global;

   
   @Override
   public void enterProg(CMMParser.ProgContext ctx) {
      global = true;
   }

   @Override
   public void exitProg(CMMParser.ProgContext ctx) {
      if( ctx.getParent() instanceof CMMParser.RepeatContext ){
         LLVMGenerator.repeatend();
      }
      LLVMGenerator.close_main();
      System.out.println("--------compiling!--------");
      System.out.println(LLVMGenerator.generate());
   }

   @Override
   public void exitFparam(CMMParser.FparamContext ctx) {
      String ID = ctx.ID().getText();
      functions.add(ID);
      function = ID;
      LLVMGenerator.functionstart(ID);
   }

   @Override
   public void enterFblock(CMMParser.FblockContext ctx) {
      global = false;
   }

   
   @Override
   public void exitFblock(CMMParser.FblockContext ctx) {
      if (!localnames.contains(function)) {
         LLVMGenerator.assign(set_variable(function), "0");
      }
      LLVMGenerator.load("%" + function);
      LLVMGenerator.functionend();
      localnames = new HashSet<String>();
      global = true;
   }
   

   @Override
   public void exitIf(CMMParser.IfContext ctx) {
   }

   @Override
   public void enterBlockif(CMMParser.BlockifContext ctx) {
      LLVMGenerator.ifstart();
   }

   @Override
   public void exitBlockif(CMMParser.BlockifContext ctx) {
      LLVMGenerator.ifend();
   }

   @Override
   public void exitRepetitions(CMMParser.RepetitionsContext ctx) {
      LLVMGenerator.repeatstart(value);
   }

   // @Override
   // public void exitProg(CMMParser.ProgContext ctx) {
   //    if (ctx.getParent() instanceof CMMParser.RepeatContext) {
   //       LLVMGenerator.repeatend();
   //    }
   // }
   

   @Override
   public void exitEqual(CMMParser.EqualContext ctx) {
      String ID = ctx.ID().getText();
      String INT = ctx.INT().getText();
      if (variables.containsKey(ID)) {
         LLVMGenerator.icmp(ID, INT);
      } else {
         ctx.getStart().getLine();
         System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
      }
   }

   @Override
   public void exitAssign(CMMParser.AssignContext ctx) {
      System.out.println("Assign!");
      String ID = ctx.ID().getText();
      System.out.println("getTexted");
      // System.out.println("STRING: " + ctx.STRING().getText());
      System.out.println("ID: " + ctx.ID().getText());
      // System.out.println("EQ: " + ctx.EQ().getText());
      // System.out.println("STR: " + ctx.STR().getText());
      // LLVMGenerator.assign(set_variable(ID), value);
      Value v = stack.pop();
      System.out.println("LECIMY TUTAJ");

      System.out.print("putID");
      variables.put(ID, v.type);
      System.out.print("AAAA");
      if (v.type == VarType.INT) {
         System.out.print("BBBB");
         LLVMGenerator.declare_i32(ID);
         LLVMGenerator.assign_i32(ID, v.name);
         System.out.print("CCCC");
      }
      if (v.type == VarType.DBL) {
         System.out.print("DDDD");
         LLVMGenerator.declare_double(ID);
         LLVMGenerator.assign_double(ID, v.name);
         System.out.print("EEEE");
      }
   }
////////
   // @Override
   // public void exitStat(CMMParser.StatContext ctx) {
   //    System.out.println("-------- compiling! --------"); // TODO remove
   //    System.out.println(LLVMGenerator.generate());
   // }

   // @Override
   // public void exitNextIntExpression(CMMParser.NextIntExpressionContext ctx) {
   //    System.out.print("nextINT!");
   //    stack.push(new Value(ctx.INT().getText(), VarType.INT));
   // }

   // @Override
   // public void exitNextDoubleExpression(CMMParser.NextDoubleExpressionContext ctx) {
   //    System.out.print("nextDBL!");
   //    stack.push(new Value(ctx.DBL().getText(), VarType.DBL)); // ctx.DOUBLE
   // }

   @Override
   public void exitWrite(CMMParser.WriteContext ctx) {
      String ID = ctx.ID().getText();
      if (variables.containsKey(ID)) {
         LLVMGenerator.printf(ID);
      } else {
         ctx.getStart().getLine();
         System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
      }
   }

   @Override
   public void exitRead(CMMParser.ReadContext ctx) {
      String ID = ctx.ID().getText();
      if (!variables.containsKey(ID)) {
         variables.put(ID, VarType.INT);  // TODO tymczasowo wrzucony VarType.INT
         LLVMGenerator.declare_i32(ID);

      }
      LLVMGenerator.scanf(ID);
      LLVMGenerator.scanf(set_variable(ID));
   }

   @Override 
      public void exitInt(CMMParser.IntContext ctx) { 
         stack.push( new Value(ctx.INT().getText(), VarType.INT) );       
      } 

      @Override 
      public void exitReal(CMMParser.RealContext ctx) { 
         stack.push( new Value(ctx.REAL().getText(), VarType.DBL) );       
      }

      @Override 
      public void exitAdd(CMMParser.AddContext ctx) { 
         Value v1 = stack.pop();
         Value v2 = stack.pop();
         if( v1.type == v2.type ) {
      if( v1.type == VarType.INT ){
               LLVMGenerator.add_i32(v1.name, v2.name); 
               stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
            }
      if( v1.type == VarType.DBL ){
               LLVMGenerator.add_double(v1.name, v2.name); 
               stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DBL) ); 
         }
         } else {
            error(ctx.getStart().getLine(), "add type mismatch");
         }
      }

      @Override 
      public void exitMult(CMMParser.MultContext ctx) { 
         Value v1 = stack.pop();
         Value v2 = stack.pop();
         if( v1.type == v2.type ) {
      if( v1.type == VarType.INT ){
               LLVMGenerator.mult_i32(v1.name, v2.name); 
               stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
            }
      if( v1.type == VarType.DBL ){
               LLVMGenerator.mult_double(v1.name, v2.name); 
               stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DBL) ); 
         }
         } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
         }
      }

   ///////////////////////// AnyoperationContext - should it be changed?
   ///////////////////////// ////////////
   /*
    * @Override
    * public void exitAdd(CMMParser.AddContext ctx) {
    * Value v1 = stack.pop();
    * Value v2 = stack.pop();
    * if( v1.type == v2.type ) {
    * if( v1.type == VarType.INT ){
    * LLVMGenerator.add_i32(v1.name, v2.name);
    * stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
    * }
    * if( v1.type == VarType.DOUBLE ){
    * LLVMGenerator.add_double(v1.name, v2.name);
    * stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) );
    * }
    * } else {
    * error(ctx.getStart().getLine(), "add type mismatch");
    * }
    * }
    * 
    * @Override
    * public void exitMult(CMMParser.MultContext ctx) {
    * Value v1 = stack.pop();
    * Value v2 = stack.pop();
    * if( v1.type == v2.type ) {
    * if( v1.type == VarType.INT ){
    * LLVMGenerator.mult_i32(v1.name, v2.name);
    * stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
    * }
    * if( v1.type == VarType.DOUBLE ){
    * LLVMGenerator.mult_double(v1.name, v2.name);
    * stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) );
    * }
    * } else {
    * error(ctx.getStart().getLine(), "mult type mismatch");
    * }
    * }
    */
   ////////////////////////////// No cast
   ////////////////////////////// implementation///////////////////////////////////
   /*
    * @Override
    * public void exitToint(CMMParser.TointContext ctx) {
    * Value v = stack.pop();
    * LLVMGenerator.fptosi( v.name );
    * stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
    * }
    * 
    * @Override
    * public void exitToDouble(CMMParser.TorealContext ctx) {
    * Value v = stack.pop();
    * LLVMGenerator.sitofp( v.name );
    * stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) );
    * }
    */
   //////////////////////////////////////////////////////////////////////////////////////

   @Override
   public void exitPrint(CMMParser.PrintContext ctx) {
      String ID = ctx.ID().getText();
      VarType type = variables.get(ID);
      if (type != null) {
         if (type == VarType.INT) {
            LLVMGenerator.printf_i32(ID);
         }
         if (type == VarType.DBL) {
            LLVMGenerator.printf_double(ID);
         }
      } else {
         error(ctx.getStart().getLine(), "unknown variable " + ID);
      }
   }

   public String set_variable(String ID) {
      String id;
      if (global) {
         if (!globalnames.contains(ID)) {
            globalnames.add(ID);
            LLVMGenerator.declare(ID, true);
         }
         id = "@" + ID;
      } else {
         if (!localnames.contains(ID)) {
            localnames.add(ID);
            LLVMGenerator.declare(ID, false);
         }
         id = "%" + ID;
      }
      return id;
   }

   
   @Override
   public void exitValue(CMMParser.ValueContext ctx) {
      if (ctx.ID() != null) {
         String ID = ctx.ID().getText();

         if (localnames.contains(ID)) {
            LLVMGenerator.load("%" + ID);
         } else if (globalnames.contains(ID)) {
            LLVMGenerator.load("@" + ID);
         } else if (functions.contains(ID)) {
            LLVMGenerator.call(ID);
         } else {
            error(ctx.getStart().getLine(), "Unknown " + ID + ": local > global > function");
         }
         value = "%" + (LLVMGenerator.tmp - 1);
      }

      if (ctx.INT() != null) {
         value = ctx.INT().getText();
      }
   }

   void error(int line, String msg) {
      System.err.println("Error, line " + line + ", " + msg);
      System.exit(1);
   }

}
