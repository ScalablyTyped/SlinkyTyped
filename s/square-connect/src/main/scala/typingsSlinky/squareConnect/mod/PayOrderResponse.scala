package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "PayOrderResponse")
@js.native
class PayOrderResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * The paid, updated `order`.
    */
  var order: js.UndefOr[Order] = js.native
}

