package typingsSlinky.stripejs.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customer extends js.Object {
  /**
    * The Address of the customer
    */
  var address: Address = js.native
  /**
    * The email address of the customer
    */
  var email: String = js.native
  /**
    * The full name of the owner
    */
  var name: String = js.native
  /**
    * The phone number of the customer
    * NOTE: This includes the extension
    */
  var phone: String = js.native
  /**
    * Verified customer’s address
    */
  val verified_address: Address = js.native
  /**
    * Verified customer’s email address
    */
  val verified_email: String = js.native
  /**
    * Verified customer’s full name
    */
  val verified_name: String = js.native
  /**
    * Verified customer’s phone number
    */
  val verified_phone: String = js.native
}

object Customer {
  @scala.inline
  def apply(
    address: Address,
    email: String,
    name: String,
    phone: String,
    verified_address: Address,
    verified_email: String,
    verified_name: String,
    verified_phone: String
  ): Customer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_email = verified_email.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any], verified_phone = verified_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
  @scala.inline
  implicit class CustomerOps[Self <: Customer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_phone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_phone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

