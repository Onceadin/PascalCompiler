// Generated from LabeledExpr.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull LabeledExprParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(@NotNull LabeledExprParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#varDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefs(@NotNull LabeledExprParser.VarDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull LabeledExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull LabeledExprParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(@NotNull LabeledExprParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(@NotNull LabeledExprParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(@NotNull LabeledExprParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull LabeledExprParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(@NotNull LabeledExprParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(@NotNull LabeledExprParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(@NotNull LabeledExprParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull LabeledExprParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull LabeledExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#varDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefList(@NotNull LabeledExprParser.VarDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(@NotNull LabeledExprParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#progDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgDef(@NotNull LabeledExprParser.ProgDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull LabeledExprParser.DeclarationsContext ctx);
}