package typingsSlinky.vscodeLanguageclient.workspaceFoldersMod

import typingsSlinky.vscode.mod.WorkspaceFolder
import typingsSlinky.vscodeJsonrpc.messagesMod.MessageType
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.DynamicFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/workspaceFolders", "WorkspaceFoldersFeature")
@js.native
class WorkspaceFoldersFeature protected ()
  extends DynamicFeature[js.UndefOr[scala.Nothing]] {
  def this(_client: BaseLanguageClient) = this()
  
  var _client: js.Any = js.native
  
  var _initialFolders: js.Any = js.native
  
  var _listeners: js.Any = js.native
  
  var asProtocol: js.Any = js.native
  
  var doSendEvent: js.Any = js.native
  
  @JSName("fillInitializeParams")
  def fillInitializeParams_MWorkspaceFoldersFeature(params: InitializeParams): Unit = js.native
  
  /* protected */ def initializeWithFolders(): Unit = js.native
  /* protected */ def initializeWithFolders(currentWorkspaceFolders: js.Array[WorkspaceFolder]): Unit = js.native
  
  @JSName("messages")
  def messages_MWorkspaceFoldersFeature: MessageType = js.native
  
  /* protected */ def sendInitialEvent(): Unit = js.native
  /* protected */ def sendInitialEvent(currentWorkspaceFolders: js.Array[WorkspaceFolder]): Unit = js.native
}
