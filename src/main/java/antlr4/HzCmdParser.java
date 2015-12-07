// Generated from HzCmd.g4 by ANTLR 4.5
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HzCmdParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USER=1, VERSION=2, ADD=3, FILE=4, IP=5, CLUSTER=6, REPLICATE=7, INSTALL=8, 
		EE=9, OS=10, LOAD=11, SET=12, INVOKE=13, KILL=14, START=15, SLEEP=16, 
		SAVE=17, ALL=18, MEMBER=19, CLIENT=20, MEMBER_ALL=21, MEMBER_VAR=22, CLIENT_ALL=23, 
		CLIENT_VAR=24, MEMBERS_ONLY=25, MEMBERS=26, CLIENTS=27, ASSIGN=28, BOOL=29, 
		TRUE=30, FALSE=31, VAR=32, NUMBER=33, WHITESPACE=34, STRING=35, IP_PAIR=36, 
		IP_STR=37, COMMENT=38;
	public static final int
		RULE_script = 0, RULE_statement = 1;
	public static final String[] ruleNames = {
		"script", "statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'user'", "'version'", "'add'", "'file'", "'ip'", "'cluster'", "'replicate'", 
		"'install'", "'EE'", "'OS'", "'load'", "'set'", "'invoke'", "'kill'", 
		"'start'", "'sleep'", "'save'", "'*'", "'member'", "'client'", null, null, 
		null, null, "'membersOnly'", "'members'", "'clients'", "'='", null, "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "USER", "VERSION", "ADD", "FILE", "IP", "CLUSTER", "REPLICATE", 
		"INSTALL", "EE", "OS", "LOAD", "SET", "INVOKE", "KILL", "START", "SLEEP", 
		"SAVE", "ALL", "MEMBER", "CLIENT", "MEMBER_ALL", "MEMBER_VAR", "CLIENT_ALL", 
		"CLIENT_VAR", "MEMBERS_ONLY", "MEMBERS", "CLIENTS", "ASSIGN", "BOOL", 
		"TRUE", "FALSE", "VAR", "NUMBER", "WHITESPACE", "STRING", "IP_PAIR", "IP_STR", 
		"COMMENT"
	};
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
	public String getGrammarFileName() { return "HzCmd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HzCmdParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HzCmdListener ) ((HzCmdListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HzCmdListener ) ((HzCmdListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			statement();
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
		public List<TerminalNode> VAR() { return getTokens(HzCmdParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(HzCmdParser.VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(HzCmdParser.ASSIGN, 0); }
		public List<TerminalNode> STRING() { return getTokens(HzCmdParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HzCmdParser.STRING, i);
		}
		public TerminalNode USER() { return getToken(HzCmdParser.USER, 0); }
		public TerminalNode VERSION() { return getToken(HzCmdParser.VERSION, 0); }
		public TerminalNode ADD() { return getToken(HzCmdParser.ADD, 0); }
		public TerminalNode IP() { return getToken(HzCmdParser.IP, 0); }
		public TerminalNode IP_PAIR() { return getToken(HzCmdParser.IP_PAIR, 0); }
		public TerminalNode FILE() { return getToken(HzCmdParser.FILE, 0); }
		public TerminalNode CLUSTER() { return getToken(HzCmdParser.CLUSTER, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(HzCmdParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HzCmdParser.NUMBER, i);
		}
		public TerminalNode REPLICATE() { return getToken(HzCmdParser.REPLICATE, 0); }
		public TerminalNode INSTALL() { return getToken(HzCmdParser.INSTALL, 0); }
		public List<TerminalNode> ALL() { return getTokens(HzCmdParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(HzCmdParser.ALL, i);
		}
		public TerminalNode OS() { return getToken(HzCmdParser.OS, 0); }
		public TerminalNode EE() { return getToken(HzCmdParser.EE, 0); }
		public TerminalNode MEMBER() { return getToken(HzCmdParser.MEMBER, 0); }
		public TerminalNode CLIENT() { return getToken(HzCmdParser.CLIENT, 0); }
		public TerminalNode LOAD() { return getToken(HzCmdParser.LOAD, 0); }
		public TerminalNode SET() { return getToken(HzCmdParser.SET, 0); }
		public TerminalNode INVOKE() { return getToken(HzCmdParser.INVOKE, 0); }
		public TerminalNode MEMBER_ALL() { return getToken(HzCmdParser.MEMBER_ALL, 0); }
		public TerminalNode MEMBER_VAR() { return getToken(HzCmdParser.MEMBER_VAR, 0); }
		public TerminalNode CLIENT_ALL() { return getToken(HzCmdParser.CLIENT_ALL, 0); }
		public TerminalNode CLIENT_VAR() { return getToken(HzCmdParser.CLIENT_VAR, 0); }
		public TerminalNode KILL() { return getToken(HzCmdParser.KILL, 0); }
		public TerminalNode START() { return getToken(HzCmdParser.START, 0); }
		public TerminalNode SLEEP() { return getToken(HzCmdParser.SLEEP, 0); }
		public TerminalNode MEMBERS_ONLY() { return getToken(HzCmdParser.MEMBERS_ONLY, 0); }
		public TerminalNode SAVE() { return getToken(HzCmdParser.SAVE, 0); }
		public TerminalNode COMMENT() { return getToken(HzCmdParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HzCmdListener ) ((HzCmdListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HzCmdListener ) ((HzCmdListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(VAR);
				setState(7);
				match(ASSIGN);
				setState(8);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(USER);
				setState(10);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				match(VERSION);
				setState(12);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				match(ADD);
				{
				setState(14);
				match(IP);
				setState(15);
				match(IP_PAIR);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(16);
				match(ADD);
				{
				setState(17);
				match(FILE);
				setState(18);
				match(STRING);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(19);
				match(CLUSTER);
				setState(20);
				match(VAR);
				setState(21);
				match(NUMBER);
				setState(22);
				match(NUMBER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(23);
				match(REPLICATE);
				setState(24);
				match(VAR);
				setState(25);
				match(VAR);
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==STRING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==STRING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(28);
				match(INSTALL);
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(30);
				_la = _input.LA(1);
				if ( !(_la==EE || _la==OS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					match(VAR);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAR );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(36);
				match(ADD);
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==MEMBER || _la==CLIENT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(38);
				match(VAR);
				setState(39);
				match(NUMBER);
				setState(40);
				match(VAR);
				setState(41);
				match(VAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(42);
				match(LOAD);
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(44);
				match(VAR);
				setState(45);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(46);
				match(SET);
				setState(47);
				match(VAR);
				setState(48);
				matchWildcard();
				setState(49);
				match(VAR);
				setState(50);
				match(ASSIGN);
				setState(51);
				match(STRING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(52);
				match(INVOKE);
				setState(53);
				match(NUMBER);
				setState(54);
				match(VAR);
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(56);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(57);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(58);
				match(KILL);
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(60);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(61);
				match(START);
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(63);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(64);
				match(SLEEP);
				setState(65);
				match(NUMBER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(66);
				match(MEMBERS_ONLY);
				setState(67);
				match(NUMBER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(68);
				match(SAVE);
				setState(69);
				match(STRING);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(70);
				match(COMMENT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(L\4\2\t\2\4\3\t\3"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3#\n\3\r\3\16\3$\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n"+
		"\3\3\3\2\2\4\2\4\2\7\4\2\"\"%%\4\2\24\24\"\"\3\2\13\f\3\2\25\26\4\2\24"+
		"\24\27\32[\2\6\3\2\2\2\4I\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\7\"\2\2"+
		"\t\n\7\36\2\2\nJ\7%\2\2\13\f\7\3\2\2\fJ\7%\2\2\r\16\7\4\2\2\16J\7%\2\2"+
		"\17\20\7\5\2\2\20\21\7\7\2\2\21J\7&\2\2\22\23\7\5\2\2\23\24\7\6\2\2\24"+
		"J\7%\2\2\25\26\7\b\2\2\26\27\7\"\2\2\27\30\7#\2\2\30J\7#\2\2\31\32\7\t"+
		"\2\2\32\33\7\"\2\2\33\34\7\"\2\2\34\35\t\2\2\2\35J\t\2\2\2\36\37\7\n\2"+
		"\2\37 \t\3\2\2 \"\t\4\2\2!#\7\"\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%"+
		"\3\2\2\2%J\3\2\2\2&\'\7\5\2\2\'(\t\5\2\2()\7\"\2\2)*\7#\2\2*+\7\"\2\2"+
		"+J\7\"\2\2,-\7\r\2\2-.\t\3\2\2./\7\"\2\2/J\7%\2\2\60\61\7\16\2\2\61\62"+
		"\7\"\2\2\62\63\13\2\2\2\63\64\7\"\2\2\64\65\7\36\2\2\65J\7%\2\2\66\67"+
		"\7\17\2\2\678\7#\2\289\7\"\2\29:\t\3\2\2:;\t\3\2\2;J\t\6\2\2<=\7\20\2"+
		"\2=>\t\3\2\2>J\t\6\2\2?@\7\21\2\2@A\t\3\2\2AJ\t\6\2\2BC\7\22\2\2CJ\7#"+
		"\2\2DE\7\33\2\2EJ\7#\2\2FG\7\23\2\2GJ\7%\2\2HJ\7(\2\2I\b\3\2\2\2I\13\3"+
		"\2\2\2I\r\3\2\2\2I\17\3\2\2\2I\22\3\2\2\2I\25\3\2\2\2I\31\3\2\2\2I\36"+
		"\3\2\2\2I&\3\2\2\2I,\3\2\2\2I\60\3\2\2\2I\66\3\2\2\2I<\3\2\2\2I?\3\2\2"+
		"\2IB\3\2\2\2ID\3\2\2\2IF\3\2\2\2IH\3\2\2\2J\5\3\2\2\2\4$I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}