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
		ASSIGN=17, INTEGER=18, LPAR=19, RPAR=20, WHILE=21, DO=22, IF=23, NUM_INT=24, 
		ID=25, WS=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'PROGRAM'", "'BEGIN'", "'WRITE'", "'WRITELN'", "'READ'", 
		"'READLN'", "'END'", "'VAR'", "'+'", "'-'", "'*'", "'/'", "'.'", "';'", 
		"':'", "','", "':='", "'INTEGER'", "'('", "')'", "'WHILE'", "'DO'", "'IF'", 
		"NUM_INT", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_progDef = 2, RULE_varDefs = 3, 
		RULE_varDefList = 4, RULE_varDef = 5, RULE_idList = 6, RULE_typeIdentifier = 7, 
		RULE_block = 8, RULE_statementList = 9, RULE_statement = 10, RULE_while_statement = 11, 
		RULE_if_statement = 12, RULE_assignment = 13, RULE_output = 14, RULE_input = 15, 
		RULE_expression = 16, RULE_simpleExpression = 17, RULE_term = 18, RULE_factor = 19, 
		RULE_unsignedConstant = 20, RULE_unsignedNumber = 21, RULE_unsignedInteger = 22;
	public static final String[] ruleNames = {
		"program", "declarations", "progDef", "varDefs", "varDefList", "varDef", 
		"idList", "typeIdentifier", "block", "statementList", "statement", "while_statement", 
		"if_statement", "assignment", "output", "input", "expression", "simpleExpression", 
		"term", "factor", "unsignedConstant", "unsignedNumber", "unsignedInteger"
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
			setState(46); declarations();
			setState(47); block();
			setState(48); match(DOT);
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50); progDef();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAM );
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(55); varDefs();
				}
				}
				setState(60);
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
			setState(61); match(PROGRAM);
			setState(62); match(ID);
			setState(63); match(SEMI);
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
			setState(65); match(VAR);
			setState(66); varDefList();
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); varDef();
				setState(69); match(SEMI);
				}
				}
				setState(73); 
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
			setState(75); idList();
			setState(76); match(COLON);
			setState(77); typeIdentifier();
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
			setState(79); match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80); match(COMMA);
				setState(81); match(ID);
				}
				}
				setState(86);
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
			setState(87); match(INTEGER);
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
			setState(89); match(BEGIN);
			setState(90); statementList();
			setState(91); match(END);
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
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93); statement();
				setState(94); match(SEMI);
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << WRITE) | (1L << WRITELN) | (1L << READ) | (1L << READLN) | (1L << WHILE) | (1L << IF) | (1L << ID))) != 0) );
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
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
			setState(106);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); assignment();
				}
				break;
			case READ:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); input();
				}
				break;
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); output();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); while_statement();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(104); block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(105); if_statement();
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
			setState(108); match(WHILE);
			setState(109); expression();
			setState(110); match(DO);
			setState(111); statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascalGrammarParser.IF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(IF);
			setState(114); expression();
			setState(115); statement();
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
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(ID);
			setState(118); match(ASSIGN);
			setState(119); expression();
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
		enterRule(_localctx, 28, RULE_output);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); match(WRITE);
				setState(122); match(LPAR);
				setState(123); expression();
				setState(124); match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); match(WRITELN);
				setState(127); match(LPAR);
				setState(128); expression();
				setState(129); match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131); match(WRITE);
				setState(132); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133); match(WRITELN);
				setState(134); match(ID);
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
		public List<TerminalNode> ID() { return getTokens(PascalGrammarParser.ID); }
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public TerminalNode READLN() { return getToken(PascalGrammarParser.READLN, 0); }
		public TerminalNode READ() { return getToken(PascalGrammarParser.READ, 0); }
		public TerminalNode ID(int i) {
			return getToken(PascalGrammarParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(PascalGrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PascalGrammarParser.RPAR, 0); }
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
		enterRule(_localctx, 30, RULE_input);
		int _la;
		try {
			setState(157);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(READ);
				setState(138); match(LPAR);
				setState(139); match(ID);
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140); match(ID);
					setState(141); match(SEMI);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(146); match(RPAR);
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); match(READLN);
				setState(148); match(LPAR);
				setState(149); match(ID);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150); match(ID);
					setState(151); match(SEMI);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(156); match(RPAR);
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
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); simpleExpression();
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
		enterRule(_localctx, 34, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); term();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(163); term();
				}
				}
				setState(168);
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
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); factor();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(171); factor();
				}
				}
				setState(176);
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
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(LPAR);
				setState(178); expression();
				setState(179); match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(182); unsignedConstant();
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
		enterRule(_localctx, 40, RULE_unsignedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); unsignedNumber();
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
		enterRule(_localctx, 42, RULE_unsignedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); unsignedInteger();
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
		enterRule(_localctx, 44, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(NUM_INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\6\3\66\n\3\r\3\16\3\67\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\6\6J\n\6\r\6\16\6K\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\7\bU\n\b\f\b\16\bX\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\6\13c\n\13\r\13\16\13d\3\f\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008a\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\6\21\u0091\n\21\r\21\16\21\u0092\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\6\21\u009b\n\21\r\21\16\21\u009c\3\21\5\21\u00a0\n\21\3"+
		"\22\3\22\3\23\3\23\3\23\7\23\u00a7\n\23\f\23\16\23\u00aa\13\23\3\24\3"+
		"\24\3\24\7\24\u00af\n\24\f\24\16\24\u00b2\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u00ba\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\4\3\2\13\f\3\2\r\16\u00be"+
		"\2\60\3\2\2\2\4\65\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\nI\3\2\2\2\fM\3\2\2\2"+
		"\16Q\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24b\3\2\2\2\26l\3\2\2\2\30n\3\2\2"+
		"\2\32s\3\2\2\2\34w\3\2\2\2\36\u0089\3\2\2\2 \u009f\3\2\2\2\"\u00a1\3\2"+
		"\2\2$\u00a3\3\2\2\2&\u00ab\3\2\2\2(\u00b9\3\2\2\2*\u00bb\3\2\2\2,\u00bd"+
		"\3\2\2\2.\u00bf\3\2\2\2\60\61\5\4\3\2\61\62\5\22\n\2\62\63\7\17\2\2\63"+
		"\3\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\67"+
		"8\3\2\2\28<\3\2\2\29;\5\b\5\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=\5\3\2\2\2><\3\2\2\2?@\7\3\2\2@A\7\33\2\2AB\7\20\2\2B\7\3\2\2\2CD\7\n"+
		"\2\2DE\5\n\6\2E\t\3\2\2\2FG\5\f\7\2GH\7\20\2\2HJ\3\2\2\2IF\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2\2MN\5\16\b\2NO\7\21\2\2OP\5\20\t"+
		"\2P\r\3\2\2\2QV\7\33\2\2RS\7\22\2\2SU\7\33\2\2TR\3\2\2\2UX\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2W\17\3\2\2\2XV\3\2\2\2YZ\7\24\2\2Z\21\3\2\2\2[\\\7\4\2"+
		"\2\\]\5\24\13\2]^\7\t\2\2^\23\3\2\2\2_`\5\26\f\2`a\7\20\2\2ac\3\2\2\2"+
		"b_\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\25\3\2\2\2fm\5\34\17\2gm\5 "+
		"\21\2hm\5\36\20\2im\5\30\r\2jm\5\22\n\2km\5\32\16\2lf\3\2\2\2lg\3\2\2"+
		"\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\27\3\2\2\2no\7\27\2\2op\5"+
		"\"\22\2pq\7\30\2\2qr\5\26\f\2r\31\3\2\2\2st\7\31\2\2tu\5\"\22\2uv\5\26"+
		"\f\2v\33\3\2\2\2wx\7\33\2\2xy\7\23\2\2yz\5\"\22\2z\35\3\2\2\2{|\7\5\2"+
		"\2|}\7\25\2\2}~\5\"\22\2~\177\7\26\2\2\177\u008a\3\2\2\2\u0080\u0081\7"+
		"\6\2\2\u0081\u0082\7\25\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7\26\2\2"+
		"\u0084\u008a\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u008a\7\33\2\2\u0087\u0088"+
		"\7\6\2\2\u0088\u008a\7\33\2\2\u0089{\3\2\2\2\u0089\u0080\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\37\3\2\2\2\u008b\u008c\7\7\2"+
		"\2\u008c\u008d\7\25\2\2\u008d\u0090\7\33\2\2\u008e\u008f\7\33\2\2\u008f"+
		"\u0091\7\20\2\2\u0090\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a0\7\26\2\2\u0095"+
		"\u0096\7\b\2\2\u0096\u0097\7\25\2\2\u0097\u009a\7\33\2\2\u0098\u0099\7"+
		"\33\2\2\u0099\u009b\7\20\2\2\u009a\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\26"+
		"\2\2\u009f\u008b\3\2\2\2\u009f\u0095\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a2"+
		"\5$\23\2\u00a2#\3\2\2\2\u00a3\u00a8\5&\24\2\u00a4\u00a5\t\2\2\2\u00a5"+
		"\u00a7\5&\24\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9%\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b0"+
		"\5(\25\2\u00ac\u00ad\t\3\2\2\u00ad\u00af\5(\25\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\'\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\5\"\22\2\u00b5\u00b6"+
		"\7\26\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00ba\7\33\2\2\u00b8\u00ba\5*\26\2"+
		"\u00b9\u00b3\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba)\3"+
		"\2\2\2\u00bb\u00bc\5,\27\2\u00bc+\3\2\2\2\u00bd\u00be\5.\30\2\u00be-\3"+
		"\2\2\2\u00bf\u00c0\7\32\2\2\u00c0/\3\2\2\2\17\67<KVdl\u0089\u0092\u009c"+
		"\u009f\u00a8\u00b0\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}