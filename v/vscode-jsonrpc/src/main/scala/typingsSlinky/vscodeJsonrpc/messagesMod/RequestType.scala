package typingsSlinky.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/messages", "RequestType")
@js.native
class RequestType[P, R, E, RO] protected () extends AbstractMessageType {
  def this(method: String) = this()
  
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple5[P, R, E, RO, _EM]] = js.native
}
