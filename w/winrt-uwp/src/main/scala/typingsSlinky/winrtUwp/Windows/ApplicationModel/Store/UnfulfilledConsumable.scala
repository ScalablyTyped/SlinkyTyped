package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains purchase and product information for an unfulfilled consumable in-app product. */
@js.native
trait UnfulfilledConsumable extends js.Object {
  /** A unique ID used to identify a consumable in-app product within a large purchase catalog. */
  var offerId: String = js.native
  /** A unique ID used to identify a consumable in-app product. This ID is used by the app to get info about the product or feature that is enabled when the customer buys it through an in-app purchase. */
  var productId: String = js.native
  /** A unique ID used to identify the transaction that included the purchase of a consumable in-app product. */
  var transactionId: String = js.native
}

object UnfulfilledConsumable {
  @scala.inline
  def apply(offerId: String, productId: String, transactionId: String): UnfulfilledConsumable = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnfulfilledConsumable]
  }
  @scala.inline
  implicit class UnfulfilledConsumableOps[Self <: UnfulfilledConsumable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

