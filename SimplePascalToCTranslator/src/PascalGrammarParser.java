// Generated from PascalGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalGrammarParser extends Parser {
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
	public String getGrammarFileName() { return "PascalGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PascalGrammarParser.DOT, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40); progDef();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAM );
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(45); varDefs();
				}
				}
				setState(50);
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
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public TerminalNode PROGRAM() { return getToken(PascalGrammarParser.PROGRAM, 0); }
		public ProgDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProgDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgDefContext progDef() throws RecognitionException {
		ProgDefContext _localctx = new ProgDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_progDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(PROGRAM);
			setState(52); match(ID);
			setState(53); match(SEMI);
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
		public TerminalNode VAR() { return getToken(PascalGrammarParser.VAR, 0); }
		public VarDefListContext varDefList() {
			return getRuleContext(VarDefListContext.class,0);
		}
		public VarDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVarDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefsContext varDefs() throws RecognitionException {
		VarDefsContext _localctx = new VarDefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(VAR);
			setState(56); varDefList();
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
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVarDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefListContext varDefList() throws RecognitionException {
		VarDefListContext _localctx = new VarDefListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58); varDef();
				setState(59); match(SEMI);
				}
				}
				setState(63); 
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
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); idList();
			setState(66); match(COLON);
			setState(67); typeIdentifier();
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
		public List<TerminalNode> ID() { return getTokens(PascalGrammarParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(PascalGrammarParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(ID);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70); match(COMMA);
				setState(71); match(ID);
				}
				}
				setState(76);
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
		public TerminalNode INTEGER() { return getToken(PascalGrammarParser.INTEGER, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(INTEGER);
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
		public TerminalNode BEGIN() { return getToken(PascalGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalGrammarParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(BEGIN);
			setState(80); statementList();
			setState(81); match(END);
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
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83); statement();
				setState(84); match(SEMI);
				}
				}
				setState(88); 
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
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PascalGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(ID);
			setState(91); match(ASSIGN);
			setState(92); expression();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); simpleExpression();
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
			return getToken(PascalGrammarParser.MINUS, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PascalGrammarParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(PascalGrammarParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PascalGrammarParser.PLUS, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); term();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(98); term();
				}
				}
				setState(103);
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
			return getToken(PascalGrammarParser.MULT, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(PascalGrammarParser.MULT); }
		public List<TerminalNode> DIV() { return getTokens(PascalGrammarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PascalGrammarParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); factor();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(106); factor();
				}
				}
				setState(111);
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
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PascalGrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PascalGrammarParser.RPAR, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(LPAR);
				setState(113); expression();
				setState(114); match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(117); unsignedConstant();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unsignedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); unsignedNumber();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unsignedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); unsignedInteger();
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
		public TerminalNode NUM_INT() { return getToken(PascalGrammarParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(NUM_INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\6\6@\n\6\r\6\16\6A"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\6\13Y\n\13\r\13\16\13Z\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\7\16f\n\16\f\16\16\16i\13\16\3\17\3\17\3\17\7\17n\n\17\f"+
		"\17\16\17q\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20y\n\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\4\3\2\13\f\3\2\r\16w\2&\3\2\2\2\4+\3\2\2\2\6\65\3\2\2\2\b9\3\2"+
		"\2\2\n?\3\2\2\2\fC\3\2\2\2\16G\3\2\2\2\20O\3\2\2\2\22Q\3\2\2\2\24X\3\2"+
		"\2\2\26\\\3\2\2\2\30`\3\2\2\2\32b\3\2\2\2\34j\3\2\2\2\36x\3\2\2\2 z\3"+
		"\2\2\2\"|\3\2\2\2$~\3\2\2\2&\'\5\4\3\2\'(\5\22\n\2()\7\17\2\2)\3\3\2\2"+
		"\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\62\3\2\2\2/\61\5"+
		"\b\5\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2"+
		"\2\2\64\62\3\2\2\2\65\66\7\3\2\2\66\67\7\30\2\2\678\7\20\2\28\7\3\2\2"+
		"\29:\7\n\2\2:;\5\n\6\2;\t\3\2\2\2<=\5\f\7\2=>\7\20\2\2>@\3\2\2\2?<\3\2"+
		"\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CD\5\16\b\2DE\7\21\2\2E"+
		"F\5\20\t\2F\r\3\2\2\2GL\7\30\2\2HI\7\22\2\2IK\7\30\2\2JH\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NL\3\2\2\2OP\7\24\2\2P\21\3\2\2\2"+
		"QR\7\4\2\2RS\5\24\13\2ST\7\t\2\2T\23\3\2\2\2UV\5\26\f\2VW\7\20\2\2WY\3"+
		"\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\25\3\2\2\2\\]\7\30\2\2"+
		"]^\7\23\2\2^_\5\30\r\2_\27\3\2\2\2`a\5\32\16\2a\31\3\2\2\2bg\5\34\17\2"+
		"cd\t\2\2\2df\5\34\17\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\33\3\2"+
		"\2\2ig\3\2\2\2jo\5\36\20\2kl\t\3\2\2ln\5\36\20\2mk\3\2\2\2nq\3\2\2\2o"+
		"m\3\2\2\2op\3\2\2\2p\35\3\2\2\2qo\3\2\2\2rs\7\25\2\2st\5\30\r\2tu\7\26"+
		"\2\2uy\3\2\2\2vy\7\30\2\2wy\5 \21\2xr\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\37"+
		"\3\2\2\2z{\5\"\22\2{!\3\2\2\2|}\5$\23\2}#\3\2\2\2~\177\7\27\2\2\177%\3"+
		"\2\2\2\n-\62ALZgox";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}