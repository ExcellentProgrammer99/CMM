// Intro to ANTLR+LLVM
// sawickib, 2014-04-26

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // ANTLRFileStream input = new ANTLRFileStream(args[0]);

        // CMMLexer lexer = new CMMLexer(input);

        // CommonTokenStream tokens = new CommonTokenStream(lexer);
        // DemoParser parser = new DemoParser(tokens);

        // ParseTree tree = parser.prog(); 

        // //System.out.println(tree.toStringTree(parser));

        // ParseTreeWalker walker = new ParseTreeWalker();
        // walker.walk(new LLVMActions(), tree);

        try{
            CharStream input = CharStreams.fromFileName(args[0]);
            CMMLexer lexer = new CMMLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CMMParser parser = new CMMParser(tokens);
            LLVMActions listener = new LLVMActions();

            var tree = parser.prog();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            System.out.print("Compilation successful");
        }
        catch(java.lang.Exception e){
            System.out.println(e.toString());
            System.out.print("Error reading file " + args[0]);
            System.exit(1);
        }

    }
}
