import org.antlr.v4.runtime.misc.NotNull;

public class EvalVisitor extends PascalGrammarBaseVisitor<Integer> {
	private boolean isMainFunction = false;
	
	@Override 
	public Integer visitProgDef(@NotNull PascalGrammarParser.ProgDefContext ctx) {
		System.out.println("//Programm name: "+ctx.ID());
		return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitVarDef(@NotNull PascalGrammarParser.VarDefContext ctx) {
		if (ctx.typeIdentifier().getText().startsWith("INTEGER"))
			System.out.print("int ");
		System.out.println(ctx.idList().getText()+";");
		return visitChildren(ctx); 
	}
	
	@Override
	public Integer visitProgram(@NotNull PascalGrammarParser.ProgramContext ctx) {
		isMainFunction = true;
		return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitBlock(@NotNull PascalGrammarParser.BlockContext ctx) {
		if(isMainFunction){
			System.out.print("void main()");
			isMainFunction = false;
		}
		System.out.println("\n{");
		Integer ret = visitChildren(ctx);
		System.out.println("}");
		return ret;
	}

	@Override
	public Integer visitStatement(@NotNull PascalGrammarParser.StatementContext ctx){
		System.out.println(ctx.ID().getText()+"="+ctx.expression().getText()+";");
		return visitChildren(ctx);
	}	
}