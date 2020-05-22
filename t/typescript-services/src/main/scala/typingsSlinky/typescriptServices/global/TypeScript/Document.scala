package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Document")
@js.native
class Document protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Document {
  def this(
    _compiler: typingsSlinky.typescriptServices.TypeScript.TypeScriptCompiler,
    _semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsSlinky.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typingsSlinky.typescriptServices.TypeScript.SyntaxTree,
    _topLevelDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl
  ) = this()
  /* CompleteClass */
  override var _amdDependencies: js.Any = js.native
  /* CompleteClass */
  override var _astDeclMap: js.Any = js.native
  /* CompleteClass */
  override var _bloomFilter: js.Any = js.native
  /* CompleteClass */
  override var _compiler: js.Any = js.native
  /* CompleteClass */
  override var _declASTMap: js.Any = js.native
  /* CompleteClass */
  override var _diagnostics: js.Any = js.native
  /* CompleteClass */
  override var _externalModuleIndicatorSpan: js.Any = js.native
  /* CompleteClass */
  override var _lineMap: js.Any = js.native
  /* CompleteClass */
  override var _scriptSnapshot: js.Any = js.native
  /* CompleteClass */
  override var _semanticInfoChain: js.Any = js.native
  /* CompleteClass */
  override var _sourceUnit: js.Any = js.native
  /* CompleteClass */
  override var _syntaxTree: js.Any = js.native
  /* CompleteClass */
  override var _topLevelDecl: js.Any = js.native
  /* CompleteClass */
  override var byteOrderMark: typingsSlinky.typescriptServices.TypeScript.ByteOrderMark = js.native
  /* CompleteClass */
  override var fileName: String = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override var referencedFiles: js.Array[String] = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /* CompleteClass */
  override def _getASTForDecl(decl: typingsSlinky.typescriptServices.TypeScript.PullDecl): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def _getDeclForAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def _setASTForDecl(
    decl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
    ast: typingsSlinky.typescriptServices.TypeScript.AST
  ): Unit = js.native
  /* CompleteClass */
  override def _setDeclForAST(
    ast: typingsSlinky.typescriptServices.TypeScript.AST,
    decl: typingsSlinky.typescriptServices.TypeScript.PullDecl
  ): Unit = js.native
  /* CompleteClass */
  override def amdDependencies(): js.Array[String] = js.native
  /* CompleteClass */
  override def bloomFilter(): typingsSlinky.typescriptServices.TypeScript.BloomFilter = js.native
  /* CompleteClass */
  /* private */ override def cacheSyntaxTreeInfo(syntaxTree: js.Any): js.Any = js.native
  /* CompleteClass */
  override def diagnostics(): js.Array[typingsSlinky.typescriptServices.TypeScript.Diagnostic] = js.native
  /* CompleteClass */
  override def emitToOwnOutputFile(): Boolean = js.native
  /* CompleteClass */
  override def externalModuleIndicatorSpan(): typingsSlinky.typescriptServices.TypeScript.TextSpan = js.native
  /* CompleteClass */
  /* private */ override def getAmdDependency(comment: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getEnclosingDecl(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  /* private */ override def getImplicitImportSpan(sourceUnitLeadingTrivia: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def getImplicitImportSpanWorker(trivia: js.Any, position: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def getTopLevelImportOrExportSpan(node: js.Any): js.Any = js.native
  /* CompleteClass */
  override def invalidate(): Unit = js.native
  /* CompleteClass */
  override def isDeclareFile(): Boolean = js.native
  /* CompleteClass */
  override def isExternalModule(): Boolean = js.native
  /* CompleteClass */
  override def lineMap(): typingsSlinky.typescriptServices.TypeScript.LineMap = js.native
  /* CompleteClass */
  override def sourceUnit(): typingsSlinky.typescriptServices.TypeScript.SourceUnit = js.native
  /* CompleteClass */
  override def syntaxTree(): typingsSlinky.typescriptServices.TypeScript.SyntaxTree = js.native
  /* CompleteClass */
  override def topLevelDecl(): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def update(
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: typingsSlinky.typescriptServices.TypeScript.TextChangeRange
  ): typingsSlinky.typescriptServices.TypeScript.Document = js.native
}

/* static members */
@JSGlobal("TypeScript.Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: typingsSlinky.typescriptServices.TypeScript.TypeScriptCompiler,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typingsSlinky.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typingsSlinky.typescriptServices.TypeScript.Document = js.native
}

