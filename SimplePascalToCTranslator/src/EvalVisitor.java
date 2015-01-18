import org.antlr.v4.runtime.misc.NotNull;

public class EvalVisitor extends PascalGrammarBaseVisitor<Integer> {

	@Override
	public Integer visitStatement(@NotNull PascalGrammarParser.StatementContext ctx){
		System.out.print("\n"+ctx.ID()+"=");
		return visitChildren(ctx); 
	}	
	
	@Override 
	public Integer visitFactor(@NotNull PascalGrammarParser.FactorContext ctx) {
		System.out.print(ctx.ID()+" ");
		return visitChildren(ctx); 
	}
	
}