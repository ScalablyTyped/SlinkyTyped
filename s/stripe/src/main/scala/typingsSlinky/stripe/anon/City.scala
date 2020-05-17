package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  /**
    * City/Suburb/Town/Village
    */
  var city: js.UndefOr[String] = js.native
  /**
    * 2-letter country code
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var line1: js.UndefOr[String] = js.native
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var line2: js.UndefOr[String] = js.native
  /**
    * Zip/Postal Code
    */
  var postal_code: js.UndefOr[String] = js.native
  /**
    * State/Province/County
    */
  var state: js.UndefOr[String] = js.native
}

object City {
  @scala.inline
  def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
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
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withLine1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line1")(js.undefined)
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
    def withPostal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostal_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(js.undefined)
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

