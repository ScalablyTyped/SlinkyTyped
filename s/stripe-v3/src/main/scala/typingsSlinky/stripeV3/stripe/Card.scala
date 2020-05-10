package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripeV3Strings.not_supported
import typingsSlinky.stripeV3.stripeV3Strings.optional
import typingsSlinky.stripeV3.stripeV3Strings.recommended
import typingsSlinky.stripeV3.stripeV3Strings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card extends js.Object {
  var address_city: js.UndefOr[String] = js.native
  var address_country: js.UndefOr[String] = js.native
  var address_line1: js.UndefOr[String] = js.native
  var address_line1_check: js.UndefOr[checkType] = js.native
  var address_line2: js.UndefOr[String] = js.native
  var address_state: js.UndefOr[String] = js.native
  var address_zip: js.UndefOr[String] = js.native
  var address_zip_check: js.UndefOr[checkType] = js.native
  var brand: brandType = js.native
  var country: String = js.native
  var currency: js.UndefOr[String] = js.native
  var cvc_check: js.UndefOr[checkType] = js.native
  var dynamic_last4: String = js.native
  var exp_month: Double = js.native
  var exp_year: Double = js.native
  var fingerprint: String = js.native
  var funding: fundingType = js.native
  var id: String = js.native
  var last4: String = js.native
  var metadata: js.Any = js.native
  var name: js.UndefOr[String] = js.native
  var `object`: String = js.native
  var three_d_secure: js.UndefOr[required | recommended | optional | not_supported] = js.native
  var tokenization_method: js.UndefOr[tokenizationType] = js.native
}

object Card {
  @scala.inline
  def apply(
    brand: brandType,
    country: String,
    dynamic_last4: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    id: String,
    last4: String,
    metadata: js.Any,
    `object`: String
  ): Card = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: brandType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamic_last4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic_last4")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunding(value: fundingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: String): Self = {
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
    def withAddress_line1_check(value: checkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_line1_check: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1_check")(js.undefined)
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
    def withAddress_zip_check(value: checkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_zip_check: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip_check")(js.undefined)
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
    @scala.inline
    def withCvc_check(value: checkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCvc_check: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_check")(js.undefined)
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
    @scala.inline
    def withThree_d_secure(value: required | recommended | optional | not_supported): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThree_d_secure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenization_method(value: tokenizationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenization_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenization_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenization_method")(js.undefined)
        ret
    }
  }
  
}

