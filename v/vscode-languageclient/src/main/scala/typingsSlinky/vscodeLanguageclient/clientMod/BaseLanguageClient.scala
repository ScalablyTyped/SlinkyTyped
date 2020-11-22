package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscode.mod.CodeActionProvider
import typingsSlinky.vscode.mod.CompletionItemProvider
import typingsSlinky.vscode.mod.DeclarationProvider
import typingsSlinky.vscode.mod.DefinitionProvider
import typingsSlinky.vscode.mod.DiagnosticCollection
import typingsSlinky.vscode.mod.DocumentColorProvider
import typingsSlinky.vscode.mod.DocumentFormattingEditProvider
import typingsSlinky.vscode.mod.DocumentHighlightProvider
import typingsSlinky.vscode.mod.DocumentLinkProvider
import typingsSlinky.vscode.mod.DocumentRangeFormattingEditProvider
import typingsSlinky.vscode.mod.FoldingRangeProvider
import typingsSlinky.vscode.mod.HoverProvider
import typingsSlinky.vscode.mod.ImplementationProvider
import typingsSlinky.vscode.mod.OnTypeFormattingEditProvider
import typingsSlinky.vscode.mod.OutputChannel
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.ReferenceProvider
import typingsSlinky.vscode.mod.RenameProvider
import typingsSlinky.vscode.mod.SelectionRangeProvider
import typingsSlinky.vscode.mod.SignatureHelpProvider
import typingsSlinky.vscode.mod.TypeDefinitionProvider
import typingsSlinky.vscode.mod.WorkspaceSymbolProvider
import typingsSlinky.vscodeJsonrpc.mod.GenericNotificationHandler
import typingsSlinky.vscodeJsonrpc.mod.GenericRequestHandler
import typingsSlinky.vscodeJsonrpc.mod.NotificationHandler
import typingsSlinky.vscodeJsonrpc.mod.NotificationHandler0
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler0
import typingsSlinky.vscodeLanguageclient.codeConverterMod.Converter
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcodeAction
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcompletion
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdeclaration
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdefinition
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidChange
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidClose
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidOpen
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidSave
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentColor
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentHighlight
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentLink
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashfoldingRange
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashformatting
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashhover
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashimplementation
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashonTypeFormatting
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareCallHierarchy
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrangeFormatting
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashreferences
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrename
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashselectionRange
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsignatureHelp
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashtypeDefinition
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSave
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSaveWaitUntil
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "BaseLanguageClient")
@js.native
abstract class BaseLanguageClient protected () extends js.Object {
  def this(id: String, name: String, clientOptions: LanguageClientOptions) = this()
  
  var _c2p: js.Any = js.native
  
  var _capabilities: js.Any = js.native
  
  var _clientGetRootPath: js.Any = js.native
  
  var _clientOptions: js.Any = js.native
  
  var _connectionPromise: js.Any = js.native
  
  var _diagnostics: js.Any = js.native
  
  var _disposeOutputChannel: js.Any = js.native
  
  val _dynamicFeatures: js.Any = js.native
  
  val _features: js.Any = js.native
  
  var _fileEventDelayer: js.Any = js.native
  
  var _fileEvents: js.Any = js.native
  
  var _id: js.Any = js.native
  
  var _initializeResult: js.Any = js.native
  
  var _listeners: js.Any = js.native
  
  val _method2Message: js.Any = js.native
  
  var _name: js.Any = js.native
  
  var _onReady: js.Any = js.native
  
  var _onReadyCallbacks: js.Any = js.native
  
  var _onStop: js.Any = js.native
  
  var _outputChannel: js.Any = js.native
  
  var _p2c: js.Any = js.native
  
  var _providers: js.Any = js.native
  
  var _resolvedConnection: js.Any = js.native
  
  var _state: js.Any = js.native
  
  var _stateChangeEmitter: js.Any = js.native
  
  var _syncedDocuments: js.Any = js.native
  
  var _telemetryEmitter: js.Any = js.native
  
  var _trace: js.Any = js.native
  
  var _traceFormat: js.Any = js.native
  
  var _traceOutputChannel: js.Any = js.native
  
  var _tracer: js.Any = js.native
  
