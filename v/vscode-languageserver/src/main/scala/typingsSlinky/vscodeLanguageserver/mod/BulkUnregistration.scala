package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkUnregistration
  extends typingsSlinky.vscodeJsonrpc.eventsMod.Disposable {
  
  /**
    * Disposes a single registration. It will be removed from the
    * `BulkUnregistration`.
    */
  def disposeSingle(arg: String): Boolean = js.native
  def disposeSingle(arg: typingsSlinky.vscodeJsonrpc.messagesMod.MessageType): Boolean = js.native
}
@JSImport("vscode-languageserver", "BulkUnregistration")
@js.native
object BulkUnregistration extends js.Object {
  
  def create(): BulkUnregistration = js.native
}
