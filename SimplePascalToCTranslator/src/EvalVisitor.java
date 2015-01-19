import org.antlr.v4.runtime.misc.NotNull;

public class EvalVisitor extends PascalGrammarBaseVisitor<Integer> {
	private boolean isMainFunction = false;

	@Override
	public Integer visitProgDef(@NotNull PascalGrammarParser.ProgDefContext ctx) {
		System.out.println("//Programm name: " + ctx.ID());
		return visitChildren(ctx);
	}

	@Override
	public Integer visitVarDef(@NotNull PascalGrammarParser.VarDefContext ctx) {
		if (ctx.typeIdentifier().getText().startsWith("INTEGER"))
			System.out.print("int ");
		System.out.println(ctx.idList().getText() + ";");
		return visitChildren(ctx);
	}

	@Override
	public Integer visitProgram(@NotNull PascalGrammarParser.ProgramContext ctx) {
		isMainFunction = true;
		System.out.println("#include <stdio.h>");
		return visitChildren(ctx);
	}

	@Override
	public Integer visitBlock(@NotNull PascalGrammarParser.BlockContext ctx) {
		if (isMainFunction) {
			System.out.print("void main()");
			isMainFunction = false;
		}
		System.out.println("\n{");
		Integer ret = visitChildren(ctx);
		System.out.println("};");
		return ret;
	}

	@Override
	public Integer visitAssignment(
			@NotNull PascalGrammarParser.AssignmentContext ctx) {
		System.out.println(ctx.ID().getText() + "="
				+ ctx.expression().getText() + ";");
		return visitChildren(ctx);
	}

	// TODO: проверка типов выводимого значения
	@Override
	public Integer visitOutput(@NotNull PascalGrammarParser.OutputContext ctx) {
		String expr = "";
		if (ctx.expression() == null) {
			expr = ctx.ID().getText();
		} else {
			expr = ctx.expression().getText();
		}

		System.out.print("printf(\"%i");

		if (ctx.getChild(0).getText().startsWith("WRITELN"))
			System.out.print("\\n");

		System.out.println("\", " + expr + ");");

		return visitChildren(ctx);
	}

	@Override
	public Integer visitStatement(
			@NotNull PascalGrammarParser.StatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Integer visitWhile_statement(
			@NotNull PascalGrammarParser.While_statementContext ctx) {
		System.out.print("while (" + ctx.expression().getText() + ")");
		Integer ret = visitChildren(ctx);
		return ret;
	}

}