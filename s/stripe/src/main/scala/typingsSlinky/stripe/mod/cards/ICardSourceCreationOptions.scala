package typingsSlinky.stripe.mod.cards

import typingsSlinky.stripe.mod.IOptionsMetadata
import typingsSlinky.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardSourceCreationOptions extends js.Object {
  var address_city: js.UndefOr[String] = js.native
  var address_country: js.UndefOr[String] = js.native
  var address_line1: js.UndefOr[String] = js.native
  var address_line2: js.UndefOr[String] = js.native
  var address_state: js.UndefOr[String] = js.native
  var address_zip: js.UndefOr[String] = js.native
  /**
    * Card security code. Required unless your account is registered in
    * Australia, Canada, or the United States. Highly recommended to always
    * include this value.
    */
  var cvc: js.UndefOr[String] = js.native
  /**
    * Two digit number representing the card's expiration month.
    */
  var exp_month: Double = js.native
  /**
    * Two or four digit number representing the card's expiration year.
    */
  var exp_year: Double = js.native
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * Cardholder's full name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The card number, as a string without any separators.
    */
  var number: String = js.native
  /**
    * The type of payment source. Should be "card".
    */
  var `object`: card = js.native
}

object ICardSourceCreationOptions {
  @scala.inline
  def apply(exp_month: Double, exp_year: Double, number: String, `object`: card): ICardSourceCreationOptions = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardSourceCreationOptions]
  }
  @scala.inline
  implicit class ICardSourceCreationOptionsOps[Self <: ICardSourceCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExp_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: card): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_city(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_city: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_city")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_country(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_country: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_country")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_line1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_line1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_line2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_line2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line2")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_state")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_zip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_zip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip")(js.undefined)
        ret
    }
    @scala.inline
    def withCvc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCvc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: IOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

