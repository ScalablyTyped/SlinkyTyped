package typingsSlinky.stripe.mod.countrySpecs

import typingsSlinky.stripe.anon.Company
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.country_spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICountrySpec extends IResourceObject {
  /**
    * The default currency for this country. This applies to both payment methods and bank accounts.
    */
  var default_currency: String = js.native
  /**
    * Value is "country_spec"
    */
  @JSName("object")
  var object_ICountrySpec: country_spec = js.native
  /**
    * Currencies that can be accepted in the specified country (for payments).
    */
  var supported_payment_currencies: js.Array[String] = js.native
  /**
    * Payment methods available in the specified country. You will need to enable bitcoin and ACH payments on your account for those methods to
    * appear in this list. The stripe payment method refers to charging through your platform.
    */
  var supported_payment_methods: js.Array[String] = js.native
  /**
    * Lists the types of verification data needed to keep an account open. Includes 'minimum' fields, which every account must eventually
    * provide, as well as a 'additional' fields, which are only required for some merchants.
    */
  var verification_fields: Company = js.native
}

object ICountrySpec {
  @scala.inline
  def apply(
    default_currency: String,
    id: String,
    `object`: country_spec,
    supported_payment_currencies: js.Array[String],
    supported_payment_methods: js.Array[String],
    verification_fields: Company
  ): ICountrySpec = {
    val __obj = js.Dynamic.literal(default_currency = default_currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], supported_payment_currencies = supported_payment_currencies.asInstanceOf[js.Any], supported_payment_methods = supported_payment_methods.asInstanceOf[js.Any], verification_fields = verification_fields.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountrySpec]
  }
  @scala.inline
  implicit class ICountrySpecOps[Self <: ICountrySpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: country_spec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported_payment_currencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported_payment_currencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported_payment_methods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported_payment_methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerification_fields(value: Company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification_fields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

