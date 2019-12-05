package typingsSlinky.vscodeDashLanguageserver

import typingsSlinky.vscodeDashJsonrpc.libEventsMod.Disposable
import typingsSlinky.vscodeDashJsonrpc.libEventsMod.Event
import typingsSlinky.vscodeDashLanguageserver.libWorkspaceFoldersMod.WorkspaceFolders
import typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod.Feature
import typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod._RemoteWorkspace
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFolder
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/workspaceFolders", JSImport.Namespace)
@js.native
object libWorkspaceFoldersMod extends js.Object {
  @js.native
  trait WorkspaceFolders extends js.Object {
    @JSName("onDidChangeWorkspaceFolders")
    var onDidChangeWorkspaceFolders_Original: Event[WorkspaceFoldersChangeEvent] = js.native
    def getWorkspaceFolders(): Thenable[js.Array[WorkspaceFolder] | Null] = js.native
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _]): Disposable = js.native
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _], thisArgs: js.Any): Disposable = js.native
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
  }
  
  val WorkspaceFoldersFeature: Feature[_RemoteWorkspace, WorkspaceFolders] = js.native
}

