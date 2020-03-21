package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.Thenable
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _RemoteWorkspace extends Remote {
  /**
    * Applies a `WorkspaceEdit` to the workspace
    * @param param the workspace edit params.
    * @return a thenable that resolves to the `ApplyWorkspaceEditResponse`.
    */
  def applyEdit(paramOrEdit: ApplyWorkspaceEditParams): Thenable[ApplyWorkspaceEditResponse] = js.native
  def applyEdit(paramOrEdit: typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit): Thenable[ApplyWorkspaceEditResponse] = js.native
}

