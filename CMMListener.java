// Generated from CMM.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMParser}.
 */
public interface CMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CMMParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CMMParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CMMParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CMMParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#reader}.
	 * @param ctx the parse tree
	 */
	void enterReader(CMMParser.ReaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#reader}.
	 * @param ctx the parse tree
	 */
	void exitReader(CMMParser.ReaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#writer}.
	 * @param ctx the parse tree
	 */
	void enterWriter(CMMParser.WriterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#writer}.
	 * @param ctx the parse tree
	 */
	void exitWriter(CMMParser.WriterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CMMParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CMMParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#create_an_array_expression}.
	 * @param ctx the parse tree
	 */
	void enterCreate_an_array_expression(CMMParser.Create_an_array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#create_an_array_expression}.
	 * @param ctx the parse tree
	 */
	void exitCreate_an_array_expression(CMMParser.Create_an_array_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#nextStrExpression}.
	 * @param ctx the parse tree
	 */
	void enterNextStrExpression(CMMParser.NextStrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#nextStrExpression}.
	 * @param ctx the parse tree
	 */
	void exitNextStrExpression(CMMParser.NextStrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#nextIntExpression}.
	 * @param ctx the parse tree
	 */
	void enterNextIntExpression(CMMParser.NextIntExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#nextIntExpression}.
	 * @param ctx the parse tree
	 */
	void exitNextIntExpression(CMMParser.NextIntExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#nextDoubleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNextDoubleExpression(CMMParser.NextDoubleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#nextDoubleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNextDoubleExpression(CMMParser.NextDoubleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#anyoperation}.
	 * @param ctx the parse tree
	 */
	void enterAnyoperation(CMMParser.AnyoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#anyoperation}.
	 * @param ctx the parse tree
	 */
	void exitAnyoperation(CMMParser.AnyoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#indexExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpression(CMMParser.IndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#indexExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpression(CMMParser.IndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CMMParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CMMParser.PrintContext ctx);
}