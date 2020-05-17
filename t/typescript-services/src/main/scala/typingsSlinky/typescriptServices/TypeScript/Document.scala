package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var _amdDependencies: js.Any = js.native
  var _astDeclMap: js.Any = js.native
  var _bloomFilter: js.Any = js.native
  var _compiler: js.Any = js.native
  var _declASTMap: js.Any = js.native
  var _diagnostics: js.Any = js.native
  var _externalModuleIndicatorSpan: js.Any = js.native
  var _lineMap: js.Any = js.native
  var _scriptSnapshot: js.Any = js.native
  var _semanticInfoChain: js.Any = js.native
  var _sourceUnit: js.Any = js.native
  var _syntaxTree: js.Any = js.native
  var _topLevelDecl: js.Any = js.native
  var byteOrderMark: ByteOrderMark = js.native
  var fileName: String = js.native
  var isOpen: Boolean = js.native
  var referencedFiles: js.Array[String] = js.native
  var version: Double = js.native
  def _getASTForDecl(decl: PullDecl): AST = js.native
  def _getDeclForAST(ast: AST): PullDecl = js.native
  def _setASTForDecl(decl: PullDecl, ast: AST): Unit = js.native
  def _setDeclForAST(ast: AST, decl: PullDecl): Unit = js.native
  def amdDependencies(): js.Array[String] = js.native
  def bloomFilter(): BloomFilter = js.native
  /* private */ def cacheSyntaxTreeInfo(syntaxTree: js.Any): js.Any = js.native
  def diagnostics(): js.Array[Diagnostic] = js.native
  def emitToOwnOutputFile(): Boolean = js.native
  def externalModuleIndicatorSpan(): TextSpan = js.native
  /* private */ def getAmdDependency(comment: js.Any): js.Any = js.native
  def getEnclosingDecl(ast: AST): PullDecl = js.native
  /* private */ def getImplicitImportSpan(sourceUnitLeadingTrivia: js.Any): js.Any = js.native
  /* private */ def getImplicitImportSpanWorker(trivia: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getTopLevelImportOrExportSpan(node: js.Any): js.Any = js.native
  def invalidate(): Unit = js.native
  def isDeclareFile(): Boolean = js.native
  def isExternalModule(): Boolean = js.native
  def lineMap(): LineMap = js.native
  def sourceUnit(): SourceUnit = js.native
  def syntaxTree(): SyntaxTree = js.native
  def topLevelDecl(): PullDecl = js.native
  def update(
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: TextChangeRange
  ): Document = js.native
}

