// Generated from /Users/martini/Downloads/CMM/CMM.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, FUNCTION=8, ENDFUNCTION=9, 
		IF=10, ENDIF=11, THEN=12, REPEAT=13, ENDREPEAT=14, WRITE=15, READ=16, 
		TOINT=17, TOREAL=18, ID=19, COMPARE=20, REAL=21, INT=22, ADD=23, MULT=24, 
		STR=25, NEWLINE=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_equal = 2, RULE_blockif = 3, RULE_expr0 = 4, 
		RULE_expr1 = 5, RULE_expr2 = 6, RULE_arr = 7, RULE_function = 8, RULE_repetitions = 9, 
		RULE_fparam = 10, RULE_fblock = 11, RULE_value = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "equal", "blockif", "expr0", "expr1", "expr2", "arr", 
			"function", "repetitions", "fparam", "fblock", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'('", "')'", "'['", "']'", "'print'", "'function'", 
			"'endfunction'", "'IF'", "'endif'", "'THEN'", "'repeat'", "'endrepeat'", 
			"'WRITE'", "'READ'", "'(int)'", "'(real)'", null, null, null, null, "'+'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PRINT", "FUNCTION", "ENDFUNCTION", 
			"IF", "ENDIF", "THEN", "REPEAT", "ENDREPEAT", "WRITE", "READ", "TOINT", 
			"TOREAL", "ID", "COMPARE", "REAL", "INT", "ADD", "MULT", "STR", "NEWLINE", 
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

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CMMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CMMParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << FUNCTION) | (1L << IF) | (1L << REPEAT) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
				case IF:
				case REPEAT:
				case WRITE:
				case READ:
				case ID:
					{
					setState(26);
					stat();
					}
					break;
				case FUNCTION:
					{
					setState(27);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(30);
				match(NEWLINE);
				}
				}
				setState(35);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends StatContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public CallContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(CMMParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(CMMParser.READ, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class RepeatContext extends StatContext {
		public TerminalNode REPEAT() { return getToken(CMMParser.REPEAT, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode ENDREPEAT() { return getToken(CMMParser.ENDREPEAT, 0); }
		public RepeatContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class IfContext extends StatContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public TerminalNode THEN() { return getToken(CMMParser.THEN, 0); }
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(CMMParser.ENDIF, 0); }
		public IfContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class WriteContext extends StatContext {
		public TerminalNode WRITE() { return getToken(CMMParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(IF);
				setState(37);
				equal();
				setState(38);
				match(THEN);
				setState(39);
				blockif();
				setState(40);
				match(ENDIF);
				}
				break;
			case 2:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(READ);
				setState(43);
				match(ID);
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(PRINT);
				setState(45);
				match(ID);
				}
				break;
			case 4:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(ID);
				}
				break;
			case 5:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(REPEAT);
				setState(48);
				repetitions();
				setState(49);
				prog();
				setState(50);
				match(ENDREPEAT);
				}
				break;
			case 6:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(ID);
				setState(53);
				match(T__0);
				setState(54);
				expr0();
				}
				break;
			case 7:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				match(WRITE);
				setState(56);
				match(ID);
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

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(T__1);
			setState(61);
			match(INT);
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

	public static class BlockifContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			prog();
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

	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
	}
	public static class AddContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(CMMParser.ADD, 0); }
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr0);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				expr1();
				setState(67);
				match(ADD);
				setState(68);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
	}
	public static class MultContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(CMMParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				expr2();
				setState(74);
				match(MULT);
				setState(75);
				expr2();
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends Expr2Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(CMMParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends Expr2Context {
		public TerminalNode STR() { return getToken(CMMParser.STR, 0); }
		public StringContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	public static class ArrayContext extends Expr2Context {
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public ArrayContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(CMMParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	public static class IDContext extends Expr2Context {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public IDContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	public static class RealContext extends Expr2Context {
		public TerminalNode REAL() { return getToken(CMMParser.REAL, 0); }
		public RealContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr2);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ID);
				}
				break;
			case STR:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(STR);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(REAL);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(TOINT);
				setState(84);
				expr2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(TOREAL);
				setState(86);
				expr2();
				}
				break;
			case T__2:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				match(T__2);
				setState(88);
				expr0();
				setState(89);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				arr();
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

	public static class ArrContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__4);
			setState(95);
			value();
			setState(96);
			match(T__5);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CMMParser.FUNCTION, 0); }
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(CMMParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FUNCTION);
			setState(99);
			fparam();
			setState(100);
			fblock();
			setState(101);
			match(ENDFUNCTION);
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

	public static class RepetitionsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			value();
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

	public static class FparamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
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

	public static class FblockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CMMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CMMParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << REPEAT) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << REPEAT) | (1L << WRITE) | (1L << READ) | (1L << ID))) != 0)) {
					{
					setState(107);
					stat();
					}
				}

				setState(110);
				match(NEWLINE);
				}
				}
				setState(115);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public TerminalNode REAL() { return getToken(CMMParser.REAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6I\n\6\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\5\ro\n\r\3\r\7\rr\n\r\f\r\16\ru\13\r\3\16\3\16\3\16"+
		"\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\27\30\2\177\2#\3\2\2"+
		"\2\4;\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nH\3\2\2\2\fO\3\2\2\2\16^\3\2\2\2"+
		"\20`\3\2\2\2\22d\3\2\2\2\24i\3\2\2\2\26k\3\2\2\2\30s\3\2\2\2\32v\3\2\2"+
		"\2\34\37\5\4\3\2\35\37\5\22\n\2\36\34\3\2\2\2\36\35\3\2\2\2\36\37\3\2"+
		"\2\2\37 \3\2\2\2 \"\7\34\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$\3\3\2\2\2%#\3\2\2\2&\'\7\f\2\2\'(\5\6\4\2()\7\16\2\2)*\5\b\5\2*+\7"+
		"\r\2\2+<\3\2\2\2,-\7\22\2\2-<\7\25\2\2./\7\t\2\2/<\7\25\2\2\60<\7\25\2"+
		"\2\61\62\7\17\2\2\62\63\5\24\13\2\63\64\5\2\2\2\64\65\7\20\2\2\65<\3\2"+
		"\2\2\66\67\7\25\2\2\678\7\3\2\28<\5\n\6\29:\7\21\2\2:<\7\25\2\2;&\3\2"+
		"\2\2;,\3\2\2\2;.\3\2\2\2;\60\3\2\2\2;\61\3\2\2\2;\66\3\2\2\2;9\3\2\2\2"+
		"<\5\3\2\2\2=>\7\25\2\2>?\7\4\2\2?@\7\30\2\2@\7\3\2\2\2AB\5\2\2\2B\t\3"+
		"\2\2\2CI\5\f\7\2DE\5\f\7\2EF\7\31\2\2FG\5\f\7\2GI\3\2\2\2HC\3\2\2\2HD"+
		"\3\2\2\2I\13\3\2\2\2JP\5\16\b\2KL\5\16\b\2LM\7\32\2\2MN\5\16\b\2NP\3\2"+
		"\2\2OJ\3\2\2\2OK\3\2\2\2P\r\3\2\2\2Q_\7\25\2\2R_\7\33\2\2S_\7\30\2\2T"+
		"_\7\27\2\2UV\7\23\2\2V_\5\16\b\2WX\7\24\2\2X_\5\16\b\2YZ\7\5\2\2Z[\5\n"+
		"\6\2[\\\7\6\2\2\\_\3\2\2\2]_\5\20\t\2^Q\3\2\2\2^R\3\2\2\2^S\3\2\2\2^T"+
		"\3\2\2\2^U\3\2\2\2^W\3\2\2\2^Y\3\2\2\2^]\3\2\2\2_\17\3\2\2\2`a\7\7\2\2"+
		"ab\5\32\16\2bc\7\b\2\2c\21\3\2\2\2de\7\n\2\2ef\5\26\f\2fg\5\30\r\2gh\7"+
		"\13\2\2h\23\3\2\2\2ij\5\32\16\2j\25\3\2\2\2kl\7\25\2\2l\27\3\2\2\2mo\5"+
		"\4\3\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\34\2\2qn\3\2\2\2ru\3\2\2\2sq"+
		"\3\2\2\2st\3\2\2\2t\31\3\2\2\2us\3\2\2\2vw\t\2\2\2w\33\3\2\2\2\n\36#;"+
		"HO^ns";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}