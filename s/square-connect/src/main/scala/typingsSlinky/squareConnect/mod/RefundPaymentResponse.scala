package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RefundPaymentResponse")
@js.native
class RefundPaymentResponse () extends js.Object {
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The successfully created `PaymentRefund`.
    */
  var refund: js.UndefOr[PaymentRefund] = js.native
}
