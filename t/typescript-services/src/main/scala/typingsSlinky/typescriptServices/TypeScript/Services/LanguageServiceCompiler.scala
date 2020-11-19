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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageServiceCompiler extends js.Object {
  
  def canEmitDeclarations(fileName: String): Boolean = js.native
  
  def cleanupSemanticCache(): Unit = js.native
  
  def compilationSettings(): ImmutableCompilationSettings = js.native
  
  var compiler: js.Any = js.native
  
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
  
  var host: js.Any = js.native
  
  var hostCache: js.Any = js.native
  
  var logger: js.Any = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanEmitDeclarations(value: String => Boolean): Self = this.set("canEmitDeclarations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCleanupSemanticCache(value: () => Unit): Self = this.set("cleanupSemanticCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompilationSettings(value: () => ImmutableCompilationSettings): Self = this.set("compilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompiler(value: js.Any): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmit(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitDeclarations(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = this.set("emitDeclarations", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileNames(value: () => js.Array[String]): Self = this.set("fileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCachedHostFileName(value: String => String): Self = this.set("getCachedHostFileName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCachedTopLevelDeclaration(value: String => PullDecl): Self = this.set("getCachedTopLevelDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCallInformationFromAST(value: (AST, Document) => PullCallSymbolInfo): Self = this.set("getCallInformationFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCompilerOptionsDiagnostics(value: js.Function1[/* path */ String, String] => js.Array[Diagnostic]): Self = this.set("getCompilerOptionsDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContextualMembersFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = this.set("getContextualMembersFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDeclForAST(value: AST => PullDecl): Self = this.set("getDeclForAST", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDocument(value: String => Document): Self = this.set("getDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptSnapshot(value: String => IScriptSnapshot): Self = this.set("getScriptSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSemanticDiagnostics(value: String => js.Array[Diagnostic]): Self = this.set("getSemanticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSymbolInformationFromAST(value: (AST, Document) => PullSymbolInfo): Self = this.set("getSymbolInformationFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSyntacticDiagnostics(value: String => js.Array[Diagnostic]): Self = this.set("getSyntacticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVisibleDeclsFromAST(value: (AST, Document) => js.Array[PullDecl]): Self = this.set("getVisibleDeclsFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetVisibleMemberSymbolsFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = this.set("getVisibleMemberSymbolsFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHost(value: js.Any): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostCache(value: js.Any): Self = this.set("hostCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullGetDeclInformation(value: (PullDecl, AST, Document) => PullSymbolInfo): Self = this.set("pullGetDeclInformation", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSynchronizeHostData(value: () => js.Any): Self = this.set("synchronizeHostData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSynchronizeHostDataWorker(value: () => js.Any): Self = this.set("synchronizeHostDataWorker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopLevelDeclaration(value: String => PullDecl): Self = this.set("topLevelDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryUpdateFile(value: (js.Any, js.Any) => js.Any): Self = this.set("tryUpdateFile", js.Any.fromFunction2(value))
  }
}
