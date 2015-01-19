// Generated from PascalGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, WRITE=3, WRITELN=4, READ=5, READLN=6, END=7, VAR=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, DOT=13, SEMI=14, COLON=15, COMMA=16, 
		ASSIGN=17, INTEGER=18, LPAR=19, RPAR=20, WHILE=21, DO=22, IF=23, NUM_INT=24, 
		ID=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "BEGIN", "WRITE", "WRITELN", "READ", "READLN", "END", "VAR", 
		"PLUS", "MINUS", "MULT", "DIV", "DOT", "SEMI", "COLON", "COMMA", "ASSIGN", 
		"INTEGER", "LPAR", "RPAR", "WHILE", "DO", "IF", "NUM_INT", "ID", "WS"
	};


	public PascalGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PascalGrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\6\31\u0094\n\31\r\31\16\31\u0095\3\32\3\32\7\32\u009a\n"+
		"\32\f\32\16\32\u009d\13\32\3\33\6\33\u00a0\n\33\r\33\16\33\u00a1\3\33"+
		"\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\3\2\5\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00a7\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5?\3\2\2\2\7E\3\2\2\2\tK\3\2\2"+
		"\2\13S\3\2\2\2\rX\3\2\2\2\17_\3\2\2\2\21c\3\2\2\2\23g\3\2\2\2\25i\3\2"+
		"\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2"+
		"\2\2#w\3\2\2\2%z\3\2\2\2\'\u0082\3\2\2\2)\u0084\3\2\2\2+\u0086\3\2\2\2"+
		"-\u008c\3\2\2\2/\u008f\3\2\2\2\61\u0093\3\2\2\2\63\u0097\3\2\2\2\65\u009f"+
		"\3\2\2\2\678\7R\2\289\7T\2\29:\7Q\2\2:;\7I\2\2;<\7T\2\2<=\7C\2\2=>\7O"+
		"\2\2>\4\3\2\2\2?@\7D\2\2@A\7G\2\2AB\7I\2\2BC\7K\2\2CD\7P\2\2D\6\3\2\2"+
		"\2EF\7Y\2\2FG\7T\2\2GH\7K\2\2HI\7V\2\2IJ\7G\2\2J\b\3\2\2\2KL\7Y\2\2LM"+
		"\7T\2\2MN\7K\2\2NO\7V\2\2OP\7G\2\2PQ\7N\2\2QR\7P\2\2R\n\3\2\2\2ST\7T\2"+
		"\2TU\7G\2\2UV\7C\2\2VW\7F\2\2W\f\3\2\2\2XY\7T\2\2YZ\7G\2\2Z[\7C\2\2[\\"+
		"\7F\2\2\\]\7N\2\2]^\7P\2\2^\16\3\2\2\2_`\7G\2\2`a\7P\2\2ab\7F\2\2b\20"+
		"\3\2\2\2cd\7X\2\2de\7C\2\2ef\7T\2\2f\22\3\2\2\2gh\7-\2\2h\24\3\2\2\2i"+
		"j\7/\2\2j\26\3\2\2\2kl\7,\2\2l\30\3\2\2\2mn\7\61\2\2n\32\3\2\2\2op\7\60"+
		"\2\2p\34\3\2\2\2qr\7=\2\2r\36\3\2\2\2st\7<\2\2t \3\2\2\2uv\7.\2\2v\"\3"+
		"\2\2\2wx\7<\2\2xy\7?\2\2y$\3\2\2\2z{\7K\2\2{|\7P\2\2|}\7V\2\2}~\7G\2\2"+
		"~\177\7I\2\2\177\u0080\7G\2\2\u0080\u0081\7T\2\2\u0081&\3\2\2\2\u0082"+
		"\u0083\7*\2\2\u0083(\3\2\2\2\u0084\u0085\7+\2\2\u0085*\3\2\2\2\u0086\u0087"+
		"\7Y\2\2\u0087\u0088\7J\2\2\u0088\u0089\7K\2\2\u0089\u008a\7N\2\2\u008a"+
		"\u008b\7G\2\2\u008b,\3\2\2\2\u008c\u008d\7F\2\2\u008d\u008e\7Q\2\2\u008e"+
		".\3\2\2\2\u008f\u0090\7K\2\2\u0090\u0091\7H\2\2\u0091\60\3\2\2\2\u0092"+
		"\u0094\4\62;\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\62\3\2\2\2\u0097\u009b\t\2\2\2\u0098\u009a"+
		"\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\64\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\t\4\2"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\33\2\2\u00a4\66\3\2\2\2\6\2"+
		"\u0095\u009b\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}