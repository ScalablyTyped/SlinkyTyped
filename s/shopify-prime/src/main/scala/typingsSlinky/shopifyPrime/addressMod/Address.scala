package typingsSlinky.shopifyPrime.addressMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends ShopifyObject {
  /**
    * The mailing address.
    */
  var address1: js.UndefOr[String] = js.native
  /**
    * An additional field for the mailing address.
    */
  var address2: js.UndefOr[String] = js.native
  /**
    * The city.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The company.
    */
  var company: js.UndefOr[String] = js.native
  /**
    * The country.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The two-letter country code corresponding to the country.
    */
  var country_code: js.UndefOr[String] = js.native
  /**
    * The normalized country name.
    */
  var country_name: js.UndefOr[String] = js.native
  /**
    * Indicates whether this address is the default address.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * The first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The phone number.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The province or state name
    */
  var province: js.UndefOr[String] = js.native
  /**
    * The two-letter province or state code.
    */
  var province_code: js.UndefOr[String] = js.native
  /**
    * The ZIP or postal code.
    */
  var zip: js.UndefOr[String] = js.native
}

object Address {
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(js.undefined)
        ret
    }
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
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
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
    def withCountry_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_name")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(js.undefined)
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
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(js.undefined)
        ret
    }
    @scala.inline
    def withProvince_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvince_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province_code")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

