package typingsSlinky.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantData extends js.Object {
  /**
    * A categorization of the seller’s type of business. See our merchant categories guide for a list of possible values.
    */
  var category: String = js.native
  /**
    * City where the seller is located
    */
  var city: String = js.native
  /**
    * Country where the seller is located
    */
  var country: String = js.native
  /**
    * Name of the seller
    */
  var name: String = js.native
  /**
    * Identifier assigned to the seller by the card brand
    */
  var network_id: String = js.native
  /**
    * Postal code where the seller is located
    */
  var postal_code: String = js.native
  /**
    * State where the seller is located
    */
  var state: String = js.native
  /**
    * The url an online purchase was made from
    */
  var url: String = js.native
}

object MerchantData {
  @scala.inline
  def apply(
    category: String,
    city: String,
    country: String,
    name: String,
    network_id: String,
    postal_code: String,
    state: String,
    url: String
  ): MerchantData = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantData]
  }
  @scala.inline
  implicit class MerchantDataOps[Self <: MerchantData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

