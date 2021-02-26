package typingsSlinky.vscodeLanguageserver

import typingsSlinky.vscodeJsonrpc.eventsMod.Disposable
import typingsSlinky.vscodeJsonrpc.eventsMod.Event
import typingsSlinky.vscodeLanguageserver.mod.Feature
import typingsSlinky.vscodeLanguageserver.mod._RemoteWorkspace
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceFoldersMod {
  
  @JSImport("vscode-languageserver/lib/workspaceFolders", "WorkspaceFoldersFeature")
  @js.native
  val WorkspaceFoldersFeature: Feature[_RemoteWorkspace, WorkspaceFolders] = js.native
  
  @js.native
  trait WorkspaceFolders extends StObject {
    
    def getWorkspaceFolders(): js.Promise[js.Array[WorkspaceFolder] | Null] = js.native
    
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _]): Disposable = js.native
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _], thisArgs: js.Any): Disposable = js.native
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    @JSName("onDidChangeWorkspaceFolders")
    var onDidChangeWorkspaceFolders_Original: Event[WorkspaceFoldersChangeEvent] = js.native
  }
}
