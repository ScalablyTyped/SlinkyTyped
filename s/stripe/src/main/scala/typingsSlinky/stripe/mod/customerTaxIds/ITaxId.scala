package typingsSlinky.stripe.mod.customerTaxIds

import typingsSlinky.stripe.stripeStrings.string
import typingsSlinky.stripe.stripeStrings.tax_id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaxId extends js.Object {
  /**
    * Two-letter ISO code representing the country of the tax ID.
    */
  var country: string = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * ID of the customer.
    */
  var customer: String = js.native
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the
    * object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  var `object`: tax_id = js.native
  /**
    * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, nz_gst, or unknown.
    */
  var `type`: TaxIdType = js.native
  /**
    * Value of the tax ID.
    */
  var value: String = js.native
  /**
    * Tax ID verification information.
    */
  var verification: ITaxIdVerification = js.native
}

object ITaxId {
  @scala.inline
  def apply(
    country: string,
    created: Double,
    customer: String,
    id: String,
    livemode: Boolean,
    `object`: tax_id,
    `type`: TaxIdType,
    value: String,
    verification: ITaxIdVerification
  ): ITaxId = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxId]
  }
  @scala.inline
  implicit class ITaxIdOps[Self <: ITaxId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: tax_id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TaxIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerification(value: ITaxIdVerification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

