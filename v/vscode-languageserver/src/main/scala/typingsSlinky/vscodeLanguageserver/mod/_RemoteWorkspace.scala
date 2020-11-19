package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _RemoteWorkspace extends js.Object {
  
  /**
    * Applies a `WorkspaceEdit` to the workspace
    * @param param the workspace edit params.
    * @return a thenable that resolves to the `ApplyWorkspaceEditResponse`.
    */
  def applyEdit(paramOrEdit: ApplyWorkspaceEditParams): js.Promise[ApplyWorkspaceEditResponse] = js.native
  def applyEdit(paramOrEdit: typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit): js.Promise[ApplyWorkspaceEditResponse] = js.native
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
}
