package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Payment Request API interface is used to store shipping or payment address information. */
@js.native
trait PaymentAddress extends js.Object {
  val addressLine: js.Array[java.lang.String] = js.native
  val city: java.lang.String = js.native
  val country: java.lang.String = js.native
  val dependentLocality: java.lang.String = js.native
  val languageCode: java.lang.String = js.native
  val organization: java.lang.String = js.native
  val phone: java.lang.String = js.native
  val postalCode: java.lang.String = js.native
  val recipient: java.lang.String = js.native
  val region: java.lang.String = js.native
  val sortingCode: java.lang.String = js.native
  def toJSON(): js.Any = js.native
}

object PaymentAddress {
  @scala.inline
  def apply(
    addressLine: js.Array[java.lang.String],
    city: java.lang.String,
    country: java.lang.String,
    dependentLocality: java.lang.String,
    languageCode: java.lang.String,
    organization: java.lang.String,
    phone: java.lang.String,
    postalCode: java.lang.String,
    recipient: java.lang.String,
    region: java.lang.String,
    sortingCode: java.lang.String,
    toJSON: () => js.Any
  ): PaymentAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dependentLocality = dependentLocality.asInstanceOf[js.Any], languageCode = languageCode.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PaymentAddress]
  }
  @scala.inline
  implicit class PaymentAddressOps[Self <: PaymentAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressLine(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependentLocality(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentLocality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageCode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortingCode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

