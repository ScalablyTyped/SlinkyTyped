package typingsSlinky.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardholderBillingAddress extends js.Object {
  /**
    * City/District/Suburb/Town/Village.
    */
  var city: String = js.native
  /**
    * 2-letter country code.
    */
  var country: String = js.native
  /**
    * Address line 1 (Street address/PO Box/Company name).
    */
  var line1: String = js.native
  /**
    * Address line 2 (Apartment/Suite/Unit/Building).
    */
  var line2: js.UndefOr[String] = js.native
  /**
    * ZIP or postal code.
    */
  var postal_code: String = js.native
  /**
    * State/County/Province/Region.
    */
  var state: js.UndefOr[String] = js.native
}

object ICardholderBillingAddress {
  @scala.inline
  def apply(city: String, country: String, line1: String, postal_code: String): ICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderBillingAddress]
  }
  @scala.inline
  implicit class ICardholderBillingAddressOps[Self <: ICardholderBillingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line2")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

