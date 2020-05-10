package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentDataShipping extends js.Object {
  /**
    * Shipping address.
    */
  var address: IAddress = js.native
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. This can be unset by updating the value to null and then saving.
    */
  var carrier: js.UndefOr[String | Null] = js.native
  /**
    * Recipient name. This can be unset by updating the value to null and then saving.
    */
  var name: String | Null = js.native
  /**
    * Recipient phone (including extension). This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String | Null] = js.native
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers were generated for this purchase, please separate them with commas. This can be unset by updating the value to null and then saving.
    */
  var tracking_number: js.UndefOr[String | Null] = js.native
}

object IPaymentIntentDataShipping {
  @scala.inline
  def apply(address: IAddress): IPaymentIntentDataShipping = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentDataShipping]
  }
  @scala.inline
  implicit class IPaymentIntentDataShippingOps[Self <: IPaymentIntentDataShipping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: IAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCarrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(null)
        ret
    }
    @scala.inline
    def withTracking_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_number")(js.undefined)
        ret
    }
    @scala.inline
    def withTracking_numberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_number")(null)
        ret
    }
  }
  
}

