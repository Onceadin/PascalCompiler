// Generated from SimpleGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, VAR=4, PLUS=5, MINUS=6, MULT=7, DIV=8, DOT=9, 
		SEMI=10, COLON=11, COMMA=12, ASSIGN=13, INTEGER=14, LPAR=15, RPAR=16, 
		NUM_INT=17, ID=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'PROGRAM'", "'BEGIN'", "'END'", "'VAR'", "'+'", "'-'", "'*'", 
		"'/'", "'.'", "';'", "':'", "','", "':='", "'INTEGER'", "'('", "')'", 
		"NUM_INT", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_progDef = 2, RULE_varDefs = 3, 
		RULE_varDefList = 4, RULE_varDef = 5, RULE_idList = 6, RULE_typeIdentifier = 7, 
		RULE_block = 8, RULE_statementList = 9, RULE_statement = 10, RULE_expression = 11, 
		RULE_simpleExpression = 12, RULE_term = 13, RULE_factor = 14, RULE_unsignedConstant = 15, 
		RULE_unsignedNumber = 16, RULE_unsignedInteger = 17;
	public static final String[] ruleNames = {
		"program", "declarations", "progDef", "varDefs", "varDefList", "varDef", 
		"idList", "typeIdentifier", "block", "statementList", "statement", "expression", 
		"simpleExpression", "term", "factor", "unsignedConstant", "unsignedNumber", 
		"unsignedInteger"
	};

	@Override
	public String getGrammarFileName() { return "SimpleGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimpleGrammarParser.DOT, 0); }
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
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); declarations();
			setState(37); block();
			setState(38); match(DOT);
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
		public List<ProgDefContext> progDef() {
			return getRuleContexts(ProgDefContext.class);
		}
		public List<VarDefsContext> varDefs() {
			return getRuleContexts(VarDefsContext.class);
		}
		public VarDefsContext varDefs(int i) {
			return getRuleContext(VarDefsContext.class,i);
		}
		public ProgDefContext progDef(int i) {
			return getRuleContext(ProgDefContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROGRAM) {
				{
				{
				setState(40); progDef();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(46); varDefs();
				}
				}
				setState(51);
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
		public TerminalNode ID() { return getToken(SimpleGrammarParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(SimpleGrammarParser.SEMI, 0); }
		public TerminalNode PROGRAM() { return getToken(SimpleGrammarParser.PROGRAM, 0); }
		public ProgDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterProgDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitProgDef(this);
		}
	}

	public final ProgDefContext progDef() throws RecognitionException {
		ProgDefContext _localctx = new ProgDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_progDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(PROGRAM);
			setState(53); match(ID);
			setState(54); match(SEMI);
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
		public TerminalNode VAR() { return getToken(SimpleGrammarParser.VAR, 0); }
		public VarDefListContext varDefList() {
			return getRuleContext(VarDefListContext.class,0);
		}
		public VarDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterVarDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitVarDefs(this);
		}
	}

	public final VarDefsContext varDefs() throws RecognitionException {
		VarDefsContext _localctx = new VarDefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(VAR);
			setState(57); varDefList();
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
		public List<TerminalNode> SEMI() { return getTokens(SimpleGrammarParser.SEMI); }
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(SimpleGrammarParser.SEMI, i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterVarDefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitVarDefList(this);
		}
	}

	public final VarDefListContext varDefList() throws RecognitionException {
		VarDefListContext _localctx = new VarDefListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59); varDef();
				setState(60); match(SEMI);
				}
				}
				setState(64); 
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
		public TerminalNode COLON() { return getToken(SimpleGrammarParser.COLON, 0); }
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); idList();
			setState(67); match(COLON);
			setState(68); typeIdentifier();
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
		public List<TerminalNode> ID() { return getTokens(SimpleGrammarParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(SimpleGrammarParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(SimpleGrammarParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SimpleGrammarParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71); match(COMMA);
				setState(72); match(ID);
				}
				}
				setState(77);
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
		public TerminalNode INTEGER() { return getToken(SimpleGrammarParser.INTEGER, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(INTEGER);
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
		public TerminalNode BEGIN() { return getToken(SimpleGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SimpleGrammarParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(BEGIN);
			setState(81); statementList();
			setState(82); match(END);
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
		public List<TerminalNode> SEMI() { return getTokens(SimpleGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SimpleGrammarParser.SEMI, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84); statement();
				setState(85); match(SEMI);
				}
				}
				setState(89); 
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(ID);
			setState(92); match(ASSIGN);
			setState(93); expression();
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
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); simpleExpression();
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
		public TerminalNode MINUS(int i) {
			return getToken(SimpleGrammarParser.MINUS, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleGrammarParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(SimpleGrammarParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleGrammarParser.PLUS, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); term();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(99); term();
				}
				}
				setState(104);
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
		public TerminalNode MULT(int i) {
			return getToken(SimpleGrammarParser.MULT, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleGrammarParser.MULT); }
		public List<TerminalNode> DIV() { return getTokens(SimpleGrammarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SimpleGrammarParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); factor();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(107); factor();
				}
				}
				setState(112);
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
		public TerminalNode ID() { return getToken(SimpleGrammarParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SimpleGrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleGrammarParser.RPAR, 0); }
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(LPAR);
				setState(114); expression();
				setState(115); match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); unsignedConstant();
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
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unsignedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); unsignedNumber();
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
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unsignedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); unsignedInteger();
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
		public TerminalNode NUM_INT() { return getToken(SimpleGrammarParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGrammarListener ) ((SimpleGrammarListener)listener).exitUnsignedInteger(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(NUM_INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\6\6A\n\6\r\6"+
		"\16\6B\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\6\13Z\n\13\r\13\16\13[\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\7\16g\n\16\f\16\16\16j\13\16\3\17\3\17\3\17\7\17o"+
		"\n\17\f\17\16\17r\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20z\n\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\4\3\2\7\b\3\2\t\nx\2&\3\2\2\2\4-\3\2\2\2\6\66\3\2\2\2\b:"+
		"\3\2\2\2\n@\3\2\2\2\fD\3\2\2\2\16H\3\2\2\2\20P\3\2\2\2\22R\3\2\2\2\24"+
		"Y\3\2\2\2\26]\3\2\2\2\30a\3\2\2\2\32c\3\2\2\2\34k\3\2\2\2\36y\3\2\2\2"+
		" {\3\2\2\2\"}\3\2\2\2$\177\3\2\2\2&\'\5\4\3\2\'(\5\22\n\2()\7\13\2\2)"+
		"\3\3\2\2\2*,\5\6\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2"+
		"\2/-\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66\67\7\3\2\2\678\7\24\2\289\7"+
		"\f\2\29\7\3\2\2\2:;\7\6\2\2;<\5\n\6\2<\t\3\2\2\2=>\5\f\7\2>?\7\f\2\2?"+
		"A\3\2\2\2@=\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DE\5\16\b"+
		"\2EF\7\r\2\2FG\5\20\t\2G\r\3\2\2\2HM\7\24\2\2IJ\7\16\2\2JL\7\24\2\2KI"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\17\3\2\2\2OM\3\2\2\2PQ\7\20\2"+
		"\2Q\21\3\2\2\2RS\7\4\2\2ST\5\24\13\2TU\7\5\2\2U\23\3\2\2\2VW\5\26\f\2"+
		"WX\7\f\2\2XZ\3\2\2\2YV\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\25\3\2"+
		"\2\2]^\7\24\2\2^_\7\17\2\2_`\5\30\r\2`\27\3\2\2\2ab\5\32\16\2b\31\3\2"+
		"\2\2ch\5\34\17\2de\t\2\2\2eg\5\34\17\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2h"+
		"i\3\2\2\2i\33\3\2\2\2jh\3\2\2\2kp\5\36\20\2lm\t\3\2\2mo\5\36\20\2nl\3"+
		"\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\35\3\2\2\2rp\3\2\2\2st\7\21\2\2"+
		"tu\5\30\r\2uv\7\22\2\2vz\3\2\2\2wz\7\24\2\2xz\5 \21\2ys\3\2\2\2yw\3\2"+
		"\2\2yx\3\2\2\2z\37\3\2\2\2{|\5\"\22\2|!\3\2\2\2}~\5$\23\2~#\3\2\2\2\177"+
		"\u0080\7\23\2\2\u0080%\3\2\2\2\n-\63BM[hpy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}