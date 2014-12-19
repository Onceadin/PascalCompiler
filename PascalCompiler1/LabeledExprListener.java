import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull LabeledExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull LabeledExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull LabeledExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull LabeledExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull LabeledExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull LabeledExprParser.StatContext ctx);
}
