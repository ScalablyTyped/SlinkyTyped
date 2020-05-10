package typingsSlinky.stripeV3.stripe.paymentRequest

import typingsSlinky.stripeV3.stripeV3Strings.fail
import typingsSlinky.stripeV3.stripeV3Strings.invalid_shipping_address
import typingsSlinky.stripeV3.stripeV3Strings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetails extends js.Object {
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.native
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
  var status: success | fail | invalid_shipping_address = js.native
  var total: js.UndefOr[DisplayItem] = js.native
}

object UpdateDetails {
  @scala.inline
  def apply(status: success | fail | invalid_shipping_address): UpdateDetails = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetails]
  }
  @scala.inline
  implicit class UpdateDetailsOps[Self <: UpdateDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: success | fail | invalid_shipping_address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayItems(value: js.Array[DisplayItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptions(value: js.Array[ShippingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: DisplayItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

