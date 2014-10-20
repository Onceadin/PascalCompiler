// Generated from MyParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParserParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MyParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MyParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(@NotNull MyParserParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(@NotNull MyParserParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#varDefs}.
	 * @param ctx the parse tree
	 */
	void enterVarDefs(@NotNull MyParserParser.VarDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#varDefs}.
	 * @param ctx the parse tree
	 */
	void exitVarDefs(@NotNull MyParserParser.VarDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MyParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MyParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull MyParserParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull MyParserParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull MyParserParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull MyParserParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(@NotNull MyParserParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(@NotNull MyParserParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull MyParserParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull MyParserParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MyParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MyParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull MyParserParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull MyParserParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull MyParserParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull MyParserParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(@NotNull MyParserParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(@NotNull MyParserParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(@NotNull MyParserParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(@NotNull MyParserParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull MyParserParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull MyParserParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MyParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MyParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void enterVarDefList(@NotNull MyParserParser.VarDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#varDefList}.
	 * @param ctx the parse tree
	 */
	void exitVarDefList(@NotNull MyParserParser.VarDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(@NotNull MyParserParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(@NotNull MyParserParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#progDef}.
	 * @param ctx the parse tree
	 */
	void enterProgDef(@NotNull MyParserParser.ProgDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#progDef}.
	 * @param ctx the parse tree
	 */
	void exitProgDef(@NotNull MyParserParser.ProgDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull MyParserParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull MyParserParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull MyParserParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull MyParserParser.DeclarationsContext ctx);
}