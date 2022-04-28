// Generated from CMM.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATORS=1, WRITE=2, READ=3, DBL=4, ADD=5, INTEGER=6, PRINT=7, STRING=8, 
		DOUBLE=9, STR=10, ID=11, TOINT=12, TOREAL=13, TOSTRING=14, INT=15, COMA=16, 
		EQ=17, SQRBRACKETO=18, SQRBRACKETC=19, BRACKETO=20, BRACKETC=21, NEWLINE=22, 
		WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATORS", "WRITE", "READ", "DBL", "ADD", "INTEGER", "PRINT", "STRING", 
			"DOUBLE", "STR", "ID", "TOINT", "TOREAL", "TOSTRING", "INT", "COMA", 
			"EQ", "SQRBRACKETO", "SQRBRACKETC", "BRACKETO", "BRACKETC", "NEWLINE", 
			"WS"
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


	public CMMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u00003\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003"+
		"\f\u0003B\u0001\u0003\u0001\u0003\u0004\u0003G\b\u0003\u000b\u0003\f\u0003"+
		"H\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\tg\b\t\n\t\f\tj\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\np\b\n\n\n\f\ns\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0004\u000e\u008c\b\u000e\u000b\u000e\f\u000e\u008d\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u009f\b\u0016\u000b\u0016\f"+
		"\u0016\u00a0\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0003"+
		"\u0000**--//\u0002\u0000\"\"\\\\\u0003\u0000AZ__az\u0004\u000009AZ__a"+
		"z\u0002\u0000\t\t  \u00aa\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u00012\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000"+
		"\u0000\u0005:\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\t"+
		"J\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000\rP\u0001\u0000"+
		"\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000"+
		"\u0013d\u0001\u0000\u0000\u0000\u0015m\u0001\u0000\u0000\u0000\u0017t"+
		"\u0001\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b\u0081\u0001"+
		"\u0000\u0000\u0000\u001d\u008b\u0001\u0000\u0000\u0000\u001f\u008f\u0001"+
		"\u0000\u0000\u0000!\u0091\u0001\u0000\u0000\u0000#\u0093\u0001\u0000\u0000"+
		"\u0000%\u0095\u0001\u0000\u0000\u0000\'\u0097\u0001\u0000\u0000\u0000"+
		")\u0099\u0001\u0000\u0000\u0000+\u009b\u0001\u0000\u0000\u0000-\u009e"+
		"\u0001\u0000\u0000\u0000/3\u0007\u0000\u0000\u000001\u0005*\u0000\u0000"+
		"13\u0005*\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"3\u0002\u0001\u0000\u0000\u000045\u0005W\u0000\u000056\u0005R\u0000\u0000"+
		"67\u0005I\u0000\u000078\u0005T\u0000\u000089\u0005E\u0000\u00009\u0004"+
		"\u0001\u0000\u0000\u0000:;\u0005R\u0000\u0000;<\u0005E\u0000\u0000<=\u0005"+
		"A\u0000\u0000=>\u0005D\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?A\u0002"+
		"09\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0005"+
		".\u0000\u0000EG\u000209\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\b\u0001"+
		"\u0000\u0000\u0000JK\u0005+\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0005"+
		"I\u0000\u0000MN\u0005N\u0000\u0000NO\u0005T\u0000\u0000O\f\u0001\u0000"+
		"\u0000\u0000PQ\u0005P\u0000\u0000QR\u0005R\u0000\u0000RS\u0005I\u0000"+
		"\u0000ST\u0005N\u0000\u0000TU\u0005T\u0000\u0000U\u000e\u0001\u0000\u0000"+
		"\u0000VW\u0005S\u0000\u0000WX\u0005T\u0000\u0000XY\u0005R\u0000\u0000"+
		"YZ\u0005I\u0000\u0000Z[\u0005N\u0000\u0000[\\\u0005G\u0000\u0000\\\u0010"+
		"\u0001\u0000\u0000\u0000]^\u0005D\u0000\u0000^_\u0005O\u0000\u0000_`\u0005"+
		"U\u0000\u0000`a\u0005B\u0000\u0000ab\u0005L\u0000\u0000bc\u0005E\u0000"+
		"\u0000c\u0012\u0001\u0000\u0000\u0000dh\u0005\"\u0000\u0000eg\b\u0001"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000kl\u0005\"\u0000\u0000l\u0014\u0001\u0000\u0000"+
		"\u0000mq\u0007\u0002\u0000\u0000np\u0007\u0003\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000r\u0016\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000tu\u0005(\u0000\u0000uv\u0005i\u0000\u0000vw\u0005n\u0000\u0000"+
		"wx\u0005t\u0000\u0000xy\u0005)\u0000\u0000y\u0018\u0001\u0000\u0000\u0000"+
		"z{\u0005(\u0000\u0000{|\u0005r\u0000\u0000|}\u0005e\u0000\u0000}~\u0005"+
		"a\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005)\u0000\u0000"+
		"\u0080\u001a\u0001\u0000\u0000\u0000\u0081\u0082\u0005(\u0000\u0000\u0082"+
		"\u0083\u0005s\u0000\u0000\u0083\u0084\u0005t\u0000\u0000\u0084\u0085\u0005"+
		"r\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086\u0087\u0005n\u0000"+
		"\u0000\u0087\u0088\u0005g\u0000\u0000\u0088\u0089\u0005)\u0000\u0000\u0089"+
		"\u001c\u0001\u0000\u0000\u0000\u008a\u008c\u000209\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u001e\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005,\u0000\u0000\u0090 \u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005=\u0000\u0000\u0092\"\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005[\u0000\u0000\u0094$\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005]\u0000\u0000\u0096&\u0001\u0000\u0000\u0000\u0097\u0098\u0005("+
		"\u0000\u0000\u0098(\u0001\u0000\u0000\u0000\u0099\u009a\u0005)\u0000\u0000"+
		"\u009a*\u0001\u0000\u0000\u0000\u009b\u009c\u0005\n\u0000\u0000\u009c"+
		",\u0001\u0000\u0000\u0000\u009d\u009f\u0007\u0004\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u0016\u0000\u0000\u00a3.\u0001"+
		"\u0000\u0000\u0000\b\u00002BHhq\u008d\u00a0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}