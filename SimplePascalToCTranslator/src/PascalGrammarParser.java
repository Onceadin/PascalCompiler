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
		ASSIGN=17, INTEGER=18, LPAR=19, RPAR=20, WHILE=21, DO=22, NUM_INT=23, 
		ID=24, WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'PROGRAM'", "'BEGIN'", "'WRITE'", "'WRITELN'", "'READ'", 
		"'READLN'", "'END'", "'VAR'", "'+'", "'-'", "'*'", "'/'", "'.'", "';'", 
		"':'", "','", "':='", "'INTEGER'", "'('", "')'", "'WHILE'", "'DO'", "NUM_INT", 
		"ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_progDef = 2, RULE_varDefs = 3, 
		RULE_varDefList = 4, RULE_varDef = 5, RULE_idList = 6, RULE_typeIdentifier = 7, 
		RULE_block = 8, RULE_statementList = 9, RULE_statement = 10, RULE_while_statement = 11, 
		RULE_assignment = 12, RULE_output = 13, RULE_input = 14, RULE_expression = 15, 
		RULE_simpleExpression = 16, RULE_term = 17, RULE_factor = 18, RULE_unsignedConstant = 19, 
		RULE_unsignedNumber = 20, RULE_unsignedInteger = 21;
	public static final String[] ruleNames = {
		"program", "declarations", "progDef", "varDefs", "varDefList", "varDef", 
		"idList", "typeIdentifier", "block", "statementList", "statement", "while_statement", 
		"assignment", "output", "input", "expression", "simpleExpression", "term", 
		"factor", "unsignedConstant", "unsignedNumber", "unsignedInteger"
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
			setState(44); declarations();
			setState(45); block();
			setState(46); match(DOT);
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); progDef();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAM );
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(53); varDefs();
				}
				}
				setState(58);
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
			setState(59); match(PROGRAM);
			setState(60); match(ID);
			setState(61); match(SEMI);
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
			setState(63); match(VAR);
			setState(64); varDefList();
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); varDef();
				setState(67); match(SEMI);
				}
				}
				setState(71); 
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
			setState(73); idList();
			setState(74); match(COLON);
			setState(75); typeIdentifier();
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
			setState(77); match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78); match(COMMA);
				setState(79); match(ID);
				}
				}
				setState(84);
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
			setState(85); match(INTEGER);
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
			setState(87); match(BEGIN);
			setState(88); statementList();
			setState(89); match(END);
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
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91); statement();
				setState(92); match(SEMI);
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << WRITE) | (1L << WRITELN) | (1L << READ) | (1L << READLN) | (1L << WHILE) | (1L << ID))) != 0) );
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
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(103);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); assignment();
				}
				break;
			case READ:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); input();
				}
				break;
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); output();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); while_statement();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(102); block();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(PascalGrammarParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PascalGrammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(WHILE);
			setState(106); expression();
			setState(107); match(DO);
			setState(108); statement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PascalGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(ID);
			setState(111); match(ASSIGN);
			setState(112); expression();
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
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode WRITE() { return getToken(PascalGrammarParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(PascalGrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PascalGrammarParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WRITELN() { return getToken(PascalGrammarParser.WRITELN, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_output);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); match(WRITE);
				setState(115); match(LPAR);
				setState(116); expression();
				setState(117); match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(WRITELN);
				setState(120); match(LPAR);
				setState(121); expression();
				setState(122); match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); match(WRITE);
				setState(125); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); match(WRITELN);
				setState(127); match(ID);
				}
				break;
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
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode READLN() { return getToken(PascalGrammarParser.READLN, 0); }
		public TerminalNode READ() { return getToken(PascalGrammarParser.READ, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(READ);
				setState(131); match(ID);
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(READLN);
				setState(133); match(ID);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); simpleExpression();
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
		enterRule(_localctx, 32, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); term();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(140); term();
				}
				}
				setState(145);
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
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); factor();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(148); factor();
				}
				}
				setState(153);
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
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); match(LPAR);
				setState(155); expression();
				setState(156); match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); unsignedConstant();
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
		enterRule(_localctx, 38, RULE_unsignedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); unsignedNumber();
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
		enterRule(_localctx, 40, RULE_unsignedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); unsignedInteger();
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
		enterRule(_localctx, 42, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(NUM_INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\3"+
		"\6\3\64\n\3\r\3\16\3\65\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\6\6H\n\6\r\6\16\6I\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\7\bS\n\b\f\b\16\bV\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13a"+
		"\n\13\r\13\16\13b\3\f\3\f\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0083\n\17\3\20\3\20\3\20\3\20\5\20\u0089\n\20\3"+
		"\21\3\21\3\22\3\22\3\22\7\22\u0090\n\22\f\22\16\22\u0093\13\22\3\23\3"+
		"\23\3\23\7\23\u0098\n\23\f\23\16\23\u009b\13\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00a3\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\3\2\13\f\3\2\r\16\u00a5"+
		"\2.\3\2\2\2\4\63\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2\16"+
		"O\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24`\3\2\2\2\26i\3\2\2\2\30k\3\2\2\2"+
		"\32p\3\2\2\2\34\u0082\3\2\2\2\36\u0088\3\2\2\2 \u008a\3\2\2\2\"\u008c"+
		"\3\2\2\2$\u0094\3\2\2\2&\u00a2\3\2\2\2(\u00a4\3\2\2\2*\u00a6\3\2\2\2,"+
		"\u00a8\3\2\2\2./\5\4\3\2/\60\5\22\n\2\60\61\7\17\2\2\61\3\3\2\2\2\62\64"+
		"\5\6\4\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66:\3"+
		"\2\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2"+
		"\2<:\3\2\2\2=>\7\3\2\2>?\7\32\2\2?@\7\20\2\2@\7\3\2\2\2AB\7\n\2\2BC\5"+
		"\n\6\2C\t\3\2\2\2DE\5\f\7\2EF\7\20\2\2FH\3\2\2\2GD\3\2\2\2HI\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KL\5\16\b\2LM\7\21\2\2MN\5\20\t\2N\r\3"+
		"\2\2\2OT\7\32\2\2PQ\7\22\2\2QS\7\32\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2U\17\3\2\2\2VT\3\2\2\2WX\7\24\2\2X\21\3\2\2\2YZ\7\4\2\2Z[\5"+
		"\24\13\2[\\\7\t\2\2\\\23\3\2\2\2]^\5\26\f\2^_\7\20\2\2_a\3\2\2\2`]\3\2"+
		"\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\25\3\2\2\2dj\5\32\16\2ej\5\36\20\2"+
		"fj\5\34\17\2gj\5\30\r\2hj\5\22\n\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2"+
		"\2\2ih\3\2\2\2j\27\3\2\2\2kl\7\27\2\2lm\5 \21\2mn\7\30\2\2no\5\26\f\2"+
		"o\31\3\2\2\2pq\7\32\2\2qr\7\23\2\2rs\5 \21\2s\33\3\2\2\2tu\7\5\2\2uv\7"+
		"\25\2\2vw\5 \21\2wx\7\26\2\2x\u0083\3\2\2\2yz\7\6\2\2z{\7\25\2\2{|\5 "+
		"\21\2|}\7\26\2\2}\u0083\3\2\2\2~\177\7\5\2\2\177\u0083\7\32\2\2\u0080"+
		"\u0081\7\6\2\2\u0081\u0083\7\32\2\2\u0082t\3\2\2\2\u0082y\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\u0080\3\2\2\2\u0083\35\3\2\2\2\u0084\u0085\7\7\2\2\u0085"+
		"\u0089\7\32\2\2\u0086\u0087\7\b\2\2\u0087\u0089\7\32\2\2\u0088\u0084\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0089\37\3\2\2\2\u008a\u008b\5\"\22\2\u008b"+
		"!\3\2\2\2\u008c\u0091\5$\23\2\u008d\u008e\t\2\2\2\u008e\u0090\5$\23\2"+
		"\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092#\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0099\5&\24\2\u0095"+
		"\u0096\t\3\2\2\u0096\u0098\5&\24\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a%\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\7\25\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\26\2\2"+
		"\u009f\u00a3\3\2\2\2\u00a0\u00a3\7\32\2\2\u00a1\u00a3\5(\25\2\u00a2\u009c"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\'\3\2\2\2\u00a4"+
		"\u00a5\5*\26\2\u00a5)\3\2\2\2\u00a6\u00a7\5,\27\2\u00a7+\3\2\2\2\u00a8"+
		"\u00a9\7\31\2\2\u00a9-\3\2\2\2\r\65:ITbi\u0082\u0088\u0091\u0099\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}