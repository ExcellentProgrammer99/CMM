// Generated from CMM.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATORS=1, WRITE=2, READ=3, DBL=4, ADD=5, INTEGER=6, PRINT=7, STRING=8, 
		DOUBLE=9, STR=10, ID=11, TOINT=12, TOREAL=13, TOSTRING=14, INT=15, COMA=16, 
		EQ=17, SQRBRACKETO=18, SQRBRACKETC=19, BRACKETO=20, BRACKETC=21, NEWLINE=22, 
		WS=23;
	public static final int
		RULE_stat = 0, RULE_start = 1, RULE_reader = 2, RULE_writer = 3, RULE_assignment = 4, 
		RULE_create_an_array_expression = 5, RULE_nextStrExpression = 6, RULE_nextIntExpression = 7, 
		RULE_nextDoubleExpression = 8, RULE_anyoperation = 9, RULE_indexExpression = 10, 
		RULE_print = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "start", "reader", "writer", "assignment", "create_an_array_expression", 
			"nextStrExpression", "nextIntExpression", "nextDoubleExpression", "anyoperation", 
			"indexExpression", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'WRITE'", "'READ'", null, "'+'", "'INT'", "'PRINT'", "'STRING'", 
			"'DOUBLE'", null, null, "'(int)'", "'(real)'", "'(string)'", null, "','", 
			"'='", "'['", "']'", "'('", "')'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATORS", "WRITE", "READ", "DBL", "ADD", "INTEGER", "PRINT", 
			"STRING", "DOUBLE", "STR", "ID", "TOINT", "TOREAL", "TOSTRING", "INT", 
			"COMA", "EQ", "SQRBRACKETO", "SQRBRACKETC", "BRACKETO", "BRACKETC", "NEWLINE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CMMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CMMParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << DOUBLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << INTEGER) | (1L << PRINT) | (1L << STRING) | (1L << DOUBLE))) != 0)) {
					{
					setState(24);
					start();
					}
				}

				setState(27);
				match(NEWLINE);
				}
				}
				setState(32);
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

	public static class StartContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public WriterContext writer() {
			return getRuleContext(WriterContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case STRING:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				assignment();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				print();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				writer();
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

	public static class ReaderContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMMParser.READ, 0); }
		public TerminalNode BRACKETO() { return getToken(CMMParser.BRACKETO, 0); }
		public TerminalNode STR() { return getToken(CMMParser.STR, 0); }
		public TerminalNode BRACKETC() { return getToken(CMMParser.BRACKETC, 0); }
		public ReaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterReader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitReader(this);
		}
	}

	public final ReaderContext reader() throws RecognitionException {
		ReaderContext _localctx = new ReaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_reader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(READ);
			setState(39);
			match(BRACKETO);
			setState(40);
			match(STR);
			setState(41);
			match(BRACKETC);
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

	public static class WriterContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CMMParser.WRITE, 0); }
		public TerminalNode BRACKETO() { return getToken(CMMParser.BRACKETO, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode COMA() { return getToken(CMMParser.COMA, 0); }
		public List<TerminalNode> STR() { return getTokens(CMMParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(CMMParser.STR, i);
		}
		public TerminalNode BRACKETC() { return getToken(CMMParser.BRACKETC, 0); }
		public IndexExpressionContext indexExpression() {
			return getRuleContext(IndexExpressionContext.class,0);
		}
		public WriterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWriter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWriter(this);
		}
	}

	public final WriterContext writer() throws RecognitionException {
		WriterContext _localctx = new WriterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_writer);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(WRITE);
				setState(44);
				match(BRACKETO);
				setState(45);
				match(ID);
				setState(46);
				match(COMA);
				setState(47);
				match(STR);
				setState(48);
				match(BRACKETC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(WRITE);
				setState(50);
				match(BRACKETO);
				setState(51);
				match(ID);
				setState(52);
				indexExpression();
				setState(53);
				match(COMA);
				setState(54);
				match(STR);
				setState(55);
				match(BRACKETC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(WRITE);
				setState(58);
				match(BRACKETO);
				setState(59);
				match(STR);
				setState(60);
				match(COMA);
				setState(61);
				match(STR);
				setState(62);
				match(BRACKETC);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CMMParser.STRING, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode EQ() { return getToken(CMMParser.EQ, 0); }
		public TerminalNode STR() { return getToken(CMMParser.STR, 0); }
		public IndexExpressionContext indexExpression() {
			return getRuleContext(IndexExpressionContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(CMMParser.DOUBLE, 0); }
		public TerminalNode DBL() { return getToken(CMMParser.DBL, 0); }
		public TerminalNode INTEGER() { return getToken(CMMParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public ReaderContext reader() {
			return getRuleContext(ReaderContext.class,0);
		}
		public Create_an_array_expressionContext create_an_array_expression() {
			return getRuleContext(Create_an_array_expressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(STRING);
				setState(66);
				match(ID);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQRBRACKETO) {
					{
					setState(67);
					indexExpression();
					}
				}

				setState(70);
				match(EQ);
				setState(71);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(DOUBLE);
				setState(73);
				match(ID);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQRBRACKETO) {
					{
					setState(74);
					indexExpression();
					}
				}

				setState(77);
				match(EQ);
				setState(78);
				match(DBL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(INTEGER);
				setState(80);
				match(ID);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQRBRACKETO) {
					{
					setState(81);
					indexExpression();
					}
				}

				setState(84);
				match(EQ);
				setState(85);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(STRING);
				setState(87);
				match(ID);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQRBRACKETO) {
					{
					setState(88);
					indexExpression();
					}
				}

				setState(91);
				match(EQ);
				setState(92);
				reader();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				create_an_array_expression();
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

	public static class Create_an_array_expressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CMMParser.STRING, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode EQ() { return getToken(CMMParser.EQ, 0); }
		public TerminalNode SQRBRACKETO() { return getToken(CMMParser.SQRBRACKETO, 0); }
		public TerminalNode STR() { return getToken(CMMParser.STR, 0); }
		public NextStrExpressionContext nextStrExpression() {
			return getRuleContext(NextStrExpressionContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(CMMParser.DOUBLE, 0); }
		public TerminalNode DBL() { return getToken(CMMParser.DBL, 0); }
		public NextDoubleExpressionContext nextDoubleExpression() {
			return getRuleContext(NextDoubleExpressionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CMMParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public NextIntExpressionContext nextIntExpression() {
			return getRuleContext(NextIntExpressionContext.class,0);
		}
		public Create_an_array_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_an_array_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterCreate_an_array_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitCreate_an_array_expression(this);
		}
	}

	public final Create_an_array_expressionContext create_an_array_expression() throws RecognitionException {
		Create_an_array_expressionContext _localctx = new Create_an_array_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_an_array_expression);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(STRING);
				setState(97);
				match(ID);
				setState(98);
				match(EQ);
				setState(99);
				match(SQRBRACKETO);
				setState(100);
				match(STR);
				setState(101);
				nextStrExpression();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(DOUBLE);
				setState(103);
				match(ID);
				setState(104);
				match(EQ);
				setState(105);
				match(SQRBRACKETO);
				setState(106);
				match(DBL);
				setState(107);
				nextDoubleExpression();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(INTEGER);
				setState(109);
				match(ID);
				setState(110);
				match(EQ);
				setState(111);
				match(SQRBRACKETO);
				setState(112);
				match(INT);
				setState(113);
				nextIntExpression();
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

	public static class NextStrExpressionContext extends ParserRuleContext {
		public TerminalNode SQRBRACKETC() { return getToken(CMMParser.SQRBRACKETC, 0); }
		public TerminalNode COMA() { return getToken(CMMParser.COMA, 0); }
		public TerminalNode STR() { return getToken(CMMParser.STR, 0); }
		public NextStrExpressionContext nextStrExpression() {
			return getRuleContext(NextStrExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CMMParser.ADD, 0); }
		public NextStrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextStrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNextStrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNextStrExpression(this);
		}
	}

	public final NextStrExpressionContext nextStrExpression() throws RecognitionException {
		NextStrExpressionContext _localctx = new NextStrExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nextStrExpression);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRBRACKETC:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(SQRBRACKETC);
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(COMA);
				setState(118);
				match(STR);
				setState(119);
				nextStrExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(ADD);
				setState(121);
				match(STR);
				setState(122);
				nextStrExpression();
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

	public static class NextIntExpressionContext extends ParserRuleContext {
		public TerminalNode SQRBRACKETC() { return getToken(CMMParser.SQRBRACKETC, 0); }
		public TerminalNode COMA() { return getToken(CMMParser.COMA, 0); }
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public NextIntExpressionContext nextIntExpression() {
			return getRuleContext(NextIntExpressionContext.class,0);
		}
		public AnyoperationContext anyoperation() {
			return getRuleContext(AnyoperationContext.class,0);
		}
		public NextIntExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextIntExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNextIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNextIntExpression(this);
		}
	}

	public final NextIntExpressionContext nextIntExpression() throws RecognitionException {
		NextIntExpressionContext _localctx = new NextIntExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nextIntExpression);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRBRACKETC:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(SQRBRACKETC);
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(COMA);
				setState(127);
				match(INT);
				setState(128);
				nextIntExpression();
				}
				break;
			case OPERATORS:
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				anyoperation();
				setState(130);
				match(INT);
				setState(131);
				nextIntExpression();
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

	public static class NextDoubleExpressionContext extends ParserRuleContext {
		public TerminalNode SQRBRACKETC() { return getToken(CMMParser.SQRBRACKETC, 0); }
		public TerminalNode COMA() { return getToken(CMMParser.COMA, 0); }
		public TerminalNode DBL() { return getToken(CMMParser.DBL, 0); }
		public NextDoubleExpressionContext nextDoubleExpression() {
			return getRuleContext(NextDoubleExpressionContext.class,0);
		}
		public AnyoperationContext anyoperation() {
			return getRuleContext(AnyoperationContext.class,0);
		}
		public NextDoubleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextDoubleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNextDoubleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNextDoubleExpression(this);
		}
	}

	public final NextDoubleExpressionContext nextDoubleExpression() throws RecognitionException {
		NextDoubleExpressionContext _localctx = new NextDoubleExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nextDoubleExpression);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRBRACKETC:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(SQRBRACKETC);
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(COMA);
				setState(137);
				match(DBL);
				setState(138);
				nextDoubleExpression();
				}
				break;
			case OPERATORS:
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				anyoperation();
				setState(140);
				match(DBL);
				setState(141);
				nextDoubleExpression();
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

	public static class AnyoperationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CMMParser.ADD, 0); }
		public TerminalNode OPERATORS() { return getToken(CMMParser.OPERATORS, 0); }
		public AnyoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAnyoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAnyoperation(this);
		}
	}

	public final AnyoperationContext anyoperation() throws RecognitionException {
		AnyoperationContext _localctx = new AnyoperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_anyoperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==OPERATORS || _la==ADD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IndexExpressionContext extends ParserRuleContext {
		public TerminalNode SQRBRACKETO() { return getToken(CMMParser.SQRBRACKETO, 0); }
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public TerminalNode SQRBRACKETC() { return getToken(CMMParser.SQRBRACKETC, 0); }
		public IndexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIndexExpression(this);
		}
	}

	public final IndexExpressionContext indexExpression() throws RecognitionException {
		IndexExpressionContext _localctx = new IndexExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_indexExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SQRBRACKETO);
			setState(148);
			match(INT);
			setState(149);
			match(SQRBRACKETC);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CMMParser.PRINT, 0); }
		public TerminalNode BRACKETO() { return getToken(CMMParser.BRACKETO, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode BRACKETC() { return getToken(CMMParser.BRACKETC, 0); }
		public TerminalNode STRING() { return getToken(CMMParser.STRING, 0); }
		public ReaderContext reader() {
			return getRuleContext(ReaderContext.class,0);
		}
		public IndexExpressionContext indexExpression() {
			return getRuleContext(IndexExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(PRINT);
				setState(152);
				match(BRACKETO);
				setState(153);
				match(ID);
				setState(154);
				match(BRACKETC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(PRINT);
				setState(156);
				match(BRACKETO);
				setState(157);
				match(STRING);
				setState(158);
				match(BRACKETC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(PRINT);
				setState(160);
				match(BRACKETO);
				setState(161);
				reader();
				setState(162);
				match(BRACKETC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(PRINT);
				setState(165);
				match(BRACKETO);
				setState(166);
				match(ID);
				setState(167);
				indexExpression();
				setState(168);
				match(BRACKETC);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0005\u0000\u001d\b"+
		"\u0000\n\u0000\f\u0000 \t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004L\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004S\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Z\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004_\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005s\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0086\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0090\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ab\b\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0001\u0002\u0000\u0001\u0001\u0005\u0005\u00b9\u0000\u001e\u0001\u0000"+
		"\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000"+
		"\u0006?\u0001\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\nr\u0001\u0000"+
		"\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000"+
		"\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u0091\u0001\u0000\u0000"+
		"\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u00aa\u0001\u0000\u0000"+
		"\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001d\u0005\u0016\u0000\u0000\u001c\u0019\u0001\u0000\u0000"+
		"\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u0001\u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000!%\u0003\b\u0004\u0000\"%\u0003\u0016\u000b"+
		"\u0000#%\u0003\u0006\u0003\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0003\u0000\u0000\'(\u0005\u0014\u0000\u0000()\u0005\n\u0000"+
		"\u0000)*\u0005\u0015\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0005"+
		"\u0002\u0000\u0000,-\u0005\u0014\u0000\u0000-.\u0005\u000b\u0000\u0000"+
		"./\u0005\u0010\u0000\u0000/0\u0005\n\u0000\u00000@\u0005\u0015\u0000\u0000"+
		"12\u0005\u0002\u0000\u000023\u0005\u0014\u0000\u000034\u0005\u000b\u0000"+
		"\u000045\u0003\u0014\n\u000056\u0005\u0010\u0000\u000067\u0005\n\u0000"+
		"\u000078\u0005\u0015\u0000\u00008@\u0001\u0000\u0000\u00009:\u0005\u0002"+
		"\u0000\u0000:;\u0005\u0014\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\u0010"+
		"\u0000\u0000=>\u0005\n\u0000\u0000>@\u0005\u0015\u0000\u0000?+\u0001\u0000"+
		"\u0000\u0000?1\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000@\u0007"+
		"\u0001\u0000\u0000\u0000AB\u0005\b\u0000\u0000BD\u0005\u000b\u0000\u0000"+
		"CE\u0003\u0014\n\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0005\u0011\u0000\u0000G_\u0005\n\u0000\u0000"+
		"HI\u0005\t\u0000\u0000IK\u0005\u000b\u0000\u0000JL\u0003\u0014\n\u0000"+
		"KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0005\u0011\u0000\u0000N_\u0005\u0004\u0000\u0000OP\u0005\u0006"+
		"\u0000\u0000PR\u0005\u000b\u0000\u0000QS\u0003\u0014\n\u0000RQ\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0011\u0000\u0000U_\u0005\u000f\u0000\u0000VW\u0005\b\u0000\u0000WY\u0005"+
		"\u000b\u0000\u0000XZ\u0003\u0014\n\u0000YX\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u0011\u0000\u0000"+
		"\\_\u0003\u0004\u0002\u0000]_\u0003\n\u0005\u0000^A\u0001\u0000\u0000"+
		"\u0000^H\u0001\u0000\u0000\u0000^O\u0001\u0000\u0000\u0000^V\u0001\u0000"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_\t\u0001\u0000\u0000\u0000`a\u0005"+
		"\b\u0000\u0000ab\u0005\u000b\u0000\u0000bc\u0005\u0011\u0000\u0000cd\u0005"+
		"\u0012\u0000\u0000de\u0005\n\u0000\u0000es\u0003\f\u0006\u0000fg\u0005"+
		"\t\u0000\u0000gh\u0005\u000b\u0000\u0000hi\u0005\u0011\u0000\u0000ij\u0005"+
		"\u0012\u0000\u0000jk\u0005\u0004\u0000\u0000ks\u0003\u0010\b\u0000lm\u0005"+
		"\u0006\u0000\u0000mn\u0005\u000b\u0000\u0000no\u0005\u0011\u0000\u0000"+
		"op\u0005\u0012\u0000\u0000pq\u0005\u000f\u0000\u0000qs\u0003\u000e\u0007"+
		"\u0000r`\u0001\u0000\u0000\u0000rf\u0001\u0000\u0000\u0000rl\u0001\u0000"+
		"\u0000\u0000s\u000b\u0001\u0000\u0000\u0000t|\u0005\u0013\u0000\u0000"+
		"uv\u0005\u0010\u0000\u0000vw\u0005\n\u0000\u0000w|\u0003\f\u0006\u0000"+
		"xy\u0005\u0005\u0000\u0000yz\u0005\n\u0000\u0000z|\u0003\f\u0006\u0000"+
		"{t\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000"+
		"\u0000|\r\u0001\u0000\u0000\u0000}\u0086\u0005\u0013\u0000\u0000~\u007f"+
		"\u0005\u0010\u0000\u0000\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0086"+
		"\u0003\u000e\u0007\u0000\u0081\u0082\u0003\u0012\t\u0000\u0082\u0083\u0005"+
		"\u000f\u0000\u0000\u0083\u0084\u0003\u000e\u0007\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000\u0085~\u0001\u0000\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086\u000f\u0001\u0000\u0000"+
		"\u0000\u0087\u0090\u0005\u0013\u0000\u0000\u0088\u0089\u0005\u0010\u0000"+
		"\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u0090\u0003\u0010\b\u0000"+
		"\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0005\u0004\u0000\u0000\u008d"+
		"\u008e\u0003\u0010\b\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0087"+
		"\u0001\u0000\u0000\u0000\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u008b"+
		"\u0001\u0000\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0007\u0000\u0000\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u0012\u0000\u0000\u0094\u0095\u0005\u000f\u0000\u0000\u0095\u0096"+
		"\u0005\u0013\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\u0007\u0000\u0000\u0098\u0099\u0005\u0014\u0000\u0000\u0099\u009a"+
		"\u0005\u000b\u0000\u0000\u009a\u00ab\u0005\u0015\u0000\u0000\u009b\u009c"+
		"\u0005\u0007\u0000\u0000\u009c\u009d\u0005\u0014\u0000\u0000\u009d\u009e"+
		"\u0005\b\u0000\u0000\u009e\u00ab\u0005\u0015\u0000\u0000\u009f\u00a0\u0005"+
		"\u0007\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1\u00a2\u0003"+
		"\u0004\u0002\u0000\u00a2\u00a3\u0005\u0015\u0000\u0000\u00a3\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005\u0007\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0014\u0000\u0000\u00a6\u00a7\u0005\u000b\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0014\n\u0000\u00a8\u00a9\u0005\u0015\u0000\u0000\u00a9\u00ab\u0001\u0000"+
		"\u0000\u0000\u00aa\u0097\u0001\u0000\u0000\u0000\u00aa\u009b\u0001\u0000"+
		"\u0000\u0000\u00aa\u009f\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001\u0000"+
		"\u0000\u0000\u00ab\u0017\u0001\u0000\u0000\u0000\u000e\u0019\u001e$?D"+
		"KRY^r{\u0085\u008f\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}