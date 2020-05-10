package typingsSlinky.stripejs.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenData extends js.Object {
  var address_city: String = js.native
  /**
    * A two character country code identifying the country
    * @example 'US'
    */
  var address_country: js.UndefOr[String] = js.native
  /**
    * Fields for billing address information.
    */
  var address_line1: String = js.native
  var address_line2: js.UndefOr[String] = js.native
  var address_state: String = js.native
  var address_zip: String = js.native
  /**
    * The amount paid, not a decimal. In USD this is in cents.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * Used to add a card to an account
    * NOTE: Currently, the only supported currency for debit card payouts is 'usd'
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The Cardholder name
    */
  var name: String = js.native
}

object TokenData {
  @scala.inline
  def apply(
    address_city: String,
    address_line1: String,
    address_state: String,
    address_zip: String,
    name: String
  ): TokenData = {
    val __obj = js.Dynamic.literal(address_city = address_city.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenData]
  }
  @scala.inline
  implicit class TokenDataOps[Self <: TokenData] (val x: Self) extends AnyVal {
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
    def withAddress_line1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_zip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
  }
  
}

