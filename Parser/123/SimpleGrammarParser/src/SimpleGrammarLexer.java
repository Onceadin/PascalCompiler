// Generated from SimpleGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, VAR=4, PLUS=5, MINUS=6, MULT=7, DIV=8, DOT=9, 
		SEMI=10, COLON=11, COMMA=12, ASSIGN=13, INTEGER=14, LPAR=15, RPAR=16, 
		NUM_INT=17, ID=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "BEGIN", "END", "VAR", "PLUS", "MINUS", "MULT", "DIV", "DOT", 
		"SEMI", "COLON", "COMMA", "ASSIGN", "INTEGER", "LPAR", "RPAR", "NUM_INT", 
		"ID", "WS"
	};


	public SimpleGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22`\n\22\r\22\16\22a\3"+
		"\23\3\23\7\23f\n\23\f\23\16\23i\13\23\3\24\6\24l\n\24\r\24\16\24m\3\24"+
		"\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\5\4\2C\\c|\6\2\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\61\3\2\2\2\7"+
		"\67\3\2\2\2\t;\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2"+
		"\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35R\3\2\2"+
		"\2\37Z\3\2\2\2!\\\3\2\2\2#_\3\2\2\2%c\3\2\2\2\'k\3\2\2\2)*\7R\2\2*+\7"+
		"T\2\2+,\7Q\2\2,-\7I\2\2-.\7T\2\2./\7C\2\2/\60\7O\2\2\60\4\3\2\2\2\61\62"+
		"\7D\2\2\62\63\7G\2\2\63\64\7I\2\2\64\65\7K\2\2\65\66\7P\2\2\66\6\3\2\2"+
		"\2\678\7G\2\289\7P\2\29:\7F\2\2:\b\3\2\2\2;<\7X\2\2<=\7C\2\2=>\7T\2\2"+
		">\n\3\2\2\2?@\7-\2\2@\f\3\2\2\2AB\7/\2\2B\16\3\2\2\2CD\7,\2\2D\20\3\2"+
		"\2\2EF\7\61\2\2F\22\3\2\2\2GH\7\60\2\2H\24\3\2\2\2IJ\7=\2\2J\26\3\2\2"+
		"\2KL\7<\2\2L\30\3\2\2\2MN\7.\2\2N\32\3\2\2\2OP\7<\2\2PQ\7?\2\2Q\34\3\2"+
		"\2\2RS\7K\2\2ST\7P\2\2TU\7V\2\2UV\7G\2\2VW\7I\2\2WX\7G\2\2XY\7T\2\2Y\36"+
		"\3\2\2\2Z[\7*\2\2[ \3\2\2\2\\]\7+\2\2]\"\3\2\2\2^`\4\62;\2_^\3\2\2\2`"+
		"a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b$\3\2\2\2cg\t\2\2\2df\t\3\2\2ed\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h&\3\2\2\2ig\3\2\2\2jl\t\4\2\2kj\3\2\2\2"+
		"lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\24\2\2p(\3\2\2\2\6\2agm\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}