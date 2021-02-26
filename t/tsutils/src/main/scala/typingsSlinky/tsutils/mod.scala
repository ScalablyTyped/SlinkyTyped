package typingsSlinky.tsutils

import typingsSlinky.std.Map
import typingsSlinky.tsutils.anon.BindingElementnameIdentif
import typingsSlinky.tsutils.anon.Name
import typingsSlinky.tsutils.controlFlowMod.ControlFlowEnd
import typingsSlinky.tsutils.convertAstMod.ConvertedAst
import typingsSlinky.tsutils.convertAstMod.NodeWrap
import typingsSlinky.tsutils.tsutilsStrings.CarriagereturnLinefeed
import typingsSlinky.tsutils.tsutilsStrings.Linefeed
import typingsSlinky.tsutils.tsutilsStrings.stripInternal
import typingsSlinky.tsutils.usageMod.DeclarationDomain
import typingsSlinky.tsutils.usageMod.UsageDomain
import typingsSlinky.tsutils.usageMod.VariableInfo
import typingsSlinky.tsutils.utilUtilMod.AccessKind
import typingsSlinky.tsutils.utilUtilMod.BooleanCompilerOptions
import typingsSlinky.tsutils.utilUtilMod.ForEachCommentCallback
import typingsSlinky.tsutils.utilUtilMod.ForEachTokenCallback
import typingsSlinky.tsutils.utilUtilMod.ImportKind
import typingsSlinky.tsutils.utilUtilMod.ImportLike
import typingsSlinky.tsutils.utilUtilMod.LateBoundPropertyNames
import typingsSlinky.tsutils.utilUtilMod.LineRange
import typingsSlinky.tsutils.utilUtilMod.ScopeBoundary
import typingsSlinky.tsutils.utilUtilMod.SideEffectOptions
import typingsSlinky.tsutils.utilUtilMod.StrictCompilerOption
import typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind
import typingsSlinky.tsutils.utilUtilMod.WellKnownSymbolLiteral
import typingsSlinky.typescript.mod.ArrowFunction
import typingsSlinky.typescript.mod.AssertionExpression
import typingsSlinky.typescript.mod.BindingElement
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.BlockLike
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.CheckJsDirective
import typingsSlinky.typescript.mod.ClassElement
import typingsSlinky.typescript.mod.ClassLikeDeclaration
import typingsSlinky.typescript.mod.CommentRange
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.FunctionExpression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.JSDoc
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.ModifierFlags
import typingsSlinky.typescript.mod.ModifiersArray
import typingsSlinky.typescript.mod.ModuleDeclaration
import typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeFlags
import typingsSlinky.typescript.mod.ObjectFlags
import typingsSlinky.typescript.mod.ObjectType
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.PropertyName
import typingsSlinky.typescript.mod.ScriptTarget
import typingsSlinky.typescript.mod.Signature
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.Statement
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.Symbol
import typingsSlinky.typescript.mod.SymbolFlags
import typingsSlinky.typescript.mod.SyntaxKind
import typingsSlinky.typescript.mod.SyntaxKind.AbstractKeyword
import typingsSlinky.typescript.mod.SyntaxKind.AsyncKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ConstKeyword
import typingsSlinky.typescript.mod.SyntaxKind.DeclareKeyword
import typingsSlinky.typescript.mod.SyntaxKind.DefaultKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ExportKeyword
import typingsSlinky.typescript.mod.SyntaxKind.PrivateKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ProtectedKeyword
import typingsSlinky.typescript.mod.SyntaxKind.PublicKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword
import typingsSlinky.typescript.mod.SyntaxKind.StaticKeyword
import typingsSlinky.typescript.mod.Token
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeChecker
import typingsSlinky.typescript.mod.TypeFlags
import typingsSlinky.typescript.mod.VariableDeclaration
import typingsSlinky.typescript.mod.VariableDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsutils", "AccessKind")
  @js.native
  object AccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.AccessKind with Double] = js.native
    
    /* 4 */ val Delete: typingsSlinky.tsutils.utilUtilMod.AccessKind.Delete with Double = js.native
    
    /* 6 */ val Modification: typingsSlinky.tsutils.utilUtilMod.AccessKind.Modification with Double = js.native
    
    /* 0 */ val None: typingsSlinky.tsutils.utilUtilMod.AccessKind.None with Double = js.native
    
    /* 1 */ val Read: typingsSlinky.tsutils.utilUtilMod.AccessKind.Read with Double = js.native
    
    /* 3 */ val ReadWrite: typingsSlinky.tsutils.utilUtilMod.AccessKind.ReadWrite with Double = js.native
    
    /* 2 */ val Write: typingsSlinky.tsutils.utilUtilMod.AccessKind.Write with Double = js.native
  }
  
  @JSImport("tsutils", "DeclarationDomain")
  @js.native
  object DeclarationDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.usageMod.DeclarationDomain with Double] = js.native
    
    /* 7 */ val Any: typingsSlinky.tsutils.usageMod.DeclarationDomain.Any with Double = js.native
    
    /* 8 */ val Import: typingsSlinky.tsutils.usageMod.DeclarationDomain.Import with Double = js.native
    
    /* 1 */ val Namespace: typingsSlinky.tsutils.usageMod.DeclarationDomain.Namespace with Double = js.native
    
    /* 2 */ val Type: typingsSlinky.tsutils.usageMod.DeclarationDomain.Type with Double = js.native
    
    /* 4 */ val Value: typingsSlinky.tsutils.usageMod.DeclarationDomain.Value with Double = js.native
  }
  
  @JSImport("tsutils", "ImportKind")
  @js.native
  object ImportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.ImportKind with Double] = js.native
    
    /* 63 */ val All: typingsSlinky.tsutils.utilUtilMod.ImportKind.All with Double = js.native
    
    /* 24 */ val AllImportExpressions: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllImportExpressions with Double = js.native
    
    /* 59 */ val AllImports: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllImports with Double = js.native
    
    /* 18 */ val AllRequireLike: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllRequireLike with Double = js.native
    
    /* 3 */ val AllStaticImports: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllStaticImports with Double = js.native
    
    /* 8 */ val DynamicImport: typingsSlinky.tsutils.utilUtilMod.ImportKind.DynamicImport with Double = js.native
    
    /* 4 */ val ExportFrom: typingsSlinky.tsutils.utilUtilMod.ImportKind.ExportFrom with Double = js.native
    
    /* 1 */ val ImportDeclaration: typingsSlinky.tsutils.utilUtilMod.ImportKind.ImportDeclaration with Double = js.native
    
    /* 2 */ val ImportEquals: typingsSlinky.tsutils.utilUtilMod.ImportKind.ImportEquals with Double = js.native
    
    /* 32 */ val ImportType: typingsSlinky.tsutils.utilUtilMod.ImportKind.ImportType with Double = js.native
    
    /* 16 */ val Require: typingsSlinky.tsutils.utilUtilMod.ImportKind.Require with Double = js.native
  }
  
  @JSImport("tsutils", "ScopeBoundary")
  @js.native
  object ScopeBoundary extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.ScopeBoundary with Double] = js.native
    
    /* 2 */ val Block: typingsSlinky.tsutils.utilUtilMod.ScopeBoundary.Block with Double = js.native
    
    /* 8 */ val ConditionalType: typingsSlinky.tsutils.utilUtilMod.ScopeBoundary.ConditionalType with Double = js.native
    
    /* 1 */ val Function: typingsSlinky.tsutils.utilUtilMod.ScopeBoundary.Function with Double = js.native
    
    /* 0 */ val None: typingsSlinky.tsutils.utilUtilMod.ScopeBoundary.None with Double = js.native
    
    /* 4 */ val Type: typingsSlinky.tsutils.utilUtilMod.ScopeBoundary.Type with Double = js.native
  }
  
  @JSImport("tsutils", "ScopeBoundarySelector")
  @js.native
  object ScopeBoundarySelector extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector with Double] = js.native
    
    /* 3 */ val Block: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.Block with Double = js.native
    
    /* 1 */ val Function: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.Function with Double = js.native
    
    /* 8 */ val InferType: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.InferType with Double = js.native
    
    /* 7 */ val Type: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.Type with Double = js.native
  }
  
  @JSImport("tsutils", "SideEffectOptions")
  @js.native
  object SideEffectOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.SideEffectOptions with Double] = js.native
    
    /* 2 */ val Constructor: typingsSlinky.tsutils.utilUtilMod.SideEffectOptions.Constructor with Double = js.native
    
    /* 4 */ val JsxElement: typingsSlinky.tsutils.utilUtilMod.SideEffectOptions.JsxElement with Double = js.native
    
    /* 0 */ val None: typingsSlinky.tsutils.utilUtilMod.SideEffectOptions.None with Double = js.native
    
    /* 1 */ val TaggedTemplate: typingsSlinky.tsutils.utilUtilMod.SideEffectOptions.TaggedTemplate with Double = js.native
  }
  
  @JSImport("tsutils", "UsageDomain")
  @js.native
  object UsageDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.usageMod.UsageDomain with Double] = js.native
    
    /* 7 */ val Any: typingsSlinky.tsutils.usageMod.UsageDomain.Any with Double = js.native
    
    /* 1 */ val Namespace: typingsSlinky.tsutils.usageMod.UsageDomain.Namespace with Double = js.native
    
    /* 2 */ val Type: typingsSlinky.tsutils.usageMod.UsageDomain.Type with Double = js.native
    
    /* 8 */ val TypeQuery: typingsSlinky.tsutils.usageMod.UsageDomain.TypeQuery with Double = js.native
    
    /* 4 */ val Value: typingsSlinky.tsutils.usageMod.UsageDomain.Value with Double = js.native
    
    /* 5 */ val ValueOrNamespace: typingsSlinky.tsutils.usageMod.UsageDomain.ValueOrNamespace with Double = js.native
  }
  
  @JSImport("tsutils", "VariableDeclarationKind")
  @js.native
  object VariableDeclarationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind with Double] = js.native
    
    /* 2 */ val Const: typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind.Const with Double = js.native
    
    /* 1 */ val Let: typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind.Let with Double = js.native
    
    /* 0 */ val Var: typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind.Var with Double = js.native
  }
  
  @JSImport("tsutils", "canHaveJsDoc")
  @js.native
  def canHaveJsDoc(node: Node): /* is typescript.typescript.HasJSDoc */ Boolean = js.native
  
  @JSImport("tsutils", "collectVariableUsage")
  @js.native
  def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
  
  @JSImport("tsutils", "commentText")
  @js.native
  def commentText(sourceText: String, comment: CommentRange): String = js.native
  
  @JSImport("tsutils", "convertAst")
  @js.native
  def convertAst(sourceFile: SourceFile): ConvertedAst = js.native
  
  @JSImport("tsutils", "endsControlFlow")
  @js.native
  def endsControlFlow(statement: BlockLike): Boolean = js.native
  @JSImport("tsutils", "endsControlFlow")
  @js.native
  def endsControlFlow(statement: Statement): Boolean = js.native
  
  @JSImport("tsutils", "findImportLikeNodes")
  @js.native
  def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind): js.Array[ImportLike] = js.native
  
  @JSImport("tsutils", "findImports")
  @js.native
  def findImports(sourceFile: SourceFile, kinds: ImportKind): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = js.native
  
  @JSImport("tsutils", "forEachComment")
  @js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = js.native
  @JSImport("tsutils", "forEachComment")
  @js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback, sourceFile: SourceFile): Unit = js.native
  
  @JSImport("tsutils", "forEachDeclaredVariable")
  @js.native
  def forEachDeclaredVariable[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with Name, T]
  ): js.UndefOr[T] = js.native
  
  @JSImport("tsutils", "forEachDestructuringIdentifier")
  @js.native
  def forEachDestructuringIdentifier[T](pattern: BindingPattern, fn: js.Function1[/* element */ BindingElementnameIdentif, T]): js.UndefOr[T] = js.native
  
  @JSImport("tsutils", "forEachToken")
  @js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = js.native
  @JSImport("tsutils", "forEachToken")
  @js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = js.native
  
  @JSImport("tsutils", "forEachTokenWithTrivia")
  @js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback): Unit = js.native
  @JSImport("tsutils", "forEachTokenWithTrivia")
  @js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback, sourceFile: SourceFile): Unit = js.native
  
  @JSImport("tsutils", "getAccessKind")
  @js.native
  def getAccessKind(node: Node): AccessKind = js.native
  
  @JSImport("tsutils", "getCallSignaturesOfType")
  @js.native
  def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = js.native
  
  @JSImport("tsutils", "getCheckJsDirective")
  @js.native
  def getCheckJsDirective(source: String): js.UndefOr[CheckJsDirective] = js.native
  
  @JSImport("tsutils", "getChildOfKind")
  @js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  @JSImport("tsutils", "getChildOfKind")
  @js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
  
  @JSImport("tsutils", "getCommentAtPosition")
  @js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  @JSImport("tsutils", "getCommentAtPosition")
  @js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
  
  @JSImport("tsutils", "getConstructorTypeOfClassLikeDeclaration")
  @js.native
  def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils", "getControlFlowEnd")
  @js.native
  def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = js.native
  @JSImport("tsutils", "getControlFlowEnd")
  @js.native
  def getControlFlowEnd(statement: Statement): ControlFlowEnd = js.native
  
  @JSImport("tsutils", "getDeclarationDomain")
  @js.native
  def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = js.native
  
  @JSImport("tsutils", "getDeclarationOfBindingElement")
  @js.native
  def getDeclarationOfBindingElement(node: BindingElement): VariableDeclaration | ParameterDeclaration = js.native
  
  @JSImport("tsutils", "getIIFE")
  @js.native
  def getIIFE(func: ArrowFunction): js.UndefOr[CallExpression] = js.native
  @JSImport("tsutils", "getIIFE")
  @js.native
  def getIIFE(func: FunctionExpression): js.UndefOr[CallExpression] = js.native
  
  @JSImport("tsutils", "getInstanceTypeOfClassLikeDeclaration")
  @js.native
  def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils", "getIteratorYieldResultFromIteratorResult")
  @js.native
  def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = js.native
  
  @JSImport("tsutils", "getJsDoc")
  @js.native
  def getJsDoc(node: Node): js.Array[JSDoc] = js.native
  @JSImport("tsutils", "getJsDoc")
  @js.native
  def getJsDoc(node: Node, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  
  @JSImport("tsutils", "getLateBoundPropertyNames")
  @js.native
  def getLateBoundPropertyNames(node: Expression, checker: TypeChecker): LateBoundPropertyNames = js.native
  
  @JSImport("tsutils", "getLateBoundPropertyNamesOfPropertyName")
  @js.native
  def getLateBoundPropertyNamesOfPropertyName(node: PropertyName, checker: TypeChecker): LateBoundPropertyNames = js.native
  
  @JSImport("tsutils", "getLineBreakStyle")
  @js.native
  def getLineBreakStyle(sourceFile: SourceFile): Linefeed | CarriagereturnLinefeed = js.native
  
  @JSImport("tsutils", "getLineRanges")
  @js.native
  def getLineRanges(sourceFile: SourceFile): js.Array[LineRange] = js.native
  
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: AbstractKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: AsyncKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ConstKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: DeclareKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: DefaultKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ExportKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: PrivateKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ProtectedKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: PublicKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: ReadonlyKeyword): js.UndefOr[Modifier] = js.native
  @JSImport("tsutils", "getModifier")
  @js.native
  def getModifier(node: Node, kind: StaticKeyword): js.UndefOr[Modifier] = js.native
  
  @JSImport("tsutils", "getNextStatement")
  @js.native
  def getNextStatement(statement: Statement): js.UndefOr[Statement] = js.native
  
  @JSImport("tsutils", "getNextToken")
  @js.native
  def getNextToken(node: Node): js.UndefOr[Node] = js.native
  @JSImport("tsutils", "getNextToken")
  @js.native
  def getNextToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  @JSImport("tsutils", "getPreviousStatement")
  @js.native
  def getPreviousStatement(statement: Statement): js.UndefOr[Statement] = js.native
  
  @JSImport("tsutils", "getPreviousToken")
  @js.native
  def getPreviousToken(node: Node): js.UndefOr[Node] = js.native
  @JSImport("tsutils", "getPreviousToken")
  @js.native
  def getPreviousToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  @JSImport("tsutils", "getPropertyName")
  @js.native
  def getPropertyName(propertyName: PropertyName): js.UndefOr[String] = js.native
  
  @JSImport("tsutils", "getPropertyNameFromType")
  @js.native
  def getPropertyNameFromType(`type`: Type): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.PropertyName] = js.native
  
  @JSImport("tsutils", "getPropertyNameOfWellKnownSymbol")
  @js.native
  def getPropertyNameOfWellKnownSymbol(node: WellKnownSymbolLiteral): typingsSlinky.tsutils.utilUtilMod.PropertyName = js.native
  
  @JSImport("tsutils", "getPropertyOfType")
  @js.native
  def getPropertyOfType(`type`: Type, name: typingsSlinky.typescript.mod.String): js.UndefOr[Symbol] = js.native
  
  @JSImport("tsutils", "getSingleLateBoundPropertyNameOfPropertyName")
  @js.native
  def getSingleLateBoundPropertyNameOfPropertyName(node: PropertyName, checker: TypeChecker): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.PropertyName] = js.native
  
  @JSImport("tsutils", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double): js.UndefOr[Node] = js.native
  @JSImport("tsutils", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: js.UndefOr[scala.Nothing], allowJsDoc: Boolean): js.UndefOr[Node] = js.native
  @JSImport("tsutils", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  @JSImport("tsutils", "getTokenAtPosition")
  @js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile, allowJsDoc: Boolean): js.UndefOr[Node] = js.native
  
  @JSImport("tsutils", "getUsageDomain")
  @js.native
  def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = js.native
  
  @JSImport("tsutils", "getVariableDeclarationKind")
  @js.native
  def getVariableDeclarationKind(declarationList: VariableDeclarationList): VariableDeclarationKind = js.native
  
  @JSImport("tsutils", "getWrappedNodeAtPosition")
  @js.native
  def getWrappedNodeAtPosition(wrap: NodeWrap, pos: Double): js.UndefOr[NodeWrap] = js.native
  
  @JSImport("tsutils", "hasAccessModifier")
  @js.native
  def hasAccessModifier(node: ClassElement): Boolean = js.native
  @JSImport("tsutils", "hasAccessModifier")
  @js.native
  def hasAccessModifier(node: ParameterDeclaration): Boolean = js.native
  
  @JSImport("tsutils", "hasModifier")
  @js.native
  def hasModifier(
    modifiers: js.UndefOr[scala.Nothing],
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = js.native
  @JSImport("tsutils", "hasModifier")
  @js.native
  def hasModifier(
    modifiers: ModifiersArray,
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = js.native
  
  @JSImport("tsutils", "hasOwnThisReference")
  @js.native
  def hasOwnThisReference(node: Node): Boolean = js.native
  
  @JSImport("tsutils", "hasSideEffects")
  @js.native
  def hasSideEffects(node: Expression): Boolean = js.native
  @JSImport("tsutils", "hasSideEffects")
  @js.native
  def hasSideEffects(node: Expression, options: SideEffectOptions): Boolean = js.native
  
  @JSImport("tsutils", "intersectionTypeParts")
  @js.native
  def intersectionTypeParts(`type`: Type): js.Array[Type] = js.native
  
  @JSImport("tsutils", "isAccessorDeclaration")
  @js.native
  def isAccessorDeclaration(node: Node): /* is typescript.typescript.AccessorDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isAmbientModule")
  @js.native
  def isAmbientModule(node: ModuleDeclaration): Boolean = js.native
  
  @JSImport("tsutils", "isAmbientModuleBlock")
  @js.native
  def isAmbientModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
  
  @JSImport("tsutils", "isArrayBindingPattern")
  @js.native
  def isArrayBindingPattern(node: Node): /* is typescript.typescript.ArrayBindingPattern */ Boolean = js.native
  
  @JSImport("tsutils", "isArrayLiteralExpression")
  @js.native
  def isArrayLiteralExpression(node: Node): /* is typescript.typescript.ArrayLiteralExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isArrayTypeNode")
  @js.native
  def isArrayTypeNode(node: Node): /* is typescript.typescript.ArrayTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isArrowFunction")
  @js.native
  def isArrowFunction(node: Node): /* is typescript.typescript.ArrowFunction */ Boolean = js.native
  
  @JSImport("tsutils", "isAsExpression")
  @js.native
  def isAsExpression(node: Node): /* is typescript.typescript.AsExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isAssertionExpression")
  @js.native
  def isAssertionExpression(node: Node): /* is typescript.typescript.AssertionExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isAssignmentKind")
  @js.native
  def isAssignmentKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils", "isAwaitExpression")
  @js.native
  def isAwaitExpression(node: Node): /* is typescript.typescript.AwaitExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isBigIntLiteral")
  @js.native
  def isBigIntLiteral(node: Node): /* is typescript.typescript.BigIntLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isBinaryExpression")
  @js.native
  def isBinaryExpression(node: Node): /* is typescript.typescript.BinaryExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isBindableObjectDefinePropertyCall")
  @js.native
  def isBindableObjectDefinePropertyCall(node: CallExpression): Boolean = js.native
  
  @JSImport("tsutils", "isBindingElement")
  @js.native
  def isBindingElement(node: Node): /* is typescript.typescript.BindingElement */ Boolean = js.native
  
  @JSImport("tsutils", "isBindingPattern")
  @js.native
  def isBindingPattern(node: Node): /* is typescript.typescript.BindingPattern */ Boolean = js.native
  
  @JSImport("tsutils", "isBlock")
  @js.native
  def isBlock(node: Node): /* is typescript.typescript.Block */ Boolean = js.native
  
  @JSImport("tsutils", "isBlockLike")
  @js.native
  def isBlockLike(node: Node): /* is typescript.typescript.BlockLike */ Boolean = js.native
  
  @JSImport("tsutils", "isBlockScopeBoundary")
  @js.native
  def isBlockScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils", "isBlockScopedDeclarationStatement")
  @js.native
  def isBlockScopedDeclarationStatement(statement: Statement): /* is typescript.typescript.DeclarationStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isBlockScopedVariableDeclaration")
  @js.native
  def isBlockScopedVariableDeclaration(declaration: VariableDeclaration): Boolean = js.native
  
  @JSImport("tsutils", "isBlockScopedVariableDeclarationList")
  @js.native
  def isBlockScopedVariableDeclarationList(declarationList: VariableDeclarationList): Boolean = js.native
  
  @JSImport("tsutils", "isBooleanLiteral")
  @js.native
  def isBooleanLiteral(node: Node): /* is typescript.typescript.BooleanLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isBooleanLiteralType")
  @js.native
  def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = js.native
  
  @JSImport("tsutils", "isBreakOrContinueStatement")
  @js.native
  def isBreakOrContinueStatement(node: Node): /* is typescript.typescript.BreakOrContinueStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isBreakStatement")
  @js.native
  def isBreakStatement(node: Node): /* is typescript.typescript.BreakStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isCallExpression")
  @js.native
  def isCallExpression(node: Node): /* is typescript.typescript.CallExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isCallLikeExpression")
  @js.native
  def isCallLikeExpression(node: Node): /* is typescript.typescript.CallLikeExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isCallSignatureDeclaration")
  @js.native
  def isCallSignatureDeclaration(node: Node): /* is typescript.typescript.CallSignatureDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isCaseBlock")
  @js.native
  def isCaseBlock(node: Node): /* is typescript.typescript.CaseBlock */ Boolean = js.native
  
  @JSImport("tsutils", "isCaseClause")
  @js.native
  def isCaseClause(node: Node): /* is typescript.typescript.CaseClause */ Boolean = js.native
  
  @JSImport("tsutils", "isCaseOrDefaultClause")
  @js.native
  def isCaseOrDefaultClause(node: Node): /* is typescript.typescript.CaseOrDefaultClause */ Boolean = js.native
  
  @JSImport("tsutils", "isCatchClause")
  @js.native
  def isCatchClause(node: Node): /* is typescript.typescript.CatchClause */ Boolean = js.native
  
  @JSImport("tsutils", "isClassDeclaration")
  @js.native
  def isClassDeclaration(node: Node): /* is typescript.typescript.ClassDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isClassExpression")
  @js.native
  def isClassExpression(node: Node): /* is typescript.typescript.ClassExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isClassLikeDeclaration")
  @js.native
  def isClassLikeDeclaration(node: Node): /* is typescript.typescript.ClassLikeDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isCommaListExpression")
  @js.native
  def isCommaListExpression(node: Node): /* is typescript.typescript.CommaListExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isCompilerOptionEnabled")
  @js.native
  def isCompilerOptionEnabled(options: CompilerOptions, option: BooleanCompilerOptions): Boolean = js.native
  @JSImport("tsutils", "isCompilerOptionEnabled")
  @js.native
  def isCompilerOptionEnabled_stripInternal(options: CompilerOptions, option: stripInternal): Boolean = js.native
  
  @JSImport("tsutils", "isComputedPropertyName")
  @js.native
  def isComputedPropertyName(node: Node): /* is typescript.typescript.ComputedPropertyName */ Boolean = js.native
  
  @JSImport("tsutils", "isConditionalExpression")
  @js.native
  def isConditionalExpression(node: Node): /* is typescript.typescript.ConditionalExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isConditionalType")
  @js.native
  def isConditionalType(`type`: Type): /* is typescript.typescript.ConditionalType */ Boolean = js.native
  
  @JSImport("tsutils", "isConditionalTypeNode")
  @js.native
  def isConditionalTypeNode(node: Node): /* is typescript.typescript.ConditionalTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isConstAssertion")
  @js.native
  def isConstAssertion(node: AssertionExpression): Boolean = js.native
  
  @JSImport("tsutils", "isConstructSignatureDeclaration")
  @js.native
  def isConstructSignatureDeclaration(node: Node): /* is typescript.typescript.ConstructSignatureDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isConstructorDeclaration")
  @js.native
  def isConstructorDeclaration(node: Node): /* is typescript.typescript.ConstructorDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isConstructorTypeNode")
  @js.native
  def isConstructorTypeNode(node: Node): /* is typescript.typescript.ConstructorTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isContinueStatement")
  @js.native
  def isContinueStatement(node: Node): /* is typescript.typescript.ContinueStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isDebuggerStatement")
  @js.native
  def isDebuggerStatement(node: Node): /* is typescript.typescript.DebuggerStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isDecorator")
  @js.native
  def isDecorator(node: Node): /* is typescript.typescript.Decorator */ Boolean = js.native
  
  @JSImport("tsutils", "isDefaultClause")
  @js.native
  def isDefaultClause(node: Node): /* is typescript.typescript.DefaultClause */ Boolean = js.native
  
  @JSImport("tsutils", "isDeleteExpression")
  @js.native
  def isDeleteExpression(node: Node): /* is typescript.typescript.DeleteExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isDoStatement")
  @js.native
  def isDoStatement(node: Node): /* is typescript.typescript.DoStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isElementAccessExpression")
  @js.native
  def isElementAccessExpression(node: Node): /* is typescript.typescript.ElementAccessExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isEmptyObjectType")
  @js.native
  def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  
  @JSImport("tsutils", "isEmptyStatement")
  @js.native
  def isEmptyStatement(node: Node): /* is typescript.typescript.EmptyStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isEntityName")
  @js.native
  def isEntityName(node: Node): /* is typescript.typescript.EntityName */ Boolean = js.native
  
  @JSImport("tsutils", "isEntityNameExpression")
  @js.native
  def isEntityNameExpression(node: Node): /* is typescript.typescript.EntityNameExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isEnumDeclaration")
  @js.native
  def isEnumDeclaration(node: Node): /* is typescript.typescript.EnumDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isEnumMember")
  @js.native
  def isEnumMember(node: Node): /* is typescript.typescript.EnumMember */ Boolean = js.native
  
  @JSImport("tsutils", "isEnumType")
  @js.native
  def isEnumType(`type`: Type): /* is typescript.typescript.EnumType */ Boolean = js.native
  
  @JSImport("tsutils", "isExportAssignment")
  @js.native
  def isExportAssignment(node: Node): /* is typescript.typescript.ExportAssignment */ Boolean = js.native
  
  @JSImport("tsutils", "isExportDeclaration")
  @js.native
  def isExportDeclaration(node: Node): /* is typescript.typescript.ExportDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isExportSpecifier")
  @js.native
  def isExportSpecifier(node: Node): /* is typescript.typescript.ExportSpecifier */ Boolean = js.native
  
  @JSImport("tsutils", "isExpression")
  @js.native
  def isExpression(node: Node): /* is typescript.typescript.Expression */ Boolean = js.native
  
  @JSImport("tsutils", "isExpressionStatement")
  @js.native
  def isExpressionStatement(node: Node): /* is typescript.typescript.ExpressionStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isExpressionValueUsed")
  @js.native
  def isExpressionValueUsed(node: Expression): Boolean = js.native
  
  @JSImport("tsutils", "isExpressionWithTypeArguments")
  @js.native
  def isExpressionWithTypeArguments(node: Node): /* is typescript.typescript.ExpressionWithTypeArguments */ Boolean = js.native
  
  @JSImport("tsutils", "isExternalModuleReference")
  @js.native
  def isExternalModuleReference(node: Node): /* is typescript.typescript.ExternalModuleReference */ Boolean = js.native
  
  @JSImport("tsutils", "isFalsyType")
  @js.native
  def isFalsyType(`type`: Type): Boolean = js.native
  
  @JSImport("tsutils", "isForInOrOfStatement")
  @js.native
  def isForInOrOfStatement(node: Node): /* is typescript.typescript.ForInOrOfStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isForInStatement")
  @js.native
  def isForInStatement(node: Node): /* is typescript.typescript.ForInStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isForOfStatement")
  @js.native
  def isForOfStatement(node: Node): /* is typescript.typescript.ForOfStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isForStatement")
  @js.native
  def isForStatement(node: Node): /* is typescript.typescript.ForStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isFunctionDeclaration")
  @js.native
  def isFunctionDeclaration(node: Node): /* is typescript.typescript.FunctionDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isFunctionExpression")
  @js.native
  def isFunctionExpression(node: Node): /* is typescript.typescript.FunctionExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isFunctionScopeBoundary")
  @js.native
  def isFunctionScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils", "isFunctionTypeNode")
  @js.native
  def isFunctionTypeNode(node: Node): /* is typescript.typescript.FunctionTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isFunctionWithBody")
  @js.native
  def isFunctionWithBody(node: Node): Boolean = js.native
  
  @JSImport("tsutils", "isGenericType")
  @js.native
  def isGenericType(`type`: Type): /* is typescript.typescript.GenericType */ Boolean = js.native
  
  @JSImport("tsutils", "isGetAccessorDeclaration")
  @js.native
  def isGetAccessorDeclaration(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isIdentifier")
  @js.native
  def isIdentifier(node: Node): /* is typescript.typescript.Identifier */ Boolean = js.native
  
  @JSImport("tsutils", "isIfStatement")
  @js.native
  def isIfStatement(node: Node): /* is typescript.typescript.IfStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isImportClause")
  @js.native
  def isImportClause(node: Node): /* is typescript.typescript.ImportClause */ Boolean = js.native
  
  @JSImport("tsutils", "isImportDeclaration")
  @js.native
  def isImportDeclaration(node: Node): /* is typescript.typescript.ImportDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isImportEqualsDeclaration")
  @js.native
  def isImportEqualsDeclaration(node: Node): /* is typescript.typescript.ImportEqualsDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isImportSpecifier")
  @js.native
  def isImportSpecifier(node: Node): /* is typescript.typescript.ImportSpecifier */ Boolean = js.native
  
  @JSImport("tsutils", "isImportTypeNode")
  @js.native
  def isImportTypeNode(node: Node): /* is typescript.typescript.ImportTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isInConstContext")
  @js.native
  def isInConstContext(node: Expression): Boolean = js.native
  
  @JSImport("tsutils", "isInSingleStatementContext")
  @js.native
  def isInSingleStatementContext(statement: Statement): Boolean = js.native
  
  @JSImport("tsutils", "isIndexSignatureDeclaration")
  @js.native
  def isIndexSignatureDeclaration(node: Node): /* is typescript.typescript.IndexSignatureDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isIndexedAccessType")
  @js.native
  def isIndexedAccessType(`type`: Type): /* is typescript.typescript.IndexedAccessType */ Boolean = js.native
  
  @JSImport("tsutils", "isIndexedAccessTypeNode")
  @js.native
  def isIndexedAccessTypeNode(node: Node): /* is typescript.typescript.IndexedAccessTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isIndexedAccessype")
  @js.native
  def isIndexedAccessype(`type`: Type): /* is typescript.typescript.IndexType */ Boolean = js.native
  
  @JSImport("tsutils", "isInferTypeNode")
  @js.native
  def isInferTypeNode(node: Node): /* is typescript.typescript.InferTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isInstantiableType")
  @js.native
  def isInstantiableType(`type`: Type): /* is typescript.typescript.InstantiableType */ Boolean = js.native
  
  @JSImport("tsutils", "isInterfaceDeclaration")
  @js.native
  def isInterfaceDeclaration(node: Node): /* is typescript.typescript.InterfaceDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isInterfaceType")
  @js.native
  def isInterfaceType(`type`: Type): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  
  @JSImport("tsutils", "isIntersectionType")
  @js.native
  def isIntersectionType(`type`: Type): /* is typescript.typescript.IntersectionType */ Boolean = js.native
  
  @JSImport("tsutils", "isIntersectionTypeNode")
  @js.native
  def isIntersectionTypeNode(node: Node): /* is typescript.typescript.IntersectionTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isIterationStatement")
  @js.native
  def isIterationStatement(node: Node): /* is typescript.typescript.IterationStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isJsDoc")
  @js.native
  def isJsDoc(node: Node): /* is typescript.typescript.JSDoc */ Boolean = js.native
  
  @JSImport("tsutils", "isJsDocKind")
  @js.native
  def isJsDocKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils", "isJsxAttribute")
  @js.native
  def isJsxAttribute(node: Node): /* is typescript.typescript.JsxAttribute */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxAttributeLike")
  @js.native
  def isJsxAttributeLike(node: Node): /* is typescript.typescript.JsxAttributeLike */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxAttributes")
  @js.native
  def isJsxAttributes(node: Node): /* is typescript.typescript.JsxAttributes */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxClosingElement")
  @js.native
  def isJsxClosingElement(node: Node): /* is typescript.typescript.JsxClosingElement */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxClosingFragment")
  @js.native
  def isJsxClosingFragment(node: Node): /* is typescript.typescript.JsxClosingFragment */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxElement")
  @js.native
  def isJsxElement(node: Node): /* is typescript.typescript.JsxElement */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxExpression")
  @js.native
  def isJsxExpression(node: Node): /* is typescript.typescript.JsxExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxFragment")
  @js.native
  def isJsxFragment(node: Node): /* is typescript.typescript.JsxFragment */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxOpeningElement")
  @js.native
  def isJsxOpeningElement(node: Node): /* is typescript.typescript.JsxOpeningElement */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxOpeningFragment")
  @js.native
  def isJsxOpeningFragment(node: Node): /* is typescript.typescript.JsxOpeningFragment */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxOpeningLikeElement")
  @js.native
  def isJsxOpeningLikeElement(node: Node): /* is typescript.typescript.JsxOpeningLikeElement */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxSelfClosingElement")
  @js.native
  def isJsxSelfClosingElement(node: Node): /* is typescript.typescript.JsxSelfClosingElement */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxSpreadAttribute")
  @js.native
  def isJsxSpreadAttribute(node: Node): /* is typescript.typescript.JsxSpreadAttribute */ Boolean = js.native
  
  @JSImport("tsutils", "isJsxText")
  @js.native
  def isJsxText(node: Node): /* is typescript.typescript.JsxText */ Boolean = js.native
  
  @JSImport("tsutils", "isKeywordKind")
  @js.native
  def isKeywordKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils", "isLabeledStatement")
  @js.native
  def isLabeledStatement(node: Node): /* is typescript.typescript.LabeledStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isLiteralExpression")
  @js.native
  def isLiteralExpression(node: Node): /* is typescript.typescript.LiteralExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isLiteralType")
  @js.native
  def isLiteralType(`type`: Type): /* is typescript.typescript.LiteralType */ Boolean = js.native
  
  @JSImport("tsutils", "isLiteralTypeNode")
  @js.native
  def isLiteralTypeNode(node: Node): /* is typescript.typescript.LiteralTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isMappedTypeNode")
  @js.native
  def isMappedTypeNode(node: Node): /* is typescript.typescript.MappedTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isMetaProperty")
  @js.native
  def isMetaProperty(node: Node): /* is typescript.typescript.MetaProperty */ Boolean = js.native
  
  @JSImport("tsutils", "isMethodDeclaration")
  @js.native
  def isMethodDeclaration(node: Node): /* is typescript.typescript.MethodDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isMethodSignature")
  @js.native
  def isMethodSignature(node: Node): /* is typescript.typescript.MethodSignature */ Boolean = js.native
  
  @JSImport("tsutils", "isModifierFlagSet")
  @js.native
  def isModifierFlagSet(node: Node, flag: ModifierFlags): Boolean = js.native
  
  @JSImport("tsutils", "isModuleBlock")
  @js.native
  def isModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
  
  @JSImport("tsutils", "isModuleDeclaration")
  @js.native
  def isModuleDeclaration(node: Node): /* is typescript.typescript.ModuleDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isNamedExports")
  @js.native
  def isNamedExports(node: Node): /* is typescript.typescript.NamedExports */ Boolean = js.native
  
  @JSImport("tsutils", "isNamedImports")
  @js.native
  def isNamedImports(node: Node): /* is typescript.typescript.NamedImports */ Boolean = js.native
  
  @JSImport("tsutils", "isNamespaceDeclaration")
  @js.native
  def isNamespaceDeclaration(node: Node): /* is typescript.typescript.NamespaceDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isNamespaceExportDeclaration")
  @js.native
  def isNamespaceExportDeclaration(node: Node): /* is typescript.typescript.NamespaceExportDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isNamespaceImport")
  @js.native
  def isNamespaceImport(node: Node): /* is typescript.typescript.NamespaceImport */ Boolean = js.native
  
  @JSImport("tsutils", "isNewExpression")
  @js.native
  def isNewExpression(node: Node): /* is typescript.typescript.NewExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isNoSubstitutionTemplateLiteral")
  @js.native
  def isNoSubstitutionTemplateLiteral(node: Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isNodeFlagSet")
  @js.native
  def isNodeFlagSet(node: Node, flag: NodeFlags): Boolean = js.native
  
  @JSImport("tsutils", "isNodeKind")
  @js.native
  def isNodeKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils", "isNonNullExpression")
  @js.native
  def isNonNullExpression(node: Node): /* is typescript.typescript.NonNullExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isNullLiteral")
  @js.native
  def isNullLiteral(node: Node): /* is typescript.typescript.NullLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isNumericLiteral")
  @js.native
  def isNumericLiteral(node: Node): /* is typescript.typescript.NumericLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isNumericOrStringLikeLiteral")
  @js.native
  def isNumericOrStringLikeLiteral(node: Node): Boolean = js.native
  
  @JSImport("tsutils", "isNumericPropertyName")
  @js.native
  def isNumericPropertyName(name: String): Boolean = js.native
  @JSImport("tsutils", "isNumericPropertyName")
  @js.native
  def isNumericPropertyName(name: typingsSlinky.typescript.mod.String): Boolean = js.native
  
  @JSImport("tsutils", "isObjectBindingPattern")
  @js.native
  def isObjectBindingPattern(node: Node): /* is typescript.typescript.ObjectBindingPattern */ Boolean = js.native
  
  @JSImport("tsutils", "isObjectFlagSet")
  @js.native
  def isObjectFlagSet(objectType: ObjectType, flag: ObjectFlags): Boolean = js.native
  
  @JSImport("tsutils", "isObjectLiteralExpression")
  @js.native
  def isObjectLiteralExpression(node: Node): /* is typescript.typescript.ObjectLiteralExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isObjectType")
  @js.native
  def isObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  
  @JSImport("tsutils", "isOmittedExpression")
  @js.native
  def isOmittedExpression(node: Node): /* is typescript.typescript.OmittedExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isOptionalTypeNode")
  @js.native
  def isOptionalTypeNode(node: Node): /* is typescript.typescript.OptionalTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isParameterDeclaration")
  @js.native
  def isParameterDeclaration(node: Node): /* is typescript.typescript.ParameterDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isParameterProperty")
  @js.native
  def isParameterProperty(node: ParameterDeclaration): Boolean = js.native
  
  @JSImport("tsutils", "isParenthesizedExpression")
  @js.native
  def isParenthesizedExpression(node: Node): /* is typescript.typescript.ParenthesizedExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isParenthesizedTypeNode")
  @js.native
  def isParenthesizedTypeNode(node: Node): /* is typescript.typescript.ParenthesizedTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isPositionInComment")
  @js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double): Boolean = js.native
  @JSImport("tsutils", "isPositionInComment")
  @js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = js.native
  
  @JSImport("tsutils", "isPostfixUnaryExpression")
  @js.native
  def isPostfixUnaryExpression(node: Node): /* is typescript.typescript.PostfixUnaryExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isPrefixUnaryExpression")
  @js.native
  def isPrefixUnaryExpression(node: Node): /* is typescript.typescript.PrefixUnaryExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isPropertyAccessExpression")
  @js.native
  def isPropertyAccessExpression(node: Node): /* is typescript.typescript.PropertyAccessExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isPropertyAssignment")
  @js.native
  def isPropertyAssignment(node: Node): /* is typescript.typescript.PropertyAssignment */ Boolean = js.native
  
  @JSImport("tsutils", "isPropertyDeclaration")
  @js.native
  def isPropertyDeclaration(node: Node): /* is typescript.typescript.PropertyDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isPropertyReadonlyInType")
  @js.native
  def isPropertyReadonlyInType(`type`: Type, name: typingsSlinky.typescript.mod.String, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils", "isPropertySignature")
  @js.native
  def isPropertySignature(node: Node): /* is typescript.typescript.PropertySignature */ Boolean = js.native
  
  @JSImport("tsutils", "isQualifiedName")
  @js.native
  def isQualifiedName(node: Node): /* is typescript.typescript.QualifiedName */ Boolean = js.native
  
  @JSImport("tsutils", "isReadonlyAssignmentDeclaration")
  @js.native
  def isReadonlyAssignmentDeclaration(node: CallExpression, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils", "isReassignmentTarget")
  @js.native
  def isReassignmentTarget(node: Expression): Boolean = js.native
  
  @JSImport("tsutils", "isRegularExpressionLiteral")
  @js.native
  def isRegularExpressionLiteral(node: Node): /* is typescript.typescript.RegularExpressionLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isRestTypeNode")
  @js.native
  def isRestTypeNode(node: Node): /* is typescript.typescript.RestTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isReturnStatement")
  @js.native
  def isReturnStatement(node: Node): /* is typescript.typescript.ReturnStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isSameLine")
  @js.native
  def isSameLine(sourceFile: SourceFile, pos1: Double, pos2: Double): Boolean = js.native
  
  @JSImport("tsutils", "isScopeBoundary")
  @js.native
  def isScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils", "isSetAccessorDeclaration")
  @js.native
  def isSetAccessorDeclaration(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isShorthandPropertyAssignment")
  @js.native
  def isShorthandPropertyAssignment(node: Node): /* is typescript.typescript.ShorthandPropertyAssignment */ Boolean = js.native
  
  @JSImport("tsutils", "isSignatureDeclaration")
  @js.native
  def isSignatureDeclaration(node: Node): /* is typescript.typescript.SignatureDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isSourceFile")
  @js.native
  def isSourceFile(node: Node): /* is typescript.typescript.SourceFile */ Boolean = js.native
  
  @JSImport("tsutils", "isSpreadAssignment")
  @js.native
  def isSpreadAssignment(node: Node): /* is typescript.typescript.SpreadAssignment */ Boolean = js.native
  
  @JSImport("tsutils", "isSpreadElement")
  @js.native
  def isSpreadElement(node: Node): /* is typescript.typescript.SpreadElement */ Boolean = js.native
  
  @JSImport("tsutils", "isStatementInAmbientContext")
  @js.native
  def isStatementInAmbientContext(node: Statement): Boolean = js.native
  
  @JSImport("tsutils", "isStrictCompilerOptionEnabled")
  @js.native
  def isStrictCompilerOptionEnabled(options: CompilerOptions, option: StrictCompilerOption): Boolean = js.native
  
  @JSImport("tsutils", "isStringLiteral")
  @js.native
  def isStringLiteral(node: Node): /* is typescript.typescript.StringLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isSubstitutionType")
  @js.native
  def isSubstitutionType(`type`: Type): /* is typescript.typescript.SubstitutionType */ Boolean = js.native
  
  @JSImport("tsutils", "isSwitchStatement")
  @js.native
  def isSwitchStatement(node: Node): /* is typescript.typescript.SwitchStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isSymbolFlagSet")
  @js.native
  def isSymbolFlagSet(symbol: Symbol, flag: SymbolFlags): Boolean = js.native
  
  @JSImport("tsutils", "isSyntaxList")
  @js.native
  def isSyntaxList(node: Node): /* is typescript.typescript.SyntaxList */ Boolean = js.native
  
  @JSImport("tsutils", "isSyntheticExpression")
  @js.native
  def isSyntheticExpression(node: Node): /* is typescript.typescript.SyntheticExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isTaggedTemplateExpression")
  @js.native
  def isTaggedTemplateExpression(node: Node): /* is typescript.typescript.TaggedTemplateExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isTemplateExpression")
  @js.native
  def isTemplateExpression(node: Node): /* is typescript.typescript.TemplateExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isTemplateLiteral")
  @js.native
  def isTemplateLiteral(node: Node): /* is typescript.typescript.TemplateLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isTextualLiteral")
  @js.native
  def isTextualLiteral(node: Node): Boolean = js.native
  
  @JSImport("tsutils", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Expression): Boolean = js.native
  @JSImport("tsutils", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = js.native
  @JSImport("tsutils", "isThenableType")
  @js.native
  def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils", "isThisParameter")
  @js.native
  def isThisParameter(parameter: ParameterDeclaration): Boolean = js.native
  
  @JSImport("tsutils", "isThrowStatement")
  @js.native
  def isThrowStatement(node: Node): /* is typescript.typescript.ThrowStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isTokenKind")
  @js.native
  def isTokenKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils", "isTryStatement")
  @js.native
  def isTryStatement(node: Node): /* is typescript.typescript.TryStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isTupleType")
  @js.native
  def isTupleType(`type`: Type): /* is typescript.typescript.TupleType */ Boolean = js.native
  
  @JSImport("tsutils", "isTupleTypeNode")
  @js.native
  def isTupleTypeNode(node: Node): /* is typescript.typescript.TupleTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isTupleTypeReference")
  @js.native
  def isTupleTypeReference(`type`: Type): /* is tsutils.anon.TypeReferencetargetTupleT */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeAliasDeclaration")
  @js.native
  def isTypeAliasDeclaration(node: Node): /* is typescript.typescript.TypeAliasDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeAssertion")
  @js.native
  def isTypeAssertion(node: Node): /* is typescript.typescript.TypeAssertion */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeAssignableToNumber")
  @js.native
  def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils", "isTypeAssignableToString")
  @js.native
  def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = js.native
  
  @JSImport("tsutils", "isTypeFlagSet")
  @js.native
  def isTypeFlagSet(`type`: Type, flag: TypeFlags): Boolean = js.native
  
  @JSImport("tsutils", "isTypeLiteralNode")
  @js.native
  def isTypeLiteralNode(node: Node): /* is typescript.typescript.TypeLiteralNode */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeNodeKind")
  @js.native
  def isTypeNodeKind(kind: SyntaxKind): Boolean = js.native
  
  @JSImport("tsutils", "isTypeOfExpression")
  @js.native
  def isTypeOfExpression(node: Node): /* is typescript.typescript.TypeOfExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeOperatorNode")
  @js.native
  def isTypeOperatorNode(node: Node): /* is typescript.typescript.TypeOperatorNode */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeParameter")
  @js.native
  def isTypeParameter(`type`: Type): /* is typescript.typescript.TypeParameter */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeParameterDeclaration")
  @js.native
  def isTypeParameterDeclaration(node: Node): /* is typescript.typescript.TypeParameterDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isTypePredicateNode")
  @js.native
  def isTypePredicateNode(node: Node): /* is typescript.typescript.TypePredicateNode */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeQueryNode")
  @js.native
  def isTypeQueryNode(node: Node): /* is typescript.typescript.TypeQueryNode */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeReference")
  @js.native
  def isTypeReference(`type`: Type): /* is typescript.typescript.TypeReference */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeReferenceNode")
  @js.native
  def isTypeReferenceNode(node: Node): /* is typescript.typescript.TypeReferenceNode */ Boolean = js.native
  
  @JSImport("tsutils", "isTypeScopeBoundary")
  @js.native
  def isTypeScopeBoundary(node: Node): ScopeBoundary = js.native
  
  @JSImport("tsutils", "isTypeVariable")
  @js.native
  def isTypeVariable(`type`: Type): Boolean = js.native
  
  @JSImport("tsutils", "isUnionOrIntersectionType")
  @js.native
  def isUnionOrIntersectionType(`type`: Type): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = js.native
  
  @JSImport("tsutils", "isUnionType")
  @js.native
  def isUnionType(`type`: Type): /* is typescript.typescript.UnionType */ Boolean = js.native
  
  @JSImport("tsutils", "isUnionTypeNode")
  @js.native
  def isUnionTypeNode(node: Node): /* is typescript.typescript.UnionTypeNode */ Boolean = js.native
  
  @JSImport("tsutils", "isUniqueESSymbolType")
  @js.native
  def isUniqueESSymbolType(`type`: Type): /* is typescript.typescript.UniqueESSymbolType */ Boolean = js.native
  
  @JSImport("tsutils", "isValidIdentifier")
  @js.native
  def isValidIdentifier(text: String): Boolean = js.native
  @JSImport("tsutils", "isValidIdentifier")
  @js.native
  def isValidIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils", "isValidJsxIdentifier")
  @js.native
  def isValidJsxIdentifier(text: String): Boolean = js.native
  @JSImport("tsutils", "isValidJsxIdentifier")
  @js.native
  def isValidJsxIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils", "isValidNumericLiteral")
  @js.native
  def isValidNumericLiteral(text: String): Boolean = js.native
  @JSImport("tsutils", "isValidNumericLiteral")
  @js.native
  def isValidNumericLiteral(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils", "isValidPropertyAccess")
  @js.native
  def isValidPropertyAccess(text: String): Boolean = js.native
  @JSImport("tsutils", "isValidPropertyAccess")
  @js.native
  def isValidPropertyAccess(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils", "isValidPropertyName")
  @js.native
  def isValidPropertyName(text: String): Boolean = js.native
  @JSImport("tsutils", "isValidPropertyName")
  @js.native
  def isValidPropertyName(text: String, languageVersion: ScriptTarget): Boolean = js.native
  
  @JSImport("tsutils", "isVariableDeclaration")
  @js.native
  def isVariableDeclaration(node: Node): /* is typescript.typescript.VariableDeclaration */ Boolean = js.native
  
  @JSImport("tsutils", "isVariableDeclarationList")
  @js.native
  def isVariableDeclarationList(node: Node): /* is typescript.typescript.VariableDeclarationList */ Boolean = js.native
  
  @JSImport("tsutils", "isVariableStatement")
  @js.native
  def isVariableStatement(node: Node): /* is typescript.typescript.VariableStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isVoidExpression")
  @js.native
  def isVoidExpression(node: Node): /* is typescript.typescript.VoidExpression */ Boolean = js.native
  
  @JSImport("tsutils", "isWellKnownSymbolLiterally")
  @js.native
  def isWellKnownSymbolLiterally(node: Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean = js.native
  
  @JSImport("tsutils", "isWhileStatement")
  @js.native
  def isWhileStatement(node: Node): /* is typescript.typescript.WhileStatement */ Boolean = js.native
  
  @JSImport("tsutils", "isWithStatement")
  @js.native
  def isWithStatement(node: Node): /* is typescript.typescript.WithStatement */ Boolean = js.native
  
  @JSImport("tsutils", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node): js.Array[JSDoc] = js.native
  @JSImport("tsutils", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: js.UndefOr[scala.Nothing], sourceFile: SourceFile): js.Array[JSDoc] = js.native
  @JSImport("tsutils", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = js.native
  @JSImport("tsutils", "parseJsDocOfNode")
  @js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  
  @JSImport("tsutils", "removeOptionalityFromType")
  @js.native
  def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = js.native
  
  @JSImport("tsutils", "someTypePart")
  @js.native
  def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = js.native
  
  @JSImport("tsutils", "symbolHasReadonlyDeclaration")
  @js.native
  def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = js.native
  
  @JSImport("tsutils", "unionTypeParts")
  @js.native
  def unionTypeParts(`type`: Type): js.Array[Type] = js.native
  
  @JSImport("tsutils", "unwrapParentheses")
  @js.native
  def unwrapParentheses(node: Expression): Expression = js.native
}
