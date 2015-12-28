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
		HOMEIP=1, USER=2, VERSION=3, ADD=4, MEMBER_BOX=5, BOXES=6, IP=7, CLUSTER=8, 
		REPLICATE=9, INSTALL=10, UNINSTALL=11, EE=12, OS=13, LOAD=14, SET=15, 
		INVOKE=16, STOP=17, INFO=18, KILL=19, CAT=20, GREP=21, RESTART=22, CLEAN=23, 
		SLEEP=24, SAVE=25, EXIT=26, DOWNLOAD=27, SHOWSSH=28, PROMPT=29, ALL=30, 
		MEMBER=31, CLIENT=32, MEMBER_ALL=33, MEMBER_VAR=34, CLIENT_ALL=35, CLIENT_VAR=36, 
		MEMBERS_ONLY=37, MEMBERS=38, CLIENTS=39, ASSIGN=40, BOOL=41, TRUE=42, 
		FALSE=43, VAR=44, NUMBER=45, WHITESPACE=46, STRING=47, IP_PAIR=48, IP_STR=49, 
		COMMENT=50;
	public static final int
		RULE_script = 0, RULE_statement = 1;
	public static final String[] ruleNames = {
		"script", "statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'homeIp'", "'user'", "'version'", "'add'", "'memberBox'", "'boxes'", 
		"'ip'", "'cluster'", "'replicate'", "'install'", "'uninstall'", "'EE'", 
		"'OS'", "'load'", "'set'", "'invoke'", "'stop'", "'info'", "'kill'", "'cat'", 
		"'grep'", "'restart'", "'clean'", "'sleep'", "'save'", "'exit'", "'download'", 
		"'showSSH'", "'prompt'", "'*'", "'member'", "'client'", null, null, null, 
		null, "'membersOnly'", "'members'", "'clients'", "'='", null, "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HOMEIP", "USER", "VERSION", "ADD", "MEMBER_BOX", "BOXES", "IP", 
		"CLUSTER", "REPLICATE", "INSTALL", "UNINSTALL", "EE", "OS", "LOAD", "SET", 
		"INVOKE", "STOP", "INFO", "KILL", "CAT", "GREP", "RESTART", "CLEAN", "SLEEP", 
		"SAVE", "EXIT", "DOWNLOAD", "SHOWSSH", "PROMPT", "ALL", "MEMBER", "CLIENT", 
		"MEMBER_ALL", "MEMBER_VAR", "CLIENT_ALL", "CLIENT_VAR", "MEMBERS_ONLY", 
		"MEMBERS", "CLIENTS", "ASSIGN", "BOOL", "TRUE", "FALSE", "VAR", "NUMBER", 
		"WHITESPACE", "STRING", "IP_PAIR", "IP_STR", "COMMENT"
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
		public TerminalNode BOXES() { return getToken(HzCmdParser.BOXES, 0); }
		public TerminalNode ADD() { return getToken(HzCmdParser.ADD, 0); }
		public TerminalNode CLUSTER() { return getToken(HzCmdParser.CLUSTER, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(HzCmdParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HzCmdParser.NUMBER, i);
		}
		public TerminalNode INSTALL() { return getToken(HzCmdParser.INSTALL, 0); }
		public List<TerminalNode> ALL() { return getTokens(HzCmdParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(HzCmdParser.ALL, i);
		}
		public TerminalNode OS() { return getToken(HzCmdParser.OS, 0); }
		public TerminalNode EE() { return getToken(HzCmdParser.EE, 0); }
		public TerminalNode UNINSTALL() { return getToken(HzCmdParser.UNINSTALL, 0); }
		public TerminalNode MEMBER_BOX() { return getToken(HzCmdParser.MEMBER_BOX, 0); }
		public TerminalNode MEMBER() { return getToken(HzCmdParser.MEMBER, 0); }
		public TerminalNode CLIENT() { return getToken(HzCmdParser.CLIENT, 0); }
		public TerminalNode LOAD() { return getToken(HzCmdParser.LOAD, 0); }
		public TerminalNode REPLICATE() { return getToken(HzCmdParser.REPLICATE, 0); }
		public TerminalNode SET() { return getToken(HzCmdParser.SET, 0); }
		public TerminalNode INVOKE() { return getToken(HzCmdParser.INVOKE, 0); }
		public TerminalNode MEMBER_ALL() { return getToken(HzCmdParser.MEMBER_ALL, 0); }
		public TerminalNode MEMBER_VAR() { return getToken(HzCmdParser.MEMBER_VAR, 0); }
		public TerminalNode CLIENT_ALL() { return getToken(HzCmdParser.CLIENT_ALL, 0); }
		public TerminalNode CLIENT_VAR() { return getToken(HzCmdParser.CLIENT_VAR, 0); }
		public TerminalNode STOP() { return getToken(HzCmdParser.STOP, 0); }
		public TerminalNode INFO() { return getToken(HzCmdParser.INFO, 0); }
		public TerminalNode KILL() { return getToken(HzCmdParser.KILL, 0); }
		public TerminalNode CAT() { return getToken(HzCmdParser.CAT, 0); }
		public TerminalNode GREP() { return getToken(HzCmdParser.GREP, 0); }
		public TerminalNode CLEAN() { return getToken(HzCmdParser.CLEAN, 0); }
		public TerminalNode RESTART() { return getToken(HzCmdParser.RESTART, 0); }
		public TerminalNode DOWNLOAD() { return getToken(HzCmdParser.DOWNLOAD, 0); }
		public TerminalNode SLEEP() { return getToken(HzCmdParser.SLEEP, 0); }
		public TerminalNode MEMBERS_ONLY() { return getToken(HzCmdParser.MEMBERS_ONLY, 0); }
		public TerminalNode SAVE() { return getToken(HzCmdParser.SAVE, 0); }
		public TerminalNode EXIT() { return getToken(HzCmdParser.EXIT, 0); }
		public TerminalNode SHOWSSH() { return getToken(HzCmdParser.SHOWSSH, 0); }
		public TerminalNode BOOL() { return getToken(HzCmdParser.BOOL, 0); }
		public TerminalNode PROMPT() { return getToken(HzCmdParser.PROMPT, 0); }
		public TerminalNode HOMEIP() { return getToken(HzCmdParser.HOMEIP, 0); }
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
			setState(114);
			switch (_input.LA(1)) {
			case VAR:
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
			case BOXES:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(BOXES);
				setState(10);
				match(ADD);
				setState(11);
				match(STRING);
				setState(12);
				match(STRING);
				}
				break;
			case CLUSTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(CLUSTER);
				setState(14);
				match(VAR);
				setState(15);
				match(NUMBER);
				setState(16);
				match(NUMBER);
				}
				break;
			case INSTALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(INSTALL);
				setState(18);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(19);
				_la = _input.LA(1);
				if ( !(_la==EE || _la==OS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(20);
				match(STRING);
				}
				break;
			case UNINSTALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(21);
				match(UNINSTALL);
				setState(22);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case MEMBER_BOX:
				enterOuterAlt(_localctx, 6);
				{
				setState(23);
				match(MEMBER_BOX);
				setState(24);
				match(NUMBER);
				setState(25);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 7);
				{
				setState(26);
				match(ADD);
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==MEMBER || _la==CLIENT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(29);
				match(NUMBER);
				setState(30);
				match(STRING);
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					match(STRING);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 8);
				{
				setState(36);
				match(LOAD);
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(38);
				match(VAR);
				setState(39);
				match(STRING);
				}
				break;
			case REPLICATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(40);
				match(REPLICATE);
				setState(41);
				match(VAR);
				setState(42);
				match(VAR);
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==STRING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==STRING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 10);
				{
				setState(45);
				match(SET);
				setState(46);
				match(VAR);
				setState(47);
				matchWildcard();
				setState(48);
				match(VAR);
				setState(49);
				match(ASSIGN);
				setState(50);
				match(STRING);
				}
				break;
			case INVOKE:
				enterOuterAlt(_localctx, 11);
				{
				setState(51);
				match(INVOKE);
				setState(52);
				match(NUMBER);
				setState(53);
				match(VAR);
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 12);
				{
				setState(57);
				match(STOP);
				setState(58);
				match(VAR);
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(61);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) {
					{
					setState(60);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case INFO:
				enterOuterAlt(_localctx, 13);
				{
				setState(63);
				match(INFO);
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(66);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) {
					{
					setState(65);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case KILL:
				enterOuterAlt(_localctx, 14);
				{
				setState(68);
				match(KILL);
				setState(69);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(71);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) {
					{
					setState(70);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case CAT:
				enterOuterAlt(_localctx, 15);
				{
				setState(73);
				match(CAT);
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(76);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) {
					{
					setState(75);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case GREP:
				enterOuterAlt(_localctx, 16);
				{
				setState(78);
				match(GREP);
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(80);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(81);
				match(STRING);
				}
				break;
			case CLEAN:
				enterOuterAlt(_localctx, 17);
				{
				setState(82);
				match(CLEAN);
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(85);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) {
					{
					setState(84);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 18);
				{
				setState(87);
				match(RESTART);
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(89);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(90);
				match(VAR);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					match(VAR);
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAR );
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 19);
				{
				setState(96);
				match(DOWNLOAD);
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(98);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << MEMBER_ALL) | (1L << MEMBER_VAR) | (1L << CLIENT_ALL) | (1L << CLIENT_VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(99);
				match(STRING);
				}
				break;
			case SLEEP:
				enterOuterAlt(_localctx, 20);
				{
				setState(100);
				match(SLEEP);
				setState(101);
				match(NUMBER);
				}
				break;
			case MEMBERS_ONLY:
				enterOuterAlt(_localctx, 21);
				{
				setState(102);
				match(MEMBERS_ONLY);
				setState(103);
				match(NUMBER);
				}
				break;
			case SAVE:
				enterOuterAlt(_localctx, 22);
				{
				setState(104);
				match(SAVE);
				setState(105);
				match(STRING);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 23);
				{
				setState(106);
				match(EXIT);
				}
				break;
			case SHOWSSH:
				enterOuterAlt(_localctx, 24);
				{
				setState(107);
				match(SHOWSSH);
				setState(108);
				match(BOOL);
				}
				break;
			case PROMPT:
				enterOuterAlt(_localctx, 25);
				{
				setState(109);
				match(PROMPT);
				setState(110);
				match(BOOL);
				}
				break;
			case HOMEIP:
				enterOuterAlt(_localctx, 26);
				{
				setState(111);
				match(HOMEIP);
				setState(112);
				match(STRING);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 27);
				{
				setState(113);
				match(COMMENT);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64w\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3#\n\3\r\3\16\3$\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3\3\5\3E\n\3\3\3\3\3\3\3\5\3"+
		"J\n\3\3\3\3\3\3\3\5\3O\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\6\3_\n\3\r\3\16\3`\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3u\n\3\3\3\2\2\4\2\4\2\7\4\2  "+
		"..\3\2\16\17\3\2!\"\4\2..\61\61\4\2  #&\u0095\2\6\3\2\2\2\4t\3\2\2\2\6"+
		"\7\5\4\3\2\7\3\3\2\2\2\b\t\7.\2\2\t\n\7*\2\2\nu\7\61\2\2\13\f\7\b\2\2"+
		"\f\r\7\6\2\2\r\16\7\61\2\2\16u\7\61\2\2\17\20\7\n\2\2\20\21\7.\2\2\21"+
		"\22\7/\2\2\22u\7/\2\2\23\24\7\f\2\2\24\25\t\2\2\2\25\26\t\3\2\2\26u\7"+
		"\61\2\2\27\30\7\r\2\2\30u\t\2\2\2\31\32\7\7\2\2\32\33\7/\2\2\33u\t\2\2"+
		"\2\34\35\7\6\2\2\35\36\t\4\2\2\36\37\t\2\2\2\37 \7/\2\2 \"\7\61\2\2!#"+
		"\7\61\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%u\3\2\2\2&\'\7\20"+
		"\2\2\'(\t\2\2\2()\7.\2\2)u\7\61\2\2*+\7\13\2\2+,\7.\2\2,-\7.\2\2-.\t\5"+
		"\2\2.u\t\5\2\2/\60\7\21\2\2\60\61\7.\2\2\61\62\13\2\2\2\62\63\7.\2\2\63"+
		"\64\7*\2\2\64u\7\61\2\2\65\66\7\22\2\2\66\67\7/\2\2\678\7.\2\289\t\2\2"+
		"\29:\t\2\2\2:u\t\6\2\2;<\7\23\2\2<=\7.\2\2=?\t\2\2\2>@\t\6\2\2?>\3\2\2"+
		"\2?@\3\2\2\2@u\3\2\2\2AB\7\24\2\2BD\t\2\2\2CE\t\6\2\2DC\3\2\2\2DE\3\2"+
		"\2\2Eu\3\2\2\2FG\7\25\2\2GI\t\2\2\2HJ\t\6\2\2IH\3\2\2\2IJ\3\2\2\2Ju\3"+
		"\2\2\2KL\7\26\2\2LN\t\2\2\2MO\t\6\2\2NM\3\2\2\2NO\3\2\2\2Ou\3\2\2\2PQ"+
		"\7\27\2\2QR\t\2\2\2RS\t\6\2\2Su\7\61\2\2TU\7\31\2\2UW\t\2\2\2VX\t\6\2"+
		"\2WV\3\2\2\2WX\3\2\2\2Xu\3\2\2\2YZ\7\30\2\2Z[\t\2\2\2[\\\t\6\2\2\\^\7"+
		".\2\2]_\7.\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2au\3\2\2\2bc\7\35"+
		"\2\2cd\t\2\2\2de\t\6\2\2eu\7\61\2\2fg\7\32\2\2gu\7/\2\2hi\7\'\2\2iu\7"+
		"/\2\2jk\7\33\2\2ku\7\61\2\2lu\7\34\2\2mn\7\36\2\2nu\7+\2\2op\7\37\2\2"+
		"pu\7+\2\2qr\7\3\2\2ru\7\61\2\2su\7\64\2\2t\b\3\2\2\2t\13\3\2\2\2t\17\3"+
		"\2\2\2t\23\3\2\2\2t\27\3\2\2\2t\31\3\2\2\2t\34\3\2\2\2t&\3\2\2\2t*\3\2"+
		"\2\2t/\3\2\2\2t\65\3\2\2\2t;\3\2\2\2tA\3\2\2\2tF\3\2\2\2tK\3\2\2\2tP\3"+
		"\2\2\2tT\3\2\2\2tY\3\2\2\2tb\3\2\2\2tf\3\2\2\2th\3\2\2\2tj\3\2\2\2tl\3"+
		"\2\2\2tm\3\2\2\2to\3\2\2\2tq\3\2\2\2ts\3\2\2\2u\5\3\2\2\2\n$?DINW`t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}