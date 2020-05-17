package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.AST
import typingsSlinky.typescriptServices.TypeScript.Diagnostic
import typingsSlinky.typescriptServices.TypeScript.Document
import typingsSlinky.typescriptServices.TypeScript.EmitOutput
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings
import typingsSlinky.typescriptServices.TypeScript.PullCallSymbolInfo
import typingsSlinky.typescriptServices.TypeScript.PullDecl
import typingsSlinky.typescriptServices.TypeScript.PullSymbolInfo
import typingsSlinky.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageServiceCompiler extends js.Object {
  var compiler: js.Any = js.native
  var host: js.Any = js.native
  var hostCache: js.Any = js.native
  var logger: js.Any = js.native
  def canEmitDeclarations(fileName: String): Boolean = js.native
  def cleanupSemanticCache(): Unit = js.native
  def compilationSettings(): ImmutableCompilationSettings = js.native
  def emit(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  def emitDeclarations(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  def fileNames(): js.Array[String] = js.native
  def getCachedHostFileName(fileName: String): String = js.native
  def getCachedTopLevelDeclaration(fileName: String): PullDecl = js.native
  def getCallInformationFromAST(ast: AST, document: Document): PullCallSymbolInfo = js.native
  def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic] = js.native
  def getContextualMembersFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  def getDeclForAST(ast: AST): PullDecl = js.native
  def getDocument(fileName: String): Document = js.native
  def getScriptSnapshot(fileName: String): IScriptSnapshot = js.native
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getSymbolInformationFromAST(ast: AST, document: Document): PullSymbolInfo = js.native
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getVisibleDeclsFromAST(ast: AST, document: Document): js.Array[PullDecl] = js.native
  def getVisibleMemberSymbolsFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo = js.native
  /* private */ def synchronizeHostData(): js.Any = js.native
  /* private */ def synchronizeHostDataWorker(): js.Any = js.native
  def topLevelDeclaration(fileName: String): PullDecl = js.native
  /* private */ def tryUpdateFile(compiler: js.Any, fileName: js.Any): js.Any = js.native
}

object LanguageServiceCompiler {
  @scala.inline
  def apply(
    canEmitDeclarations: String => Boolean,
    cleanupSemanticCache: () => Unit,
    compilationSettings: () => ImmutableCompilationSettings,
    compiler: js.Any,
    emit: (String, js.Function1[/* path */ String, String]) => EmitOutput,
    emitDeclarations: (String, js.Function1[/* path */ String, String]) => EmitOutput,
    fileNames: () => js.Array[String],
    getCachedHostFileName: String => String,
    getCachedTopLevelDeclaration: String => PullDecl,
    getCallInformationFromAST: (AST, Document) => PullCallSymbolInfo,
    getCompilerOptionsDiagnostics: js.Function1[/* path */ String, String] => js.Array[Diagnostic],
    getContextualMembersFromAST: (AST, Document) => PullVisibleSymbolsInfo,
    getDeclForAST: AST => PullDecl,
    getDocument: String => Document,
    getScriptSnapshot: String => IScriptSnapshot,
    getSemanticDiagnostics: String => js.Array[Diagnostic],
    getSymbolInformationFromAST: (AST, Document) => PullSymbolInfo,
    getSyntacticDiagnostics: String => js.Array[Diagnostic],
    getVisibleDeclsFromAST: (AST, Document) => js.Array[PullDecl],
    getVisibleMemberSymbolsFromAST: (AST, Document) => PullVisibleSymbolsInfo,
    host: js.Any,
    hostCache: js.Any,
    logger: js.Any,
    pullGetDeclInformation: (PullDecl, AST, Document) => PullSymbolInfo,
    synchronizeHostData: () => js.Any,
    synchronizeHostDataWorker: () => js.Any,
    topLevelDeclaration: String => PullDecl,
    tryUpdateFile: (js.Any, js.Any) => js.Any
  ): LanguageServiceCompiler = {
    val __obj = js.Dynamic.literal(canEmitDeclarations = js.Any.fromFunction1(canEmitDeclarations), cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), compilationSettings = js.Any.fromFunction0(compilationSettings), compiler = compiler.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitDeclarations = js.Any.fromFunction2(emitDeclarations), fileNames = js.Any.fromFunction0(fileNames), getCachedHostFileName = js.Any.fromFunction1(getCachedHostFileName), getCachedTopLevelDeclaration = js.Any.fromFunction1(getCachedTopLevelDeclaration), getCallInformationFromAST = js.Any.fromFunction2(getCallInformationFromAST), getCompilerOptionsDiagnostics = js.Any.fromFunction1(getCompilerOptionsDiagnostics), getContextualMembersFromAST = js.Any.fromFunction2(getContextualMembersFromAST), getDeclForAST = js.Any.fromFunction1(getDeclForAST), getDocument = js.Any.fromFunction1(getDocument), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSymbolInformationFromAST = js.Any.fromFunction2(getSymbolInformationFromAST), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getVisibleDeclsFromAST = js.Any.fromFunction2(getVisibleDeclsFromAST), getVisibleMemberSymbolsFromAST = js.Any.fromFunction2(getVisibleMemberSymbolsFromAST), host = host.asInstanceOf[js.Any], hostCache = hostCache.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pullGetDeclInformation = js.Any.fromFunction3(pullGetDeclInformation), synchronizeHostData = js.Any.fromFunction0(synchronizeHostData), synchronizeHostDataWorker = js.Any.fromFunction0(synchronizeHostDataWorker), topLevelDeclaration = js.Any.fromFunction1(topLevelDeclaration), tryUpdateFile = js.Any.fromFunction2(tryUpdateFile))
    __obj.asInstanceOf[LanguageServiceCompiler]
  }
  @scala.inline
  implicit class LanguageServiceCompilerOps[Self <: LanguageServiceCompiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanEmitDeclarations(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEmitDeclarations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCleanupSemanticCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupSemanticCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompilationSettings(value: () => ImmutableCompilationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompiler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmitDeclarations(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitDeclarations")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFileNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCachedHostFileName(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCachedHostFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCachedTopLevelDeclaration(value: String => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCachedTopLevelDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCallInformationFromAST(value: (AST, Document) => PullCallSymbolInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallInformationFromAST")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCompilerOptionsDiagnostics(value: js.Function1[/* path */ String, String] => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilerOptionsDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContextualMembersFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContextualMembersFromAST")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDeclForAST(value: AST => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeclForAST")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDocument(value: String => Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptSnapshot(value: String => IScriptSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSemanticDiagnostics(value: String => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSemanticDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSymbolInformationFromAST(value: (AST, Document) => PullSymbolInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSymbolInformationFromAST")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSyntacticDiagnostics(value: String => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSyntacticDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVisibleDeclsFromAST(value: (AST, Document) => js.Array[PullDecl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleDeclsFromAST")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetVisibleMemberSymbolsFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleMemberSymbolsFromAST")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullGetDeclInformation(value: (PullDecl, AST, Document) => PullSymbolInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullGetDeclInformation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSynchronizeHostData(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeHostData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSynchronizeHostDataWorker(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeHostDataWorker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTopLevelDeclaration(value: String => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryUpdateFile(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryUpdateFile")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

