import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class TranslatorProject {
	
	public static void main(String[] args) throws Exception {
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		PascalGrammarLexer lexer = new PascalGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PascalGrammarParser parser = new PascalGrammarParser(tokens);
		ParseTree tree = parser.program(); // parse
		//System.out.println(tree.toStringTree(parser)); // print tree as text
		EvalVisitor eval = new EvalVisitor();
		eval.visit(tree);
	}
}
