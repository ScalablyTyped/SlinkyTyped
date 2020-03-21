package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType0[js.Array[WorkspaceFolder] | Null, Unit, Unit] = js.native
}

