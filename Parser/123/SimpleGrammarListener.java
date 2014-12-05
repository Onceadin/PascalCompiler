// Generated from SimpleGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleGrammarParser}.
 */
public interface SimpleGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(@NotNull SimpleGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(@NotNull SimpleGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SimpleGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SimpleGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#progDef}.
	 * @param ctx the parse tree
	 */
	void enterProgDef(@NotNull SimpleGrammarParser.ProgDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#progDef}.
	 * @param ctx the parse tree
	 */
	void exitProgDef(@NotNull SimpleGrammarParser.ProgDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(@NotNull SimpleGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(@NotNull SimpleGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull SimpleGrammarParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull SimpleGrammarParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(@NotNull SimpleGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(@NotNull SimpleGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void enterVarDefList(@NotNull SimpleGrammarParser.VarDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void exitVarDefList(@NotNull SimpleGrammarParser.VarDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull SimpleGrammarParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull SimpleGrammarParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull SimpleGrammarParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull SimpleGrammarParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimpleGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimpleGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#varDefs}.
	 * @param ctx the parse tree
	 */
	void enterVarDefs(@NotNull SimpleGrammarParser.VarDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#varDefs}.
	 * @param ctx the parse tree
	 */
	void exitVarDefs(@NotNull SimpleGrammarParser.VarDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(@NotNull SimpleGrammarParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(@NotNull SimpleGrammarParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull SimpleGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull SimpleGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimpleGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimpleGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull SimpleGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull SimpleGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull SimpleGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull SimpleGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(@NotNull SimpleGrammarParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(@NotNull SimpleGrammarParser.UnsignedConstantContext ctx);
}