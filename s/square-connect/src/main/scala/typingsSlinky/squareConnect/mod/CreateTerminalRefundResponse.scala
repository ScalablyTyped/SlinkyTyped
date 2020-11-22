package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateTerminalRefundResponse")
@js.native
class CreateTerminalRefundResponse () extends js.Object {
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The created `TerminalRefund`
    */
  var refund: js.UndefOr[TerminalRefund] = js.native
}
