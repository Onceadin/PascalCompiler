// Generated from PascalGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(@NotNull PascalGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PascalGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#progDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgDef(@NotNull PascalGrammarParser.ProgDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull PascalGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(@NotNull PascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PascalGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(@NotNull PascalGrammarParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(@NotNull PascalGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#varDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefList(@NotNull PascalGrammarParser.VarDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull PascalGrammarParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(@NotNull PascalGrammarParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull PascalGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(@NotNull PascalGrammarParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull PascalGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#varDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefs(@NotNull PascalGrammarParser.VarDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(@NotNull PascalGrammarParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(@NotNull PascalGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull PascalGrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PascalGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull PascalGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull PascalGrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull PascalGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(@NotNull PascalGrammarParser.UnsignedConstantContext ctx);
}