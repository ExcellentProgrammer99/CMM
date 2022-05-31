// Generated from CMM.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMParser}.
 */
public interface CMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CMMParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CMMParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(CMMParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(CMMParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(CMMParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(CMMParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CMMParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CMMParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCall(CMMParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCall(CMMParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(CMMParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(CMMParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CMMParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CMMParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(CMMParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(CMMParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(CMMParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(CMMParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(CMMParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(CMMParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link CMMParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(CMMParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link CMMParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(CMMParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link CMMParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CMMParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CMMParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CMMParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link CMMParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(CMMParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link CMMParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(CMMParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CMMParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(CMMParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CMMParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(CMMParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterID(CMMParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitID(CMMParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterString(CMMParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitString(CMMParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(CMMParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(CMMParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(CMMParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(CMMParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(CMMParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(CMMParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(CMMParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(CMMParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(CMMParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(CMMParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterArray(CMMParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link CMMParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitArray(CMMParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(CMMParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(CMMParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CMMParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CMMParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(CMMParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(CMMParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(CMMParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(CMMParser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(CMMParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(CMMParser.FblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CMMParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CMMParser.ValueContext ctx);
}