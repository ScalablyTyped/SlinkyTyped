package typingsSlinky.tsutils

import typingsSlinky.tsutils.tsutilsStrings.Symbol
import typingsSlinky.tsutils.tsutilsStrings.allowJs
import typingsSlinky.tsutils.tsutilsStrings.allowSyntheticDefaultImports
import typingsSlinky.tsutils.tsutilsStrings.allowUmdGlobalAccess
import typingsSlinky.tsutils.tsutilsStrings.allowUnreachableCode
import typingsSlinky.tsutils.tsutilsStrings.allowUnusedLabels
import typingsSlinky.tsutils.tsutilsStrings.alwaysStrict
import typingsSlinky.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies
import typingsSlinky.tsutils.tsutilsStrings.baseUrl
import typingsSlinky.tsutils.tsutilsStrings.charset
import typingsSlinky.tsutils.tsutilsStrings.checkJs
import typingsSlinky.tsutils.tsutilsStrings.composite
import typingsSlinky.tsutils.tsutilsStrings.declaration
import typingsSlinky.tsutils.tsutilsStrings.declarationDir
import typingsSlinky.tsutils.tsutilsStrings.declarationMap
import typingsSlinky.tsutils.tsutilsStrings.disableReferencedProjectLoad
import typingsSlinky.tsutils.tsutilsStrings.disableSizeLimit
import typingsSlinky.tsutils.tsutilsStrings.disableSolutionSearching
import typingsSlinky.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect
import typingsSlinky.tsutils.tsutilsStrings.downlevelIteration
import typingsSlinky.tsutils.tsutilsStrings.emitBOM
import typingsSlinky.tsutils.tsutilsStrings.emitDeclarationOnly
import typingsSlinky.tsutils.tsutilsStrings.emitDecoratorMetadata
import typingsSlinky.tsutils.tsutilsStrings.esModuleInterop
import typingsSlinky.tsutils.tsutilsStrings.experimentalDecorators
import typingsSlinky.tsutils.tsutilsStrings.forceConsistentCasingInFileNames
import typingsSlinky.tsutils.tsutilsStrings.importHelpers
import typingsSlinky.tsutils.tsutilsStrings.importsNotUsedAsValues
import typingsSlinky.tsutils.tsutilsStrings.incremental
import typingsSlinky.tsutils.tsutilsStrings.inlineSourceMap
import typingsSlinky.tsutils.tsutilsStrings.inlineSources
import typingsSlinky.tsutils.tsutilsStrings.isolatedModules
import typingsSlinky.tsutils.tsutilsStrings.jsx
import typingsSlinky.tsutils.tsutilsStrings.jsxFactory
import typingsSlinky.tsutils.tsutilsStrings.jsxFragmentFactory
import typingsSlinky.tsutils.tsutilsStrings.jsxImportSource
import typingsSlinky.tsutils.tsutilsStrings.keyofStringsOnly
import typingsSlinky.tsutils.tsutilsStrings.lib
import typingsSlinky.tsutils.tsutilsStrings.locale
import typingsSlinky.tsutils.tsutilsStrings.mapRoot
import typingsSlinky.tsutils.tsutilsStrings.maxNodeModuleJsDepth
import typingsSlinky.tsutils.tsutilsStrings.module
import typingsSlinky.tsutils.tsutilsStrings.moduleResolution
import typingsSlinky.tsutils.tsutilsStrings.newLine
import typingsSlinky.tsutils.tsutilsStrings.noEmit
import typingsSlinky.tsutils.tsutilsStrings.noEmitHelpers
import typingsSlinky.tsutils.tsutilsStrings.noEmitOnError
import typingsSlinky.tsutils.tsutilsStrings.noErrorTruncation
import typingsSlinky.tsutils.tsutilsStrings.noFallthroughCasesInSwitch
import typingsSlinky.tsutils.tsutilsStrings.noImplicitAny
import typingsSlinky.tsutils.tsutilsStrings.noImplicitReturns
import typingsSlinky.tsutils.tsutilsStrings.noImplicitThis
import typingsSlinky.tsutils.tsutilsStrings.noImplicitUseStrict
import typingsSlinky.tsutils.tsutilsStrings.noLib
import typingsSlinky.tsutils.tsutilsStrings.noResolve
import typingsSlinky.tsutils.tsutilsStrings.noStrictGenericChecks
import typingsSlinky.tsutils.tsutilsStrings.noUncheckedIndexedAccess
import typingsSlinky.tsutils.tsutilsStrings.noUnusedLocals
import typingsSlinky.tsutils.tsutilsStrings.noUnusedParameters
import typingsSlinky.tsutils.tsutilsStrings.out
import typingsSlinky.tsutils.tsutilsStrings.outDir
import typingsSlinky.tsutils.tsutilsStrings.outFile
import typingsSlinky.tsutils.tsutilsStrings.paths
import typingsSlinky.tsutils.tsutilsStrings.preserveConstEnums
import typingsSlinky.tsutils.tsutilsStrings.preserveSymlinks
import typingsSlinky.tsutils.tsutilsStrings.project
import typingsSlinky.tsutils.tsutilsStrings.reactNamespace
import typingsSlinky.tsutils.tsutilsStrings.removeComments
import typingsSlinky.tsutils.tsutilsStrings.require
import typingsSlinky.tsutils.tsutilsStrings.resolveJsonModule
import typingsSlinky.tsutils.tsutilsStrings.rootDir
import typingsSlinky.tsutils.tsutilsStrings.rootDirs
import typingsSlinky.tsutils.tsutilsStrings.skipDefaultLibCheck
import typingsSlinky.tsutils.tsutilsStrings.skipLibCheck
import typingsSlinky.tsutils.tsutilsStrings.sourceMap
import typingsSlinky.tsutils.tsutilsStrings.sourceRoot
import typingsSlinky.tsutils.tsutilsStrings.strict
import typingsSlinky.tsutils.tsutilsStrings.strictBindCallApply
import typingsSlinky.tsutils.tsutilsStrings.strictFunctionTypes
import typingsSlinky.tsutils.tsutilsStrings.strictNullChecks
import typingsSlinky.tsutils.tsutilsStrings.strictPropertyInitialization
import typingsSlinky.tsutils.tsutilsStrings.stripInternal
import typingsSlinky.tsutils.tsutilsStrings.suppressExcessPropertyErrors
import typingsSlinky.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors
import typingsSlinky.tsutils.tsutilsStrings.symbol_
import typingsSlinky.tsutils.tsutilsStrings.target
import typingsSlinky.tsutils.tsutilsStrings.traceResolution
import typingsSlinky.tsutils.tsutilsStrings.tsBuildInfoFile
import typingsSlinky.tsutils.tsutilsStrings.typeRoots
import typingsSlinky.tsutils.tsutilsStrings.types
import typingsSlinky.tsutils.tsutilsStrings.useDefineForClassFields
import typingsSlinky.tsutils.utilUtilMod._ImportLike
import typingsSlinky.typescript.mod.ArrayTypeNode
import typingsSlinky.typescript.mod.BaseType
import typingsSlinky.typescript.mod.BindingName
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.DestructuringPattern
import typingsSlinky.typescript.mod.DotDotDotToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ExternalModuleReference
import typingsSlinky.typescript.mod.GenericType
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.LeftHandSideExpression
import typingsSlinky.typescript.mod.ModifiersArray
import typingsSlinky.typescript.mod.ModuleBlock
import typingsSlinky.typescript.mod.ModuleReference
import typingsSlinky.typescript.mod.NamedExportBindings
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.NodeFlags
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.ObjectFlags
import typingsSlinky.typescript.mod.PropertyName
import typingsSlinky.typescript.mod.QuestionDotToken
import typingsSlinky.typescript.mod.Signature
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SourceFileLike
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.SyntaxKind
import typingsSlinky.typescript.mod.SyntaxKind.BindingElement
import typingsSlinky.typescript.mod.SyntaxKind.CallExpression
import typingsSlinky.typescript.mod.SyntaxKind.ExportDeclaration
import typingsSlinky.typescript.mod.SyntaxKind.ImportEqualsDeclaration
import typingsSlinky.typescript.mod.SyntaxKind.ImportKeyword
import typingsSlinky.typescript.mod.Token
import typingsSlinky.typescript.mod.TupleType
import typingsSlinky.typescript.mod.TupleTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeFlags
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined typescript.typescript.BindingElement & {  name :typescript.typescript.Identifier} */
  @js.native
  trait BindingElementnameIdentif extends StObject {
    
    var _declarationBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
    
    val end: Double = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val initializer: js.UndefOr[Expression] = js.native
    
    val kind: BindingElement = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val name: BindingName with Identifier = js.native
    
    val parent: BindingPattern = js.native
    
    val pos: Double = js.native
    
    val propertyName: js.UndefOr[PropertyName] = js.native
  }
  
  @js.native
  trait Body extends StObject
  
  /* Inlined typescript.typescript.CallExpression & {  expression :typescript.typescript.Token<typescript.typescript.SyntaxKind.ImportKeyword> | typescript.typescript.Identifier & {  text :'require'},   arguments :[typescript.typescript.Expression]} */
  @js.native
  trait CallExpressionexpressionT extends _ImportLike {
    
    var _declarationBrand: js.Any = js.native
    
    var _expressionBrand: js.Any = js.native
    
    var _leftHandSideExpressionBrand: js.Any = js.native
    
    var _unaryExpressionBrand: js.Any = js.native
    
    var _updateExpressionBrand: js.Any = js.native
    
    val arguments: NodeArray[Expression] with js.Array[Expression] = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    val expression: LeftHandSideExpression with (Token[ImportKeyword] | Identifiertextrequire) = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: CallExpression = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val questionDotToken: js.UndefOr[QuestionDotToken] = js.native
    
    val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
  }
  
  /* Inlined typescript.typescript.ExportDeclaration & {  moduleSpecifier :{}} */
  @js.native
  trait ExportDeclarationmoduleSp extends _ImportLike {
    
    var _declarationBrand: js.Any = js.native
    
    var _statementBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    /** Will not be assigned in the case of `export * from "foo";` */
    val exportClause: js.UndefOr[NamedExportBindings] = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val isTypeOnly: Boolean = js.native
    
    val kind: ExportDeclaration = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: js.UndefOr[Expression] with js.Object = js.native
    
    val name: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'Symbol',   escapedText :'symbol'} */
  @js.native
  trait IdentifiertextSymbolescap extends StObject {
    
    var _declarationBrand: js.Any = js.native
    
    var _expressionBrand: js.Any = js.native
    
    var _leftHandSideExpressionBrand: js.Any = js.native
    
    var _memberExpressionBrand: js.Any = js.native
    
    var _primaryExpressionBrand: js.Any = js.native
    
    var _unaryExpressionBrand: js.Any = js.native
    
    var _updateExpressionBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    /**
      * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
      * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
      */
    val escapedText: typingsSlinky.typescript.mod.String with symbol_ = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
    
    val kind: typingsSlinky.typescript.mod.SyntaxKind.Identifier = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String with Symbol = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'require'} */
  @js.native
  trait Identifiertextrequire extends StObject {
    
    var _declarationBrand: js.Any = js.native
    
    var _expressionBrand: js.Any = js.native
    
    var _leftHandSideExpressionBrand: js.Any = js.native
    
    var _memberExpressionBrand: js.Any = js.native
    
    var _primaryExpressionBrand: js.Any = js.native
    
    var _unaryExpressionBrand: js.Any = js.native
    
    var _updateExpressionBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    /**
      * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
      * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
      */
    val escapedText: typingsSlinky.typescript.mod.String = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
    
    val kind: typingsSlinky.typescript.mod.SyntaxKind.Identifier = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String with require = js.native
  }
  
  /* Inlined typescript.typescript.ImportEqualsDeclaration & {  moduleReference :typescript.typescript.ExternalModuleReference} */
  @js.native
  trait ImportEqualsDeclarationmo extends _ImportLike {
    
    var _declarationBrand: js.Any = js.native
    
    var _statementBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: ImportEqualsDeclaration = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val moduleReference: ModuleReference with ExternalModuleReference = js.native
    
    val name: Identifier = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined {[ K in keyof typescript.typescript.CompilerOptions ]: std.NonNullable<typescript.typescript.CompilerOptions[K]> extends boolean? K : never} */
  @js.native
  trait KinkeyofCompilerOptionsNo extends StObject {
    
    var allowJs: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowJs] = js.native
    
    var allowSyntheticDefaultImports: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowSyntheticDefaultImports] = js.native
    
    var allowUmdGlobalAccess: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowUmdGlobalAccess] = js.native
    
    var allowUnreachableCode: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowUnreachableCode] = js.native
    
    var allowUnusedLabels: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.allowUnusedLabels] = js.native
    
    var alwaysStrict: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.alwaysStrict] = js.native
    
    var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies] = js.native
    
    var baseUrl: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.baseUrl] = js.native
    
    var charset: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.charset] = js.native
    
    var checkJs: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.checkJs] = js.native
    
    var composite: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.composite] = js.native
    
    var declaration: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.declaration] = js.native
    
    var declarationDir: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.declarationDir] = js.native
    
    var declarationMap: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.declarationMap] = js.native
    
    var disableReferencedProjectLoad: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.disableReferencedProjectLoad] = js.native
    
    var disableSizeLimit: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.disableSizeLimit] = js.native
    
    var disableSolutionSearching: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.disableSolutionSearching] = js.native
    
    var disableSourceOfProjectReferenceRedirect: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect] = js.native
    
    var downlevelIteration: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.downlevelIteration] = js.native
    
    var emitBOM: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.emitBOM] = js.native
    
    var emitDeclarationOnly: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.emitDeclarationOnly] = js.native
    
    var emitDecoratorMetadata: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.emitDecoratorMetadata] = js.native
    
    var esModuleInterop: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.esModuleInterop] = js.native
    
    var experimentalDecorators: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.experimentalDecorators] = js.native
    
    var forceConsistentCasingInFileNames: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.forceConsistentCasingInFileNames] = js.native
    
    var importHelpers: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.importHelpers] = js.native
    
    var importsNotUsedAsValues: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.importsNotUsedAsValues] = js.native
    
    var incremental: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.incremental] = js.native
    
    var inlineSourceMap: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.inlineSourceMap] = js.native
    
    var inlineSources: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.inlineSources] = js.native
    
    var isolatedModules: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.isolatedModules] = js.native
    
    var jsx: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.jsx] = js.native
    
    var jsxFactory: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.jsxFactory] = js.native
    
    var jsxFragmentFactory: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.jsxFragmentFactory] = js.native
    
    var jsxImportSource: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.jsxImportSource] = js.native
    
    var keyofStringsOnly: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.keyofStringsOnly] = js.native
    
    var lib: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.lib] = js.native
    
    var locale: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.locale] = js.native
    
    var mapRoot: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.mapRoot] = js.native
    
    var maxNodeModuleJsDepth: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.maxNodeModuleJsDepth] = js.native
    
    var module: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.module] = js.native
    
    var moduleResolution: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.moduleResolution] = js.native
    
    var newLine: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.newLine] = js.native
    
    var noEmit: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noEmit] = js.native
    
    var noEmitHelpers: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noEmitHelpers] = js.native
    
    var noEmitOnError: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noEmitOnError] = js.native
    
    var noErrorTruncation: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noErrorTruncation] = js.native
    
    var noFallthroughCasesInSwitch: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noFallthroughCasesInSwitch] = js.native
    
    var noImplicitAny: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitAny] = js.native
    
    var noImplicitReturns: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitReturns] = js.native
    
    var noImplicitThis: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitThis] = js.native
    
    var noImplicitUseStrict: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noImplicitUseStrict] = js.native
    
    var noLib: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noLib] = js.native
    
    var noResolve: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noResolve] = js.native
    
    var noStrictGenericChecks: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noStrictGenericChecks] = js.native
    
    var noUncheckedIndexedAccess: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noUncheckedIndexedAccess] = js.native
    
    var noUnusedLocals: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noUnusedLocals] = js.native
    
    var noUnusedParameters: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.noUnusedParameters] = js.native
    
    var out: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.out] = js.native
    
    var outDir: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.outDir] = js.native
    
    var outFile: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.outFile] = js.native
    
    var paths: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.paths] = js.native
    
    var preserveConstEnums: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.preserveConstEnums] = js.native
    
    var preserveSymlinks: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.preserveSymlinks] = js.native
    
    var project: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.project] = js.native
    
    var reactNamespace: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.reactNamespace] = js.native
    
    var removeComments: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.removeComments] = js.native
    
    var resolveJsonModule: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.resolveJsonModule] = js.native
    
    var rootDir: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.rootDir] = js.native
    
    var rootDirs: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.rootDirs] = js.native
    
    var skipDefaultLibCheck: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.skipDefaultLibCheck] = js.native
    
    var skipLibCheck: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.skipLibCheck] = js.native
    
    var sourceMap: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.sourceMap] = js.native
    
    var sourceRoot: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.sourceRoot] = js.native
    
    var strict: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strict] = js.native
    
    var strictBindCallApply: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictBindCallApply] = js.native
    
    var strictFunctionTypes: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictFunctionTypes] = js.native
    
    var strictNullChecks: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictNullChecks] = js.native
    
    var strictPropertyInitialization: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.strictPropertyInitialization] = js.native
    
    var stripInternal: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.stripInternal] = js.native
    
    var suppressExcessPropertyErrors: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.suppressExcessPropertyErrors] = js.native
    
    var suppressImplicitAnyIndexErrors: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors] = js.native
    
    var target: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.target] = js.native
    
    var traceResolution: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.traceResolution] = js.native
    
    var tsBuildInfoFile: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.tsBuildInfoFile] = js.native
    
    var typeRoots: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.typeRoots] = js.native
    
    var types: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.types] = js.native
    
    var useDefineForClassFields: js.UndefOr[typingsSlinky.tsutils.tsutilsStrings.useDefineForClassFields] = js.native
  }
  object KinkeyofCompilerOptionsNo {
    
    @scala.inline
    def apply(): KinkeyofCompilerOptionsNo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KinkeyofCompilerOptionsNo]
    }
    
    @scala.inline
    implicit class KinkeyofCompilerOptionsNoMutableBuilder[Self <: KinkeyofCompilerOptionsNo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowJs(value: allowJs): Self = StObject.set(x, "allowJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowJsUndefined: Self = StObject.set(x, "allowJs", js.undefined)
      
      @scala.inline
      def setAllowSyntheticDefaultImports(value: allowSyntheticDefaultImports): Self = StObject.set(x, "allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSyntheticDefaultImportsUndefined: Self = StObject.set(x, "allowSyntheticDefaultImports", js.undefined)
      
      @scala.inline
      def setAllowUmdGlobalAccess(value: allowUmdGlobalAccess): Self = StObject.set(x, "allowUmdGlobalAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUmdGlobalAccessUndefined: Self = StObject.set(x, "allowUmdGlobalAccess", js.undefined)
      
      @scala.inline
      def setAllowUnreachableCode(value: allowUnreachableCode): Self = StObject.set(x, "allowUnreachableCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnreachableCodeUndefined: Self = StObject.set(x, "allowUnreachableCode", js.undefined)
      
      @scala.inline
      def setAllowUnusedLabels(value: allowUnusedLabels): Self = StObject.set(x, "allowUnusedLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnusedLabelsUndefined: Self = StObject.set(x, "allowUnusedLabels", js.undefined)
      
      @scala.inline
      def setAlwaysStrict(value: alwaysStrict): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
      
      @scala.inline
      def setAssumeChangesOnlyAffectDirectDependencies(value: assumeChangesOnlyAffectDirectDependencies): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: baseUrl): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setCharset(value: charset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCheckJs(value: checkJs): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckJsUndefined: Self = StObject.set(x, "checkJs", js.undefined)
      
      @scala.inline
      def setComposite(value: composite): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      @scala.inline
      def setDeclaration(value: declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationDir(value: declarationDir): Self = StObject.set(x, "declarationDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationDirUndefined: Self = StObject.set(x, "declarationDir", js.undefined)
      
      @scala.inline
      def setDeclarationMap(value: declarationMap): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
      
      @scala.inline
      def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      @scala.inline
      def setDisableReferencedProjectLoad(value: disableReferencedProjectLoad): Self = StObject.set(x, "disableReferencedProjectLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableReferencedProjectLoadUndefined: Self = StObject.set(x, "disableReferencedProjectLoad", js.undefined)
      
      @scala.inline
      def setDisableSizeLimit(value: disableSizeLimit): Self = StObject.set(x, "disableSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSizeLimitUndefined: Self = StObject.set(x, "disableSizeLimit", js.undefined)
      
      @scala.inline
      def setDisableSolutionSearching(value: disableSolutionSearching): Self = StObject.set(x, "disableSolutionSearching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSolutionSearchingUndefined: Self = StObject.set(x, "disableSolutionSearching", js.undefined)
      
      @scala.inline
      def setDisableSourceOfProjectReferenceRedirect(value: disableSourceOfProjectReferenceRedirect): Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSourceOfProjectReferenceRedirectUndefined: Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", js.undefined)
      
      @scala.inline
      def setDownlevelIteration(value: downlevelIteration): Self = StObject.set(x, "downlevelIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownlevelIterationUndefined: Self = StObject.set(x, "downlevelIteration", js.undefined)
      
      @scala.inline
      def setEmitBOM(value: emitBOM): Self = StObject.set(x, "emitBOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitBOMUndefined: Self = StObject.set(x, "emitBOM", js.undefined)
      
      @scala.inline
      def setEmitDeclarationOnly(value: emitDeclarationOnly): Self = StObject.set(x, "emitDeclarationOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitDeclarationOnlyUndefined: Self = StObject.set(x, "emitDeclarationOnly", js.undefined)
      
      @scala.inline
      def setEmitDecoratorMetadata(value: emitDecoratorMetadata): Self = StObject.set(x, "emitDecoratorMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitDecoratorMetadataUndefined: Self = StObject.set(x, "emitDecoratorMetadata", js.undefined)
      
      @scala.inline
      def setEsModuleInterop(value: esModuleInterop): Self = StObject.set(x, "esModuleInterop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsModuleInteropUndefined: Self = StObject.set(x, "esModuleInterop", js.undefined)
      
      @scala.inline
      def setExperimentalDecorators(value: experimentalDecorators): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      @scala.inline
      def setForceConsistentCasingInFileNames(value: forceConsistentCasingInFileNames): Self = StObject.set(x, "forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceConsistentCasingInFileNamesUndefined: Self = StObject.set(x, "forceConsistentCasingInFileNames", js.undefined)
      
      @scala.inline
      def setImportHelpers(value: importHelpers): Self = StObject.set(x, "importHelpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportHelpersUndefined: Self = StObject.set(x, "importHelpers", js.undefined)
      
      @scala.inline
      def setImportsNotUsedAsValues(value: importsNotUsedAsValues): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
      
      @scala.inline
      def setIncremental(value: incremental): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
      
      @scala.inline
      def setInlineSourceMap(value: inlineSourceMap): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
      
      @scala.inline
      def setInlineSources(value: inlineSources): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
      
      @scala.inline
      def setIsolatedModules(value: isolatedModules): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
      
      @scala.inline
      def setJsx(value: jsx): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxFactory(value: jsxFactory): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
      
      @scala.inline
      def setJsxFragmentFactory(value: jsxFragmentFactory): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
      
      @scala.inline
      def setJsxImportSource(value: jsxImportSource): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      @scala.inline
      def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      @scala.inline
      def setKeyofStringsOnly(value: keyofStringsOnly): Self = StObject.set(x, "keyofStringsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyofStringsOnlyUndefined: Self = StObject.set(x, "keyofStringsOnly", js.undefined)
      
      @scala.inline
      def setLib(value: lib): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      @scala.inline
      def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMapRoot(value: mapRoot): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
      
      @scala.inline
      def setMaxNodeModuleJsDepth(value: maxNodeModuleJsDepth): Self = StObject.set(x, "maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNodeModuleJsDepthUndefined: Self = StObject.set(x, "maxNodeModuleJsDepth", js.undefined)
      
      @scala.inline
      def setModule(value: module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleResolution(value: moduleResolution): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setNewLine(value: newLine): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      @scala.inline
      def setNoEmit(value: noEmit): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitHelpers(value: noEmitHelpers): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
      
      @scala.inline
      def setNoEmitOnError(value: noEmitOnError): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      @scala.inline
      def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
      
      @scala.inline
      def setNoErrorTruncation(value: noErrorTruncation): Self = StObject.set(x, "noErrorTruncation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoErrorTruncationUndefined: Self = StObject.set(x, "noErrorTruncation", js.undefined)
      
      @scala.inline
      def setNoFallthroughCasesInSwitch(value: noFallthroughCasesInSwitch): Self = StObject.set(x, "noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoFallthroughCasesInSwitchUndefined: Self = StObject.set(x, "noFallthroughCasesInSwitch", js.undefined)
      
      @scala.inline
      def setNoImplicitAny(value: noImplicitAny): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitAnyUndefined: Self = StObject.set(x, "noImplicitAny", js.undefined)
      
      @scala.inline
      def setNoImplicitReturns(value: noImplicitReturns): Self = StObject.set(x, "noImplicitReturns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitReturnsUndefined: Self = StObject.set(x, "noImplicitReturns", js.undefined)
      
      @scala.inline
      def setNoImplicitThis(value: noImplicitThis): Self = StObject.set(x, "noImplicitThis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitThisUndefined: Self = StObject.set(x, "noImplicitThis", js.undefined)
      
      @scala.inline
      def setNoImplicitUseStrict(value: noImplicitUseStrict): Self = StObject.set(x, "noImplicitUseStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitUseStrictUndefined: Self = StObject.set(x, "noImplicitUseStrict", js.undefined)
      
      @scala.inline
      def setNoLib(value: noLib): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
      
      @scala.inline
      def setNoResolve(value: noResolve): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResolveUndefined: Self = StObject.set(x, "noResolve", js.undefined)
      
      @scala.inline
      def setNoStrictGenericChecks(value: noStrictGenericChecks): Self = StObject.set(x, "noStrictGenericChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStrictGenericChecksUndefined: Self = StObject.set(x, "noStrictGenericChecks", js.undefined)
      
      @scala.inline
      def setNoUncheckedIndexedAccess(value: noUncheckedIndexedAccess): Self = StObject.set(x, "noUncheckedIndexedAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUncheckedIndexedAccessUndefined: Self = StObject.set(x, "noUncheckedIndexedAccess", js.undefined)
      
      @scala.inline
      def setNoUnusedLocals(value: noUnusedLocals): Self = StObject.set(x, "noUnusedLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUnusedLocalsUndefined: Self = StObject.set(x, "noUnusedLocals", js.undefined)
      
      @scala.inline
      def setNoUnusedParameters(value: noUnusedParameters): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
      
      @scala.inline
      def setOut(value: out): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDir(value: outDir): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      @scala.inline
      def setOutFile(value: outFile): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      @scala.inline
      def setPaths(value: paths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPreserveConstEnums(value: preserveConstEnums): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
      
      @scala.inline
      def setPreserveSymlinks(value: preserveSymlinks): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      @scala.inline
      def setProject(value: project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setReactNamespace(value: reactNamespace): Self = StObject.set(x, "reactNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactNamespaceUndefined: Self = StObject.set(x, "reactNamespace", js.undefined)
      
      @scala.inline
      def setRemoveComments(value: removeComments): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      @scala.inline
      def setResolveJsonModule(value: resolveJsonModule): Self = StObject.set(x, "resolveJsonModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveJsonModuleUndefined: Self = StObject.set(x, "resolveJsonModule", js.undefined)
      
      @scala.inline
      def setRootDir(value: rootDir): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      @scala.inline
      def setRootDirs(value: rootDirs): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
      
      @scala.inline
      def setSkipDefaultLibCheck(value: skipDefaultLibCheck): Self = StObject.set(x, "skipDefaultLibCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDefaultLibCheckUndefined: Self = StObject.set(x, "skipDefaultLibCheck", js.undefined)
      
      @scala.inline
      def setSkipLibCheck(value: skipLibCheck): Self = StObject.set(x, "skipLibCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLibCheckUndefined: Self = StObject.set(x, "skipLibCheck", js.undefined)
      
      @scala.inline
      def setSourceMap(value: sourceMap): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: sourceRoot): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setStrict(value: strict): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictBindCallApply(value: strictBindCallApply): Self = StObject.set(x, "strictBindCallApply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictBindCallApplyUndefined: Self = StObject.set(x, "strictBindCallApply", js.undefined)
      
      @scala.inline
      def setStrictFunctionTypes(value: strictFunctionTypes): Self = StObject.set(x, "strictFunctionTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictFunctionTypesUndefined: Self = StObject.set(x, "strictFunctionTypes", js.undefined)
      
      @scala.inline
      def setStrictNullChecks(value: strictNullChecks): Self = StObject.set(x, "strictNullChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictNullChecksUndefined: Self = StObject.set(x, "strictNullChecks", js.undefined)
      
      @scala.inline
      def setStrictPropertyInitialization(value: strictPropertyInitialization): Self = StObject.set(x, "strictPropertyInitialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictPropertyInitializationUndefined: Self = StObject.set(x, "strictPropertyInitialization", js.undefined)
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setStripInternal(value: stripInternal): Self = StObject.set(x, "stripInternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripInternalUndefined: Self = StObject.set(x, "stripInternal", js.undefined)
      
      @scala.inline
      def setSuppressExcessPropertyErrors(value: suppressExcessPropertyErrors): Self = StObject.set(x, "suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressExcessPropertyErrorsUndefined: Self = StObject.set(x, "suppressExcessPropertyErrors", js.undefined)
      
      @scala.inline
      def setSuppressImplicitAnyIndexErrors(value: suppressImplicitAnyIndexErrors): Self = StObject.set(x, "suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressImplicitAnyIndexErrorsUndefined: Self = StObject.set(x, "suppressImplicitAnyIndexErrors", js.undefined)
      
      @scala.inline
      def setTarget(value: target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTraceResolution(value: traceResolution): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
      
      @scala.inline
      def setTsBuildInfoFile(value: tsBuildInfoFile): Self = StObject.set(x, "tsBuildInfoFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsBuildInfoFileUndefined: Self = StObject.set(x, "tsBuildInfoFile", js.undefined)
      
      @scala.inline
      def setTypeRoots(value: typeRoots): Self = StObject.set(x, "typeRoots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeRootsUndefined: Self = StObject.set(x, "typeRoots", js.undefined)
      
      @scala.inline
      def setTypes(value: types): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setUseDefineForClassFields(value: useDefineForClassFields): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: Identifier = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: Identifier): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined typescript.typescript.TypeReference & {  target :typescript.typescript.TupleType} */
  @js.native
  trait TypeReferencetargetTupleT extends StObject {
    
    var aliasSymbol: js.UndefOr[typingsSlinky.typescript.mod.Symbol] = js.native
    
    var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.native
    
    var flags: TypeFlags = js.native
    
    def getApparentProperties(): js.Array[typingsSlinky.typescript.mod.Symbol] = js.native
    
    def getBaseTypes(): js.UndefOr[js.Array[BaseType]] = js.native
    
    def getCallSignatures(): js.Array[Signature] = js.native
    
    def getConstraint(): js.UndefOr[Type] = js.native
    
    def getConstructSignatures(): js.Array[Signature] = js.native
    
    def getDefault(): js.UndefOr[Type] = js.native
    
    def getFlags(): TypeFlags = js.native
    
    def getNonNullableType(): Type = js.native
    
    def getNumberIndexType(): js.UndefOr[Type] = js.native
    
    def getProperties(): js.Array[typingsSlinky.typescript.mod.Symbol] = js.native
    
    def getProperty(propertyName: String): js.UndefOr[typingsSlinky.typescript.mod.Symbol] = js.native
    
    def getStringIndexType(): js.UndefOr[Type] = js.native
    
    def getSymbol(): js.UndefOr[typingsSlinky.typescript.mod.Symbol] = js.native
    
    def isClass(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
    
    def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
    
    def isIntersection(): /* is typescript.typescript.IntersectionType */ Boolean = js.native
    
    def isLiteral(): /* is typescript.typescript.LiteralType */ Boolean = js.native
    
    def isNumberLiteral(): /* is typescript.typescript.NumberLiteralType */ Boolean = js.native
    
    def isStringLiteral(): /* is typescript.typescript.StringLiteralType */ Boolean = js.native
    
    def isTypeParameter(): /* is typescript.typescript.TypeParameter */ Boolean = js.native
    
    def isUnion(): /* is typescript.typescript.UnionType */ Boolean = js.native
    
    def isUnionOrIntersection(): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = js.native
    
    var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.native
    
    var objectFlags: ObjectFlags = js.native
    
    var pattern: js.UndefOr[DestructuringPattern] = js.native
    
    var symbol: typingsSlinky.typescript.mod.Symbol = js.native
    
    var target: GenericType with TupleType = js.native
    
    var typeArguments: js.UndefOr[js.Array[Type]] = js.native
  }
  object TypeReferencetargetTupleT {
    
    @scala.inline
    def apply(
      flags: TypeFlags,
      getApparentProperties: () => js.Array[typingsSlinky.typescript.mod.Symbol],
      getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
      getCallSignatures: () => js.Array[Signature],
      getConstraint: () => js.UndefOr[Type],
      getConstructSignatures: () => js.Array[Signature],
      getDefault: () => js.UndefOr[Type],
      getFlags: () => TypeFlags,
      getNonNullableType: () => Type,
      getNumberIndexType: () => js.UndefOr[Type],
      getProperties: () => js.Array[typingsSlinky.typescript.mod.Symbol],
      getProperty: String => js.UndefOr[typingsSlinky.typescript.mod.Symbol],
      getStringIndexType: () => js.UndefOr[Type],
      getSymbol: () => js.UndefOr[typingsSlinky.typescript.mod.Symbol],
      isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
      isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
      isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
      isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
      isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
      isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
      isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
      isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
      isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
      objectFlags: ObjectFlags,
      symbol: typingsSlinky.typescript.mod.Symbol,
      target: GenericType with TupleType
    ): TypeReferencetargetTupleT = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeReferencetargetTupleT]
    }
    
    @scala.inline
    implicit class TypeReferencetargetTupleTMutableBuilder[Self <: TypeReferencetargetTupleT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasSymbol(value: typingsSlinky.typescript.mod.Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasSymbolUndefined: Self = StObject.set(x, "aliasSymbol", js.undefined)
      
      @scala.inline
      def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
      
      @scala.inline
      def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value :_*))
      
      @scala.inline
      def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetApparentProperties(value: () => js.Array[typingsSlinky.typescript.mod.Symbol]): Self = StObject.set(x, "getApparentProperties", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBaseTypes(value: () => js.UndefOr[js.Array[BaseType]]): Self = StObject.set(x, "getBaseTypes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCallSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getCallSignatures", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConstraint(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConstructSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getConstructSignatures", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefault(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFlags(value: () => TypeFlags): Self = StObject.set(x, "getFlags", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNonNullableType(value: () => Type): Self = StObject.set(x, "getNonNullableType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNumberIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getNumberIndexType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetProperties(value: () => js.Array[typingsSlinky.typescript.mod.Symbol]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetProperty(value: String => js.UndefOr[typingsSlinky.typescript.mod.Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStringIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getStringIndexType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSymbol(value: () => js.UndefOr[typingsSlinky.typescript.mod.Symbol]): Self = StObject.set(x, "getSymbol", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsClass(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClass", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsClassOrInterface(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClassOrInterface", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsIntersection(value: () => /* is typescript.typescript.IntersectionType */ Boolean): Self = StObject.set(x, "isIntersection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLiteral(value: () => /* is typescript.typescript.LiteralType */ Boolean): Self = StObject.set(x, "isLiteral", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNumberLiteral(value: () => /* is typescript.typescript.NumberLiteralType */ Boolean): Self = StObject.set(x, "isNumberLiteral", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStringLiteral(value: () => /* is typescript.typescript.StringLiteralType */ Boolean): Self = StObject.set(x, "isStringLiteral", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTypeParameter(value: () => /* is typescript.typescript.TypeParameter */ Boolean): Self = StObject.set(x, "isTypeParameter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUnion(value: () => /* is typescript.typescript.UnionType */ Boolean): Self = StObject.set(x, "isUnion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUnionOrIntersection(value: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean): Self = StObject.set(x, "isUnionOrIntersection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNode(value: TypeReferenceNode | ArrayTypeNode | TupleTypeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setObjectFlags(value: ObjectFlags): Self = StObject.set(x, "objectFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: DestructuringPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setSymbol(value: typingsSlinky.typescript.mod.Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: GenericType with TupleType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
      
      @scala.inline
      def setTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "typeArguments", js.Array(value :_*))
    }
  }
  
  /* Inlined {[ _ in keyof typescript.typescript.CompilerOptions ]: infer U} */
  @js.native
  trait inkeyofCompilerOptionsinf extends StObject {
    
    var allowJs: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var allowSyntheticDefaultImports: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var allowUmdGlobalAccess: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var allowUnreachableCode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var allowUnusedLabels: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var alwaysStrict: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var baseUrl: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var charset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var checkJs: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var composite: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var declaration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var declarationDir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var declarationMap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var disableReferencedProjectLoad: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var disableSizeLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var disableSolutionSearching: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var disableSourceOfProjectReferenceRedirect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var downlevelIteration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var emitBOM: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var emitDeclarationOnly: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var emitDecoratorMetadata: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var esModuleInterop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var experimentalDecorators: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var forceConsistentCasingInFileNames: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var importHelpers: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var importsNotUsedAsValues: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var incremental: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var inlineSourceMap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var inlineSources: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var isolatedModules: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var jsx: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var jsxFactory: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var jsxFragmentFactory: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var jsxImportSource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var keyofStringsOnly: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var lib: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var locale: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var mapRoot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var maxNodeModuleJsDepth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var module: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var moduleResolution: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var newLine: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noEmit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noEmitHelpers: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noEmitOnError: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noErrorTruncation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noFallthroughCasesInSwitch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noImplicitAny: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noImplicitReturns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noImplicitThis: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noImplicitUseStrict: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noLib: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noResolve: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noStrictGenericChecks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noUncheckedIndexedAccess: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noUnusedLocals: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var noUnusedParameters: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var out: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var outDir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var outFile: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var paths: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var preserveConstEnums: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var preserveSymlinks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var project: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var reactNamespace: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var removeComments: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var resolveJsonModule: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var rootDir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var rootDirs: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var skipDefaultLibCheck: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var skipLibCheck: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var sourceMap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var sourceRoot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var strict: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var strictBindCallApply: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var strictFunctionTypes: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var strictNullChecks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var strictPropertyInitialization: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var stripInternal: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var suppressExcessPropertyErrors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var suppressImplicitAnyIndexErrors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var target: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var traceResolution: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var tsBuildInfoFile: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var typeRoots: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var types: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
    
    var useDefineForClassFields: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.native
  }
  object inkeyofCompilerOptionsinf {
    
    @scala.inline
    def apply(): inkeyofCompilerOptionsinf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[inkeyofCompilerOptionsinf]
    }
    
    @scala.inline
    implicit class inkeyofCompilerOptionsinfMutableBuilder[Self <: inkeyofCompilerOptionsinf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowJs(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowJsUndefined: Self = StObject.set(x, "allowJs", js.undefined)
      
      @scala.inline
      def setAllowSyntheticDefaultImports(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSyntheticDefaultImportsUndefined: Self = StObject.set(x, "allowSyntheticDefaultImports", js.undefined)
      
      @scala.inline
      def setAllowUmdGlobalAccess(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowUmdGlobalAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUmdGlobalAccessUndefined: Self = StObject.set(x, "allowUmdGlobalAccess", js.undefined)
      
      @scala.inline
      def setAllowUnreachableCode(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowUnreachableCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnreachableCodeUndefined: Self = StObject.set(x, "allowUnreachableCode", js.undefined)
      
      @scala.inline
      def setAllowUnusedLabels(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowUnusedLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnusedLabelsUndefined: Self = StObject.set(x, "allowUnusedLabels", js.undefined)
      
      @scala.inline
      def setAlwaysStrict(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
      
      @scala.inline
      def setAssumeChangesOnlyAffectDirectDependencies(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setCharset(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCheckJs(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckJsUndefined: Self = StObject.set(x, "checkJs", js.undefined)
      
      @scala.inline
      def setComposite(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      @scala.inline
      def setDeclaration(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationDir(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "declarationDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationDirUndefined: Self = StObject.set(x, "declarationDir", js.undefined)
      
      @scala.inline
      def setDeclarationMap(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
      
      @scala.inline
      def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      @scala.inline
      def setDisableReferencedProjectLoad(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableReferencedProjectLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableReferencedProjectLoadUndefined: Self = StObject.set(x, "disableReferencedProjectLoad", js.undefined)
      
      @scala.inline
      def setDisableSizeLimit(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSizeLimitUndefined: Self = StObject.set(x, "disableSizeLimit", js.undefined)
      
      @scala.inline
      def setDisableSolutionSearching(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableSolutionSearching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSolutionSearchingUndefined: Self = StObject.set(x, "disableSolutionSearching", js.undefined)
      
      @scala.inline
      def setDisableSourceOfProjectReferenceRedirect(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSourceOfProjectReferenceRedirectUndefined: Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", js.undefined)
      
      @scala.inline
      def setDownlevelIteration(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "downlevelIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownlevelIterationUndefined: Self = StObject.set(x, "downlevelIteration", js.undefined)
      
      @scala.inline
      def setEmitBOM(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "emitBOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitBOMUndefined: Self = StObject.set(x, "emitBOM", js.undefined)
      
      @scala.inline
      def setEmitDeclarationOnly(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "emitDeclarationOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitDeclarationOnlyUndefined: Self = StObject.set(x, "emitDeclarationOnly", js.undefined)
      
      @scala.inline
      def setEmitDecoratorMetadata(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "emitDecoratorMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitDecoratorMetadataUndefined: Self = StObject.set(x, "emitDecoratorMetadata", js.undefined)
      
      @scala.inline
      def setEsModuleInterop(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "esModuleInterop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsModuleInteropUndefined: Self = StObject.set(x, "esModuleInterop", js.undefined)
      
      @scala.inline
      def setExperimentalDecorators(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      @scala.inline
      def setForceConsistentCasingInFileNames(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceConsistentCasingInFileNamesUndefined: Self = StObject.set(x, "forceConsistentCasingInFileNames", js.undefined)
      
      @scala.inline
      def setImportHelpers(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "importHelpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportHelpersUndefined: Self = StObject.set(x, "importHelpers", js.undefined)
      
      @scala.inline
      def setImportsNotUsedAsValues(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
      
      @scala.inline
      def setIncremental(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
      
      @scala.inline
      def setInlineSourceMap(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
      
      @scala.inline
      def setInlineSources(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
      
      @scala.inline
      def setIsolatedModules(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
      
      @scala.inline
      def setJsx(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxFactory(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
      
      @scala.inline
      def setJsxFragmentFactory(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
      
      @scala.inline
      def setJsxImportSource(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      @scala.inline
      def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      @scala.inline
      def setKeyofStringsOnly(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "keyofStringsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyofStringsOnlyUndefined: Self = StObject.set(x, "keyofStringsOnly", js.undefined)
      
      @scala.inline
      def setLib(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      @scala.inline
      def setLocale(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMapRoot(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
      
      @scala.inline
      def setMaxNodeModuleJsDepth(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNodeModuleJsDepthUndefined: Self = StObject.set(x, "maxNodeModuleJsDepth", js.undefined)
      
      @scala.inline
      def setModule(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleResolution(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setNewLine(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      @scala.inline
      def setNoEmit(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitHelpers(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
      
      @scala.inline
      def setNoEmitOnError(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      @scala.inline
      def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
      
      @scala.inline
      def setNoErrorTruncation(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noErrorTruncation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoErrorTruncationUndefined: Self = StObject.set(x, "noErrorTruncation", js.undefined)
      
      @scala.inline
      def setNoFallthroughCasesInSwitch(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoFallthroughCasesInSwitchUndefined: Self = StObject.set(x, "noFallthroughCasesInSwitch", js.undefined)
      
      @scala.inline
      def setNoImplicitAny(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitAnyUndefined: Self = StObject.set(x, "noImplicitAny", js.undefined)
      
      @scala.inline
      def setNoImplicitReturns(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitReturns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitReturnsUndefined: Self = StObject.set(x, "noImplicitReturns", js.undefined)
      
      @scala.inline
      def setNoImplicitThis(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitThis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitThisUndefined: Self = StObject.set(x, "noImplicitThis", js.undefined)
      
      @scala.inline
      def setNoImplicitUseStrict(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitUseStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitUseStrictUndefined: Self = StObject.set(x, "noImplicitUseStrict", js.undefined)
      
      @scala.inline
      def setNoLib(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
      
      @scala.inline
      def setNoResolve(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResolveUndefined: Self = StObject.set(x, "noResolve", js.undefined)
      
      @scala.inline
      def setNoStrictGenericChecks(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noStrictGenericChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStrictGenericChecksUndefined: Self = StObject.set(x, "noStrictGenericChecks", js.undefined)
      
      @scala.inline
      def setNoUncheckedIndexedAccess(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noUncheckedIndexedAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUncheckedIndexedAccessUndefined: Self = StObject.set(x, "noUncheckedIndexedAccess", js.undefined)
      
      @scala.inline
      def setNoUnusedLocals(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noUnusedLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUnusedLocalsUndefined: Self = StObject.set(x, "noUnusedLocals", js.undefined)
      
      @scala.inline
      def setNoUnusedParameters(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
      
      @scala.inline
      def setOut(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDir(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      @scala.inline
      def setOutFile(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      @scala.inline
      def setPaths(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPreserveConstEnums(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
      
      @scala.inline
      def setPreserveSymlinks(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      @scala.inline
      def setProject(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setReactNamespace(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "reactNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactNamespaceUndefined: Self = StObject.set(x, "reactNamespace", js.undefined)
      
      @scala.inline
      def setRemoveComments(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      @scala.inline
      def setResolveJsonModule(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "resolveJsonModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveJsonModuleUndefined: Self = StObject.set(x, "resolveJsonModule", js.undefined)
      
      @scala.inline
      def setRootDir(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      @scala.inline
      def setRootDirs(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
      
      @scala.inline
      def setSkipDefaultLibCheck(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "skipDefaultLibCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDefaultLibCheckUndefined: Self = StObject.set(x, "skipDefaultLibCheck", js.undefined)
      
      @scala.inline
      def setSkipLibCheck(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "skipLibCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLibCheckUndefined: Self = StObject.set(x, "skipLibCheck", js.undefined)
      
      @scala.inline
      def setSourceMap(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setStrict(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictBindCallApply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictBindCallApply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictBindCallApplyUndefined: Self = StObject.set(x, "strictBindCallApply", js.undefined)
      
      @scala.inline
      def setStrictFunctionTypes(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictFunctionTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictFunctionTypesUndefined: Self = StObject.set(x, "strictFunctionTypes", js.undefined)
      
      @scala.inline
      def setStrictNullChecks(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictNullChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictNullChecksUndefined: Self = StObject.set(x, "strictNullChecks", js.undefined)
      
      @scala.inline
      def setStrictPropertyInitialization(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictPropertyInitialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictPropertyInitializationUndefined: Self = StObject.set(x, "strictPropertyInitialization", js.undefined)
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setStripInternal(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "stripInternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripInternalUndefined: Self = StObject.set(x, "stripInternal", js.undefined)
      
      @scala.inline
      def setSuppressExcessPropertyErrors(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressExcessPropertyErrorsUndefined: Self = StObject.set(x, "suppressExcessPropertyErrors", js.undefined)
      
      @scala.inline
      def setSuppressImplicitAnyIndexErrors(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressImplicitAnyIndexErrorsUndefined: Self = StObject.set(x, "suppressImplicitAnyIndexErrors", js.undefined)
      
      @scala.inline
      def setTarget(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTraceResolution(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
      
      @scala.inline
      def setTsBuildInfoFile(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "tsBuildInfoFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsBuildInfoFileUndefined: Self = StObject.set(x, "tsBuildInfoFile", js.undefined)
      
      @scala.inline
      def setTypeRoots(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "typeRoots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeRootsUndefined: Self = StObject.set(x, "typeRoots", js.undefined)
      
      @scala.inline
      def setTypes(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setUseDefineForClassFields(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
    }
  }
}
