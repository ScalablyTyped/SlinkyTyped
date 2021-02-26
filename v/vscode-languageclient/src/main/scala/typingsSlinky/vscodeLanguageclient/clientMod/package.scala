package typingsSlinky.vscodeLanguageclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type DidChangeConfigurationSignature = js.ThisFunction1[
    /* this */ scala.Unit, 
    /* sections */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ]
  
  type DidChangeWatchedFileSignature = js.ThisFunction1[
    /* this */ scala.Unit, 
    /* event */ typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FileEvent, 
    scala.Unit
  ]
  
  @scala.inline
  def EOL: js.Array[java.lang.String] = typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[java.lang.String]]
  
  type ExecuteCommandSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* command */ java.lang.String, 
    /* args */ js.Array[js.Any], 
    typingsSlinky.vscode.mod.ProviderResult[js.Any]
  ]
  
  type HandleDiagnosticsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* uri */ typingsSlinky.vscode.mod.Uri, 
    /* diagnostics */ js.Array[typingsSlinky.vscode.mod.Diagnostic], 
    scala.Unit
  ]
  
  type InitializationFailedHandler = js.Function1[
    /* error */ typingsSlinky.vscodeLanguageserverProtocol.mod.ResponseError[typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeError] | js.Error | js.Any, 
    scala.Boolean
  ]
  
  type Middleware = typingsSlinky.vscodeLanguageclient.clientMod._Middleware with typingsSlinky.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware with typingsSlinky.vscodeLanguageclient.implementationMod.ImplementationMiddleware with typingsSlinky.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware with typingsSlinky.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware with typingsSlinky.vscodeLanguageclient.declarationMod.DeclarationMiddleware with typingsSlinky.vscodeLanguageclient.selectionRangeMod.SelectionRangeProviderMiddleware
  
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  
  type PrepareRenameSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      typingsSlinky.vscode.mod.Range | typingsSlinky.vscodeLanguageclient.anon.Placeholder
    ]
  ]
  
  type ProvideCodeActionsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* range */ typingsSlinky.vscode.mod.Range, 
    /* context */ typingsSlinky.vscode.mod.CodeActionContext, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.Command | typingsSlinky.vscode.mod.CodeAction]]
  ]
  
  type ProvideCodeLensesSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.CodeLens]]
  ]
  
  type ProvideCompletionItemsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* context */ typingsSlinky.vscode.mod.CompletionContext, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      js.Array[typingsSlinky.vscode.mod.CompletionItem] | typingsSlinky.vscode.mod.CompletionList[typingsSlinky.vscode.mod.CompletionItem]
    ]
  ]
  
  type ProvideDefinitionSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      typingsSlinky.vscode.mod.Definition | js.Array[typingsSlinky.vscode.mod.DefinitionLink]
    ]
  ]
  
  type ProvideDocumentFormattingEditsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
  ]
  
  type ProvideDocumentHighlightsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentHighlight]]
  ]
  
  type ProvideDocumentLinksSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.DocumentLink]]
  ]
  
  type ProvideDocumentRangeFormattingEditsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* range */ typingsSlinky.vscode.mod.Range, 
    /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
  ]
  
  type ProvideDocumentSymbolsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[
      js.Array[
        typingsSlinky.vscode.mod.DocumentSymbol | typingsSlinky.vscode.mod.SymbolInformation
      ]
    ]
  ]
  
  type ProvideHoverSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.Hover]
  ]
  
  type ProvideOnTypeFormattingEditsSignature = js.ThisFunction5[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* ch */ java.lang.String, 
    /* options */ typingsSlinky.vscode.mod.FormattingOptions, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.TextEdit]]
  ]
  
  type ProvideReferencesSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* options */ typingsSlinky.vscodeLanguageclient.anon.IncludeDeclaration, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.Location]]
  ]
  
  type ProvideRenameEditsSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* newName */ java.lang.String, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.WorkspaceEdit]
  ]
  
  type ProvideSignatureHelpSignature = js.ThisFunction4[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* context */ typingsSlinky.vscode.mod.SignatureHelpContext, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.SignatureHelp]
  ]
  
  type ProvideWorkspaceSymbolsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* query */ java.lang.String, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.SymbolInformation]]
  ]
  
  type ResolveCodeLensSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* codeLens */ typingsSlinky.vscode.mod.CodeLens, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.CodeLens]
  ]
  
  type ResolveCompletionItemSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* item */ typingsSlinky.vscode.mod.CompletionItem, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.CompletionItem]
  ]
  
  type ResolveDocumentLinkSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* link */ typingsSlinky.vscode.mod.DocumentLink, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.DocumentLink]
  ]
  
  type WorkspaceMiddleware = typingsSlinky.vscodeLanguageclient.clientMod._WorkspaceMiddleware with typingsSlinky.vscodeLanguageclient.configurationMod.ConfigurationWorkspaceMiddleware with typingsSlinky.vscodeLanguageclient.workspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
  
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  
  @scala.inline
  def createClientSocketTransport(port: scala.Double): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  @scala.inline
  def createClientSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  
  @scala.inline
  def createProtocolConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger
  ): typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  @scala.inline
  def createProtocolConnection(
    reader: typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typingsSlinky.vscodeJsonrpc.mod.Logger,
    strategy: typingsSlinky.vscodeJsonrpc.mod.ConnectionStrategy
  ): typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerSocketTransport(port: scala.Double, encoding: typingsSlinky.node.BufferEncoding): js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def generateRandomPipeName(): java.lang.String = typingsSlinky.vscodeLanguageclient.clientMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]
}
