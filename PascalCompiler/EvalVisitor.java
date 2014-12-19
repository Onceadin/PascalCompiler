


public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {

	@Override
	public Integer visitExpression(LabeledExprParser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}

	@Override
	public Integer visitUnsignedNumber(LabeledExprParser.UnsignedNumberContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("BOOOOOOOOOBSas");
		return super.visitUnsignedNumber(ctx);
	}

	@Override
	public Integer visitVarDefs(LabeledExprParser.VarDefsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVarDefs(ctx);
	}

	@Override
	public Integer visitBlock(LabeledExprParser.BlockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBlock(ctx);
	}

	@Override
	public Integer visitFactor(LabeledExprParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFactor(ctx);
	}

	@Override
	public Integer visitIdList(LabeledExprParser.IdListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdList(ctx);
	}

	@Override
	public Integer visitVarDef(LabeledExprParser.VarDefContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVarDef(ctx);
	}

	@Override
	public Integer visitStatementList(LabeledExprParser.StatementListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatementList(ctx);
	}

	@Override
	public Integer visitStatement(LabeledExprParser.StatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	@Override
	public Integer visitTypeIdentifier(LabeledExprParser.TypeIdentifierContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTypeIdentifier(ctx);
	}

	@Override
	public Integer visitUnsignedInteger(LabeledExprParser.UnsignedIntegerContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnsignedInteger(ctx);
	}

	@Override
	public Integer visitUnsignedConstant(LabeledExprParser.UnsignedConstantContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnsignedConstant(ctx);
	}

	@Override
	public Integer visitTerm(LabeledExprParser.TermContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTerm(ctx);
	}

	@Override
	public Integer visitProgram(LabeledExprParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProgram(ctx);
	}

	@Override
	public Integer visitVarDefList(LabeledExprParser.VarDefListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVarDefList(ctx);
	}

	@Override
	public Integer visitSimpleExpression(LabeledExprParser.SimpleExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSimpleExpression(ctx);
	}

	@Override
	public Integer visitProgDef(LabeledExprParser.ProgDefContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProgDef(ctx);
	}

	@Override
	public Integer visitDeclarations(LabeledExprParser.DeclarationsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclarations(ctx);
	}
	
}