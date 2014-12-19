package pascalCompiler;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Test {

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		// create a lexer that feeds off of input CharStream
		MyParserLexer lexer = new MyParserLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		MyParserParser parser = new MyParserParser(tokens);
		//ParseTree tree = parser.; // begin parsing at init rule
		//System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		
		
	}

}
