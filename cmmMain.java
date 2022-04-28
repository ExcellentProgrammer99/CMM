import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class cmmMain {
    public static void main(String[] args){
        // ANTRLFileStream input = new ANTLRFileStream(args[0]);
        try{
            CharStream input = CharStreams.fromFileName(args[0]);
            CMMLexer lexer = new CMMLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CMMParser parser = new CMMParser(tokens);
            LLVMActions listener = new LLVMActions();

            var tree = parser.stat();

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