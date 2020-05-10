package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactLocationField extends IContactField {
  var city: String = js.native
  var country: String = js.native
  var postalCode: String = js.native
  var region: String = js.native
  var street: String = js.native
  var unstructuredAddress: String = js.native
}

object IContactLocationField {
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    city: String,
    country: String,
    name: String,
    postalCode: String,
    region: String,
    street: String,
    `type`: ContactFieldType,
    unstructuredAddress: String,
    value: String
  ): IContactLocationField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], unstructuredAddress = unstructuredAddress.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactLocationField]
  }
  @scala.inline
  implicit class IContactLocationFieldOps[Self <: IContactLocationField] (val x: Self) extends AnyVal {
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
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnstructuredAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstructuredAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

