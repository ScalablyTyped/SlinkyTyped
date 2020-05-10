package typingsSlinky.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShippingInformation extends js.Object {
  /**
    * Shipping address.
    */
  var address: IAddress = js.native
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
    */
  var carrier: js.UndefOr[String | Null] = js.native
  /**
    * Recipient name.
    */
  var name: String = js.native
  /**
    * Recipient phone (including extension).
    */
  var phone: js.UndefOr[String | Null] = js.native
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple
    * tracking numbers were generated for this purchase, please separate them with commas.
    */
  var tracking_number: js.UndefOr[String | Null] = js.native
}

object IShippingInformation {
  @scala.inline
  def apply(address: IAddress, name: String): IShippingInformation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShippingInformation]
  }
  @scala.inline
  implicit class IShippingInformationOps[Self <: IShippingInformation] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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