object Document {
  @scala.inline
  def apply(
    _amdDependencies: js.Any,
    _astDeclMap: js.Any,
    _bloomFilter: js.Any,
    _compiler: js.Any,
    _declASTMap: js.Any,
    _diagnostics: js.Any,
    _externalModuleIndicatorSpan: js.Any,
    _getASTForDecl: PullDecl => AST,
    _getDeclForAST: AST => PullDecl,
    _lineMap: js.Any,
    _scriptSnapshot: js.Any,
    _semanticInfoChain: js.Any,
    _setASTForDecl: (PullDecl, AST) => Unit,
    _setDeclForAST: (AST, PullDecl) => Unit,
    _sourceUnit: js.Any,
    _syntaxTree: js.Any,
    _topLevelDecl: js.Any,
    amdDependencies: () => js.Array[String],
    bloomFilter: () => BloomFilter,
    byteOrderMark: ByteOrderMark,
    cacheSyntaxTreeInfo: js.Any => js.Any,
    diagnostics: () => js.Array[Diagnostic],
    emitToOwnOutputFile: () => Boolean,
    externalModuleIndicatorSpan: () => TextSpan,
    fileName: String,
    getAmdDependency: js.Any => js.Any,
    getEnclosingDecl: AST => PullDecl,
    getImplicitImportSpan: js.Any => js.Any,
    getImplicitImportSpanWorker: (js.Any, js.Any) => js.Any,
    getTopLevelImportOrExportSpan: js.Any => js.Any,
    invalidate: () => Unit,
    isDeclareFile: () => Boolean,
    isExternalModule: () => Boolean,
    isOpen: Boolean,
    lineMap: () => LineMap,
    referencedFiles: js.Array[String],
    sourceUnit: () => SourceUnit,
    syntaxTree: () => SyntaxTree,
    topLevelDecl: () => PullDecl,
    update: (IScriptSnapshot, Double, Boolean, TextChangeRange) => Document,
    version: Double
  ): Document = {
    val __obj = js.Dynamic.literal(_amdDependencies = _amdDependencies.asInstanceOf[js.Any], _astDeclMap = _astDeclMap.asInstanceOf[js.Any], _bloomFilter = _bloomFilter.asInstanceOf[js.Any], _compiler = _compiler.asInstanceOf[js.Any], _declASTMap = _declASTMap.asInstanceOf[js.Any], _diagnostics = _diagnostics.asInstanceOf[js.Any], _externalModuleIndicatorSpan = _externalModuleIndicatorSpan.asInstanceOf[js.Any], _getASTForDecl = js.Any.fromFunction1(_getASTForDecl), _getDeclForAST = js.Any.fromFunction1(_getDeclForAST), _lineMap = _lineMap.asInstanceOf[js.Any], _scriptSnapshot = _scriptSnapshot.asInstanceOf[js.Any], _semanticInfoChain = _semanticInfoChain.asInstanceOf[js.Any], _setASTForDecl = js.Any.fromFunction2(_setASTForDecl), _setDeclForAST = js.Any.fromFunction2(_setDeclForAST), _sourceUnit = _sourceUnit.asInstanceOf[js.Any], _syntaxTree = _syntaxTree.asInstanceOf[js.Any], _topLevelDecl = _topLevelDecl.asInstanceOf[js.Any], amdDependencies = js.Any.fromFunction0(amdDependencies), bloomFilter = js.Any.fromFunction0(bloomFilter), byteOrderMark = byteOrderMark.asInstanceOf[js.Any], cacheSyntaxTreeInfo = js.Any.fromFunction1(cacheSyntaxTreeInfo), diagnostics = js.Any.fromFunction0(diagnostics), emitToOwnOutputFile = js.Any.fromFunction0(emitToOwnOutputFile), externalModuleIndicatorSpan = js.Any.fromFunction0(externalModuleIndicatorSpan), fileName = fileName.asInstanceOf[js.Any], getAmdDependency = js.Any.fromFunction1(getAmdDependency), getEnclosingDecl = js.Any.fromFunction1(getEnclosingDecl), getImplicitImportSpan = js.Any.fromFunction1(getImplicitImportSpan), getImplicitImportSpanWorker = js.Any.fromFunction2(getImplicitImportSpanWorker), getTopLevelImportOrExportSpan = js.Any.fromFunction1(getTopLevelImportOrExportSpan), invalidate = js.Any.fromFunction0(invalidate), isDeclareFile = js.Any.fromFunction0(isDeclareFile), isExternalModule = js.Any.fromFunction0(isExternalModule), isOpen = isOpen.asInstanceOf[js.Any], lineMap = js.Any.fromFunction0(lineMap), referencedFiles = referencedFiles.asInstanceOf[js.Any], sourceUnit = js.Any.fromFunction0(sourceUnit), syntaxTree = js.Any.fromFunction0(syntaxTree), topLevelDecl = js.Any.fromFunction0(topLevelDecl), update = js.Any.fromFunction4(update), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_amdDependencies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_amdDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_astDeclMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_astDeclMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_bloomFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bloomFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_compiler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_declASTMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_declASTMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_diagnostics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_externalModuleIndicatorSpan(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_externalModuleIndicatorSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getASTForDecl(value: PullDecl => AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getASTForDecl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_getDeclForAST(value: AST => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getDeclForAST")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_lineMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lineMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scriptSnapshot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scriptSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_semanticInfoChain(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_semanticInfoChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setASTForDecl(value: (PullDecl, AST) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setASTForDecl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_setDeclForAST(value: (AST, PullDecl) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setDeclForAST")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_sourceUnit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_syntaxTree(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_syntaxTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_topLevelDecl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_topLevelDecl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmdDependencies(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amdDependencies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBloomFilter(value: () => BloomFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bloomFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByteOrderMark(value: ByteOrderMark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOrderMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheSyntaxTreeInfo(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSyntaxTreeInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiagnostics(value: () => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmitToOwnOutputFile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitToOwnOutputFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExternalModuleIndicatorSpan(value: () => TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModuleIndicatorSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAmdDependency(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAmdDependency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEnclosingDecl(value: AST => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnclosingDecl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImplicitImportSpan(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplicitImportSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImplicitImportSpanWorker(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplicitImportSpanWorker")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTopLevelImportOrExportSpan(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTopLevelImportOrExportSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvalidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDeclareFile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeclareFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsExternalModule(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalModule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineMap(value: () => LineMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReferencedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceUnit(value: () => SourceUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUnit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSyntaxTree(value: () => SyntaxTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntaxTree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTopLevelDecl(value: () => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelDecl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (IScriptSnapshot, Double, Boolean, TextChangeRange) => Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

