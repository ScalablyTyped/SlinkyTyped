package typingsSlinky.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CancelPaymentResponse")
@js.native
class CancelPaymentResponse () extends js.Object {
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * The successfully canceled `Payment` object.
    */
  var payment: js.UndefOr[Payment] = js.native
}

