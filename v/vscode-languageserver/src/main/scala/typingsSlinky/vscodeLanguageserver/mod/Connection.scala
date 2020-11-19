package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeJsonrpc.mod.GenericNotificationHandler
import typingsSlinky.vscodeJsonrpc.mod.GenericRequestHandler
import typingsSlinky.vscodeJsonrpc.mod.NotificationHandler
import typingsSlinky.vscodeJsonrpc.mod.NotificationHandler0
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler0
import typingsSlinky.vscodeJsonrpc.mod.StarNotificationHandler
import typingsSlinky.vscodeJsonrpc.mod.StarRequestHandler
import typingsSlinky.vscodeLanguageserver.anon.Placeholder
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DefinitionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeConfigurationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentRangeFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.HoverParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializedParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PrepareRenameParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PublishDiagnosticsParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.SignatureHelpParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionParams
import typingsSlinky.vscodeLanguageserverTypes.mod.Declaration
import typingsSlinky.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Definition
import typingsSlinky.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsSlinky.vscodeLanguageserverTypes.mod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] extends js.Object {
  
  /**
    * A property to provide access to client specific features like registering
    * for requests or notifications.
    */
  var client: RemoteClient with PClient = js.native
  
  /**
    * A property to provide access to console specific features.
    */
  var console: RemoteConsole with PConsole = js.native
  
  /**
    * Disposes the connection
    */
  def dispose(): Unit = js.native
  
  /**
    * A property to provide access to language specific features.
    */
  var languages: Languages with PLanguages = js.native
  
  /**
    * Start listening on the input stream for messages to process.
    */
  def listen(): Unit = js.native
  
  /**
    * Installs a handler for the `CodeAction` request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeAction(
    handler: ServerRequestHandler[
      CodeActionParams, 
      js.UndefOr[
        (js.Array[
          typingsSlinky.vscodeLanguageserverTypes.mod.Command | typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
        ]) | Null
      ], 
      js.Array[
        typingsSlinky.vscodeLanguageserverTypes.mod.Command | typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
    * computing the commands is expensive implementers should only return code lens objects with the
    * range set and handle the resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLens(
    handler: ServerRequestHandler[
      CodeLensParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * This function will be called for each visible code lens, usually when scrolling and after
    * the onCodeLens has been called.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLensResolve(
    handler: RequestHandler[
      typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens, 
      typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onColorPresentation(
    handler: ServerRequestHandler[
      ColorPresentationParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Completion` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletion(
    handler: ServerRequestHandler[
      CompletionParams, 
      js.UndefOr[
        js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem] | typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList | Null
      ], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `CompletionResolve` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletionResolve(
    handler: RequestHandler[
      typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem, 
      typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Declaration` request.
    *
    * @param handler The corresponding handler.
    */
  def onDeclaration(
    handler: ServerRequestHandler[
      DeclarationParams, 
      js.UndefOr[Declaration | js.Array[DeclarationLink] | Null], 
      js.Array[DeclarationLink | typingsSlinky.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onDefinition(
    handler: ServerRequestHandler[
      DefinitionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | typingsSlinky.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `DidChangeConfiguration` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeConfiguration(handler: NotificationHandler[DidChangeConfigurationParams]): Unit = js.native
  
  /**
    * Installs a handler for the `DidChangeTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeTextDocument(handler: NotificationHandler[DidChangeTextDocumentParams]): Unit = js.native
  
  /**
    * Installs a handler for the `DidChangeWatchedFiles` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeWatchedFiles(handler: NotificationHandler[DidChangeWatchedFilesParams]): Unit = js.native
  
  /**
    * Installs a handler for the `DidCloseTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidCloseTextDocument(handler: NotificationHandler[DidCloseTextDocumentParams]): Unit = js.native
  
  /**
    * Installs a handler for the `DidOpenTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidOpenTextDocument(handler: NotificationHandler[DidOpenTextDocumentParams]): Unit = js.native
  
  /**
    * Installs a handler for the `DidSaveTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidSaveTextDocument(handler: NotificationHandler[DidSaveTextDocumentParams]): Unit = js.native
  
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentColor(
    handler: ServerRequestHandler[
      DocumentColorParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentFormatting(
    handler: ServerRequestHandler[
      DocumentFormattingParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `DocumentHighlight` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentHighlight(
    handler: ServerRequestHandler[
      DocumentHighlightParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document links resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinkResolve(
    handler: RequestHandler[
      typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink, 
      js.UndefOr[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document links request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinks(
    handler: ServerRequestHandler[
      DocumentLinkParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document on type formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentOnTypeFormatting(
    handler: RequestHandler[
      DocumentOnTypeFormattingParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document range formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentRangeFormatting(
    handler: ServerRequestHandler[
      DocumentRangeFormattingParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `DocumentSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentSymbol(
    handler: ServerRequestHandler[
      DocumentSymbolParams, 
      js.UndefOr[
        (js.Array[
          typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
        ]) | Null
      ], 
      js.Array[
        typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the execute command request.
    *
    * @param handler The corresponding handler.
    */
  def onExecuteCommand(handler: ServerRequestHandler[ExecuteCommandParams, js.UndefOr[_ | Null], scala.Nothing, Unit]): Unit = js.native
  
  /**
    * Installs a handler for the exit notification.
    *
    * @param handler The exit handler.
    */
  def onExit(handler: NotificationHandler0): Unit = js.native
  
  /**
    * Installs a handler for the folding ranges request.
    *
    * @param handler The corresponding handler.
    */
  def onFoldingRanges(
    handler: ServerRequestHandler[
      FoldingRangeParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.FoldingRange] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.FoldingRange], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Hover` request.
    *
    * @param handler The corresponding handler.
    */
  def onHover(
    handler: ServerRequestHandler[
      HoverParams, 
      js.UndefOr[typingsSlinky.vscodeLanguageserverTypes.mod.Hover | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Implementation` request.
    *
    * @param handler The corresponding handler.
    */
  def onImplementation(
    handler: ServerRequestHandler[
      ImplementationParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | typingsSlinky.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the initialize request.
    *
    * @param handler The initialize handler.
    */
  def onInitialize(
    handler: ServerRequestHandler[
      InitializeParams, 
      InitializeResult[_], 
      scala.Nothing, 
      typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeError
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the initialized notification.
    *
    * @param handler The initialized handler.
    */
  def onInitialized(handler: NotificationHandler[InitializedParams]): Unit = js.native
  
  /**
    * Installs a notification handler that is invoked if no specific notification handler can be found.
    *
    * @param handler a handler that handles all notifications.
    */
  def onNotification(handler: StarNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler described by the given [NotificationType](#NotificationType).
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param handler The handler to install.
    */
  def onNotification[RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  
  /**
    * Installs a handler for the prepare rename request.
    *
    * @param handler The corresponding handler.
    */
  def onPrepareRename(
    handler: RequestHandler[
      PrepareRenameParams, 
      js.UndefOr[typingsSlinky.vscodeLanguageserverTypes.mod.Range | Placeholder | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a progress handler for a given token.
    * @param type the progress type
    * @param token the token
    * @param handler the handler
    */
  def onProgress[P](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: String,
    handler: NotificationHandler[P]
  ): typingsSlinky.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onProgress[P](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: Double,
    handler: NotificationHandler[P]
  ): typingsSlinky.vscodeJsonrpc.eventsMod.Disposable = js.native
  
  /**
    * Installs a handler for the `References` request.
    *
    * @param handler The corresponding handler.
    */
  def onReferences(
    handler: ServerRequestHandler[
      ReferenceParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the rename request.
    *
    * @param handler The corresponding handler.
    */
  def onRenameRequest(
    handler: ServerRequestHandler[
      RenameParams, 
      js.UndefOr[typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a request handler that is invoked if no specific request handler can be found.
    *
    * @param handler a handler that handles all requests.
    */
  def onRequest(handler: StarRequestHandler): Unit = js.native
  /**
    * Installs a request handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  /**
    * Installs a request handler described by the given [RequestType](#RequestType).
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param handler The handler to install
    */
  def onRequest[R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  
  /**
    * Installs a handler for the selection ranges request.
    *
    * @param handler The corresponding handler.
    */
  def onSelectionRanges(
    handler: ServerRequestHandler[
      SelectionRangeParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the shutdown request.
    *
    * @param handler The initialize handler.
    */
  def onShutdown(handler: RequestHandler0[Unit, Unit]): Unit = js.native
  
  /**
    * Installs a handler for the `SignatureHelp` request.
    *
    * @param handler The corresponding handler.
    */
  def onSignatureHelp(
    handler: ServerRequestHandler[SignatureHelpParams, js.UndefOr[SignatureHelp | Null], scala.Nothing, Unit]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Type Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onTypeDefinition(
    handler: ServerRequestHandler[
      TypeDefinitionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | typingsSlinky.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `WillSaveTextDocument` notification.
    *
    * Note that this notification is opt-in. The client will not send it unless
    * your server has the `textDocumentSync.willSave` capability or you've
    * dynamically registered for the `textDocument/willSave` method.
    *
    * @param handler The corresponding handler.
    */
  def onWillSaveTextDocument(handler: NotificationHandler[WillSaveTextDocumentParams]): Unit = js.native
  
  /**
    * Installs a handler for the `WillSaveTextDocumentWaitUntil` request.
    *
    * Note that this request is opt-in. The client will not send it unless
    * your server has the `textDocumentSync.willSaveWaitUntil` capability,
    * or you've dynamically registered for the `textDocument/willSaveWaitUntil`
    * method.
    *
    * @param handler The corresponding handler.
    */
  def onWillSaveTextDocumentWaitUntil(
    handler: RequestHandler[
      WillSaveTextDocumentParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `WorkspaceSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspaceSymbol(
    handler: ServerRequestHandler[
      WorkspaceSymbolParams, 
      js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation] | Null], 
      js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sends diagnostics computed for a given document to VSCode to render them in the
    * user interface.
    *
    * @param params The diagnostic parameters.
    */
  def sendDiagnostics(params: PublishDiagnosticsParams): Unit = js.native
  
  /**
    * Send a notification to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The notification's parameters.
    */
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, params: js.Any): Unit = js.native
  /**
    * Send a notification to the client.
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param params The notification's parameters.
    */
  def sendNotification[RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType0[RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], params: P): Unit = js.native
  
  /**
    * Sends progress.
    * @param type the progress type
    * @param token the token to use
    * @param value the progress value
    */
  def sendProgress[P](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P], token: String, value: P): Unit = js.native
  def sendProgress[P](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[P], token: Double, value: P): Unit = js.native
  
  /**
    * Send a request to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The request's parameters.
    */
  def sendRequest[R](method: String): js.Promise[R] = js.native
  def sendRequest[R](method: String, params: js.Any): js.Promise[R] = js.native
  def sendRequest[R](
    method: String,
    params: js.Any,
    token: typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken): js.Promise[R] = js.native
  /**
    * Send a request to the client.
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param params The request's parameters.
    */
  def sendRequest[R, E, RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    token: typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](`type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    params: P,
    token: typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
  ): js.Promise[R] = js.native
  
  /**
    * A property to provide access to telemetry specific features.
    */
  var telemetry: Telemetry with PTelemetry = js.native
  
  /**
    * A property to provide access to tracer specific features.
    */
  var tracer: Tracer with PTracer = js.native
  
  /**
    * A property to provide access to windows specific features.
    */
  var window: RemoteWindow with PWindow = js.native
  
  /**
    * A property to provide access to workspace specific features.
    */
  var workspace: RemoteWorkspace with PWorkspace = js.native
}
