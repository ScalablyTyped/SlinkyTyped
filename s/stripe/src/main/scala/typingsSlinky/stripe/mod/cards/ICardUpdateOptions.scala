package typingsSlinky.stripe.mod.cards

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardUpdateOptions extends IDataOptionsWithMetadata {
  var address_city: js.UndefOr[String] = js.native
  var address_country: js.UndefOr[String] = js.native
  var address_line1: js.UndefOr[String] = js.native
  var address_line2: js.UndefOr[String] = js.native
  var address_state: js.UndefOr[String] = js.native
  var address_zip: js.UndefOr[String] = js.native
  /**
    * Only applicable on accounts (not customers or recipients).
    * If set to true, this card will become the default external
    * account for its currency.
    *
    * Managed accounts only
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
  var exp_month: js.UndefOr[Double] = js.native
  var exp_year: js.UndefOr[Double] = js.native
  /**
    * Cardholder name
    */
  var name: js.UndefOr[String] = js.native
}

object ICardUpdateOptions {
  @scala.inline
  def apply(): ICardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardUpdateOptions]
  }
  @scala.inline
  implicit class ICardUpdateOptionsOps[Self <: ICardUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefault_for_currency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_for_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_for_currency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_for_currency")(js.undefined)
        ret
    }
    @scala.inline
    def withExp_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp_month: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(js.undefined)
        ret
    }
    @scala.inline
    def withExp_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp_year: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(js.undefined)
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

