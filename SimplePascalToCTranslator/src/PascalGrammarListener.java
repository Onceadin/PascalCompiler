// Generated from PascalGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalGrammarParser}.
 */
public interface PascalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(@NotNull PascalGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(@NotNull PascalGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PascalGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PascalGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#progDef}.
	 * @param ctx the parse tree
	 */
	void enterProgDef(@NotNull PascalGrammarParser.ProgDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#progDef}.
	 * @param ctx the parse tree
	 */
	void exitProgDef(@NotNull PascalGrammarParser.ProgDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(@NotNull PascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(@NotNull PascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PascalGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PascalGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull PascalGrammarParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull PascalGrammarParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(@NotNull PascalGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(@NotNull PascalGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void enterVarDefList(@NotNull PascalGrammarParser.VarDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void exitVarDefList(@NotNull PascalGrammarParser.VarDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull PascalGrammarParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull PascalGrammarParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull PascalGrammarParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull PascalGrammarParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PascalGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PascalGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#varDefs}.
	 * @param ctx the parse tree
	 */
	void enterVarDefs(@NotNull PascalGrammarParser.VarDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#varDefs}.
	 * @param ctx the parse tree
	 */
	void exitVarDefs(@NotNull PascalGrammarParser.VarDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(@NotNull PascalGrammarParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(@NotNull PascalGrammarParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull PascalGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull PascalGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PascalGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PascalGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull PascalGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull PascalGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull PascalGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull PascalGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(@NotNull PascalGrammarParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(@NotNull PascalGrammarParser.UnsignedConstantContext ctx);
}