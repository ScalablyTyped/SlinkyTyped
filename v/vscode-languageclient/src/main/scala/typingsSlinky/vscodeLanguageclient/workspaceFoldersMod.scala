package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.WorkspaceFolder
import typingsSlinky.vscode.mod.WorkspaceFoldersChangeEvent
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeJsonrpc.messagesMod.MessageType
import typingsSlinky.vscodeJsonrpc.mod.HandlerResult
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.DynamicFeature
import typingsSlinky.vscodeLanguageclient.clientMod.NextSignature
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.MiddlewareSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceFoldersMod {
  
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
  
  @JSImport("vscode-languageclient/lib/workspaceFolders", "arrayDiff")
  @js.native
  def arrayDiff[T](left: js.Array[T], right: js.Array[T]): js.Array[T] = js.native
  
  @js.native
  trait WorkspaceFolderWorkspaceMiddleware extends StObject {
    
    var didChangeWorkspaceFolders: js.UndefOr[NextSignature[WorkspaceFoldersChangeEvent, Unit]] = js.native
    
    var workspaceFolders: js.UndefOr[MiddlewareSignature] = js.native
  }
  object WorkspaceFolderWorkspaceMiddleware {
    
    @scala.inline
    def apply(): WorkspaceFolderWorkspaceMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
    }
    
    @scala.inline
    implicit class WorkspaceFolderWorkspaceMiddlewareMutableBuilder[Self <: WorkspaceFolderWorkspaceMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidChangeWorkspaceFolders(value: NextSignature[WorkspaceFoldersChangeEvent, Unit]): Self = StObject.set(x, "didChangeWorkspaceFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidChangeWorkspaceFoldersUndefined: Self = StObject.set(x, "didChangeWorkspaceFolders", js.undefined)
      
      @scala.inline
      def setWorkspaceFolders(
        value: (/* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[
              (js.Array[
                typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
              ]) | Null, 
              Unit
            ]
      ): Self = StObject.set(x, "workspaceFolders", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
    }
  }
}
