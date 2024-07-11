// Generated from /home/konrad/Dokumente/Python/JavaReader/JavaParser/antlr/JavaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, MODULE=51, OPEN=52, REQUIRES=53, EXPORTS=54, OPENS=55, TO=56, 
		USES=57, PROVIDES=58, WITH=59, TRANSITIVE=60, VAR=61, YIELD=62, RECORD=63, 
		SEALED=64, PERMITS=65, NON_SEALED=66, DECIMAL_LITERAL=67, HEX_LITERAL=68, 
		OCT_LITERAL=69, BINARY_LITERAL=70, FLOAT_LITERAL=71, HEX_FLOAT_LITERAL=72, 
		BOOL_LITERAL=73, CHAR_LITERAL=74, STRING_LITERAL=75, TEXT_BLOCK=76, NULL_LITERAL=77, 
		LPAREN=78, RPAREN=79, LBRACE=80, RBRACE=81, LBRACK=82, RBRACK=83, SEMI=84, 
		COMMA=85, DOT=86, ASSIGN=87, GT=88, LT=89, BANG=90, TILDE=91, QUESTION=92, 
		COLON=93, EQUAL=94, LE=95, GE=96, NOTEQUAL=97, AND=98, OR=99, INC=100, 
		DEC=101, ADD=102, SUB=103, MUL=104, DIV=105, BITAND=106, BITOR=107, CARET=108, 
		MOD=109, ADD_ASSIGN=110, SUB_ASSIGN=111, MUL_ASSIGN=112, DIV_ASSIGN=113, 
		AND_ASSIGN=114, OR_ASSIGN=115, XOR_ASSIGN=116, MOD_ASSIGN=117, LSHIFT_ASSIGN=118, 
		RSHIFT_ASSIGN=119, URSHIFT_ASSIGN=120, ARROW=121, COLONCOLON=122, AT=123, 
		ELLIPSIS=124, WS=125, JAVADOC_COMMENT=126, COMMENT=127, LINE_COMMENT=128, 
		IDENTIFIER=129;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclarationWithJavaDoc = 3, RULE_typeDeclaration = 4, RULE_modifier = 5, 
		RULE_classOrInterfaceModifier = 6, RULE_variableModifier = 7, RULE_classDeclaration = 8, 
		RULE_typeParameters = 9, RULE_typeParameter = 10, RULE_typeBound = 11, 
		RULE_enumDeclaration = 12, RULE_enumConstants = 13, RULE_enumConstant = 14, 
		RULE_enumBodyDeclarations = 15, RULE_interfaceDeclaration = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclarationWithJavaDoc = 20, 
		RULE_memberDeclaration = 21, RULE_methodDeclaration = 22, RULE_methodBody = 23, 
		RULE_typeTypeOrVoid = 24, RULE_genericMethodDeclaration = 25, RULE_genericConstructorDeclaration = 26, 
		RULE_constructorDeclaration = 27, RULE_compactConstructorDeclaration = 28, 
		RULE_fieldDeclaration = 29, RULE_interfaceBodyDeclaration = 30, RULE_interfaceMemberDeclarationWithJavaDoc = 31, 
		RULE_interfaceMemberDeclaration = 32, RULE_constDeclaration = 33, RULE_constantDeclarator = 34, 
		RULE_interfaceMethodDeclaration = 35, RULE_interfaceMethodModifier = 36, 
		RULE_genericInterfaceMethodDeclaration = 37, RULE_interfaceCommonBodyDeclaration = 38, 
		RULE_variableDeclarators = 39, RULE_variableDeclarator = 40, RULE_variableDeclaratorId = 41, 
		RULE_variableInitializer = 42, RULE_arrayInitializer = 43, RULE_classOrInterfaceType = 44, 
		RULE_typeArgument = 45, RULE_qualifiedNameList = 46, RULE_formalParameters = 47, 
		RULE_receiverParameter = 48, RULE_formalParameterList = 49, RULE_formalParameter = 50, 
		RULE_lastFormalParameter = 51, RULE_lambdaLVTIList = 52, RULE_lambdaLVTIParameter = 53, 
		RULE_qualifiedName = 54, RULE_literal = 55, RULE_integerLiteral = 56, 
		RULE_floatLiteral = 57, RULE_altAnnotationQualifiedName = 58, RULE_annotation = 59, 
		RULE_elementValuePairs = 60, RULE_elementValuePair = 61, RULE_elementValue = 62, 
		RULE_elementValueArrayInitializer = 63, RULE_annotationTypeDeclaration = 64, 
		RULE_annotationTypeBody = 65, RULE_annotationTypeElementDeclaration = 66, 
		RULE_annotationTypeElementRest = 67, RULE_annotationMethodOrConstantRest = 68, 
		RULE_annotationMethodRest = 69, RULE_annotationConstantRest = 70, RULE_defaultValue = 71, 
		RULE_moduleDeclaration = 72, RULE_moduleBody = 73, RULE_moduleDirective = 74, 
		RULE_requiresModifier = 75, RULE_recordDeclaration = 76, RULE_recordHeader = 77, 
		RULE_recordComponentList = 78, RULE_recordComponent = 79, RULE_recordBody = 80, 
		RULE_block = 81, RULE_blockStatement = 82, RULE_localVariableDeclaration = 83, 
		RULE_identifier = 84, RULE_typeIdentifier = 85, RULE_localTypeDeclaration = 86, 
		RULE_statement = 87, RULE_catchClause = 88, RULE_catchType = 89, RULE_finallyBlock = 90, 
		RULE_resourceSpecification = 91, RULE_resources = 92, RULE_resource = 93, 
		RULE_switchBlockStatementGroup = 94, RULE_switchLabel = 95, RULE_forControl = 96, 
		RULE_forInit = 97, RULE_enhancedForControl = 98, RULE_parExpression = 99, 
		RULE_expressionList = 100, RULE_methodCall = 101, RULE_expression = 102, 
		RULE_pattern = 103, RULE_lambdaExpression = 104, RULE_lambdaParameters = 105, 
		RULE_lambdaBody = 106, RULE_primary = 107, RULE_switchExpression = 108, 
		RULE_switchLabeledRule = 109, RULE_guardedPattern = 110, RULE_switchRuleOutcome = 111, 
		RULE_classType = 112, RULE_creator = 113, RULE_createdName = 114, RULE_innerCreator = 115, 
		RULE_arrayCreatorRest = 116, RULE_classCreatorRest = 117, RULE_explicitGenericInvocation = 118, 
		RULE_typeArgumentsOrDiamond = 119, RULE_nonWildcardTypeArgumentsOrDiamond = 120, 
		RULE_nonWildcardTypeArguments = 121, RULE_typeList = 122, RULE_typeType = 123, 
		RULE_primitiveType = 124, RULE_typeArguments = 125, RULE_superSuffix = 126, 
		RULE_explicitGenericInvocationSuffix = 127, RULE_arguments = 128, RULE_javadoc = 129;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclarationWithJavaDoc", 
			"typeDeclaration", "modifier", "classOrInterfaceModifier", "variableModifier", 
			"classDeclaration", "typeParameters", "typeParameter", "typeBound", "enumDeclaration", 
			"enumConstants", "enumConstant", "enumBodyDeclarations", "interfaceDeclaration", 
			"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclarationWithJavaDoc", 
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"genericMethodDeclaration", "genericConstructorDeclaration", "constructorDeclaration", 
			"compactConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclarationWithJavaDoc", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "genericInterfaceMethodDeclaration", "interfaceCommonBodyDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"qualifiedNameList", "formalParameters", "receiverParameter", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "lambdaLVTIList", "lambdaLVTIParameter", 
			"qualifiedName", "literal", "integerLiteral", "floatLiteral", "altAnnotationQualifiedName", 
			"annotation", "elementValuePairs", "elementValuePair", "elementValue", 
			"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
			"annotationMethodRest", "annotationConstantRest", "defaultValue", "moduleDeclaration", 
			"moduleBody", "moduleDirective", "requiresModifier", "recordDeclaration", 
			"recordHeader", "recordComponentList", "recordComponent", "recordBody", 
			"block", "blockStatement", "localVariableDeclaration", "identifier", 
			"typeIdentifier", "localTypeDeclaration", "statement", "catchClause", 
			"catchType", "finallyBlock", "resourceSpecification", "resources", "resource", 
			"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", 
			"enhancedForControl", "parExpression", "expressionList", "methodCall", 
			"expression", "pattern", "lambdaExpression", "lambdaParameters", "lambdaBody", 
			"primary", "switchExpression", "switchLabeledRule", "guardedPattern", 
			"switchRuleOutcome", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments", "javadoc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'module'", 
			"'open'", "'requires'", "'exports'", "'opens'", "'to'", "'uses'", "'provides'", 
			"'with'", "'transitive'", "'var'", "'yield'", "'record'", "'sealed'", 
			"'permits'", "'non-sealed'", null, null, null, null, null, null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", 
			"'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"TEXT_BLOCK", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "JAVADOC_COMMENT", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public List<TypeDeclarationWithJavaDocContext> typeDeclarationWithJavaDoc() {
			return getRuleContexts(TypeDeclarationWithJavaDocContext.class);
		}
		public TypeDeclarationWithJavaDocContext typeDeclarationWithJavaDoc(int i) {
			return getRuleContext(TypeDeclarationWithJavaDocContext.class,i);
		}
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(260);
					packageDeclaration();
					}
					break;
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(265);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IMPORT:
							{
							setState(263);
							importDeclaration();
							}
							break;
						case SEMI:
							{
							setState(264);
							match(SEMI);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2250914781658622L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5188146770731859975L) != 0) || _la==IDENTIFIER) {
					{
					setState(272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ABSTRACT:
					case CLASS:
					case ENUM:
					case FINAL:
					case INTERFACE:
					case PRIVATE:
					case PROTECTED:
					case PUBLIC:
					case STATIC:
					case STRICTFP:
					case MODULE:
					case OPEN:
					case REQUIRES:
					case EXPORTS:
					case OPENS:
					case TO:
					case USES:
					case PROVIDES:
					case WITH:
					case TRANSITIVE:
					case VAR:
					case YIELD:
					case RECORD:
					case SEALED:
					case PERMITS:
					case NON_SEALED:
					case AT:
					case JAVADOC_COMMENT:
					case IDENTIFIER:
						{
						setState(270);
						typeDeclarationWithJavaDoc();
						}
						break;
					case SEMI:
						{
						setState(271);
						match(SEMI);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				moduleDeclaration();
				setState(278);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(282);
				annotation();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(PACKAGE);
			setState(289);
			qualifiedName();
			setState(290);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(IMPORT);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(293);
				match(STATIC);
				}
			}

			setState(296);
			qualifiedName();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(297);
				match(DOT);
				setState(298);
				match(MUL);
				}
			}

			setState(301);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationWithJavaDocContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public JavadocContext javadoc() {
			return getRuleContext(JavadocContext.class,0);
		}
		public TypeDeclarationWithJavaDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarationWithJavaDoc; }
	}

	public final TypeDeclarationWithJavaDocContext typeDeclarationWithJavaDoc() throws RecognitionException {
		TypeDeclarationWithJavaDocContext _localctx = new TypeDeclarationWithJavaDocContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclarationWithJavaDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JAVADOC_COMMENT) {
				{
				setState(303);
				javadoc();
				}
			}

			setState(306);
			typeDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					classOrInterfaceModifier();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(314);
				classDeclaration();
				}
				break;
			case ENUM:
				{
				setState(315);
				enumDeclaration();
				}
				break;
			case INTERFACE:
				{
				setState(316);
				interfaceDeclaration();
				}
				break;
			case AT:
				{
				setState(317);
				annotationTypeDeclaration();
				}
				break;
			case RECORD:
				{
				setState(318);
				recordDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(VOLATILE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaParser.NON_SEALED, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceModifier);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(335);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(336);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(337);
				match(NON_SEALED);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableModifier);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(FINAL);
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				annotation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(CLASS);
			setState(345);
			identifier();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(346);
				typeParameters();
				}
			}

			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(349);
				match(EXTENDS);
				setState(350);
				typeType();
				}
			}

			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(353);
				match(IMPLEMENTS);
				setState(354);
				typeList();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(357);
				match(PERMITS);
				setState(358);
				typeList();
				}
			}

			setState(361);
			classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LT);
			setState(364);
			typeParameter();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				typeParameter();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					annotation();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(380);
			identifier();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(381);
				match(EXTENDS);
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(382);
						annotation();
						}
						} 
					}
					setState(387);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(388);
				typeBound();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			typeType();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(392);
				match(BITAND);
				setState(393);
				typeType();
				}
				}
				setState(398);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(ENUM);
			setState(400);
			identifier();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(401);
				match(IMPLEMENTS);
				setState(402);
				typeList();
				}
			}

			setState(405);
			match(LBRACE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(406);
				enumConstants();
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(409);
				match(COMMA);
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(412);
				enumBodyDeclarations();
				}
			}

			setState(415);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			enumConstant();
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(418);
					match(COMMA);
					setState(419);
					enumConstant();
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					annotation();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(431);
			identifier();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(432);
				arguments();
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(435);
				classBody();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(SEMI);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1331583875988694L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5188146770765479943L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(439);
				classBodyDeclaration();
				}
				}
				setState(444);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(INTERFACE);
			setState(446);
			identifier();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(447);
				typeParameters();
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(450);
				match(EXTENDS);
				setState(451);
				typeList();
				}
			}

			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(454);
				match(PERMITS);
				setState(455);
				typeList();
				}
			}

			setState(458);
			interfaceBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(LBRACE);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1331583875988694L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5188146770765479943L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(461);
				classBodyDeclaration();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(LBRACE);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1331583875984598L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5188146770765414407L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(470);
				interfaceBodyDeclaration();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public MemberDeclarationWithJavaDocContext memberDeclarationWithJavaDoc() {
			return getRuleContext(MemberDeclarationWithJavaDocContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(479);
					match(STATIC);
					}
				}

				setState(482);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				memberDeclarationWithJavaDoc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationWithJavaDocContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public JavadocContext javadoc() {
			return getRuleContext(JavadocContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public MemberDeclarationWithJavaDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarationWithJavaDoc; }
	}

	public final MemberDeclarationWithJavaDocContext memberDeclarationWithJavaDoc() throws RecognitionException {
		MemberDeclarationWithJavaDocContext _localctx = new MemberDeclarationWithJavaDocContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclarationWithJavaDoc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JAVADOC_COMMENT) {
				{
				setState(486);
				javadoc();
				}
			}

			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					modifier();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(495);
			memberDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_memberDeclaration);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				recordDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				genericMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				fieldDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				constructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				genericConstructorDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				interfaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(504);
				annotationTypeDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(505);
				classDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(506);
				enumDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			typeTypeOrVoid();
			setState(510);
			identifier();
			setState(511);
			formalParameters();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(512);
				match(LBRACK);
				setState(513);
				match(RBRACK);
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(519);
				match(THROWS);
				setState(520);
				qualifiedNameList();
				}
			}

			setState(523);
			methodBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodBody);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeTypeOrVoid);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(VOID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			typeParameters();
			setState(534);
			methodDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			typeParameters();
			setState(537);
			constructorDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			identifier();
			setState(540);
			formalParameters();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(541);
				match(THROWS);
				setState(542);
				qualifiedNameList();
				}
			}

			setState(545);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompactConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public CompactConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compactConstructorDeclaration; }
	}

	public final CompactConstructorDeclarationContext compactConstructorDeclaration() throws RecognitionException {
		CompactConstructorDeclarationContext _localctx = new CompactConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compactConstructorDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(547);
					modifier();
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(553);
			identifier();
			setState(554);
			((CompactConstructorDeclarationContext)_localctx).constructorBody = block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			typeType();
			setState(557);
			variableDeclarators();
			setState(558);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationWithJavaDocContext interfaceMemberDeclarationWithJavaDoc() {
			return getRuleContext(InterfaceMemberDeclarationWithJavaDocContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceBodyDeclaration);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case LT:
			case AT:
			case JAVADOC_COMMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				interfaceMemberDeclarationWithJavaDoc();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationWithJavaDocContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public JavadocContext javadoc() {
			return getRuleContext(JavadocContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceMemberDeclarationWithJavaDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclarationWithJavaDoc; }
	}

	public final InterfaceMemberDeclarationWithJavaDocContext interfaceMemberDeclarationWithJavaDoc() throws RecognitionException {
		InterfaceMemberDeclarationWithJavaDocContext _localctx = new InterfaceMemberDeclarationWithJavaDocContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMemberDeclarationWithJavaDoc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JAVADOC_COMMENT) {
				{
				setState(564);
				javadoc();
				}
			}

			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(567);
					modifier();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(573);
			interfaceMemberDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMemberDeclaration);
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				recordDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				constDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				interfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(579);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				annotationTypeDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(581);
				classDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(582);
				enumDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			typeType();
			setState(586);
			constantDeclarator();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(587);
				match(COMMA);
				setState(588);
				constantDeclarator();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			identifier();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(597);
				match(LBRACK);
				setState(598);
				match(RBRACK);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			match(ASSIGN);
			setState(605);
			variableInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					interfaceMethodModifier();
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(613);
			interfaceCommonBodyDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceMethodModifier);
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(619);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(620);
				match(STRICTFP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2250940820221950L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 576460752303423491L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(623);
				interfaceMethodModifier();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			typeParameters();
			setState(630);
			interfaceCommonBodyDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceCommonBodyDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCommonBodyDeclaration; }
	}

	public final InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() throws RecognitionException {
		InterfaceCommonBodyDeclarationContext _localctx = new InterfaceCommonBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interfaceCommonBodyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(632);
					annotation();
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(638);
			typeTypeOrVoid();
			setState(639);
			identifier();
			setState(640);
			formalParameters();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(641);
				match(LBRACK);
				setState(642);
				match(RBRACK);
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(648);
				match(THROWS);
				setState(649);
				qualifiedNameList();
				}
			}

			setState(652);
			methodBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			variableDeclarator();
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(655);
				match(COMMA);
				setState(656);
				variableDeclarator();
				}
				}
				setState(661);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			variableDeclaratorId();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(663);
				match(ASSIGN);
				setState(664);
				variableInitializer();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			identifier();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(668);
				match(LBRACK);
				setState(669);
				match(RBRACK);
				}
				}
				setState(674);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableInitializer);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(LBRACE);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223127275610966053L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4683743741343707135L) != 0)) {
				{
				setState(680);
				variableInitializer();
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(681);
						match(COMMA);
						setState(682);
						variableInitializer();
						}
						} 
					}
					setState(687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(688);
					match(COMMA);
					}
				}

				}
			}

			setState(693);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classOrInterfaceType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(695);
					identifier();
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(696);
						typeArguments();
						}
					}

					setState(699);
					match(DOT);
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(706);
			typeIdentifier();
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(707);
				typeArguments();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeArgument);
		int _la;
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(711);
					annotation();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				match(QUESTION);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(718);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(719);
					typeType();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			qualifiedName();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(725);
				match(COMMA);
				setState(726);
				qualifiedName();
				}
				}
				setState(731);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(LPAREN);
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223090579141953573L) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(733);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(736);
				receiverParameter();
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(737);
					match(COMMA);
					setState(738);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223090579141986341L) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(741);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(746);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			typeType();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(749);
				identifier();
				setState(750);
				match(DOT);
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(THIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				formalParameter();
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(760);
						match(COMMA);
						setState(761);
						formalParameter();
						}
						} 
					}
					setState(766);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(767);
					match(COMMA);
					setState(768);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				lastFormalParameter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(774);
					variableModifier();
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(780);
			typeType();
			setState(781);
			variableDeclaratorId();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(783);
					variableModifier();
					}
					} 
				}
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(789);
			typeType();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(790);
				annotation();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			match(ELLIPSIS);
			setState(797);
			variableDeclaratorId();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaLVTIListContext extends ParserRuleContext {
		public List<LambdaLVTIParameterContext> lambdaLVTIParameter() {
			return getRuleContexts(LambdaLVTIParameterContext.class);
		}
		public LambdaLVTIParameterContext lambdaLVTIParameter(int i) {
			return getRuleContext(LambdaLVTIParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIList; }
	}

	public final LambdaLVTIListContext lambdaLVTIList() throws RecognitionException {
		LambdaLVTIListContext _localctx = new LambdaLVTIListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lambdaLVTIList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			lambdaLVTIParameter();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(800);
				match(COMMA);
				setState(801);
				lambdaLVTIParameter();
				}
				}
				setState(806);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaLVTIParameterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LambdaLVTIParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIParameter; }
	}

	public final LambdaLVTIParameterContext lambdaLVTIParameter() throws RecognitionException {
		LambdaLVTIParameterContext _localctx = new LambdaLVTIParameterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lambdaLVTIParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(807);
					variableModifier();
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(813);
			match(VAR);
			setState(814);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			identifier();
			setState(821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					match(DOT);
					setState(818);
					identifier();
					}
					} 
				}
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public TerminalNode TEXT_BLOCK() { return getToken(JavaParser.TEXT_BLOCK, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		try {
			setState(831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(827);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(828);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(829);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(830);
				match(TEXT_BLOCK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(837);
				identifier();
				setState(838);
				match(DOT);
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			match(AT);
			setState(846);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(848);
				match(AT);
				setState(849);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(850);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(853);
				match(LPAREN);
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(854);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(855);
					elementValue();
					}
					break;
				}
				setState(858);
				match(RPAREN);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			elementValuePair();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(862);
				match(COMMA);
				setState(863);
				elementValuePair();
				}
				}
				setState(868);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			identifier();
			setState(870);
			match(ASSIGN);
			setState(871);
			elementValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValue);
		try {
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				elementValueArrayInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(LBRACE);
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223127275610966053L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4683743741343707135L) != 0)) {
				{
				setState(879);
				elementValue();
				setState(884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(880);
						match(COMMA);
						setState(881);
						elementValue();
						}
						} 
					}
					setState(886);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
			}

			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(889);
				match(COMMA);
				}
			}

			setState(892);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(AT);
			setState(895);
			match(INTERFACE);
			setState(896);
			identifier();
			setState(897);
			annotationTypeBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(LBRACE);
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1613058852699350L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 576460752304472071L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(900);
				annotationTypeElementDeclaration();
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(906);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(908);
						modifier();
						}
						} 
					}
					setState(913);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(914);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationTypeElementRest);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				typeType();
				setState(919);
				annotationMethodOrConstantRest();
				setState(920);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				classDeclaration();
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(923);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				interfaceDeclaration();
				setState(928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(927);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(930);
				enumDeclaration();
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(931);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(934);
				annotationTypeDeclaration();
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(935);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(938);
				recordDeclaration();
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(939);
					match(SEMI);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationMethodOrConstantRest);
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				annotationConstantRest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			identifier();
			setState(949);
			match(LPAREN);
			setState(950);
			match(RPAREN);
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(951);
				defaultValue();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			variableDeclarators();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(DEFAULT);
			setState(957);
			elementValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(959);
				match(OPEN);
				}
			}

			setState(962);
			match(MODULE);
			setState(963);
			qualifiedName();
			setState(964);
			moduleBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(LBRACE);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 495395959010754560L) != 0)) {
				{
				{
				setState(967);
				moduleDirective();
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(973);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleDirectiveContext extends ParserRuleContext {
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<RequiresModifierContext> requiresModifier() {
			return getRuleContexts(RequiresModifierContext.class);
		}
		public RequiresModifierContext requiresModifier(int i) {
			return getRuleContext(RequiresModifierContext.class,i);
		}
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(1011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				match(REQUIRES);
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(976);
						requiresModifier();
						}
						} 
					}
					setState(981);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(982);
				qualifiedName();
				setState(983);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(EXPORTS);
				setState(986);
				qualifiedName();
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(987);
					match(TO);
					setState(988);
					qualifiedName();
					}
				}

				setState(991);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				match(OPENS);
				setState(994);
				qualifiedName();
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(995);
					match(TO);
					setState(996);
					qualifiedName();
					}
				}

				setState(999);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
				match(USES);
				setState(1002);
				qualifiedName();
				setState(1003);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1005);
				match(PROVIDES);
				setState(1006);
				qualifiedName();
				setState(1007);
				match(WITH);
				setState(1008);
				qualifiedName();
				setState(1009);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RequiresModifierContext extends ParserRuleContext {
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public RequiresModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiresModifier; }
	}

	public final RequiresModifierContext requiresModifier() throws RecognitionException {
		RequiresModifierContext _localctx = new RequiresModifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_la = _input.LA(1);
			if ( !(_la==STATIC || _la==TRANSITIVE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordHeaderContext recordHeader() {
			return getRuleContext(RecordHeaderContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(RECORD);
			setState(1016);
			identifier();
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1017);
				typeParameters();
				}
			}

			setState(1020);
			recordHeader();
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1021);
				match(IMPLEMENTS);
				setState(1022);
				typeList();
				}
			}

			setState(1025);
			recordBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordHeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(LPAREN);
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223090579141953573L) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(1028);
				recordComponentList();
				}
			}

			setState(1031);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordComponentListContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			recordComponent();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1034);
				match(COMMA);
				setState(1035);
				recordComponent();
				}
				}
				setState(1040);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			typeType();
			setState(1042);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<CompactConstructorDeclarationContext> compactConstructorDeclaration() {
			return getRuleContexts(CompactConstructorDeclarationContext.class);
		}
		public CompactConstructorDeclarationContext compactConstructorDeclaration(int i) {
			return getRuleContext(CompactConstructorDeclarationContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(LBRACE);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1331583875988694L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5188146770765479943L) != 0) || _la==IDENTIFIER) {
				{
				setState(1047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1045);
					classBodyDeclaration();
					}
					break;
				case 2:
					{
					setState(1046);
					compactConstructorDeclaration();
					}
					break;
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1052);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(LBRACE);
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -668508564985026L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 576461783331602431L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1055);
				blockStatement();
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1061);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_blockStatement);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				localVariableDeclaration();
				setState(1064);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				localTypeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1070);
					variableModifier();
					}
					} 
				}
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1076);
				match(VAR);
				setState(1077);
				identifier();
				setState(1078);
				match(ASSIGN);
				setState(1079);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1081);
				typeType();
				setState(1082);
				variableDeclarators();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==IDENTIFIER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typeIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 29695L) != 0) || _la==IDENTIFIER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_localTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1090);
					classOrInterfaceModifier();
					}
					} 
				}
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1096);
				classDeclaration();
				}
				break;
			case INTERFACE:
				{
				setState(1097);
				interfaceDeclaration();
				}
				break;
			case RECORD:
				{
				setState(1098);
				recordDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public IdentifierContext identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(ASSERT);
				setState(1103);
				expression(0);
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1104);
					match(COLON);
					setState(1105);
					expression(0);
					}
				}

				setState(1108);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				match(IF);
				setState(1111);
				parExpression();
				setState(1112);
				statement();
				setState(1115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1113);
					match(ELSE);
					setState(1114);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1117);
				match(FOR);
				setState(1118);
				match(LPAREN);
				setState(1119);
				forControl();
				setState(1120);
				match(RPAREN);
				setState(1121);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1123);
				match(WHILE);
				setState(1124);
				parExpression();
				setState(1125);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1127);
				match(DO);
				setState(1128);
				statement();
				setState(1129);
				match(WHILE);
				setState(1130);
				parExpression();
				setState(1131);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1133);
				match(TRY);
				setState(1134);
				block();
				setState(1144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1135);
						catchClause();
						}
						}
						setState(1138); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1140);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1143);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1146);
				match(TRY);
				setState(1147);
				resourceSpecification();
				setState(1148);
				block();
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1149);
					catchClause();
					}
					}
					setState(1154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1155);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1158);
				match(SWITCH);
				setState(1159);
				parExpression();
				setState(1160);
				match(LBRACE);
				setState(1164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1161);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1167);
					switchLabel();
					}
					}
					setState(1172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1173);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1175);
				match(SYNCHRONIZED);
				setState(1176);
				parExpression();
				setState(1177);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1179);
				match(RETURN);
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223127275610966053L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4683743741343698943L) != 0)) {
					{
					setState(1180);
					expression(0);
					}
				}

				setState(1183);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1184);
				match(THROW);
				setState(1185);
				expression(0);
				setState(1186);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1188);
				match(BREAK);
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==IDENTIFIER) {
					{
					setState(1189);
					identifier();
					}
				}

				setState(1192);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1193);
				match(CONTINUE);
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==IDENTIFIER) {
					{
					setState(1194);
					identifier();
					}
				}

				setState(1197);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1198);
				match(YIELD);
				setState(1199);
				expression(0);
				setState(1200);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1202);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1203);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1204);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1206);
				switchExpression();
				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1207);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1210);
				((StatementContext)_localctx).identifierLabel = identifier();
				setState(1211);
				match(COLON);
				setState(1212);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(CATCH);
			setState(1217);
			match(LPAREN);
			setState(1221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1218);
					variableModifier();
					}
					} 
				}
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(1224);
			catchType();
			setState(1225);
			identifier();
			setState(1226);
			match(RPAREN);
			setState(1227);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			qualifiedName();
			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1230);
				match(BITOR);
				setState(1231);
				qualifiedName();
				}
				}
				setState(1236);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(FINALLY);
			setState(1238);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(LPAREN);
			setState(1241);
			resources();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1242);
				match(SEMI);
				}
			}

			setState(1245);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			resource();
			setState(1252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1248);
					match(SEMI);
					setState(1249);
					resource();
					}
					} 
				}
				setState(1254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_resource);
		try {
			int _alt;
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1255);
						variableModifier();
						}
						} 
					}
					setState(1260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1261);
					classOrInterfaceType();
					setState(1262);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1264);
					match(VAR);
					setState(1265);
					identifier();
					}
					break;
				}
				setState(1268);
				match(ASSIGN);
				setState(1269);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				qualifiedName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1274);
				switchLabel();
				}
				}
				setState(1277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1279);
				blockStatement();
				}
				}
				setState(1282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -668508564985026L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 576461783331602431L) != 0) || _la==IDENTIFIER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public IdentifierContext varName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_switchLabel);
		try {
			setState(1295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				match(CASE);
				setState(1290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1285);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1286);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1287);
					typeType();
					setState(1288);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1292);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				match(DEFAULT);
				setState(1294);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_forControl);
		int _la;
		try {
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223127275610998821L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4683743741343698943L) != 0)) {
					{
					setState(1298);
					forInit();
					}
				}

				setState(1301);
				match(SEMI);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223127275610966053L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4683743741343698943L) != 0)) {
					{
					setState(1302);
					expression(0);
					}
				}

				setState(1305);
				match(SEMI);
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223127275610966053L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4683743741343698943L) != 0)) {
					{
					setState(1306);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forInit);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1315);
					variableModifier();
					}
					} 
				}
				setState(1320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1321);
				typeType();
				}
				break;
			case 2:
				{
				setState(1322);
				match(VAR);
				}
				break;
			}
			setState(1325);
			variableDeclaratorId();
			setState(1326);
			match(COLON);
			setState(1327);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(LPAREN);
			setState(1330);
			expression(0);
			setState(1331);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			expression(0);
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1334);
				match(COMMA);
				setState(1335);
				expression(0);
				}
				}
				setState(1340);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				{
				setState(1341);
				identifier();
				}
				break;
			case THIS:
				{
				setState(1342);
				match(THIS);
				}
				break;
			case SUPER:
				{
				setState(1343);
				match(SUPER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1346);
			arguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode COLONCOLON() { return getToken(JavaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1349);
				primary();
				}
				break;
			case 2:
				{
				setState(1350);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1351);
				typeType();
				setState(1352);
				match(COLONCOLON);
				setState(1358);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case LT:
				case IDENTIFIER:
					{
					setState(1354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1353);
						typeArguments();
						}
					}

					setState(1356);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1357);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(1360);
				classType();
				setState(1361);
				match(COLONCOLON);
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1362);
					typeArguments();
					}
				}

				setState(1365);
				match(NEW);
				}
				break;
			case 5:
				{
				setState(1367);
				switchExpression();
				}
				break;
			case 6:
				{
				setState(1368);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 15363L) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1369);
				expression(17);
				}
				break;
			case 7:
				{
				setState(1370);
				match(LPAREN);
				setState(1374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1371);
						annotation();
						}
						} 
					}
					setState(1376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1377);
				typeType();
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1378);
					match(BITAND);
					setState(1379);
					typeType();
					}
					}
					setState(1384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1385);
				match(RPAREN);
				setState(1386);
				expression(16);
				}
				break;
			case 8:
				{
				setState(1388);
				match(NEW);
				setState(1389);
				creator();
				}
				break;
			case 9:
				{
				setState(1390);
				lambdaExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1474);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1393);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1394);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 35L) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1395);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1396);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1397);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1398);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1399);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1407);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1400);
							match(LT);
							setState(1401);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1402);
							match(GT);
							setState(1403);
							match(GT);
							setState(1404);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1405);
							match(GT);
							setState(1406);
							match(GT);
							}
							break;
						}
						setState(1409);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1410);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1411);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 387L) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1412);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1413);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1414);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1415);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1416);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1417);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1418);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1419);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1420);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1421);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1422);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1423);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1424);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1425);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1426);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1427);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1428);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1429);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1430);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1431);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1432);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1433);
						expression(0);
						setState(1434);
						match(COLON);
						setState(1435);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1437);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1438);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 17171480577L) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1439);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1440);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1441);
						match(LBRACK);
						setState(1442);
						expression(0);
						setState(1443);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1445);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1446);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1458);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1447);
							identifier();
							}
							break;
						case 2:
							{
							setState(1448);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1449);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1450);
							match(NEW);
							setState(1452);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1451);
								nonWildcardTypeArguments();
								}
							}

							setState(1454);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1455);
							match(SUPER);
							setState(1456);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1457);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1460);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1461);
						match(COLONCOLON);
						setState(1463);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1462);
							typeArguments();
							}
						}

						setState(1465);
						identifier();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1466);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1467);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1468);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1469);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1472);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1470);
							typeType();
							}
							break;
						case 2:
							{
							setState(1471);
							pattern();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1479);
					variableModifier();
					}
					} 
				}
				setState(1484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1485);
			typeType();
			setState(1489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1486);
					annotation();
					}
					} 
				}
				setState(1491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			setState(1492);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			lambdaParameters();
			setState(1495);
			match(ARROW);
			setState(1496);
			lambdaBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext lambdaLVTIList() {
			return getRuleContext(LambdaLVTIListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_lambdaParameters);
		int _la;
		try {
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				match(LPAREN);
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223090579141986341L) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1500);
					formalParameterList();
					}
				}

				setState(1503);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1504);
				match(LPAREN);
				setState(1505);
				identifier();
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1506);
					match(COMMA);
					setState(1507);
					identifier();
					}
					}
					setState(1512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1513);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1515);
				match(LPAREN);
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & 281466386776065L) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1516);
					lambdaLVTIList();
					}
				}

				setState(1519);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_lambdaBody);
		try {
			setState(1524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_primary);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1526);
				match(LPAREN);
				setState(1527);
				expression(0);
				setState(1528);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1531);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1532);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1533);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1534);
				typeTypeOrVoid();
				setState(1535);
				match(DOT);
				setState(1536);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1538);
				nonWildcardTypeArguments();
				setState(1542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case IDENTIFIER:
					{
					setState(1539);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1540);
					match(THIS);
					setState(1541);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchLabeledRuleContext> switchLabeledRule() {
			return getRuleContexts(SwitchLabeledRuleContext.class);
		}
		public SwitchLabeledRuleContext switchLabeledRule(int i) {
			return getRuleContext(SwitchLabeledRuleContext.class,i);
		}
		public SwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpression; }
	}

	public final SwitchExpressionContext switchExpression() throws RecognitionException {
		SwitchExpressionContext _localctx = new SwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(SWITCH);
			setState(1547);
			parExpression();
			setState(1548);
			match(LBRACE);
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1549);
				switchLabeledRule();
				}
				}
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1555);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabeledRuleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public SwitchRuleOutcomeContext switchRuleOutcome() {
			return getRuleContext(SwitchRuleOutcomeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabeledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledRule; }
	}

	public final SwitchLabeledRuleContext switchLabeledRule() throws RecognitionException {
		SwitchLabeledRuleContext _localctx = new SwitchLabeledRuleContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				match(CASE);
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1558);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1559);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1560);
					guardedPattern(0);
					}
					break;
				}
				setState(1563);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1564);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				match(DEFAULT);
				setState(1566);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1567);
				switchRuleOutcome();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GuardedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GuardedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedPattern; }
	}

	public final GuardedPatternContext guardedPattern() throws RecognitionException {
		return guardedPattern(0);
	}

	private GuardedPatternContext guardedPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardedPatternContext _localctx = new GuardedPatternContext(_ctx, _parentState);
		GuardedPatternContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1571);
				match(LPAREN);
				setState(1572);
				guardedPattern(0);
				setState(1573);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				{
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1575);
						variableModifier();
						}
						} 
					}
					setState(1580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				setState(1581);
				typeType();
				setState(1585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1582);
						annotation();
						}
						} 
					}
					setState(1587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				setState(1588);
				identifier();
				setState(1593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1589);
						match(AND);
						setState(1590);
						expression(0);
						}
						} 
					}
					setState(1595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1598);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1599);
					match(AND);
					setState(1600);
					expression(0);
					}
					} 
				}
				setState(1605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchRuleOutcomeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchRuleOutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchRuleOutcome; }
	}

	public final SwitchRuleOutcomeContext switchRuleOutcome() throws RecognitionException {
		SwitchRuleOutcomeContext _localctx = new SwitchRuleOutcomeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_switchRuleOutcome);
		int _la;
		try {
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -668508564985026L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 576461783331602431L) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(1607);
					blockStatement();
					}
					}
					setState(1612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1615);
				classOrInterfaceType();
				setState(1616);
				match(DOT);
				}
				break;
			}
			setState(1623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1620);
					annotation();
					}
					} 
				}
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1626);
			identifier();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1627);
				typeArguments();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_creator);
		int _la;
		try {
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1630);
					nonWildcardTypeArguments();
					}
				}

				setState(1633);
				createdName();
				setState(1634);
				classCreatorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				createdName();
				setState(1637);
				arrayCreatorRest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_createdName);
		int _la;
		try {
			setState(1656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				identifier();
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1642);
					typeArgumentsOrDiamond();
					}
				}

				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1645);
					match(DOT);
					setState(1646);
					identifier();
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1647);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
				primitiveType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			identifier();
			setState(1660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1659);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1662);
			classCreatorRest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1664);
					match(LBRACK);
					setState(1665);
					match(RBRACK);
					}
					}
					setState(1668); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(1670);
				arrayInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1671);
						match(LBRACK);
						setState(1672);
						expression(0);
						setState(1673);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1677); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1679);
						match(LBRACK);
						setState(1680);
						match(RBRACK);
						}
						} 
					}
					setState(1685);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			arguments();
			setState(1690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1689);
				classBody();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			nonWildcardTypeArguments();
			setState(1693);
			explicitGenericInvocationSuffix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_typeArgumentsOrDiamond);
		try {
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				match(LT);
				setState(1696);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1697);
				typeArguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				match(LT);
				setState(1701);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				nonWildcardTypeArguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			match(LT);
			setState(1706);
			typeList();
			setState(1707);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			typeType();
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1710);
				match(COMMA);
				setState(1711);
				typeType();
				}
				}
				setState(1716);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1717);
					annotation();
					}
					} 
				}
				setState(1722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			setState(1725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				{
				setState(1723);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1724);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1730);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 32767L) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1727);
						annotation();
						}
						}
						setState(1732);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1733);
					match(LBRACK);
					setState(1734);
					match(RBRACK);
					}
					} 
				}
				setState(1739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138111107368L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(LT);
			setState(1743);
			typeArgument();
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1744);
				match(COMMA);
				setState(1745);
				typeArgument();
				}
				}
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1751);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_superSuffix);
		int _la;
		try {
			setState(1762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1753);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1754);
				match(DOT);
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1755);
					typeArguments();
					}
				}

				setState(1758);
				identifier();
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1759);
					arguments();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1764);
				match(SUPER);
				setState(1765);
				superSuffix();
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				identifier();
				setState(1767);
				arguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(LPAREN);
			setState(1773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9223127275610966053L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4683743741343698943L) != 0)) {
				{
				setState(1772);
				expressionList();
				}
			}

			setState(1775);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JavadocContext extends ParserRuleContext {
		public TerminalNode JAVADOC_COMMENT() { return getToken(JavaParser.JAVADOC_COMMENT, 0); }
		public JavadocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadoc; }
	}

	public final JavadocContext javadoc() throws RecognitionException {
		JavadocContext _localctx = new JavadocContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_javadoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(JAVADOC_COMMENT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 102:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 110:
			return guardedPattern_sempred((GuardedPatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 22);
		case 15:
			return precpred(_ctx, 18);
		case 16:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean guardedPattern_sempred(GuardedPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0081\u06f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0001\u0000\u0003\u0000\u0106\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u010a\b\u0000\n\u0000\f\u0000\u010d\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0111\b\u0000\n\u0000\f\u0000\u0114"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0119\b\u0000"+
		"\u0001\u0001\u0005\u0001\u011c\b\u0001\n\u0001\f\u0001\u011f\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0127\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u012c"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003\u0131\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004\u0136\b\u0004\n\u0004"+
		"\f\u0004\u0139\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0140\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0147\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0153\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0157\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u015c\b\b\u0001"+
		"\b\u0001\b\u0003\b\u0160\b\b\u0001\b\u0001\b\u0003\b\u0164\b\b\u0001\b"+
		"\u0001\b\u0003\b\u0168\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0170\b\t\n\t\f\t\u0173\t\t\u0001\t\u0001\t\u0001\n\u0005\n"+
		"\u0178\b\n\n\n\f\n\u017b\t\n\u0001\n\u0001\n\u0001\n\u0005\n\u0180\b\n"+
		"\n\n\f\n\u0183\t\n\u0001\n\u0003\n\u0186\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u018b\b\u000b\n\u000b\f\u000b\u018e\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0194\b\f\u0001\f\u0001\f\u0003\f\u0198"+
		"\b\f\u0001\f\u0003\f\u019b\b\f\u0001\f\u0003\f\u019e\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0005\r\u01a5\b\r\n\r\f\r\u01a8\t\r\u0001\u000e"+
		"\u0005\u000e\u01ab\b\u000e\n\u000e\f\u000e\u01ae\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01b2\b\u000e\u0001\u000e\u0003\u000e\u01b5\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u01b9\b\u000f\n\u000f\f\u000f\u01bc"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01c1\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u01c5\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01c9\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u01cf\b\u0011\n\u0011\f\u0011\u01d2\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u01d8\b\u0012\n\u0012\f\u0012"+
		"\u01db\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01e1\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01e5\b\u0013\u0001"+
		"\u0014\u0003\u0014\u01e8\b\u0014\u0001\u0014\u0005\u0014\u01eb\b\u0014"+
		"\n\u0014\f\u0014\u01ee\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01fc\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0203\b\u0016\n"+
		"\u0016\f\u0016\u0206\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u020a"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0210"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0214\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0220\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0005\u001c\u0225\b\u001c\n\u001c\f\u001c\u0228"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0233\b\u001e\u0001"+
		"\u001f\u0003\u001f\u0236\b\u001f\u0001\u001f\u0005\u001f\u0239\b\u001f"+
		"\n\u001f\f\u001f\u023c\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0248\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u024e\b!\n!\f!\u0251\t!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u0258\b\"\n\"\f\"\u025b\t\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0005#\u0261\b#\n#\f#\u0264\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u026e\b$\u0001%\u0005%\u0271\b%\n%\f%\u0274\t%"+
		"\u0001%\u0001%\u0001%\u0001&\u0005&\u027a\b&\n&\f&\u027d\t&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u0284\b&\n&\f&\u0287\t&\u0001&\u0001&\u0003"+
		"&\u028b\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u0292\b\'\n\'"+
		"\f\'\u0295\t\'\u0001(\u0001(\u0001(\u0003(\u029a\b(\u0001)\u0001)\u0001"+
		")\u0005)\u029f\b)\n)\f)\u02a2\t)\u0001*\u0001*\u0003*\u02a6\b*\u0001+"+
		"\u0001+\u0001+\u0001+\u0005+\u02ac\b+\n+\f+\u02af\t+\u0001+\u0003+\u02b2"+
		"\b+\u0003+\u02b4\b+\u0001+\u0001+\u0001,\u0001,\u0003,\u02ba\b,\u0001"+
		",\u0001,\u0005,\u02be\b,\n,\f,\u02c1\t,\u0001,\u0001,\u0003,\u02c5\b,"+
		"\u0001-\u0001-\u0005-\u02c9\b-\n-\f-\u02cc\t-\u0001-\u0001-\u0001-\u0003"+
		"-\u02d1\b-\u0003-\u02d3\b-\u0001.\u0001.\u0001.\u0005.\u02d8\b.\n.\f."+
		"\u02db\t.\u0001/\u0001/\u0003/\u02df\b/\u0001/\u0001/\u0001/\u0003/\u02e4"+
		"\b/\u0001/\u0003/\u02e7\b/\u0003/\u02e9\b/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00050\u02f1\b0\n0\f0\u02f4\t0\u00010\u00010\u00011\u0001"+
		"1\u00011\u00051\u02fb\b1\n1\f1\u02fe\t1\u00011\u00011\u00031\u0302\b1"+
		"\u00011\u00031\u0305\b1\u00012\u00052\u0308\b2\n2\f2\u030b\t2\u00012\u0001"+
		"2\u00012\u00013\u00053\u0311\b3\n3\f3\u0314\t3\u00013\u00013\u00053\u0318"+
		"\b3\n3\f3\u031b\t3\u00013\u00013\u00013\u00014\u00014\u00014\u00054\u0323"+
		"\b4\n4\f4\u0326\t4\u00015\u00055\u0329\b5\n5\f5\u032c\t5\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00056\u0334\b6\n6\f6\u0337\t6\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00037\u0340\b7\u00018\u00018\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0005:\u0349\b:\n:\f:\u034c\t:\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0003;\u0354\b;\u0001;\u0001;\u0001;\u0003"+
		";\u0359\b;\u0001;\u0003;\u035c\b;\u0001<\u0001<\u0001<\u0005<\u0361\b"+
		"<\n<\f<\u0364\t<\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0003"+
		">\u036d\b>\u0001?\u0001?\u0001?\u0001?\u0005?\u0373\b?\n?\f?\u0376\t?"+
		"\u0003?\u0378\b?\u0001?\u0003?\u037b\b?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001A\u0001A\u0005A\u0386\bA\nA\fA\u0389\tA\u0001A\u0001"+
		"A\u0001B\u0005B\u038e\bB\nB\fB\u0391\tB\u0001B\u0001B\u0003B\u0395\bB"+
		"\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u039d\bC\u0001C\u0001"+
		"C\u0003C\u03a1\bC\u0001C\u0001C\u0003C\u03a5\bC\u0001C\u0001C\u0003C\u03a9"+
		"\bC\u0001C\u0001C\u0003C\u03ad\bC\u0003C\u03af\bC\u0001D\u0001D\u0003"+
		"D\u03b3\bD\u0001E\u0001E\u0001E\u0001E\u0003E\u03b9\bE\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0001H\u0003H\u03c1\bH\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0005I\u03c9\bI\nI\fI\u03cc\tI\u0001I\u0001I\u0001J\u0001J\u0005"+
		"J\u03d2\bJ\nJ\fJ\u03d5\tJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u03de\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u03e6"+
		"\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0003J\u03f4\bJ\u0001K\u0001K\u0001L\u0001L\u0001L\u0003"+
		"L\u03fb\bL\u0001L\u0001L\u0001L\u0003L\u0400\bL\u0001L\u0001L\u0001M\u0001"+
		"M\u0003M\u0406\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0005N\u040d\bN\n"+
		"N\fN\u0410\tN\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0005P\u0418\b"+
		"P\nP\fP\u041b\tP\u0001P\u0001P\u0001Q\u0001Q\u0005Q\u0421\bQ\nQ\fQ\u0424"+
		"\tQ\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u042d\bR\u0001"+
		"S\u0005S\u0430\bS\nS\fS\u0433\tS\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u043d\bS\u0001T\u0001T\u0001U\u0001U\u0001V\u0005"+
		"V\u0444\bV\nV\fV\u0447\tV\u0001V\u0001V\u0001V\u0003V\u044c\bV\u0001W"+
		"\u0001W\u0001W\u0001W\u0001W\u0003W\u0453\bW\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0003W\u045c\bW\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0004W\u0471\bW\u000bW\fW\u0472\u0001W\u0003"+
		"W\u0476\bW\u0001W\u0003W\u0479\bW\u0001W\u0001W\u0001W\u0001W\u0005W\u047f"+
		"\bW\nW\fW\u0482\tW\u0001W\u0003W\u0485\bW\u0001W\u0001W\u0001W\u0001W"+
		"\u0005W\u048b\bW\nW\fW\u048e\tW\u0001W\u0005W\u0491\bW\nW\fW\u0494\tW"+
		"\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0003W\u049e"+
		"\bW\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0003W\u04a7\bW\u0001"+
		"W\u0001W\u0001W\u0003W\u04ac\bW\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0003W\u04b9\bW\u0001W\u0001W\u0001"+
		"W\u0001W\u0003W\u04bf\bW\u0001X\u0001X\u0001X\u0005X\u04c4\bX\nX\fX\u04c7"+
		"\tX\u0001X\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0005Y\u04d1"+
		"\bY\nY\fY\u04d4\tY\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0003[\u04dc"+
		"\b[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0005\\\u04e3\b\\\n\\\f\\\u04e6"+
		"\t\\\u0001]\u0005]\u04e9\b]\n]\f]\u04ec\t]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0003]\u04f3\b]\u0001]\u0001]\u0001]\u0001]\u0003]\u04f9\b]\u0001"+
		"^\u0004^\u04fc\b^\u000b^\f^\u04fd\u0001^\u0004^\u0501\b^\u000b^\f^\u0502"+
		"\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0003_\u050b\b_\u0001_\u0001"+
		"_\u0001_\u0003_\u0510\b_\u0001`\u0001`\u0003`\u0514\b`\u0001`\u0001`\u0003"+
		"`\u0518\b`\u0001`\u0001`\u0003`\u051c\b`\u0003`\u051e\b`\u0001a\u0001"+
		"a\u0003a\u0522\ba\u0001b\u0005b\u0525\bb\nb\fb\u0528\tb\u0001b\u0001b"+
		"\u0003b\u052c\bb\u0001b\u0001b\u0001b\u0001b\u0001c\u0001c\u0001c\u0001"+
		"c\u0001d\u0001d\u0001d\u0005d\u0539\bd\nd\fd\u053c\td\u0001e\u0001e\u0001"+
		"e\u0003e\u0541\be\u0001e\u0001e\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0003f\u054b\bf\u0001f\u0001f\u0003f\u054f\bf\u0001f\u0001f\u0001f\u0003"+
		"f\u0554\bf\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0005f\u055d"+
		"\bf\nf\ff\u0560\tf\u0001f\u0001f\u0001f\u0005f\u0565\bf\nf\ff\u0568\t"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u0570\bf\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0003f\u0580\bf\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u05ad\bf\u0001"+
		"f\u0001f\u0001f\u0001f\u0003f\u05b3\bf\u0001f\u0001f\u0001f\u0003f\u05b8"+
		"\bf\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u05c1\bf\u0005"+
		"f\u05c3\bf\nf\ff\u05c6\tf\u0001g\u0005g\u05c9\bg\ng\fg\u05cc\tg\u0001"+
		"g\u0001g\u0005g\u05d0\bg\ng\fg\u05d3\tg\u0001g\u0001g\u0001h\u0001h\u0001"+
		"h\u0001h\u0001i\u0001i\u0001i\u0003i\u05de\bi\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0005i\u05e5\bi\ni\fi\u05e8\ti\u0001i\u0001i\u0001i\u0001i\u0003"+
		"i\u05ee\bi\u0001i\u0003i\u05f1\bi\u0001j\u0001j\u0003j\u05f5\bj\u0001"+
		"k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001"+
		"k\u0001k\u0001k\u0001k\u0001k\u0001k\u0003k\u0607\bk\u0003k\u0609\bk\u0001"+
		"l\u0001l\u0001l\u0001l\u0005l\u060f\bl\nl\fl\u0612\tl\u0001l\u0001l\u0001"+
		"m\u0001m\u0001m\u0001m\u0003m\u061a\bm\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0003m\u0621\bm\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0005n\u0629"+
		"\bn\nn\fn\u062c\tn\u0001n\u0001n\u0005n\u0630\bn\nn\fn\u0633\tn\u0001"+
		"n\u0001n\u0001n\u0005n\u0638\bn\nn\fn\u063b\tn\u0003n\u063d\bn\u0001n"+
		"\u0001n\u0001n\u0005n\u0642\bn\nn\fn\u0645\tn\u0001o\u0001o\u0005o\u0649"+
		"\bo\no\fo\u064c\to\u0003o\u064e\bo\u0001p\u0001p\u0001p\u0003p\u0653\b"+
		"p\u0001p\u0005p\u0656\bp\np\fp\u0659\tp\u0001p\u0001p\u0003p\u065d\bp"+
		"\u0001q\u0003q\u0660\bq\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003"+
		"q\u0668\bq\u0001r\u0001r\u0003r\u066c\br\u0001r\u0001r\u0001r\u0003r\u0671"+
		"\br\u0005r\u0673\br\nr\fr\u0676\tr\u0001r\u0003r\u0679\br\u0001s\u0001"+
		"s\u0003s\u067d\bs\u0001s\u0001s\u0001t\u0001t\u0004t\u0683\bt\u000bt\f"+
		"t\u0684\u0001t\u0001t\u0001t\u0001t\u0001t\u0004t\u068c\bt\u000bt\ft\u068d"+
		"\u0001t\u0001t\u0005t\u0692\bt\nt\ft\u0695\tt\u0003t\u0697\bt\u0001u\u0001"+
		"u\u0003u\u069b\bu\u0001v\u0001v\u0001v\u0001w\u0001w\u0001w\u0003w\u06a3"+
		"\bw\u0001x\u0001x\u0001x\u0003x\u06a8\bx\u0001y\u0001y\u0001y\u0001y\u0001"+
		"z\u0001z\u0001z\u0005z\u06b1\bz\nz\fz\u06b4\tz\u0001{\u0005{\u06b7\b{"+
		"\n{\f{\u06ba\t{\u0001{\u0001{\u0003{\u06be\b{\u0001{\u0005{\u06c1\b{\n"+
		"{\f{\u06c4\t{\u0001{\u0001{\u0005{\u06c8\b{\n{\f{\u06cb\t{\u0001|\u0001"+
		"|\u0001}\u0001}\u0001}\u0001}\u0005}\u06d3\b}\n}\f}\u06d6\t}\u0001}\u0001"+
		"}\u0001~\u0001~\u0001~\u0003~\u06dd\b~\u0001~\u0001~\u0003~\u06e1\b~\u0003"+
		"~\u06e3\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0003\u007f\u06ea\b\u007f\u0001\u0080\u0001\u0080\u0003\u0080\u06ee\b"+
		"\u0080\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0000"+
		"\u0002\u00cc\u00dc\u0082\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0000\u000f\u0002"+
		"\u0000\u0011\u0011((\u0001\u0000CF\u0001\u0000GH\u0002\u0000&&<<\u0002"+
		"\u00003A\u0081\u0081\u0003\u00003<?A\u0081\u0081\u0002\u0000Z[dg\u0002"+
		"\u0000himm\u0001\u0000fg\u0002\u0000XY_`\u0002\u0000^^aa\u0002\u0000W"+
		"Wnx\u0001\u0000de\u0002\u0000]]yy\b\u0000\u0003\u0003\u0005\u0005\b\b"+
		"\u000e\u000e\u0014\u0014\u001b\u001b\u001d\u001d%%\u07b7\u0000\u0118\u0001"+
		"\u0000\u0000\u0000\u0002\u011d\u0001\u0000\u0000\u0000\u0004\u0124\u0001"+
		"\u0000\u0000\u0000\u0006\u0130\u0001\u0000\u0000\u0000\b\u0137\u0001\u0000"+
		"\u0000\u0000\n\u0146\u0001\u0000\u0000\u0000\f\u0152\u0001\u0000\u0000"+
		"\u0000\u000e\u0156\u0001\u0000\u0000\u0000\u0010\u0158\u0001\u0000\u0000"+
		"\u0000\u0012\u016b\u0001\u0000\u0000\u0000\u0014\u0179\u0001\u0000\u0000"+
		"\u0000\u0016\u0187\u0001\u0000\u0000\u0000\u0018\u018f\u0001\u0000\u0000"+
		"\u0000\u001a\u01a1\u0001\u0000\u0000\u0000\u001c\u01ac\u0001\u0000\u0000"+
		"\u0000\u001e\u01b6\u0001\u0000\u0000\u0000 \u01bd\u0001\u0000\u0000\u0000"+
		"\"\u01cc\u0001\u0000\u0000\u0000$\u01d5\u0001\u0000\u0000\u0000&\u01e4"+
		"\u0001\u0000\u0000\u0000(\u01e7\u0001\u0000\u0000\u0000*\u01fb\u0001\u0000"+
		"\u0000\u0000,\u01fd\u0001\u0000\u0000\u0000.\u020f\u0001\u0000\u0000\u0000"+
		"0\u0213\u0001\u0000\u0000\u00002\u0215\u0001\u0000\u0000\u00004\u0218"+
		"\u0001\u0000\u0000\u00006\u021b\u0001\u0000\u0000\u00008\u0226\u0001\u0000"+
		"\u0000\u0000:\u022c\u0001\u0000\u0000\u0000<\u0232\u0001\u0000\u0000\u0000"+
		">\u0235\u0001\u0000\u0000\u0000@\u0247\u0001\u0000\u0000\u0000B\u0249"+
		"\u0001\u0000\u0000\u0000D\u0254\u0001\u0000\u0000\u0000F\u0262\u0001\u0000"+
		"\u0000\u0000H\u026d\u0001\u0000\u0000\u0000J\u0272\u0001\u0000\u0000\u0000"+
		"L\u027b\u0001\u0000\u0000\u0000N\u028e\u0001\u0000\u0000\u0000P\u0296"+
		"\u0001\u0000\u0000\u0000R\u029b\u0001\u0000\u0000\u0000T\u02a5\u0001\u0000"+
		"\u0000\u0000V\u02a7\u0001\u0000\u0000\u0000X\u02bf\u0001\u0000\u0000\u0000"+
		"Z\u02d2\u0001\u0000\u0000\u0000\\\u02d4\u0001\u0000\u0000\u0000^\u02dc"+
		"\u0001\u0000\u0000\u0000`\u02ec\u0001\u0000\u0000\u0000b\u0304\u0001\u0000"+
		"\u0000\u0000d\u0309\u0001\u0000\u0000\u0000f\u0312\u0001\u0000\u0000\u0000"+
		"h\u031f\u0001\u0000\u0000\u0000j\u032a\u0001\u0000\u0000\u0000l\u0330"+
		"\u0001\u0000\u0000\u0000n\u033f\u0001\u0000\u0000\u0000p\u0341\u0001\u0000"+
		"\u0000\u0000r\u0343\u0001\u0000\u0000\u0000t\u034a\u0001\u0000\u0000\u0000"+
		"v\u0353\u0001\u0000\u0000\u0000x\u035d\u0001\u0000\u0000\u0000z\u0365"+
		"\u0001\u0000\u0000\u0000|\u036c\u0001\u0000\u0000\u0000~\u036e\u0001\u0000"+
		"\u0000\u0000\u0080\u037e\u0001\u0000\u0000\u0000\u0082\u0383\u0001\u0000"+
		"\u0000\u0000\u0084\u0394\u0001\u0000\u0000\u0000\u0086\u03ae\u0001\u0000"+
		"\u0000\u0000\u0088\u03b2\u0001\u0000\u0000\u0000\u008a\u03b4\u0001\u0000"+
		"\u0000\u0000\u008c\u03ba\u0001\u0000\u0000\u0000\u008e\u03bc\u0001\u0000"+
		"\u0000\u0000\u0090\u03c0\u0001\u0000\u0000\u0000\u0092\u03c6\u0001\u0000"+
		"\u0000\u0000\u0094\u03f3\u0001\u0000\u0000\u0000\u0096\u03f5\u0001\u0000"+
		"\u0000\u0000\u0098\u03f7\u0001\u0000\u0000\u0000\u009a\u0403\u0001\u0000"+
		"\u0000\u0000\u009c\u0409\u0001\u0000\u0000\u0000\u009e\u0411\u0001\u0000"+
		"\u0000\u0000\u00a0\u0414\u0001\u0000\u0000\u0000\u00a2\u041e\u0001\u0000"+
		"\u0000\u0000\u00a4\u042c\u0001\u0000\u0000\u0000\u00a6\u0431\u0001\u0000"+
		"\u0000\u0000\u00a8\u043e\u0001\u0000\u0000\u0000\u00aa\u0440\u0001\u0000"+
		"\u0000\u0000\u00ac\u0445\u0001\u0000\u0000\u0000\u00ae\u04be\u0001\u0000"+
		"\u0000\u0000\u00b0\u04c0\u0001\u0000\u0000\u0000\u00b2\u04cd\u0001\u0000"+
		"\u0000\u0000\u00b4\u04d5\u0001\u0000\u0000\u0000\u00b6\u04d8\u0001\u0000"+
		"\u0000\u0000\u00b8\u04df\u0001\u0000\u0000\u0000\u00ba\u04f8\u0001\u0000"+
		"\u0000\u0000\u00bc\u04fb\u0001\u0000\u0000\u0000\u00be\u050f\u0001\u0000"+
		"\u0000\u0000\u00c0\u051d\u0001\u0000\u0000\u0000\u00c2\u0521\u0001\u0000"+
		"\u0000\u0000\u00c4\u0526\u0001\u0000\u0000\u0000\u00c6\u0531\u0001\u0000"+
		"\u0000\u0000\u00c8\u0535\u0001\u0000\u0000\u0000\u00ca\u0540\u0001\u0000"+
		"\u0000\u0000\u00cc\u056f\u0001\u0000\u0000\u0000\u00ce\u05ca\u0001\u0000"+
		"\u0000\u0000\u00d0\u05d6\u0001\u0000\u0000\u0000\u00d2\u05f0\u0001\u0000"+
		"\u0000\u0000\u00d4\u05f4\u0001\u0000\u0000\u0000\u00d6\u0608\u0001\u0000"+
		"\u0000\u0000\u00d8\u060a\u0001\u0000\u0000\u0000\u00da\u0620\u0001\u0000"+
		"\u0000\u0000\u00dc\u063c\u0001\u0000\u0000\u0000\u00de\u064d\u0001\u0000"+
		"\u0000\u0000\u00e0\u0652\u0001\u0000\u0000\u0000\u00e2\u0667\u0001\u0000"+
		"\u0000\u0000\u00e4\u0678\u0001\u0000\u0000\u0000\u00e6\u067a\u0001\u0000"+
		"\u0000\u0000\u00e8\u0696\u0001\u0000\u0000\u0000\u00ea\u0698\u0001\u0000"+
		"\u0000\u0000\u00ec\u069c\u0001\u0000\u0000\u0000\u00ee\u06a2\u0001\u0000"+
		"\u0000\u0000\u00f0\u06a7\u0001\u0000\u0000\u0000\u00f2\u06a9\u0001\u0000"+
		"\u0000\u0000\u00f4\u06ad\u0001\u0000\u0000\u0000\u00f6\u06b8\u0001\u0000"+
		"\u0000\u0000\u00f8\u06cc\u0001\u0000\u0000\u0000\u00fa\u06ce\u0001\u0000"+
		"\u0000\u0000\u00fc\u06e2\u0001\u0000\u0000\u0000\u00fe\u06e9\u0001\u0000"+
		"\u0000\u0000\u0100\u06eb\u0001\u0000\u0000\u0000\u0102\u06f1\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0003\u0002\u0001\u0000\u0105\u0104\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010b\u0001\u0000"+
		"\u0000\u0000\u0107\u010a\u0003\u0004\u0002\u0000\u0108\u010a\u0005T\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0112\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0111\u0003\u0006\u0003"+
		"\u0000\u010f\u0111\u0005T\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0119\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0003\u0090H\u0000\u0116\u0117\u0005\u0000\u0000\u0001\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0105\u0001\u0000\u0000\u0000\u0118"+
		"\u0115\u0001\u0000\u0000\u0000\u0119\u0001\u0001\u0000\u0000\u0000\u011a"+
		"\u011c\u0003v;\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005 \u0000\u0000\u0121\u0122\u0003l6"+
		"\u0000\u0122\u0123\u0005T\u0000\u0000\u0123\u0003\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0005\u0019\u0000\u0000\u0125\u0127\u0005&\u0000\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u012b\u0003l6\u0000\u0129\u012a\u0005"+
		"V\u0000\u0000\u012a\u012c\u0005h\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0005T\u0000\u0000\u012e\u0005\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u0003\u0102\u0081\u0000\u0130\u012f\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0003\b\u0004\u0000\u0133\u0007\u0001\u0000\u0000\u0000\u0134"+
		"\u0136\u0003\f\u0006\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013f\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u0140\u0003\u0010\b\u0000\u013b\u0140\u0003"+
		"\u0018\f\u0000\u013c\u0140\u0003 \u0010\u0000\u013d\u0140\u0003\u0080"+
		"@\u0000\u013e\u0140\u0003\u0098L\u0000\u013f\u013a\u0001\u0000\u0000\u0000"+
		"\u013f\u013b\u0001\u0000\u0000\u0000\u013f\u013c\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\t\u0001\u0000\u0000\u0000\u0141\u0147\u0003\f\u0006\u0000\u0142"+
		"\u0147\u0005\u001e\u0000\u0000\u0143\u0147\u0005*\u0000\u0000\u0144\u0147"+
		"\u0005.\u0000\u0000\u0145\u0147\u00051\u0000\u0000\u0146\u0141\u0001\u0000"+
		"\u0000\u0000\u0146\u0142\u0001\u0000\u0000\u0000\u0146\u0143\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u000b\u0001\u0000\u0000\u0000\u0148\u0153\u0003v;\u0000"+
		"\u0149\u0153\u0005#\u0000\u0000\u014a\u0153\u0005\"\u0000\u0000\u014b"+
		"\u0153\u0005!\u0000\u0000\u014c\u0153\u0005&\u0000\u0000\u014d\u0153\u0005"+
		"\u0001\u0000\u0000\u014e\u0153\u0005\u0012\u0000\u0000\u014f\u0153\u0005"+
		"\'\u0000\u0000\u0150\u0153\u0005@\u0000\u0000\u0151\u0153\u0005B\u0000"+
		"\u0000\u0152\u0148\u0001\u0000\u0000\u0000\u0152\u0149\u0001\u0000\u0000"+
		"\u0000\u0152\u014a\u0001\u0000\u0000\u0000\u0152\u014b\u0001\u0000\u0000"+
		"\u0000\u0152\u014c\u0001\u0000\u0000\u0000\u0152\u014d\u0001\u0000\u0000"+
		"\u0000\u0152\u014e\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\r\u0001\u0000\u0000\u0000\u0154\u0157\u0005\u0012\u0000\u0000"+
		"\u0155\u0157\u0003v;\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u000f\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005\t\u0000\u0000\u0159\u015b\u0003\u00a8T\u0000\u015a\u015c\u0003"+
		"\u0012\t\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0011"+
		"\u0000\u0000\u015e\u0160\u0003\u00f6{\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0005\u0018\u0000\u0000\u0162\u0164\u0003\u00f4z\u0000"+
		"\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0166\u0005A\u0000\u0000\u0166"+
		"\u0168\u0003\u00f4z\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0003\"\u0011\u0000\u016a\u0011\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"Y\u0000\u0000\u016c\u0171\u0003\u0014\n\u0000\u016d\u016e\u0005U\u0000"+
		"\u0000\u016e\u0170\u0003\u0014\n\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005X\u0000\u0000\u0175"+
		"\u0013\u0001\u0000\u0000\u0000\u0176\u0178\u0003v;\u0000\u0177\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u0185\u0003"+
		"\u00a8T\u0000\u017d\u0181\u0005\u0011\u0000\u0000\u017e\u0180\u0003v;"+
		"\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0186\u0003\u0016\u000b\u0000\u0185\u017d\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0015\u0001\u0000\u0000"+
		"\u0000\u0187\u018c\u0003\u00f6{\u0000\u0188\u0189\u0005j\u0000\u0000\u0189"+
		"\u018b\u0003\u00f6{\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018e"+
		"\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u0017\u0001\u0000\u0000\u0000\u018e\u018c"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0010\u0000\u0000\u0190\u0193"+
		"\u0003\u00a8T\u0000\u0191\u0192\u0005\u0018\u0000\u0000\u0192\u0194\u0003"+
		"\u00f4z\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0005P\u0000"+
		"\u0000\u0196\u0198\u0003\u001a\r\u0000\u0197\u0196\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0005U\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0003\u001e\u000f\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0005Q\u0000\u0000\u01a0\u0019\u0001\u0000\u0000\u0000\u01a1\u01a6"+
		"\u0003\u001c\u000e\u0000\u01a2\u01a3\u0005U\u0000\u0000\u01a3\u01a5\u0003"+
		"\u001c\u000e\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u001b\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0003v;\u0000\u01aa\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b1\u0003\u00a8T\u0000"+
		"\u01b0\u01b2\u0003\u0100\u0080\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b5\u0003\"\u0011\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u001d\u0001\u0000\u0000\u0000\u01b6"+
		"\u01ba\u0005T\u0000\u0000\u01b7\u01b9\u0003&\u0013\u0000\u01b8\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u001f\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"\u001c\u0000\u0000\u01be\u01c0\u0003\u00a8T\u0000\u01bf\u01c1\u0003\u0012"+
		"\t\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u0011\u0000"+
		"\u0000\u01c3\u01c5\u0003\u00f4z\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005A\u0000\u0000\u01c7\u01c9\u0003\u00f4z\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003$\u0012\u0000\u01cb!\u0001\u0000"+
		"\u0000\u0000\u01cc\u01d0\u0005P\u0000\u0000\u01cd\u01cf\u0003&\u0013\u0000"+
		"\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005Q\u0000\u0000\u01d4#\u0001\u0000\u0000\u0000\u01d5\u01d9"+
		"\u0005P\u0000\u0000\u01d6\u01d8\u0003<\u001e\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000"+
		"\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005Q\u0000"+
		"\u0000\u01dd%\u0001\u0000\u0000\u0000\u01de\u01e5\u0005T\u0000\u0000\u01df"+
		"\u01e1\u0005&\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e5"+
		"\u0003\u00a2Q\u0000\u01e3\u01e5\u0003(\u0014\u0000\u01e4\u01de\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e0\u0001\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\'\u0001\u0000\u0000\u0000\u01e6\u01e8\u0003\u0102\u0081"+
		"\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e8\u01ec\u0001\u0000\u0000\u0000\u01e9\u01eb\u0003\n\u0005\u0000"+
		"\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0003*\u0015\u0000\u01f0)\u0001\u0000\u0000\u0000\u01f1\u01fc"+
		"\u0003\u0098L\u0000\u01f2\u01fc\u0003,\u0016\u0000\u01f3\u01fc\u00032"+
		"\u0019\u0000\u01f4\u01fc\u0003:\u001d\u0000\u01f5\u01fc\u00036\u001b\u0000"+
		"\u01f6\u01fc\u00034\u001a\u0000\u01f7\u01fc\u0003 \u0010\u0000\u01f8\u01fc"+
		"\u0003\u0080@\u0000\u01f9\u01fc\u0003\u0010\b\u0000\u01fa\u01fc\u0003"+
		"\u0018\f\u0000\u01fb\u01f1\u0001\u0000\u0000\u0000\u01fb\u01f2\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000\u01fb\u01f4\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f5\u0001\u0000\u0000\u0000\u01fb\u01f6\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f7\u0001\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc+\u0001\u0000\u0000\u0000\u01fd\u01fe\u00030\u0018\u0000"+
		"\u01fe\u01ff\u0003\u00a8T\u0000\u01ff\u0204\u0003^/\u0000\u0200\u0201"+
		"\u0005R\u0000\u0000\u0201\u0203\u0005S\u0000\u0000\u0202\u0200\u0001\u0000"+
		"\u0000\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0209\u0001\u0000"+
		"\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u0005-\u0000"+
		"\u0000\u0208\u020a\u0003\\.\u0000\u0209\u0207\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0003.\u0017\u0000\u020c-\u0001\u0000\u0000\u0000\u020d\u0210"+
		"\u0003\u00a2Q\u0000\u020e\u0210\u0005T\u0000\u0000\u020f\u020d\u0001\u0000"+
		"\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210/\u0001\u0000\u0000"+
		"\u0000\u0211\u0214\u0003\u00f6{\u0000\u0212\u0214\u00050\u0000\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214"+
		"1\u0001\u0000\u0000\u0000\u0215\u0216\u0003\u0012\t\u0000\u0216\u0217"+
		"\u0003,\u0016\u0000\u02173\u0001\u0000\u0000\u0000\u0218\u0219\u0003\u0012"+
		"\t\u0000\u0219\u021a\u00036\u001b\u0000\u021a5\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0003\u00a8T\u0000\u021c\u021f\u0003^/\u0000\u021d\u021e"+
		"\u0005-\u0000\u0000\u021e\u0220\u0003\\.\u0000\u021f\u021d\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0003\u00a2Q\u0000\u02227\u0001\u0000\u0000\u0000"+
		"\u0223\u0225\u0003\n\u0005\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225"+
		"\u0228\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0001\u0000\u0000\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228"+
		"\u0226\u0001\u0000\u0000\u0000\u0229\u022a\u0003\u00a8T\u0000\u022a\u022b"+
		"\u0003\u00a2Q\u0000\u022b9\u0001\u0000\u0000\u0000\u022c\u022d\u0003\u00f6"+
		"{\u0000\u022d\u022e\u0003N\'\u0000\u022e\u022f\u0005T\u0000\u0000\u022f"+
		";\u0001\u0000\u0000\u0000\u0230\u0233\u0003>\u001f\u0000\u0231\u0233\u0005"+
		"T\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231\u0001\u0000"+
		"\u0000\u0000\u0233=\u0001\u0000\u0000\u0000\u0234\u0236\u0003\u0102\u0081"+
		"\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u023a\u0001\u0000\u0000\u0000\u0237\u0239\u0003\n\u0005\u0000"+
		"\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000"+
		"\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000"+
		"\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0003@ \u0000\u023e?\u0001\u0000\u0000\u0000\u023f\u0248"+
		"\u0003\u0098L\u0000\u0240\u0248\u0003B!\u0000\u0241\u0248\u0003F#\u0000"+
		"\u0242\u0248\u0003J%\u0000\u0243\u0248\u0003 \u0010\u0000\u0244\u0248"+
		"\u0003\u0080@\u0000\u0245\u0248\u0003\u0010\b\u0000\u0246\u0248\u0003"+
		"\u0018\f\u0000\u0247\u023f\u0001\u0000\u0000\u0000\u0247\u0240\u0001\u0000"+
		"\u0000\u0000\u0247\u0241\u0001\u0000\u0000\u0000\u0247\u0242\u0001\u0000"+
		"\u0000\u0000\u0247\u0243\u0001\u0000\u0000\u0000\u0247\u0244\u0001\u0000"+
		"\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0246\u0001\u0000"+
		"\u0000\u0000\u0248A\u0001\u0000\u0000\u0000\u0249\u024a\u0003\u00f6{\u0000"+
		"\u024a\u024f\u0003D\"\u0000\u024b\u024c\u0005U\u0000\u0000\u024c\u024e"+
		"\u0003D\"\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u0251\u0001"+
		"\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001"+
		"\u0000\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u024f\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0005T\u0000\u0000\u0253C\u0001\u0000\u0000"+
		"\u0000\u0254\u0259\u0003\u00a8T\u0000\u0255\u0256\u0005R\u0000\u0000\u0256"+
		"\u0258\u0005S\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u025b"+
		"\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0001\u0000\u0000\u0000\u025a\u025c\u0001\u0000\u0000\u0000\u025b\u0259"+
		"\u0001\u0000\u0000\u0000\u025c\u025d\u0005W\u0000\u0000\u025d\u025e\u0003"+
		"T*\u0000\u025eE\u0001\u0000\u0000\u0000\u025f\u0261\u0003H$\u0000\u0260"+
		"\u025f\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262"+
		"\u0260\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263"+
		"\u0265\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265"+
		"\u0266\u0003L&\u0000\u0266G\u0001\u0000\u0000\u0000\u0267\u026e\u0003"+
		"v;\u0000\u0268\u026e\u0005#\u0000\u0000\u0269\u026e\u0005\u0001\u0000"+
		"\u0000\u026a\u026e\u0005\f\u0000\u0000\u026b\u026e\u0005&\u0000\u0000"+
		"\u026c\u026e\u0005\'\u0000\u0000\u026d\u0267\u0001\u0000\u0000\u0000\u026d"+
		"\u0268\u0001\u0000\u0000\u0000\u026d\u0269\u0001\u0000\u0000\u0000\u026d"+
		"\u026a\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d"+
		"\u026c\u0001\u0000\u0000\u0000\u026eI\u0001\u0000\u0000\u0000\u026f\u0271"+
		"\u0003H$\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000"+
		"\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000"+
		"\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0003\u0012\t\u0000\u0276\u0277\u0003L&\u0000"+
		"\u0277K\u0001\u0000\u0000\u0000\u0278\u027a\u0003v;\u0000\u0279\u0278"+
		"\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e"+
		"\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u00030\u0018\u0000\u027f\u0280\u0003\u00a8T\u0000\u0280\u0285\u0003^"+
		"/\u0000\u0281\u0282\u0005R\u0000\u0000\u0282\u0284\u0005S\u0000\u0000"+
		"\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000"+
		"\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000"+
		"\u0286\u028a\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000"+
		"\u0288\u0289\u0005-\u0000\u0000\u0289\u028b\u0003\\.\u0000\u028a\u0288"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0003.\u0017\u0000\u028dM\u0001\u0000"+
		"\u0000\u0000\u028e\u0293\u0003P(\u0000\u028f\u0290\u0005U\u0000\u0000"+
		"\u0290\u0292\u0003P(\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0295"+
		"\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0294"+
		"\u0001\u0000\u0000\u0000\u0294O\u0001\u0000\u0000\u0000\u0295\u0293\u0001"+
		"\u0000\u0000\u0000\u0296\u0299\u0003R)\u0000\u0297\u0298\u0005W\u0000"+
		"\u0000\u0298\u029a\u0003T*\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u0001\u0000\u0000\u0000\u029aQ\u0001\u0000\u0000\u0000\u029b\u02a0"+
		"\u0003\u00a8T\u0000\u029c\u029d\u0005R\u0000\u0000\u029d\u029f\u0005S"+
		"\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029f\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1S\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a6\u0003V+\u0000\u02a4\u02a6\u0003\u00ccf\u0000\u02a5"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6"+
		"U\u0001\u0000\u0000\u0000\u02a7\u02b3\u0005P\u0000\u0000\u02a8\u02ad\u0003"+
		"T*\u0000\u02a9\u02aa\u0005U\u0000\u0000\u02aa\u02ac\u0003T*\u0000\u02ab"+
		"\u02a9\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae"+
		"\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b2\u0005U\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02a8"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005Q\u0000\u0000\u02b6W\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b9\u0003\u00a8T\u0000\u02b8\u02ba\u0003\u00fa}\u0000"+
		"\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005V\u0000\u0000\u02bc"+
		"\u02be\u0001\u0000\u0000\u0000\u02bd\u02b7\u0001\u0000\u0000\u0000\u02be"+
		"\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c4\u0003\u00aaU\u0000\u02c3\u02c5"+
		"\u0003\u00fa}\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c5Y\u0001\u0000\u0000\u0000\u02c6\u02d3\u0003\u00f6"+
		"{\u0000\u02c7\u02c9\u0003v;\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000"+
		"\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02d0\u0005\\\u0000\u0000\u02ce"+
		"\u02cf\u0007\u0000\u0000\u0000\u02cf\u02d1\u0003\u00f6{\u0000\u02d0\u02ce"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d2\u02c6\u0001\u0000\u0000\u0000\u02d2\u02ca"+
		"\u0001\u0000\u0000\u0000\u02d3[\u0001\u0000\u0000\u0000\u02d4\u02d9\u0003"+
		"l6\u0000\u02d5\u02d6\u0005U\u0000\u0000\u02d6\u02d8\u0003l6\u0000\u02d7"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da"+
		"]\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02dc\u02e8"+
		"\u0005N\u0000\u0000\u02dd\u02df\u0003`0\u0000\u02de\u02dd\u0001\u0000"+
		"\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e0\u02e3\u0003`0\u0000\u02e1\u02e2\u0005U\u0000\u0000"+
		"\u02e2\u02e4\u0003b1\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e9\u0001\u0000\u0000\u0000\u02e5\u02e7"+
		"\u0003b1\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e9\u0001\u0000\u0000\u0000\u02e8\u02de\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e0\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005O\u0000"+
		"\u0000\u02eb_\u0001\u0000\u0000\u0000\u02ec\u02f2\u0003\u00f6{\u0000\u02ed"+
		"\u02ee\u0003\u00a8T\u0000\u02ee\u02ef\u0005V\u0000\u0000\u02ef\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f0\u02ed\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u0005+\u0000\u0000\u02f6a\u0001\u0000\u0000"+
		"\u0000\u02f7\u02fc\u0003d2\u0000\u02f8\u02f9\u0005U\u0000\u0000\u02f9"+
		"\u02fb\u0003d2\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001"+
		"\u0000\u0000\u0000\u02fd\u0301\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001"+
		"\u0000\u0000\u0000\u02ff\u0300\u0005U\u0000\u0000\u0300\u0302\u0003f3"+
		"\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000"+
		"\u0000\u0302\u0305\u0001\u0000\u0000\u0000\u0303\u0305\u0003f3\u0000\u0304"+
		"\u02f7\u0001\u0000\u0000\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305"+
		"c\u0001\u0000\u0000\u0000\u0306\u0308\u0003\u000e\u0007\u0000\u0307\u0306"+
		"\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u0307"+
		"\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030c"+
		"\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0003\u00f6{\u0000\u030d\u030e\u0003R)\u0000\u030ee\u0001\u0000\u0000"+
		"\u0000\u030f\u0311\u0003\u000e\u0007\u0000\u0310\u030f\u0001\u0000\u0000"+
		"\u0000\u0311\u0314\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0315\u0001\u0000\u0000"+
		"\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u0319\u0003\u00f6{\u0000"+
		"\u0316\u0318\u0003v;\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0318\u031b"+
		"\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0001\u0000\u0000\u0000\u031a\u031c\u0001\u0000\u0000\u0000\u031b\u0319"+
		"\u0001\u0000\u0000\u0000\u031c\u031d\u0005|\u0000\u0000\u031d\u031e\u0003"+
		"R)\u0000\u031eg\u0001\u0000\u0000\u0000\u031f\u0324\u0003j5\u0000\u0320"+
		"\u0321\u0005U\u0000\u0000\u0321\u0323\u0003j5\u0000\u0322\u0320\u0001"+
		"\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325i\u0001\u0000"+
		"\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u0329\u0003\u000e"+
		"\u0007\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000"+
		"\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000"+
		"\u0000\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0005=\u0000\u0000\u032e\u032f\u0003\u00a8T\u0000"+
		"\u032fk\u0001\u0000\u0000\u0000\u0330\u0335\u0003\u00a8T\u0000\u0331\u0332"+
		"\u0005V\u0000\u0000\u0332\u0334\u0003\u00a8T\u0000\u0333\u0331\u0001\u0000"+
		"\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335\u0333\u0001\u0000"+
		"\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336m\u0001\u0000\u0000"+
		"\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u0340\u0003p8\u0000\u0339"+
		"\u0340\u0003r9\u0000\u033a\u0340\u0005J\u0000\u0000\u033b\u0340\u0005"+
		"K\u0000\u0000\u033c\u0340\u0005I\u0000\u0000\u033d\u0340\u0005M\u0000"+
		"\u0000\u033e\u0340\u0005L\u0000\u0000\u033f\u0338\u0001\u0000\u0000\u0000"+
		"\u033f\u0339\u0001\u0000\u0000\u0000\u033f\u033a\u0001\u0000\u0000\u0000"+
		"\u033f\u033b\u0001\u0000\u0000\u0000\u033f\u033c\u0001\u0000\u0000\u0000"+
		"\u033f\u033d\u0001\u0000\u0000\u0000\u033f\u033e\u0001\u0000\u0000\u0000"+
		"\u0340o\u0001\u0000\u0000\u0000\u0341\u0342\u0007\u0001\u0000\u0000\u0342"+
		"q\u0001\u0000\u0000\u0000\u0343\u0344\u0007\u0002\u0000\u0000\u0344s\u0001"+
		"\u0000\u0000\u0000\u0345\u0346\u0003\u00a8T\u0000\u0346\u0347\u0005V\u0000"+
		"\u0000\u0347\u0349\u0001\u0000\u0000\u0000\u0348\u0345\u0001\u0000\u0000"+
		"\u0000\u0349\u034c\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000"+
		"\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d\u0001\u0000\u0000"+
		"\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034d\u034e\u0005{\u0000\u0000"+
		"\u034e\u034f\u0003\u00a8T\u0000\u034fu\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0005{\u0000\u0000\u0351\u0354\u0003l6\u0000\u0352\u0354\u0003t:\u0000"+
		"\u0353\u0350\u0001\u0000\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000"+
		"\u0354\u035b\u0001\u0000\u0000\u0000\u0355\u0358\u0005N\u0000\u0000\u0356"+
		"\u0359\u0003x<\u0000\u0357\u0359\u0003|>\u0000\u0358\u0356\u0001\u0000"+
		"\u0000\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000"+
		"\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035c\u0005O\u0000"+
		"\u0000\u035b\u0355\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000"+
		"\u0000\u035cw\u0001\u0000\u0000\u0000\u035d\u0362\u0003z=\u0000\u035e"+
		"\u035f\u0005U\u0000\u0000\u035f\u0361\u0003z=\u0000\u0360\u035e\u0001"+
		"\u0000\u0000\u0000\u0361\u0364\u0001\u0000\u0000\u0000\u0362\u0360\u0001"+
		"\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363y\u0001\u0000"+
		"\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0366\u0003\u00a8"+
		"T\u0000\u0366\u0367\u0005W\u0000\u0000\u0367\u0368\u0003|>\u0000\u0368"+
		"{\u0001\u0000\u0000\u0000\u0369\u036d\u0003\u00ccf\u0000\u036a\u036d\u0003"+
		"v;\u0000\u036b\u036d\u0003~?\u0000\u036c\u0369\u0001\u0000\u0000\u0000"+
		"\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036b\u0001\u0000\u0000\u0000"+
		"\u036d}\u0001\u0000\u0000\u0000\u036e\u0377\u0005P\u0000\u0000\u036f\u0374"+
		"\u0003|>\u0000\u0370\u0371\u0005U\u0000\u0000\u0371\u0373\u0003|>\u0000"+
		"\u0372\u0370\u0001\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000"+
		"\u0374\u0372\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000"+
		"\u0375\u0378\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000"+
		"\u0377\u036f\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000"+
		"\u0378\u037a\u0001\u0000\u0000\u0000\u0379\u037b\u0005U\u0000\u0000\u037a"+
		"\u0379\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b"+
		"\u037c\u0001\u0000\u0000\u0000\u037c\u037d\u0005Q\u0000\u0000\u037d\u007f"+
		"\u0001\u0000\u0000\u0000\u037e\u037f\u0005{\u0000\u0000\u037f\u0380\u0005"+
		"\u001c\u0000\u0000\u0380\u0381\u0003\u00a8T\u0000\u0381\u0382\u0003\u0082"+
		"A\u0000\u0382\u0081\u0001\u0000\u0000\u0000\u0383\u0387\u0005P\u0000\u0000"+
		"\u0384\u0386\u0003\u0084B\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0386"+
		"\u0389\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387"+
		"\u0388\u0001\u0000\u0000\u0000\u0388\u038a\u0001\u0000\u0000\u0000\u0389"+
		"\u0387\u0001\u0000\u0000\u0000\u038a\u038b\u0005Q\u0000\u0000\u038b\u0083"+
		"\u0001\u0000\u0000\u0000\u038c\u038e\u0003\n\u0005\u0000\u038d\u038c\u0001"+
		"\u0000\u0000\u0000\u038e\u0391\u0001\u0000\u0000\u0000\u038f\u038d\u0001"+
		"\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0392\u0001"+
		"\u0000\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0392\u0395\u0003"+
		"\u0086C\u0000\u0393\u0395\u0005T\u0000\u0000\u0394\u038f\u0001\u0000\u0000"+
		"\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0395\u0085\u0001\u0000\u0000"+
		"\u0000\u0396\u0397\u0003\u00f6{\u0000\u0397\u0398\u0003\u0088D\u0000\u0398"+
		"\u0399\u0005T\u0000\u0000\u0399\u03af\u0001\u0000\u0000\u0000\u039a\u039c"+
		"\u0003\u0010\b\u0000\u039b\u039d\u0005T\u0000\u0000\u039c\u039b\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u03af\u0001"+
		"\u0000\u0000\u0000\u039e\u03a0\u0003 \u0010\u0000\u039f\u03a1\u0005T\u0000"+
		"\u0000\u03a0\u039f\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a1\u03af\u0001\u0000\u0000\u0000\u03a2\u03a4\u0003\u0018\f\u0000"+
		"\u03a3\u03a5\u0005T\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a5\u0001\u0000\u0000\u0000\u03a5\u03af\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a8\u0003\u0080@\u0000\u03a7\u03a9\u0005T\u0000\u0000\u03a8\u03a7\u0001"+
		"\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03af\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ac\u0003\u0098L\u0000\u03ab\u03ad\u0005T\u0000"+
		"\u0000\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000"+
		"\u0000\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u0396\u0001\u0000\u0000"+
		"\u0000\u03ae\u039a\u0001\u0000\u0000\u0000\u03ae\u039e\u0001\u0000\u0000"+
		"\u0000\u03ae\u03a2\u0001\u0000\u0000\u0000\u03ae\u03a6\u0001\u0000\u0000"+
		"\u0000\u03ae\u03aa\u0001\u0000\u0000\u0000\u03af\u0087\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b3\u0003\u008aE\u0000\u03b1\u03b3\u0003\u008cF\u0000\u03b2"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b3"+
		"\u0089\u0001\u0000\u0000\u0000\u03b4\u03b5\u0003\u00a8T\u0000\u03b5\u03b6"+
		"\u0005N\u0000\u0000\u03b6\u03b8\u0005O\u0000\u0000\u03b7\u03b9\u0003\u008e"+
		"G\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000"+
		"\u0000\u03b9\u008b\u0001\u0000\u0000\u0000\u03ba\u03bb\u0003N\'\u0000"+
		"\u03bb\u008d\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005\f\u0000\u0000\u03bd"+
		"\u03be\u0003|>\u0000\u03be\u008f\u0001\u0000\u0000\u0000\u03bf\u03c1\u0005"+
		"4\u0000\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c3\u00053\u0000"+
		"\u0000\u03c3\u03c4\u0003l6\u0000\u03c4\u03c5\u0003\u0092I\u0000\u03c5"+
		"\u0091\u0001\u0000\u0000\u0000\u03c6\u03ca\u0005P\u0000\u0000\u03c7\u03c9"+
		"\u0003\u0094J\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9\u03cc\u0001"+
		"\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001"+
		"\u0000\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001"+
		"\u0000\u0000\u0000\u03cd\u03ce\u0005Q\u0000\u0000\u03ce\u0093\u0001\u0000"+
		"\u0000\u0000\u03cf\u03d3\u00055\u0000\u0000\u03d0\u03d2\u0003\u0096K\u0000"+
		"\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000"+
		"\u03d4\u03d6\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d7\u0003l6\u0000\u03d7\u03d8\u0005T\u0000\u0000\u03d8\u03f4"+
		"\u0001\u0000\u0000\u0000\u03d9\u03da\u00056\u0000\u0000\u03da\u03dd\u0003"+
		"l6\u0000\u03db\u03dc\u00058\u0000\u0000\u03dc\u03de\u0003l6\u0000\u03dd"+
		"\u03db\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de"+
		"\u03df\u0001\u0000\u0000\u0000\u03df\u03e0\u0005T\u0000\u0000\u03e0\u03f4"+
		"\u0001\u0000\u0000\u0000\u03e1\u03e2\u00057\u0000\u0000\u03e2\u03e5\u0003"+
		"l6\u0000\u03e3\u03e4\u00058\u0000\u0000\u03e4\u03e6\u0003l6\u0000\u03e5"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6"+
		"\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8\u0005T\u0000\u0000\u03e8\u03f4"+
		"\u0001\u0000\u0000\u0000\u03e9\u03ea\u00059\u0000\u0000\u03ea\u03eb\u0003"+
		"l6\u0000\u03eb\u03ec\u0005T\u0000\u0000\u03ec\u03f4\u0001\u0000\u0000"+
		"\u0000\u03ed\u03ee\u0005:\u0000\u0000\u03ee\u03ef\u0003l6\u0000\u03ef"+
		"\u03f0\u0005;\u0000\u0000\u03f0\u03f1\u0003l6\u0000\u03f1\u03f2\u0005"+
		"T\u0000\u0000\u03f2\u03f4\u0001\u0000\u0000\u0000\u03f3\u03cf\u0001\u0000"+
		"\u0000\u0000\u03f3\u03d9\u0001\u0000\u0000\u0000\u03f3\u03e1\u0001\u0000"+
		"\u0000\u0000\u03f3\u03e9\u0001\u0000\u0000\u0000\u03f3\u03ed\u0001\u0000"+
		"\u0000\u0000\u03f4\u0095\u0001\u0000\u0000\u0000\u03f5\u03f6\u0007\u0003"+
		"\u0000\u0000\u03f6\u0097\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005?\u0000"+
		"\u0000\u03f8\u03fa\u0003\u00a8T\u0000\u03f9\u03fb\u0003\u0012\t\u0000"+
		"\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u03ff\u0003\u009aM\u0000\u03fd"+
		"\u03fe\u0005\u0018\u0000\u0000\u03fe\u0400\u0003\u00f4z\u0000\u03ff\u03fd"+
		"\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0401"+
		"\u0001\u0000\u0000\u0000\u0401\u0402\u0003\u00a0P\u0000\u0402\u0099\u0001"+
		"\u0000\u0000\u0000\u0403\u0405\u0005N\u0000\u0000\u0404\u0406\u0003\u009c"+
		"N\u0000\u0405\u0404\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0408\u0005O\u0000\u0000"+
		"\u0408\u009b\u0001\u0000\u0000\u0000\u0409\u040e\u0003\u009eO\u0000\u040a"+
		"\u040b\u0005U\u0000\u0000\u040b\u040d\u0003\u009eO\u0000\u040c\u040a\u0001"+
		"\u0000\u0000\u0000\u040d\u0410\u0001\u0000\u0000\u0000\u040e\u040c\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u009d\u0001"+
		"\u0000\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0411\u0412\u0003"+
		"\u00f6{\u0000\u0412\u0413\u0003\u00a8T\u0000\u0413\u009f\u0001\u0000\u0000"+
		"\u0000\u0414\u0419\u0005P\u0000\u0000\u0415\u0418\u0003&\u0013\u0000\u0416"+
		"\u0418\u00038\u001c\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0417\u0416"+
		"\u0001\u0000\u0000\u0000\u0418\u041b\u0001\u0000\u0000\u0000\u0419\u0417"+
		"\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u041c"+
		"\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000\u0000\u041c\u041d"+
		"\u0005Q\u0000\u0000\u041d\u00a1\u0001\u0000\u0000\u0000\u041e\u0422\u0005"+
		"P\u0000\u0000\u041f\u0421\u0003\u00a4R\u0000\u0420\u041f\u0001\u0000\u0000"+
		"\u0000\u0421\u0424\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000"+
		"\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0425\u0001\u0000\u0000"+
		"\u0000\u0424\u0422\u0001\u0000\u0000\u0000\u0425\u0426\u0005Q\u0000\u0000"+
		"\u0426\u00a3\u0001\u0000\u0000\u0000\u0427\u0428\u0003\u00a6S\u0000\u0428"+
		"\u0429\u0005T\u0000\u0000\u0429\u042d\u0001\u0000\u0000\u0000\u042a\u042d"+
		"\u0003\u00acV\u0000\u042b\u042d\u0003\u00aeW\u0000\u042c\u0427\u0001\u0000"+
		"\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c\u042b\u0001\u0000"+
		"\u0000\u0000\u042d\u00a5\u0001\u0000\u0000\u0000\u042e\u0430\u0003\u000e"+
		"\u0007\u0000\u042f\u042e\u0001\u0000\u0000\u0000\u0430\u0433\u0001\u0000"+
		"\u0000\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000"+
		"\u0000\u0000\u0432\u043c\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000"+
		"\u0000\u0000\u0434\u0435\u0005=\u0000\u0000\u0435\u0436\u0003\u00a8T\u0000"+
		"\u0436\u0437\u0005W\u0000\u0000\u0437\u0438\u0003\u00ccf\u0000\u0438\u043d"+
		"\u0001\u0000\u0000\u0000\u0439\u043a\u0003\u00f6{\u0000\u043a\u043b\u0003"+
		"N\'\u0000\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u0434\u0001\u0000"+
		"\u0000\u0000\u043c\u0439\u0001\u0000\u0000\u0000\u043d\u00a7\u0001\u0000"+
		"\u0000\u0000\u043e\u043f\u0007\u0004\u0000\u0000\u043f\u00a9\u0001\u0000"+
		"\u0000\u0000\u0440\u0441\u0007\u0005\u0000\u0000\u0441\u00ab\u0001\u0000"+
		"\u0000\u0000\u0442\u0444\u0003\f\u0006\u0000\u0443\u0442\u0001\u0000\u0000"+
		"\u0000\u0444\u0447\u0001\u0000\u0000\u0000\u0445\u0443\u0001\u0000\u0000"+
		"\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u044b\u0001\u0000\u0000"+
		"\u0000\u0447\u0445\u0001\u0000\u0000\u0000\u0448\u044c\u0003\u0010\b\u0000"+
		"\u0449\u044c\u0003 \u0010\u0000\u044a\u044c\u0003\u0098L\u0000\u044b\u0448"+
		"\u0001\u0000\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000\u044b\u044a"+
		"\u0001\u0000\u0000\u0000\u044c\u00ad\u0001\u0000\u0000\u0000\u044d\u04bf"+
		"\u0003\u00a2Q\u0000\u044e\u044f\u0005\u0002\u0000\u0000\u044f\u0452\u0003"+
		"\u00ccf\u0000\u0450\u0451\u0005]\u0000\u0000\u0451\u0453\u0003\u00ccf"+
		"\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000"+
		"\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0455\u0005T\u0000\u0000"+
		"\u0455\u04bf\u0001\u0000\u0000\u0000\u0456\u0457\u0005\u0016\u0000\u0000"+
		"\u0457\u0458\u0003\u00c6c\u0000\u0458\u045b\u0003\u00aeW\u0000\u0459\u045a"+
		"\u0005\u000f\u0000\u0000\u045a\u045c\u0003\u00aeW\u0000\u045b\u0459\u0001"+
		"\u0000\u0000\u0000\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u04bf\u0001"+
		"\u0000\u0000\u0000\u045d\u045e\u0005\u0015\u0000\u0000\u045e\u045f\u0005"+
		"N\u0000\u0000\u045f\u0460\u0003\u00c0`\u0000\u0460\u0461\u0005O\u0000"+
		"\u0000\u0461\u0462\u0003\u00aeW\u0000\u0462\u04bf\u0001\u0000\u0000\u0000"+
		"\u0463\u0464\u00052\u0000\u0000\u0464\u0465\u0003\u00c6c\u0000\u0465\u0466"+
		"\u0003\u00aeW\u0000\u0466\u04bf\u0001\u0000\u0000\u0000\u0467\u0468\u0005"+
		"\r\u0000\u0000\u0468\u0469\u0003\u00aeW\u0000\u0469\u046a\u00052\u0000"+
		"\u0000\u046a\u046b\u0003\u00c6c\u0000\u046b\u046c\u0005T\u0000\u0000\u046c"+
		"\u04bf\u0001\u0000\u0000\u0000\u046d\u046e\u0005/\u0000\u0000\u046e\u0478"+
		"\u0003\u00a2Q\u0000\u046f\u0471\u0003\u00b0X\u0000\u0470\u046f\u0001\u0000"+
		"\u0000\u0000\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u0470\u0001\u0000"+
		"\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0475\u0001\u0000"+
		"\u0000\u0000\u0474\u0476\u0003\u00b4Z\u0000\u0475\u0474\u0001\u0000\u0000"+
		"\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0479\u0001\u0000\u0000"+
		"\u0000\u0477\u0479\u0003\u00b4Z\u0000\u0478\u0470\u0001\u0000\u0000\u0000"+
		"\u0478\u0477\u0001\u0000\u0000\u0000\u0479\u04bf\u0001\u0000\u0000\u0000"+
		"\u047a\u047b\u0005/\u0000\u0000\u047b\u047c\u0003\u00b6[\u0000\u047c\u0480"+
		"\u0003\u00a2Q\u0000\u047d\u047f\u0003\u00b0X\u0000\u047e\u047d\u0001\u0000"+
		"\u0000\u0000\u047f\u0482\u0001\u0000\u0000\u0000\u0480\u047e\u0001\u0000"+
		"\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0484\u0001\u0000"+
		"\u0000\u0000\u0482\u0480\u0001\u0000\u0000\u0000\u0483\u0485\u0003\u00b4"+
		"Z\u0000\u0484\u0483\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000"+
		"\u0000\u0485\u04bf\u0001\u0000\u0000\u0000\u0486\u0487\u0005)\u0000\u0000"+
		"\u0487\u0488\u0003\u00c6c\u0000\u0488\u048c\u0005P\u0000\u0000\u0489\u048b"+
		"\u0003\u00bc^\u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048b\u048e\u0001"+
		"\u0000\u0000\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001"+
		"\u0000\u0000\u0000\u048d\u0492\u0001\u0000\u0000\u0000\u048e\u048c\u0001"+
		"\u0000\u0000\u0000\u048f\u0491\u0003\u00be_\u0000\u0490\u048f\u0001\u0000"+
		"\u0000\u0000\u0491\u0494\u0001\u0000\u0000\u0000\u0492\u0490\u0001\u0000"+
		"\u0000\u0000\u0492\u0493\u0001\u0000\u0000\u0000\u0493\u0495\u0001\u0000"+
		"\u0000\u0000\u0494\u0492\u0001\u0000\u0000\u0000\u0495\u0496\u0005Q\u0000"+
		"\u0000\u0496\u04bf\u0001\u0000\u0000\u0000\u0497\u0498\u0005*\u0000\u0000"+
		"\u0498\u0499\u0003\u00c6c\u0000\u0499\u049a\u0003\u00a2Q\u0000\u049a\u04bf"+
		"\u0001\u0000\u0000\u0000\u049b\u049d\u0005$\u0000\u0000\u049c\u049e\u0003"+
		"\u00ccf\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000"+
		"\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u04bf\u0005T\u0000"+
		"\u0000\u04a0\u04a1\u0005,\u0000\u0000\u04a1\u04a2\u0003\u00ccf\u0000\u04a2"+
		"\u04a3\u0005T\u0000\u0000\u04a3\u04bf\u0001\u0000\u0000\u0000\u04a4\u04a6"+
		"\u0005\u0004\u0000\u0000\u04a5\u04a7\u0003\u00a8T\u0000\u04a6\u04a5\u0001"+
		"\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001"+
		"\u0000\u0000\u0000\u04a8\u04bf\u0005T\u0000\u0000\u04a9\u04ab\u0005\u000b"+
		"\u0000\u0000\u04aa\u04ac\u0003\u00a8T\u0000\u04ab\u04aa\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000"+
		"\u0000\u04ad\u04bf\u0005T\u0000\u0000\u04ae\u04af\u0005>\u0000\u0000\u04af"+
		"\u04b0\u0003\u00ccf\u0000\u04b0\u04b1\u0005T\u0000\u0000\u04b1\u04bf\u0001"+
		"\u0000\u0000\u0000\u04b2\u04bf\u0005T\u0000\u0000\u04b3\u04b4\u0003\u00cc"+
		"f\u0000\u04b4\u04b5\u0005T\u0000\u0000\u04b5\u04bf\u0001\u0000\u0000\u0000"+
		"\u04b6\u04b8\u0003\u00d8l\u0000\u04b7\u04b9\u0005T\u0000\u0000\u04b8\u04b7"+
		"\u0001\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04bf"+
		"\u0001\u0000\u0000\u0000\u04ba\u04bb\u0003\u00a8T\u0000\u04bb\u04bc\u0005"+
		"]\u0000\u0000\u04bc\u04bd\u0003\u00aeW\u0000\u04bd\u04bf\u0001\u0000\u0000"+
		"\u0000\u04be\u044d\u0001\u0000\u0000\u0000\u04be\u044e\u0001\u0000\u0000"+
		"\u0000\u04be\u0456\u0001\u0000\u0000\u0000\u04be\u045d\u0001\u0000\u0000"+
		"\u0000\u04be\u0463\u0001\u0000\u0000\u0000\u04be\u0467\u0001\u0000\u0000"+
		"\u0000\u04be\u046d\u0001\u0000\u0000\u0000\u04be\u047a\u0001\u0000\u0000"+
		"\u0000\u04be\u0486\u0001\u0000\u0000\u0000\u04be\u0497\u0001\u0000\u0000"+
		"\u0000\u04be\u049b\u0001\u0000\u0000\u0000\u04be\u04a0\u0001\u0000\u0000"+
		"\u0000\u04be\u04a4\u0001\u0000\u0000\u0000\u04be\u04a9\u0001\u0000\u0000"+
		"\u0000\u04be\u04ae\u0001\u0000\u0000\u0000\u04be\u04b2\u0001\u0000\u0000"+
		"\u0000\u04be\u04b3\u0001\u0000\u0000\u0000\u04be\u04b6\u0001\u0000\u0000"+
		"\u0000\u04be\u04ba\u0001\u0000\u0000\u0000\u04bf\u00af\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0005\u0007\u0000\u0000\u04c1\u04c5\u0005N\u0000\u0000"+
		"\u04c2\u04c4\u0003\u000e\u0007\u0000\u04c3\u04c2\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c7\u0001\u0000\u0000\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c8\u0001\u0000\u0000\u0000"+
		"\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c8\u04c9\u0003\u00b2Y\u0000\u04c9"+
		"\u04ca\u0003\u00a8T\u0000\u04ca\u04cb\u0005O\u0000\u0000\u04cb\u04cc\u0003"+
		"\u00a2Q\u0000\u04cc\u00b1\u0001\u0000\u0000\u0000\u04cd\u04d2\u0003l6"+
		"\u0000\u04ce\u04cf\u0005k\u0000\u0000\u04cf\u04d1\u0003l6\u0000\u04d0"+
		"\u04ce\u0001\u0000\u0000\u0000\u04d1\u04d4\u0001\u0000\u0000\u0000\u04d2"+
		"\u04d0\u0001\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3"+
		"\u00b3\u0001\u0000\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d5"+
		"\u04d6\u0005\u0013\u0000\u0000\u04d6\u04d7\u0003\u00a2Q\u0000\u04d7\u00b5"+
		"\u0001\u0000\u0000\u0000\u04d8\u04d9\u0005N\u0000\u0000\u04d9\u04db\u0003"+
		"\u00b8\\\u0000\u04da\u04dc\u0005T\u0000\u0000\u04db\u04da\u0001\u0000"+
		"\u0000\u0000\u04db\u04dc\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000"+
		"\u0000\u0000\u04dd\u04de\u0005O\u0000\u0000\u04de\u00b7\u0001\u0000\u0000"+
		"\u0000\u04df\u04e4\u0003\u00ba]\u0000\u04e0\u04e1\u0005T\u0000\u0000\u04e1"+
		"\u04e3\u0003\u00ba]\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000\u04e3\u04e6"+
		"\u0001\u0000\u0000\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e5\u00b9\u0001\u0000\u0000\u0000\u04e6\u04e4"+
		"\u0001\u0000\u0000\u0000\u04e7\u04e9\u0003\u000e\u0007\u0000\u04e8\u04e7"+
		"\u0001\u0000\u0000\u0000\u04e9\u04ec\u0001\u0000\u0000\u0000\u04ea\u04e8"+
		"\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04f2"+
		"\u0001\u0000\u0000\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ed\u04ee"+
		"\u0003X,\u0000\u04ee\u04ef\u0003R)\u0000\u04ef\u04f3\u0001\u0000\u0000"+
		"\u0000\u04f0\u04f1\u0005=\u0000\u0000\u04f1\u04f3\u0003\u00a8T\u0000\u04f2"+
		"\u04ed\u0001\u0000\u0000\u0000\u04f2\u04f0\u0001\u0000\u0000\u0000\u04f3"+
		"\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u0005W\u0000\u0000\u04f5\u04f6"+
		"\u0003\u00ccf\u0000\u04f6\u04f9\u0001\u0000\u0000\u0000\u04f7\u04f9\u0003"+
		"l6\u0000\u04f8\u04ea\u0001\u0000\u0000\u0000\u04f8\u04f7\u0001\u0000\u0000"+
		"\u0000\u04f9\u00bb\u0001\u0000\u0000\u0000\u04fa\u04fc\u0003\u00be_\u0000"+
		"\u04fb\u04fa\u0001\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000\u0000"+
		"\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000"+
		"\u04fe\u0500\u0001\u0000\u0000\u0000\u04ff\u0501\u0003\u00a4R\u0000\u0500"+
		"\u04ff\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502"+
		"\u0500\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000\u0503"+
		"\u00bd\u0001\u0000\u0000\u0000\u0504\u050a\u0005\u0006\u0000\u0000\u0505"+
		"\u050b\u0003\u00ccf\u0000\u0506\u050b\u0005\u0081\u0000\u0000\u0507\u0508"+
		"\u0003\u00f6{\u0000\u0508\u0509\u0003\u00a8T\u0000\u0509\u050b\u0001\u0000"+
		"\u0000\u0000\u050a\u0505\u0001\u0000\u0000\u0000\u050a\u0506\u0001\u0000"+
		"\u0000\u0000\u050a\u0507\u0001\u0000\u0000\u0000\u050b\u050c\u0001\u0000"+
		"\u0000\u0000\u050c\u0510\u0005]\u0000\u0000\u050d\u050e\u0005\f\u0000"+
		"\u0000\u050e\u0510\u0005]\u0000\u0000\u050f\u0504\u0001\u0000\u0000\u0000"+
		"\u050f\u050d\u0001\u0000\u0000\u0000\u0510\u00bf\u0001\u0000\u0000\u0000"+
		"\u0511\u051e\u0003\u00c4b\u0000\u0512\u0514\u0003\u00c2a\u0000\u0513\u0512"+
		"\u0001\u0000\u0000\u0000\u0513\u0514\u0001\u0000\u0000\u0000\u0514\u0515"+
		"\u0001\u0000\u0000\u0000\u0515\u0517\u0005T\u0000\u0000\u0516\u0518\u0003"+
		"\u00ccf\u0000\u0517\u0516\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000"+
		"\u0000\u0000\u0518\u0519\u0001\u0000\u0000\u0000\u0519\u051b\u0005T\u0000"+
		"\u0000\u051a\u051c\u0003\u00c8d\u0000\u051b\u051a\u0001\u0000\u0000\u0000"+
		"\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051e\u0001\u0000\u0000\u0000"+
		"\u051d\u0511\u0001\u0000\u0000\u0000\u051d\u0513\u0001\u0000\u0000\u0000"+
		"\u051e\u00c1\u0001\u0000\u0000\u0000\u051f\u0522\u0003\u00a6S\u0000\u0520"+
		"\u0522\u0003\u00c8d\u0000\u0521\u051f\u0001\u0000\u0000\u0000\u0521\u0520"+
		"\u0001\u0000\u0000\u0000\u0522\u00c3\u0001\u0000\u0000\u0000\u0523\u0525"+
		"\u0003\u000e\u0007\u0000\u0524\u0523\u0001\u0000\u0000\u0000\u0525\u0528"+
		"\u0001\u0000\u0000\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0526\u0527"+
		"\u0001\u0000\u0000\u0000\u0527\u052b\u0001\u0000\u0000\u0000\u0528\u0526"+
		"\u0001\u0000\u0000\u0000\u0529\u052c\u0003\u00f6{\u0000\u052a\u052c\u0005"+
		"=\u0000\u0000\u052b\u0529\u0001\u0000\u0000\u0000\u052b\u052a\u0001\u0000"+
		"\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u052e\u0003R)\u0000"+
		"\u052e\u052f\u0005]\u0000\u0000\u052f\u0530\u0003\u00ccf\u0000\u0530\u00c5"+
		"\u0001\u0000\u0000\u0000\u0531\u0532\u0005N\u0000\u0000\u0532\u0533\u0003"+
		"\u00ccf\u0000\u0533\u0534\u0005O\u0000\u0000\u0534\u00c7\u0001\u0000\u0000"+
		"\u0000\u0535\u053a\u0003\u00ccf\u0000\u0536\u0537\u0005U\u0000\u0000\u0537"+
		"\u0539\u0003\u00ccf\u0000\u0538\u0536\u0001\u0000\u0000\u0000\u0539\u053c"+
		"\u0001\u0000\u0000\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053a\u053b"+
		"\u0001\u0000\u0000\u0000\u053b\u00c9\u0001\u0000\u0000\u0000\u053c\u053a"+
		"\u0001\u0000\u0000\u0000\u053d\u0541\u0003\u00a8T\u0000\u053e\u0541\u0005"+
		"+\u0000\u0000\u053f\u0541\u0005(\u0000\u0000\u0540\u053d\u0001\u0000\u0000"+
		"\u0000\u0540\u053e\u0001\u0000\u0000\u0000\u0540\u053f\u0001\u0000\u0000"+
		"\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542\u0543\u0003\u0100\u0080"+
		"\u0000\u0543\u00cb\u0001\u0000\u0000\u0000\u0544\u0545\u0006f\uffff\uffff"+
		"\u0000\u0545\u0570\u0003\u00d6k\u0000\u0546\u0570\u0003\u00cae\u0000\u0547"+
		"\u0548\u0003\u00f6{\u0000\u0548\u054e\u0005z\u0000\u0000\u0549\u054b\u0003"+
		"\u00fa}\u0000\u054a\u0549\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000"+
		"\u0000\u0000\u054b\u054c\u0001\u0000\u0000\u0000\u054c\u054f\u0003\u00a8"+
		"T\u0000\u054d\u054f\u0005\u001f\u0000\u0000\u054e\u054a\u0001\u0000\u0000"+
		"\u0000\u054e\u054d\u0001\u0000\u0000\u0000\u054f\u0570\u0001\u0000\u0000"+
		"\u0000\u0550\u0551\u0003\u00e0p\u0000\u0551\u0553\u0005z\u0000\u0000\u0552"+
		"\u0554\u0003\u00fa}\u0000\u0553\u0552\u0001\u0000\u0000\u0000\u0553\u0554"+
		"\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000\u0000\u0555\u0556"+
		"\u0005\u001f\u0000\u0000\u0556\u0570\u0001\u0000\u0000\u0000\u0557\u0570"+
		"\u0003\u00d8l\u0000\u0558\u0559\u0007\u0006\u0000\u0000\u0559\u0570\u0003"+
		"\u00ccf\u0011\u055a\u055e\u0005N\u0000\u0000\u055b\u055d\u0003v;\u0000"+
		"\u055c\u055b\u0001\u0000\u0000\u0000\u055d\u0560\u0001\u0000\u0000\u0000"+
		"\u055e\u055c\u0001\u0000\u0000\u0000\u055e\u055f\u0001\u0000\u0000\u0000"+
		"\u055f\u0561\u0001\u0000\u0000\u0000\u0560\u055e\u0001\u0000\u0000\u0000"+
		"\u0561\u0566\u0003\u00f6{\u0000\u0562\u0563\u0005j\u0000\u0000\u0563\u0565"+
		"\u0003\u00f6{\u0000\u0564\u0562\u0001\u0000\u0000\u0000\u0565\u0568\u0001"+
		"\u0000\u0000\u0000\u0566\u0564\u0001\u0000\u0000\u0000\u0566\u0567\u0001"+
		"\u0000\u0000\u0000\u0567\u0569\u0001\u0000\u0000\u0000\u0568\u0566\u0001"+
		"\u0000\u0000\u0000\u0569\u056a\u0005O\u0000\u0000\u056a\u056b\u0003\u00cc"+
		"f\u0010\u056b\u0570\u0001\u0000\u0000\u0000\u056c\u056d\u0005\u001f\u0000"+
		"\u0000\u056d\u0570\u0003\u00e2q\u0000\u056e\u0570\u0003\u00d0h\u0000\u056f"+
		"\u0544\u0001\u0000\u0000\u0000\u056f\u0546\u0001\u0000\u0000\u0000\u056f"+
		"\u0547\u0001\u0000\u0000\u0000\u056f\u0550\u0001\u0000\u0000\u0000\u056f"+
		"\u0557\u0001\u0000\u0000\u0000\u056f\u0558\u0001\u0000\u0000\u0000\u056f"+
		"\u055a\u0001\u0000\u0000\u0000\u056f\u056c\u0001\u0000\u0000\u0000\u056f"+
		"\u056e\u0001\u0000\u0000\u0000\u0570\u05c4\u0001\u0000\u0000\u0000\u0571"+
		"\u0572\n\u000e\u0000\u0000\u0572\u0573\u0007\u0007\u0000\u0000\u0573\u05c3"+
		"\u0003\u00ccf\u000f\u0574\u0575\n\r\u0000\u0000\u0575\u0576\u0007\b\u0000"+
		"\u0000\u0576\u05c3\u0003\u00ccf\u000e\u0577\u057f\n\f\u0000\u0000\u0578"+
		"\u0579\u0005Y\u0000\u0000\u0579\u0580\u0005Y\u0000\u0000\u057a\u057b\u0005"+
		"X\u0000\u0000\u057b\u057c\u0005X\u0000\u0000\u057c\u0580\u0005X\u0000"+
		"\u0000\u057d\u057e\u0005X\u0000\u0000\u057e\u0580\u0005X\u0000\u0000\u057f"+
		"\u0578\u0001\u0000\u0000\u0000\u057f\u057a\u0001\u0000\u0000\u0000\u057f"+
		"\u057d\u0001\u0000\u0000\u0000\u0580\u0581\u0001\u0000\u0000\u0000\u0581"+
		"\u05c3\u0003\u00ccf\r\u0582\u0583\n\u000b\u0000\u0000\u0583\u0584\u0007"+
		"\t\u0000\u0000\u0584\u05c3\u0003\u00ccf\f\u0585\u0586\n\t\u0000\u0000"+
		"\u0586\u0587\u0007\n\u0000\u0000\u0587\u05c3\u0003\u00ccf\n\u0588\u0589"+
		"\n\b\u0000\u0000\u0589\u058a\u0005j\u0000\u0000\u058a\u05c3\u0003\u00cc"+
		"f\t\u058b\u058c\n\u0007\u0000\u0000\u058c\u058d\u0005l\u0000\u0000\u058d"+
		"\u05c3\u0003\u00ccf\b\u058e\u058f\n\u0006\u0000\u0000\u058f\u0590\u0005"+
		"k\u0000\u0000\u0590\u05c3\u0003\u00ccf\u0007\u0591\u0592\n\u0005\u0000"+
		"\u0000\u0592\u0593\u0005b\u0000\u0000\u0593\u05c3\u0003\u00ccf\u0006\u0594"+
		"\u0595\n\u0004\u0000\u0000\u0595\u0596\u0005c\u0000\u0000\u0596\u05c3"+
		"\u0003\u00ccf\u0005\u0597\u0598\n\u0003\u0000\u0000\u0598\u0599\u0005"+
		"\\\u0000\u0000\u0599\u059a\u0003\u00ccf\u0000\u059a\u059b\u0005]\u0000"+
		"\u0000\u059b\u059c\u0003\u00ccf\u0003\u059c\u05c3\u0001\u0000\u0000\u0000"+
		"\u059d\u059e\n\u0002\u0000\u0000\u059e\u059f\u0007\u000b\u0000\u0000\u059f"+
		"\u05c3\u0003\u00ccf\u0002\u05a0\u05a1\n\u0019\u0000\u0000\u05a1\u05a2"+
		"\u0005R\u0000\u0000\u05a2\u05a3\u0003\u00ccf\u0000\u05a3\u05a4\u0005S"+
		"\u0000\u0000\u05a4\u05c3\u0001\u0000\u0000\u0000\u05a5\u05a6\n\u0018\u0000"+
		"\u0000\u05a6\u05b2\u0005V\u0000\u0000\u05a7\u05b3\u0003\u00a8T\u0000\u05a8"+
		"\u05b3\u0003\u00cae\u0000\u05a9\u05b3\u0005+\u0000\u0000\u05aa\u05ac\u0005"+
		"\u001f\u0000\u0000\u05ab\u05ad\u0003\u00f2y\u0000\u05ac\u05ab\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad\u05ae\u0001\u0000"+
		"\u0000\u0000\u05ae\u05b3\u0003\u00e6s\u0000\u05af\u05b0\u0005(\u0000\u0000"+
		"\u05b0\u05b3\u0003\u00fc~\u0000\u05b1\u05b3\u0003\u00ecv\u0000\u05b2\u05a7"+
		"\u0001\u0000\u0000\u0000\u05b2\u05a8\u0001\u0000\u0000\u0000\u05b2\u05a9"+
		"\u0001\u0000\u0000\u0000\u05b2\u05aa\u0001\u0000\u0000\u0000\u05b2\u05af"+
		"\u0001\u0000\u0000\u0000\u05b2\u05b1\u0001\u0000\u0000\u0000\u05b3\u05c3"+
		"\u0001\u0000\u0000\u0000\u05b4\u05b5\n\u0016\u0000\u0000\u05b5\u05b7\u0005"+
		"z\u0000\u0000\u05b6\u05b8\u0003\u00fa}\u0000\u05b7\u05b6\u0001\u0000\u0000"+
		"\u0000\u05b7\u05b8\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000"+
		"\u0000\u05b9\u05c3\u0003\u00a8T\u0000\u05ba\u05bb\n\u0012\u0000\u0000"+
		"\u05bb\u05c3\u0007\f\u0000\u0000\u05bc\u05bd\n\n\u0000\u0000\u05bd\u05c0"+
		"\u0005\u001a\u0000\u0000\u05be\u05c1\u0003\u00f6{\u0000\u05bf\u05c1\u0003"+
		"\u00ceg\u0000\u05c0\u05be\u0001\u0000\u0000\u0000\u05c0\u05bf\u0001\u0000"+
		"\u0000\u0000\u05c1\u05c3\u0001\u0000\u0000\u0000\u05c2\u0571\u0001\u0000"+
		"\u0000\u0000\u05c2\u0574\u0001\u0000\u0000\u0000\u05c2\u0577\u0001\u0000"+
		"\u0000\u0000\u05c2\u0582\u0001\u0000\u0000\u0000\u05c2\u0585\u0001\u0000"+
		"\u0000\u0000\u05c2\u0588\u0001\u0000\u0000\u0000\u05c2\u058b\u0001\u0000"+
		"\u0000\u0000\u05c2\u058e\u0001\u0000\u0000\u0000\u05c2\u0591\u0001\u0000"+
		"\u0000\u0000\u05c2\u0594\u0001\u0000\u0000\u0000\u05c2\u0597\u0001\u0000"+
		"\u0000\u0000\u05c2\u059d\u0001\u0000\u0000\u0000\u05c2\u05a0\u0001\u0000"+
		"\u0000\u0000\u05c2\u05a5\u0001\u0000\u0000\u0000\u05c2\u05b4\u0001\u0000"+
		"\u0000\u0000\u05c2\u05ba\u0001\u0000\u0000\u0000\u05c2\u05bc\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c6\u0001\u0000\u0000\u0000\u05c4\u05c2\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u00cd\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c4\u0001\u0000\u0000\u0000\u05c7\u05c9\u0003\u000e"+
		"\u0007\u0000\u05c8\u05c7\u0001\u0000\u0000\u0000\u05c9\u05cc\u0001\u0000"+
		"\u0000\u0000\u05ca\u05c8\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000"+
		"\u0000\u0000\u05cb\u05cd\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000"+
		"\u0000\u0000\u05cd\u05d1\u0003\u00f6{\u0000\u05ce\u05d0\u0003v;\u0000"+
		"\u05cf\u05ce\u0001\u0000\u0000\u0000\u05d0\u05d3\u0001\u0000\u0000\u0000"+
		"\u05d1\u05cf\u0001\u0000\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000"+
		"\u05d2\u05d4\u0001\u0000\u0000\u0000\u05d3\u05d1\u0001\u0000\u0000\u0000"+
		"\u05d4\u05d5\u0003\u00a8T\u0000\u05d5\u00cf\u0001\u0000\u0000\u0000\u05d6"+
		"\u05d7\u0003\u00d2i\u0000\u05d7\u05d8\u0005y\u0000\u0000\u05d8\u05d9\u0003"+
		"\u00d4j\u0000\u05d9\u00d1\u0001\u0000\u0000\u0000\u05da\u05f1\u0003\u00a8"+
		"T\u0000\u05db\u05dd\u0005N\u0000\u0000\u05dc\u05de\u0003b1\u0000\u05dd"+
		"\u05dc\u0001\u0000\u0000\u0000\u05dd\u05de\u0001\u0000\u0000\u0000\u05de"+
		"\u05df\u0001\u0000\u0000\u0000\u05df\u05f1\u0005O\u0000\u0000\u05e0\u05e1"+
		"\u0005N\u0000\u0000\u05e1\u05e6\u0003\u00a8T\u0000\u05e2\u05e3\u0005U"+
		"\u0000\u0000\u05e3\u05e5\u0003\u00a8T\u0000\u05e4\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e5\u05e8\u0001\u0000\u0000\u0000\u05e6\u05e4\u0001\u0000\u0000"+
		"\u0000\u05e6\u05e7\u0001\u0000\u0000\u0000\u05e7\u05e9\u0001\u0000\u0000"+
		"\u0000\u05e8\u05e6\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005O\u0000\u0000"+
		"\u05ea\u05f1\u0001\u0000\u0000\u0000\u05eb\u05ed\u0005N\u0000\u0000\u05ec"+
		"\u05ee\u0003h4\u0000\u05ed\u05ec\u0001\u0000\u0000\u0000\u05ed\u05ee\u0001"+
		"\u0000\u0000\u0000\u05ee\u05ef\u0001\u0000\u0000\u0000\u05ef\u05f1\u0005"+
		"O\u0000\u0000\u05f0\u05da\u0001\u0000\u0000\u0000\u05f0\u05db\u0001\u0000"+
		"\u0000\u0000\u05f0\u05e0\u0001\u0000\u0000\u0000\u05f0\u05eb\u0001\u0000"+
		"\u0000\u0000\u05f1\u00d3\u0001\u0000\u0000\u0000\u05f2\u05f5\u0003\u00cc"+
		"f\u0000\u05f3\u05f5\u0003\u00a2Q\u0000\u05f4\u05f2\u0001\u0000\u0000\u0000"+
		"\u05f4\u05f3\u0001\u0000\u0000\u0000\u05f5\u00d5\u0001\u0000\u0000\u0000"+
		"\u05f6\u05f7\u0005N\u0000\u0000\u05f7\u05f8\u0003\u00ccf\u0000\u05f8\u05f9"+
		"\u0005O\u0000\u0000\u05f9\u0609\u0001\u0000\u0000\u0000\u05fa\u0609\u0005"+
		"+\u0000\u0000\u05fb\u0609\u0005(\u0000\u0000\u05fc\u0609\u0003n7\u0000"+
		"\u05fd\u0609\u0003\u00a8T\u0000\u05fe\u05ff\u00030\u0018\u0000\u05ff\u0600"+
		"\u0005V\u0000\u0000\u0600\u0601\u0005\t\u0000\u0000\u0601\u0609\u0001"+
		"\u0000\u0000\u0000\u0602\u0606\u0003\u00f2y\u0000\u0603\u0607\u0003\u00fe"+
		"\u007f\u0000\u0604\u0605\u0005+\u0000\u0000\u0605\u0607\u0003\u0100\u0080"+
		"\u0000\u0606\u0603\u0001\u0000\u0000\u0000\u0606\u0604\u0001\u0000\u0000"+
		"\u0000\u0607\u0609\u0001\u0000\u0000\u0000\u0608\u05f6\u0001\u0000\u0000"+
		"\u0000\u0608\u05fa\u0001\u0000\u0000\u0000\u0608\u05fb\u0001\u0000\u0000"+
		"\u0000\u0608\u05fc\u0001\u0000\u0000\u0000\u0608\u05fd\u0001\u0000\u0000"+
		"\u0000\u0608\u05fe\u0001\u0000\u0000\u0000\u0608\u0602\u0001\u0000\u0000"+
		"\u0000\u0609\u00d7\u0001\u0000\u0000\u0000\u060a\u060b\u0005)\u0000\u0000"+
		"\u060b\u060c\u0003\u00c6c\u0000\u060c\u0610\u0005P\u0000\u0000\u060d\u060f"+
		"\u0003\u00dam\u0000\u060e\u060d\u0001\u0000\u0000\u0000\u060f\u0612\u0001"+
		"\u0000\u0000\u0000\u0610\u060e\u0001\u0000\u0000\u0000\u0610\u0611\u0001"+
		"\u0000\u0000\u0000\u0611\u0613\u0001\u0000\u0000\u0000\u0612\u0610\u0001"+
		"\u0000\u0000\u0000\u0613\u0614\u0005Q\u0000\u0000\u0614\u00d9\u0001\u0000"+
		"\u0000\u0000\u0615\u0619\u0005\u0006\u0000\u0000\u0616\u061a\u0003\u00c8"+
		"d\u0000\u0617\u061a\u0005M\u0000\u0000\u0618\u061a\u0003\u00dcn\u0000"+
		"\u0619\u0616\u0001\u0000\u0000\u0000\u0619\u0617\u0001\u0000\u0000\u0000"+
		"\u0619\u0618\u0001\u0000\u0000\u0000\u061a\u061b\u0001\u0000\u0000\u0000"+
		"\u061b\u061c\u0007\r\u0000\u0000\u061c\u0621\u0003\u00deo\u0000\u061d"+
		"\u061e\u0005\f\u0000\u0000\u061e\u061f\u0007\r\u0000\u0000\u061f\u0621"+
		"\u0003\u00deo\u0000\u0620\u0615\u0001\u0000\u0000\u0000\u0620\u061d\u0001"+
		"\u0000\u0000\u0000\u0621\u00db\u0001\u0000\u0000\u0000\u0622\u0623\u0006"+
		"n\uffff\uffff\u0000\u0623\u0624\u0005N\u0000\u0000\u0624\u0625\u0003\u00dc"+
		"n\u0000\u0625\u0626\u0005O\u0000\u0000\u0626\u063d\u0001\u0000\u0000\u0000"+
		"\u0627\u0629\u0003\u000e\u0007\u0000\u0628\u0627\u0001\u0000\u0000\u0000"+
		"\u0629\u062c\u0001\u0000\u0000\u0000\u062a\u0628\u0001\u0000\u0000\u0000"+
		"\u062a\u062b\u0001\u0000\u0000\u0000\u062b\u062d\u0001\u0000\u0000\u0000"+
		"\u062c\u062a\u0001\u0000\u0000\u0000\u062d\u0631\u0003\u00f6{\u0000\u062e"+
		"\u0630\u0003v;\u0000\u062f\u062e\u0001\u0000\u0000\u0000\u0630\u0633\u0001"+
		"\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000\u0000\u0631\u0632\u0001"+
		"\u0000\u0000\u0000\u0632\u0634\u0001\u0000\u0000\u0000\u0633\u0631\u0001"+
		"\u0000\u0000\u0000\u0634\u0639\u0003\u00a8T\u0000\u0635\u0636\u0005b\u0000"+
		"\u0000\u0636\u0638\u0003\u00ccf\u0000\u0637\u0635\u0001\u0000\u0000\u0000"+
		"\u0638\u063b\u0001\u0000\u0000\u0000\u0639\u0637\u0001\u0000\u0000\u0000"+
		"\u0639\u063a\u0001\u0000\u0000\u0000\u063a\u063d\u0001\u0000\u0000\u0000"+
		"\u063b\u0639\u0001\u0000\u0000\u0000\u063c\u0622\u0001\u0000\u0000\u0000"+
		"\u063c\u062a\u0001\u0000\u0000\u0000\u063d\u0643\u0001\u0000\u0000\u0000"+
		"\u063e\u063f\n\u0001\u0000\u0000\u063f\u0640\u0005b\u0000\u0000\u0640"+
		"\u0642\u0003\u00ccf\u0000\u0641\u063e\u0001\u0000\u0000\u0000\u0642\u0645"+
		"\u0001\u0000\u0000\u0000\u0643\u0641\u0001\u0000\u0000\u0000\u0643\u0644"+
		"\u0001\u0000\u0000\u0000\u0644\u00dd\u0001\u0000\u0000\u0000\u0645\u0643"+
		"\u0001\u0000\u0000\u0000\u0646\u064e\u0003\u00a2Q\u0000\u0647\u0649\u0003"+
		"\u00a4R\u0000\u0648\u0647\u0001\u0000\u0000\u0000\u0649\u064c\u0001\u0000"+
		"\u0000\u0000\u064a\u0648\u0001\u0000\u0000\u0000\u064a\u064b\u0001\u0000"+
		"\u0000\u0000\u064b\u064e\u0001\u0000\u0000\u0000\u064c\u064a\u0001\u0000"+
		"\u0000\u0000\u064d\u0646\u0001\u0000\u0000\u0000\u064d\u064a\u0001\u0000"+
		"\u0000\u0000\u064e\u00df\u0001\u0000\u0000\u0000\u064f\u0650\u0003X,\u0000"+
		"\u0650\u0651\u0005V\u0000\u0000\u0651\u0653\u0001\u0000\u0000\u0000\u0652"+
		"\u064f\u0001\u0000\u0000\u0000\u0652\u0653\u0001\u0000\u0000\u0000\u0653"+
		"\u0657\u0001\u0000\u0000\u0000\u0654\u0656\u0003v;\u0000\u0655\u0654\u0001"+
		"\u0000\u0000\u0000\u0656\u0659\u0001\u0000\u0000\u0000\u0657\u0655\u0001"+
		"\u0000\u0000\u0000\u0657\u0658\u0001\u0000\u0000\u0000\u0658\u065a\u0001"+
		"\u0000\u0000\u0000\u0659\u0657\u0001\u0000\u0000\u0000\u065a\u065c\u0003"+
		"\u00a8T\u0000\u065b\u065d\u0003\u00fa}\u0000\u065c\u065b\u0001\u0000\u0000"+
		"\u0000\u065c\u065d\u0001\u0000\u0000\u0000\u065d\u00e1\u0001\u0000\u0000"+
		"\u0000\u065e\u0660\u0003\u00f2y\u0000\u065f\u065e\u0001\u0000\u0000\u0000"+
		"\u065f\u0660\u0001\u0000\u0000\u0000\u0660\u0661\u0001\u0000\u0000\u0000"+
		"\u0661\u0662\u0003\u00e4r\u0000\u0662\u0663\u0003\u00eau\u0000\u0663\u0668"+
		"\u0001\u0000\u0000\u0000\u0664\u0665\u0003\u00e4r\u0000\u0665\u0666\u0003"+
		"\u00e8t\u0000\u0666\u0668\u0001\u0000\u0000\u0000\u0667\u065f\u0001\u0000"+
		"\u0000\u0000\u0667\u0664\u0001\u0000\u0000\u0000\u0668\u00e3\u0001\u0000"+
		"\u0000\u0000\u0669\u066b\u0003\u00a8T\u0000\u066a\u066c\u0003\u00eew\u0000"+
		"\u066b\u066a\u0001\u0000\u0000\u0000\u066b\u066c\u0001\u0000\u0000\u0000"+
		"\u066c\u0674\u0001\u0000\u0000\u0000\u066d\u066e\u0005V\u0000\u0000\u066e"+
		"\u0670\u0003\u00a8T\u0000\u066f\u0671\u0003\u00eew\u0000\u0670\u066f\u0001"+
		"\u0000\u0000\u0000\u0670\u0671\u0001\u0000\u0000\u0000\u0671\u0673\u0001"+
		"\u0000\u0000\u0000\u0672\u066d\u0001\u0000\u0000\u0000\u0673\u0676\u0001"+
		"\u0000\u0000\u0000\u0674\u0672\u0001\u0000\u0000\u0000\u0674\u0675\u0001"+
		"\u0000\u0000\u0000\u0675\u0679\u0001\u0000\u0000\u0000\u0676\u0674\u0001"+
		"\u0000\u0000\u0000\u0677\u0679\u0003\u00f8|\u0000\u0678\u0669\u0001\u0000"+
		"\u0000\u0000\u0678\u0677\u0001\u0000\u0000\u0000\u0679\u00e5\u0001\u0000"+
		"\u0000\u0000\u067a\u067c\u0003\u00a8T\u0000\u067b\u067d\u0003\u00f0x\u0000"+
		"\u067c\u067b\u0001\u0000\u0000\u0000\u067c\u067d\u0001\u0000\u0000\u0000"+
		"\u067d\u067e\u0001\u0000\u0000\u0000\u067e\u067f\u0003\u00eau\u0000\u067f"+
		"\u00e7\u0001\u0000\u0000\u0000\u0680\u0681\u0005R\u0000\u0000\u0681\u0683"+
		"\u0005S\u0000\u0000\u0682\u0680\u0001\u0000\u0000\u0000\u0683\u0684\u0001"+
		"\u0000\u0000\u0000\u0684\u0682\u0001\u0000\u0000\u0000\u0684\u0685\u0001"+
		"\u0000\u0000\u0000\u0685\u0686\u0001\u0000\u0000\u0000\u0686\u0697\u0003"+
		"V+\u0000\u0687\u0688\u0005R\u0000\u0000\u0688\u0689\u0003\u00ccf\u0000"+
		"\u0689\u068a\u0005S\u0000\u0000\u068a\u068c\u0001\u0000\u0000\u0000\u068b"+
		"\u0687\u0001\u0000\u0000\u0000\u068c\u068d\u0001\u0000\u0000\u0000\u068d"+
		"\u068b\u0001\u0000\u0000\u0000\u068d\u068e\u0001\u0000\u0000\u0000\u068e"+
		"\u0693\u0001\u0000\u0000\u0000\u068f\u0690\u0005R\u0000\u0000\u0690\u0692"+
		"\u0005S\u0000\u0000\u0691\u068f\u0001\u0000\u0000\u0000\u0692\u0695\u0001"+
		"\u0000\u0000\u0000\u0693\u0691\u0001\u0000\u0000\u0000\u0693\u0694\u0001"+
		"\u0000\u0000\u0000\u0694\u0697\u0001\u0000\u0000\u0000\u0695\u0693\u0001"+
		"\u0000\u0000\u0000\u0696\u0682\u0001\u0000\u0000\u0000\u0696\u068b\u0001"+
		"\u0000\u0000\u0000\u0697\u00e9\u0001\u0000\u0000\u0000\u0698\u069a\u0003"+
		"\u0100\u0080\u0000\u0699\u069b\u0003\"\u0011\u0000\u069a\u0699\u0001\u0000"+
		"\u0000\u0000\u069a\u069b\u0001\u0000\u0000\u0000\u069b\u00eb\u0001\u0000"+
		"\u0000\u0000\u069c\u069d\u0003\u00f2y\u0000\u069d\u069e\u0003\u00fe\u007f"+
		"\u0000\u069e\u00ed\u0001\u0000\u0000\u0000\u069f\u06a0\u0005Y\u0000\u0000"+
		"\u06a0\u06a3\u0005X\u0000\u0000\u06a1\u06a3\u0003\u00fa}\u0000\u06a2\u069f"+
		"\u0001\u0000\u0000\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a3\u00ef"+
		"\u0001\u0000\u0000\u0000\u06a4\u06a5\u0005Y\u0000\u0000\u06a5\u06a8\u0005"+
		"X\u0000\u0000\u06a6\u06a8\u0003\u00f2y\u0000\u06a7\u06a4\u0001\u0000\u0000"+
		"\u0000\u06a7\u06a6\u0001\u0000\u0000\u0000\u06a8\u00f1\u0001\u0000\u0000"+
		"\u0000\u06a9\u06aa\u0005Y\u0000\u0000\u06aa\u06ab\u0003\u00f4z\u0000\u06ab"+
		"\u06ac\u0005X\u0000\u0000\u06ac\u00f3\u0001\u0000\u0000\u0000\u06ad\u06b2"+
		"\u0003\u00f6{\u0000\u06ae\u06af\u0005U\u0000\u0000\u06af\u06b1\u0003\u00f6"+
		"{\u0000\u06b0\u06ae\u0001\u0000\u0000\u0000\u06b1\u06b4\u0001\u0000\u0000"+
		"\u0000\u06b2\u06b0\u0001\u0000\u0000\u0000\u06b2\u06b3\u0001\u0000\u0000"+
		"\u0000\u06b3\u00f5\u0001\u0000\u0000\u0000\u06b4\u06b2\u0001\u0000\u0000"+
		"\u0000\u06b5\u06b7\u0003v;\u0000\u06b6\u06b5\u0001\u0000\u0000\u0000\u06b7"+
		"\u06ba\u0001\u0000\u0000\u0000\u06b8\u06b6\u0001\u0000\u0000\u0000\u06b8"+
		"\u06b9\u0001\u0000\u0000\u0000\u06b9\u06bd\u0001\u0000\u0000\u0000\u06ba"+
		"\u06b8\u0001\u0000\u0000\u0000\u06bb\u06be\u0003X,\u0000\u06bc\u06be\u0003"+
		"\u00f8|\u0000\u06bd\u06bb\u0001\u0000\u0000\u0000\u06bd\u06bc\u0001\u0000"+
		"\u0000\u0000\u06be\u06c9\u0001\u0000\u0000\u0000\u06bf\u06c1\u0003v;\u0000"+
		"\u06c0\u06bf\u0001\u0000\u0000\u0000\u06c1\u06c4\u0001\u0000\u0000\u0000"+
		"\u06c2\u06c0\u0001\u0000\u0000\u0000\u06c2\u06c3\u0001\u0000\u0000\u0000"+
		"\u06c3\u06c5\u0001\u0000\u0000\u0000\u06c4\u06c2\u0001\u0000\u0000\u0000"+
		"\u06c5\u06c6\u0005R\u0000\u0000\u06c6\u06c8\u0005S\u0000\u0000\u06c7\u06c2"+
		"\u0001\u0000\u0000\u0000\u06c8\u06cb\u0001\u0000\u0000\u0000\u06c9\u06c7"+
		"\u0001\u0000\u0000\u0000\u06c9\u06ca\u0001\u0000\u0000\u0000\u06ca\u00f7"+
		"\u0001\u0000\u0000\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cc\u06cd"+
		"\u0007\u000e\u0000\u0000\u06cd\u00f9\u0001\u0000\u0000\u0000\u06ce\u06cf"+
		"\u0005Y\u0000\u0000\u06cf\u06d4\u0003Z-\u0000\u06d0\u06d1\u0005U\u0000"+
		"\u0000\u06d1\u06d3\u0003Z-\u0000\u06d2\u06d0\u0001\u0000\u0000\u0000\u06d3"+
		"\u06d6\u0001\u0000\u0000\u0000\u06d4\u06d2\u0001\u0000\u0000\u0000\u06d4"+
		"\u06d5\u0001\u0000\u0000\u0000\u06d5\u06d7\u0001\u0000\u0000\u0000\u06d6"+
		"\u06d4\u0001\u0000\u0000\u0000\u06d7\u06d8\u0005X\u0000\u0000\u06d8\u00fb"+
		"\u0001\u0000\u0000\u0000\u06d9\u06e3\u0003\u0100\u0080\u0000\u06da\u06dc"+
		"\u0005V\u0000\u0000\u06db\u06dd\u0003\u00fa}\u0000\u06dc\u06db\u0001\u0000"+
		"\u0000\u0000\u06dc\u06dd\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000"+
		"\u0000\u0000\u06de\u06e0\u0003\u00a8T\u0000\u06df\u06e1\u0003\u0100\u0080"+
		"\u0000\u06e0\u06df\u0001\u0000\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000"+
		"\u0000\u06e1\u06e3\u0001\u0000\u0000\u0000\u06e2\u06d9\u0001\u0000\u0000"+
		"\u0000\u06e2\u06da\u0001\u0000\u0000\u0000\u06e3\u00fd\u0001\u0000\u0000"+
		"\u0000\u06e4\u06e5\u0005(\u0000\u0000\u06e5\u06ea\u0003\u00fc~\u0000\u06e6"+
		"\u06e7\u0003\u00a8T\u0000\u06e7\u06e8\u0003\u0100\u0080\u0000\u06e8\u06ea"+
		"\u0001\u0000\u0000\u0000\u06e9\u06e4\u0001\u0000\u0000\u0000\u06e9\u06e6"+
		"\u0001\u0000\u0000\u0000\u06ea\u00ff\u0001\u0000\u0000\u0000\u06eb\u06ed"+
		"\u0005N\u0000\u0000\u06ec\u06ee\u0003\u00c8d\u0000\u06ed\u06ec\u0001\u0000"+
		"\u0000\u0000\u06ed\u06ee\u0001\u0000\u0000\u0000\u06ee\u06ef\u0001\u0000"+
		"\u0000\u0000\u06ef\u06f0\u0005O\u0000\u0000\u06f0\u0101\u0001\u0000\u0000"+
		"\u0000\u06f1\u06f2\u0005~\u0000\u0000\u06f2\u0103\u0001\u0000\u0000\u0000"+
		"\u00de\u0105\u0109\u010b\u0110\u0112\u0118\u011d\u0126\u012b\u0130\u0137"+
		"\u013f\u0146\u0152\u0156\u015b\u015f\u0163\u0167\u0171\u0179\u0181\u0185"+
		"\u018c\u0193\u0197\u019a\u019d\u01a6\u01ac\u01b1\u01b4\u01ba\u01c0\u01c4"+
		"\u01c8\u01d0\u01d9\u01e0\u01e4\u01e7\u01ec\u01fb\u0204\u0209\u020f\u0213"+
		"\u021f\u0226\u0232\u0235\u023a\u0247\u024f\u0259\u0262\u026d\u0272\u027b"+
		"\u0285\u028a\u0293\u0299\u02a0\u02a5\u02ad\u02b1\u02b3\u02b9\u02bf\u02c4"+
		"\u02ca\u02d0\u02d2\u02d9\u02de\u02e3\u02e6\u02e8\u02f2\u02fc\u0301\u0304"+
		"\u0309\u0312\u0319\u0324\u032a\u0335\u033f\u034a\u0353\u0358\u035b\u0362"+
		"\u036c\u0374\u0377\u037a\u0387\u038f\u0394\u039c\u03a0\u03a4\u03a8\u03ac"+
		"\u03ae\u03b2\u03b8\u03c0\u03ca\u03d3\u03dd\u03e5\u03f3\u03fa\u03ff\u0405"+
		"\u040e\u0417\u0419\u0422\u042c\u0431\u043c\u0445\u044b\u0452\u045b\u0472"+
		"\u0475\u0478\u0480\u0484\u048c\u0492\u049d\u04a6\u04ab\u04b8\u04be\u04c5"+
		"\u04d2\u04db\u04e4\u04ea\u04f2\u04f8\u04fd\u0502\u050a\u050f\u0513\u0517"+
		"\u051b\u051d\u0521\u0526\u052b\u053a\u0540\u054a\u054e\u0553\u055e\u0566"+
		"\u056f\u057f\u05ac\u05b2\u05b7\u05c0\u05c2\u05c4\u05ca\u05d1\u05dd\u05e6"+
		"\u05ed\u05f0\u05f4\u0606\u0608\u0610\u0619\u0620\u062a\u0631\u0639\u063c"+
		"\u0643\u064a\u064d\u0652\u0657\u065c\u065f\u0667\u066b\u0670\u0674\u0678"+
		"\u067c\u0684\u068d\u0693\u0696\u069a\u06a2\u06a7\u06b2\u06b8\u06bd\u06c2"+
		"\u06c9\u06d4\u06dc\u06e0\u06e2\u06e9\u06ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}