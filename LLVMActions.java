
import java.util.HashMap;
import java.util.Stack;

enum VarType{ INT, DOUBLE, UNKNOWN }

class Value{ 
	public String name;
	public VarType type;
	public Value( String name, VarType type ){
		this.name = name;
		this.type = type;
	}
}

public class LLVMActions extends CMMBaseListener {
    
    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();

    @Override
    public void exitAssignment(CMMParser.AssignmentContext ctx) {
       System.out.println("Assign!");
       String ID = ctx.ID().getText();
       System.out.println("getTexted");
      //  System.out.println("STRING: " + ctx.STRING().getText());
       System.out.println("ID: " + ctx.ID().getText());
      //  System.out.println("EQ: " + ctx.EQ().getText());
      //  System.out.println("STR: " + ctx.STR().getText());
       Value v = stack.pop();
       System.out.print("putID");
       variables.put(ID, v.type);
       System.out.print("AAAA");
       if( v.type == VarType.INT ){
          System.out.print("BBBB");
         LLVMGenerator.declare_i32(ID);
         LLVMGenerator.assign_i32(ID, v.name);
         System.out.print("CCCC");
       } 
       if( v.type == VarType.DOUBLE ){
          System.out.print("DDDD");
         LLVMGenerator.declare_double(ID);
         LLVMGenerator.assign_double(ID, v.name);
         System.out.print("EEEE");
       } 
    }

    @Override 
    public void exitStat(CMMParser.StatContext ctx) { 
       System.out.println("-------- compiling! --------"); // TODO remove
       System.out.println( LLVMGenerator.generate() );
    }

    @Override 
    public void exitNextIntExpression(CMMParser.NextIntExpressionContext ctx) {
         System.out.print("nextINT!");
         stack.push( new Value(ctx.INT().getText(), VarType.INT) );       
    } 

    @Override 
    public void exitNextDoubleExpression(CMMParser.NextDoubleExpressionContext ctx) { 
         System.out.print("nextDBL!");
         stack.push( new Value(ctx.DBL().getText(), VarType.DOUBLE) );       // ctx.DOUBLE
    } 
   ///////////////////////// AnyoperationContext - should it be changed? ////////////
    /* @Override 
    public void exitAdd(DemoParser.AddContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.add_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.DOUBLE ){
             LLVMGenerator.add_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "add type mismatch");
       }
    }

    @Override 
    public void exitMult(DemoParser.MultContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.mult_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.DOUBLE ){
             LLVMGenerator.mult_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "mult type mismatch");
       }
    } */
    //////////////////////////////No cast implementation///////////////////////////////////
    /* @Override 
    public void exitToint(DemoParser.TointContext ctx) { 
       Value v = stack.pop();
       LLVMGenerator.fptosi( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
    }

    @Override 
    public void exitToDouble(DemoParser.TorealContext ctx) { 
       Value v = stack.pop();
       LLVMGenerator.sitofp( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.DOUBLE) ); 
    } */
    //////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void exitPrint(CMMParser.PrintContext ctx) {
       String ID = ctx.ID().getText();
       VarType type = variables.get(ID);
       if( type != null ) {
          if( type == VarType.INT ){
            LLVMGenerator.printf_i32( ID );
          }
          if( type == VarType.DOUBLE ){
            LLVMGenerator.printf_double( ID );
          }
       } else {
          error(ctx.getStart().getLine(), "unknown variable "+ID);
       }
    } 

   void error(int line, String msg){
       System.err.println("Error, line "+line+", "+msg);
       System.exit(1);
   } 
       
}
