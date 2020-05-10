package typingsSlinky.shopifyPrime.customerMod

import typingsSlinky.shopifyPrime.addressMod.Address
import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customer extends ShopifyObject {
  /**
    * Indicates whether the customer has consented to be sent marketing material via email.
    */
  var accepts_marketing: js.UndefOr[Boolean] = js.native
  /**
    * A list of addresses for the customer.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  /**
    * The date and time when the customer was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The default address for the customer.
    */
  var default_address: js.UndefOr[Address] = js.native
  /**
    * The email address of the customer.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The customer's first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The customer's last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * The id of the customer's last order.
    */
  var last_order_id: js.UndefOr[Double] = js.native
  /**
    * The name of the customer's last order. This is directly related to the Order's name field.
    */
  var last_order_name: js.UndefOr[String] = js.native
  /**
    * The customer's identifier used with Multipass login
    */
  var multipass_identifier: js.UndefOr[String] = js.native
  /**
    * A note about the customer.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The number of orders associated with this customer.
    */
  var orders_count: js.UndefOr[Double] = js.native
  /**
    * The state of the customer in a shop. Known values are 'disabled', 'decline', 'invited' and 'enabled'.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values.
    */
  var tags: js.UndefOr[String] = js.native
  /**
    * Indicates whether the customer should be charged taxes when placing orders.
    */
  var tax_exempt: js.UndefOr[Boolean] = js.native
  /**
    * The total amount of money that the customer has spent at the shop. Note: the Shopify API may return this as a string value.
    */
  var total_spent: js.UndefOr[String | Double] = js.native
  /**
    * The date and time when the customer information was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * States whether or not the email address has been verified.
    */
  var verified_email: js.UndefOr[Boolean] = js.native
}

object Customer {
  @scala.inline
  def apply(): Customer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customer]
  }
  @scala.inline
  implicit class CustomerOps[Self <: Customer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepts_marketing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts_marketing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepts_marketing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts_marketing")(js.undefined)
        ret
    }
    @scala.inline
    def withAddresses(value: js.Array[Address]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_address")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
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
    def withLast_order_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_order_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_order_id")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_order_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_order_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_order_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_order_name")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipass_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipass_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipass_identifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipass_identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withOrders_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orders_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrders_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orders_count")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_exempt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_exempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_exempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_exempt")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_spent(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_spent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_spent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_spent")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withVerified_email(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerified_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_email")(js.undefined)
        ret
    }
  }
  
}