  var cleanUp: js.Any = js.native
  
  var cleanUpChannel: js.Any = js.native
  
  def clientOptions: LanguageClientOptions = js.native
  
  def code2ProtocolConverter: Converter = js.native
  
  var computeClientCapabilities: js.Any = js.native
  
  var createConnection: js.Any = js.native
  
  def createDefaultErrorHandler(): ErrorHandler = js.native
  
  /* protected */ def createMessageTransports(encoding: String): js.Promise[MessageTransports] = js.native
  
  var data2String: js.Any = js.native
  
  def diagnostics: js.UndefOr[DiagnosticCollection] = js.native
  
  var doInitialize: js.Any = js.native
  
  def error(message: String): Unit = js.native
  def error(message: String, data: js.UndefOr[scala.Nothing], showNotification: Boolean): Unit = js.native
  def error(message: String, data: js.Any): Unit = js.native
  def error(message: String, data: js.Any, showNotification: Boolean): Unit = js.native
  
  var fillInitializeParams: js.Any = js.native
  
  var forceDocumentSync: js.Any = js.native
  
  @JSName("getFeature")
  def getFeature_textDocumentcodeAction(request: textDocumentSlashcodeAction): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[CodeActionProvider[typingsSlinky.vscode.mod.CodeAction]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcompletion(request: textDocumentSlashcompletion): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[CompletionItemProvider[typingsSlinky.vscode.mod.CompletionItem]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdeclaration(request: textDocumentSlashdeclaration): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[DeclarationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdefinition(request: textDocumentSlashdefinition): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[DefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidChange(request: textDocumentSlashdidChange): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with (NotificationFeature[js.Function1[/* textDocument */ typingsSlinky.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidClose(request: textDocumentSlashdidClose): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with (NotificationFeature[js.Function1[/* textDocument */ typingsSlinky.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidOpen(request: textDocumentSlashdidOpen): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with (NotificationFeature[js.Function1[/* textDocument */ typingsSlinky.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidSave(request: textDocumentSlashdidSave): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with (NotificationFeature[js.Function1[/* textDocument */ typingsSlinky.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentColor(request: textDocumentSlashdocumentColor): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[DocumentColorProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentHighlight(request: textDocumentSlashdocumentHighlight): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[DocumentHighlightProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentLink(request: textDocumentSlashdocumentLink): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[DocumentLinkProvider[typingsSlinky.vscode.mod.DocumentLink]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentfoldingRange(request: textDocumentSlashfoldingRange): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[FoldingRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentformatting(request: textDocumentSlashformatting): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[DocumentFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenthover(request: textDocumentSlashhover): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[HoverProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentimplementation(request: textDocumentSlashimplementation): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[ImplementationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentonTypeFormatting(request: textDocumentSlashonTypeFormatting): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[OnTypeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentprepareCallHierarchy(request: textDocumentSlashprepareCallHierarchy): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[TypeDefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrangeFormatting(request: textDocumentSlashrangeFormatting): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[DocumentRangeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentreferences(request: textDocumentSlashreferences): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[ReferenceProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrename(request: textDocumentSlashrename): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[RenameProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentselectionRange(request: textDocumentSlashselectionRange): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[SelectionRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentsignatureHelp(request: textDocumentSlashsignatureHelp): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[SignatureHelpProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenttypeDefinition(request: textDocumentSlashtypeDefinition): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with TextDocumentProviderFeature[TypeDefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSave(request: textDocumentSlashwillSave): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with (NotificationFeature[js.Function1[/* textDocument */ typingsSlinky.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSaveWaitUntil(request: textDocumentSlashwillSaveWaitUntil): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with (NotificationFeature[
    js.Function1[
      /* textDocument */ typingsSlinky.vscode.mod.TextDocument, 
      ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
    ]
  ]) = js.native
  @JSName("getFeature")
  def getFeature_workspacesymbol(request: workspaceSlashsymbol): (DynamicFeature[
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ]) with WorkspaceProviderFeature[WorkspaceSymbolProvider[typingsSlinky.vscode.mod.SymbolInformation]] = js.native
  
  var getPublicState: js.Any = js.native
  
  var handleApplyWorkspaceEdit: js.Any = js.native
  
  /* protected */ def handleConnectionClosed(): Unit = js.native
  
  var handleConnectionError: js.Any = js.native
  
  var handleDiagnostics: js.Any = js.native
  
  var handleRegistrationRequest: js.Any = js.native
  
  var handleUnregistrationRequest: js.Any = js.native
  
  var hookConfigurationChanged: js.Any = js.native
  
  var hookFileEvents: js.Any = js.native
  
  def info(message: String): Unit = js.native
  def info(message: String, data: js.UndefOr[scala.Nothing], showNotification: Boolean): Unit = js.native
  def info(message: String, data: js.Any): Unit = js.native
  def info(message: String, data: js.Any, showNotification: Boolean): Unit = js.native
  
  var initialize: js.Any = js.native
  
  var initializeFeatures: js.Any = js.native
  
  def initializeResult: js.UndefOr[InitializeResult[_]] = js.native
  
  var isConnectionActive: js.Any = js.native
  
  def logFailedRequest(`type`: typingsSlinky.vscodeJsonrpc.messagesMod.MessageType, error: js.Any): Unit = js.native
  
  var logObjectTrace: js.Any = js.native
  
  var logTrace: js.Any = js.native
  
  def needsStart(): Boolean = js.native
  
  def needsStop(): Boolean = js.native
  
  var notifyFileEvent: js.Any = js.native
  
  def onDidChangeState: typingsSlinky.vscodeJsonrpc.eventsMod.Event[StateChangeEvent] = js.native
  
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  def onNotification[RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  
  def onProgress[P](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: String,
    handler: NotificationHandler[P]
  ): typingsSlinky.vscode.mod.Disposable = js.native
  def onProgress[P](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: Double,
    handler: NotificationHandler[P]
  ): typingsSlinky.vscode.mod.Disposable = js.native
  
  def onReady(): js.Promise[Unit] = js.native
  
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  def onRequest[R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  
  def onTelemetry: typingsSlinky.vscodeJsonrpc.eventsMod.Event[_] = js.native
  
  def outputChannel: OutputChannel = js.native
  
  def protocol2CodeConverter: typingsSlinky.vscodeLanguageclient.protocolConverterMod.Converter = js.native
  
  var refreshTrace: js.Any = js.native
  
  /* protected */ def registerBuiltinFeatures(): Unit = js.native
  
  def registerFeature(feature: DynamicFeature[_]): Unit = js.native
  def registerFeature(feature: StaticFeature): Unit = js.native
  
  def registerFeatures(features: js.Array[StaticFeature | DynamicFeature[_]]): Unit = js.native
  
  var resolveConnection: js.Any = js.native
  
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, params: js.Any): Unit = js.native
  def sendNotification[RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType0[RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType[P, RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], params: P): Unit = js.native
  
  def sendProgress[P](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P], token: String, value: P): Unit = js.native
  def sendProgress[P](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P], token: Double, value: P): Unit = js.native
  
  def sendRequest[R](method: String): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: js.Any): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: js.Any, token: typingsSlinky.vscode.mod.CancellationToken): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: typingsSlinky.vscode.mod.CancellationToken): js.Promise[R] = js.native
  def sendRequest[R, E, RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    token: typingsSlinky.vscode.mod.CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    params: P,
    token: typingsSlinky.vscode.mod.CancellationToken
  ): js.Promise[R] = js.native
  
  var setDiagnostics: js.Any = js.native
  
  var showNotificationMessage: js.Any = js.native
  
  def start(): typingsSlinky.vscode.mod.Disposable = js.native
  
  /* private */ def state: js.Any = js.native
  /* private */ def state_=(value: js.Any): Unit = js.native
  
  def stop(): js.Promise[Unit] = js.native
  
  def traceOutputChannel: OutputChannel = js.native
  
  def trace_=(value: typingsSlinky.vscodeJsonrpc.mod.Trace): Unit = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, data: js.UndefOr[scala.Nothing], showNotification: Boolean): Unit = js.native
  def warn(message: String, data: js.Any): Unit = js.native
  def warn(message: String, data: js.Any, showNotification: Boolean): Unit = js.native
}
