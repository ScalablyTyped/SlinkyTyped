package typingsSlinky.stripe.mod.orders

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.mod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrderCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
    */
  var coupon: js.UndefOr[String] = js.native
  /**
    * 3-letter ISO code representing the currency in which the order should be made. Stripe will validate that all entries in items match
    * the currency specified here.
    */
  var currency: String = js.native
  /**
    * The ID of an existing customer to use for this order. If provided, the customer email and shipping address will be used to create
    * the order. Subsequently, the customer will also be charged to pay the order. If email or shipping are also provided, they will
    * override the values retrieved from the customer object.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * The email address of the customer placing the order.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * List of items constituting the order.
    */
  var items: js.UndefOr[js.Array[IOrderItemCreationHash]] = js.native
  /**
    * Shipping address for the order. Required if any of the SKUs are for products that have shippable set to true.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.native
}

object IOrderCreationOptions {
  @scala.inline
  def apply(currency: String): IOrderCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderCreationOptions]
  }
  @scala.inline
  implicit class IOrderCreationOptionsOps[Self <: IOrderCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoupon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoupon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
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
    def withItems(value: js.Array[IOrderItemCreationHash]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: IShippingInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
  }
  
}

