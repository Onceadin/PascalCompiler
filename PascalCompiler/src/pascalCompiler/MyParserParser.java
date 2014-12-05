package pascalCompiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, WRITE=3, WRITELN=4, READ=5, READLN=6, END=7, VAR=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, DOT=13, SEMI=14, COLON=15, COMMA=16, 
		ASSIGN=17, INTEGER=18, LPAR=19, RPAR=20, NUM_INT=21, ID=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'PROGRAM'", "'BEGIN'", "'WRITE'", "'WRITELN'", "'READ'", 
		"'READLN'", "'END'", "'VAR'", "'+'", "'-'", "'*'", "'/'", "'.'", "';'", 
		"':'", "','", "':='", "'INTEGER'", "'('", "')'", "NUM_INT", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_progDef = 2, RULE_varDefs = 3, 
		RULE_varDefList = 4, RULE_varDef = 5, RULE_idList = 6, RULE_typeIdentifier = 7, 
		RULE_block = 8, RULE_statementList = 9, RULE_statement = 10, RULE_output = 11, 
		RULE_input = 12, RULE_expression = 13, RULE_simpleExpression = 14, RULE_term = 15, 
		RULE_factor = 16, RULE_unsignedConstant = 17, RULE_unsignedNumber = 18, 
		RULE_unsignedInteger = 19;
	public static final String[] ruleNames = {
		"program", "declarations", "progDef", "varDefs", "varDefList", "varDef", 
		"idList", "typeIdentifier", "block", "statementList", "statement", "output", 
		"input", "expression", "simpleExpression", "term", "factor", "unsignedConstant", 
		"unsignedNumber", "unsignedInteger"
	};

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MyParserParser.DOT, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); declarations();
			setState(41); block();
			setState(42); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<VarDefsContext> varDefs() {
			return getRuleContexts(VarDefsContext.class);
		}
		public VarDefsContext varDefs(int i) {
			return getRuleContext(VarDefsContext.class,i);
		}
		public ProgDefContext progDef(int i) {
			return getRuleContext(ProgDefContext.class,i);
		}
		public List<ProgDefContext> progDef() {
			return getRuleContexts(ProgDefContext.class);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROGRAM) {
				{
				{
				setState(44); progDef();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(50); varDefs();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgDefContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MyParserParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TerminalNode PROGRAM() { return getToken(MyParserParser.PROGRAM, 0); }
		public ProgDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterProgDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitProgDef(this);
		}
	}

	public final ProgDefContext progDef() throws RecognitionException {
		ProgDefContext _localctx = new ProgDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_progDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(PROGRAM);
			setState(57); match(ID);
			setState(58); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefsContext extends ParserRuleContext {
		public VarDefListContext varDefList() {
			return getRuleContext(VarDefListContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MyParserParser.VAR, 0); }
		public VarDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVarDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVarDefs(this);
		}
	}

	public final VarDefsContext varDefs() throws RecognitionException {
		VarDefsContext _localctx = new VarDefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(VAR);
			setState(61); varDefList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefListContext extends ParserRuleContext {
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MyParserParser.SEMI); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(MyParserParser.SEMI, i);
		}
		public VarDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVarDefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVarDefList(this);
		}
	}

	public final VarDefListContext varDefList() throws RecognitionException {
		VarDefListContext _localctx = new VarDefListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63); varDef();
				setState(64); match(SEMI);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyParserParser.COLON, 0); }
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); idList();
			setState(71); match(COLON);
			setState(72); typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(MyParserParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(MyParserParser.ID); }
		public TerminalNode COMMA(int i) {
			return getToken(MyParserParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(MyParserParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75); match(COMMA);
				setState(76); match(ID);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MyParserParser.INTEGER, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(MyParserParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MyParserParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(BEGIN);
			setState(85); statementList();
			setState(86); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(MyParserParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MyParserParser.SEMI, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88); statement();
				setState(89); match(SEMI);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WRITELN) | (1L << READ) | (1L << READLN) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MyParserParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(MyParserParser.LPAR, 0); }
		public TerminalNode ASSIGN() { return getToken(MyParserParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(ID);
				setState(96); match(ASSIGN);
				setState(97); expression();
				}
				break;
			case READ:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); input();
				setState(99); match(LPAR);
				setState(100); expression();
				setState(101); match(RPAR);
				}
				break;
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); output();
				setState(104); match(LPAR);
				setState(105); expression();
				setState(106); match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(MyParserParser.WRITELN, 0); }
		public TerminalNode WRITE() { return getToken(MyParserParser.WRITE, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==WRITE || _la==WRITELN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode READLN() { return getToken(MyParserParser.READLN, 0); }
		public TerminalNode READ() { return getToken(MyParserParser.READ, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==READLN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); simpleExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(MyParserParser.MINUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MyParserParser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(MyParserParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MyParserParser.PLUS, i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); term();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(118); term();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(MyParserParser.DIV); }
		public List<TerminalNode> MULT() { return getTokens(MyParserParser.MULT); }
		public TerminalNode DIV(int i) {
			return getToken(MyParserParser.DIV, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TerminalNode MULT(int i) {
			return getToken(MyParserParser.MULT, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); factor();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(126); factor();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MyParserParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(MyParserParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); match(LPAR);
				setState(133); expression();
				setState(134); match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(137); unsignedConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unsignedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); unsignedNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unsignedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); unsignedInteger();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(MyParserParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitUnsignedInteger(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\6\6E\n\6\r\6\16\6F\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bP\n\b\f\b\16"+
		"\bS\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13^\n\13\r\13\16\13"+
		"_\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20z\n\20\f\20\16\20}\13\20\3\21"+
		"\3\21\3\21\7\21\u0082\n\21\f\21\16\21\u0085\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u008d\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\5\6\3\2\7\b\3\2\13"+
		"\f\3\2\r\16\u008b\2*\3\2\2\2\4\61\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\nD\3\2"+
		"\2\2\fH\3\2\2\2\16L\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24]\3\2\2\2\26n\3"+
		"\2\2\2\30p\3\2\2\2\32r\3\2\2\2\34t\3\2\2\2\36v\3\2\2\2 ~\3\2\2\2\"\u008c"+
		"\3\2\2\2$\u008e\3\2\2\2&\u0090\3\2\2\2(\u0092\3\2\2\2*+\5\4\3\2+,\5\22"+
		"\n\2,-\7\17\2\2-\3\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2"+
		"\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\61\3\2\2\2\64\66\5\b\5\2\65\64\3\2"+
		"\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\7"+
		"\3\2\2;<\7\30\2\2<=\7\20\2\2=\7\3\2\2\2>?\7\n\2\2?@\5\n\6\2@\t\3\2\2\2"+
		"AB\5\f\7\2BC\7\20\2\2CE\3\2\2\2DA\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2G\13\3\2\2\2HI\5\16\b\2IJ\7\21\2\2JK\5\20\t\2K\r\3\2\2\2LQ\7\30\2\2"+
		"MN\7\22\2\2NP\7\30\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\17\3\2"+
		"\2\2SQ\3\2\2\2TU\7\24\2\2U\21\3\2\2\2VW\7\4\2\2WX\5\24\13\2XY\7\t\2\2"+
		"Y\23\3\2\2\2Z[\5\26\f\2[\\\7\20\2\2\\^\3\2\2\2]Z\3\2\2\2^_\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`\25\3\2\2\2ab\7\30\2\2bc\7\23\2\2co\5\34\17\2de\5\32"+
		"\16\2ef\7\25\2\2fg\5\34\17\2gh\7\26\2\2ho\3\2\2\2ij\5\30\r\2jk\7\25\2"+
		"\2kl\5\34\17\2lm\7\26\2\2mo\3\2\2\2na\3\2\2\2nd\3\2\2\2ni\3\2\2\2o\27"+
		"\3\2\2\2pq\t\2\2\2q\31\3\2\2\2rs\t\3\2\2s\33\3\2\2\2tu\5\36\20\2u\35\3"+
		"\2\2\2v{\5 \21\2wx\t\4\2\2xz\5 \21\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|\37\3\2\2\2}{\3\2\2\2~\u0083\5\"\22\2\177\u0080\t\5\2\2\u0080\u0082"+
		"\5\"\22\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084!\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\25\2\2"+
		"\u0087\u0088\5\34\17\2\u0088\u0089\7\26\2\2\u0089\u008d\3\2\2\2\u008a"+
		"\u008d\7\30\2\2\u008b\u008d\5$\23\2\u008c\u0086\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d#\3\2\2\2\u008e\u008f\5&\24\2\u008f%\3"+
		"\2\2\2\u0090\u0091\5(\25\2\u0091\'\3\2\2\2\u0092\u0093\7\27\2\2\u0093"+
		")\3\2\2\2\13\61\67FQ_n{\u0083\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}