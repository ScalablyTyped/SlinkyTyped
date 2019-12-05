package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typingsSlinky.vscodeDashLanguageserver.Thenable
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.ApplyWorkspaceEditParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.ApplyWorkspaceEditResponse
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
  def applyEdit(
    paramOrEdit: typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
  ): Thenable[ApplyWorkspaceEditResponse] = js.native
}

