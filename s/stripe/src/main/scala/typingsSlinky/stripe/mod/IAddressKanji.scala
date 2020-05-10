package typingsSlinky.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddressKanji extends js.Object {
  /**
    * City or ward.
    * This can be unset by updating the value to null and then saving.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * Two-letter country code (ISO 3166-1 alpha-2).
    * This can be unset by updating the value to null and then saving.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Block or building number.
    * This can be unset by updating the value to null and then saving.
    */
  var line1: js.UndefOr[String] = js.native
  /**
    * Building details.
    * This can be unset by updating the value to null and then saving.
    */
  var line2: js.UndefOr[String] = js.native
  /**
    * Postal code.
    * This can be unset by updating the value to null and then saving.
    */
  var postal_code: js.UndefOr[String] = js.native
  /**
    * Prefecture.
    * This can be unset by updating the value to null and then saving.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Town or cho-me.
    * This can be unset by updating the value to null and then saving.
    */
  var town: js.UndefOr[String] = js.native
}

object IAddressKanji {
  @scala.inline
  def apply(): IAddressKanji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddressKanji]
  }
  @scala.inline
  implicit class IAddressKanjiOps[Self <: IAddressKanji] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("town")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("town")(js.undefined)
        ret
    }
  }
  
}

