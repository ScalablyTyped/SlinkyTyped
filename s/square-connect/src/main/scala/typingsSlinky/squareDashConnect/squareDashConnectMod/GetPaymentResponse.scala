package typingsSlinky.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "GetPaymentResponse")
@js.native
class GetPaymentResponse () extends js.Object {
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * The requested `Payment`.
    */
  var payment: js.UndefOr[Payment] = js.native
}

