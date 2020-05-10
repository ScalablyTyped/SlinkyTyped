package typingsSlinky.stripe.mod.orders

import typingsSlinky.stripe.AnonCanceled
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.IShippingInformation
import typingsSlinky.stripe.mod.charges.ICharge
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.stripeStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrder extends IResourceObject {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount for the order.
    */
  var amount: Double = js.native
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount returned for the order thus far.
    */
  var amount_returned: Double = js.native
  /**
    * ID of the Connect Application that created the order.
    */
  var application: String = js.native
  var application_fee: Double = js.native
  /**
    * The ID of the payment used to pay for the order. Present if the order status is paid, fulfilled, or refunded. [Expandable]
    */
  var charge: String | ICharge = js.native
  var created: Double = js.native
  /**
    * 3-letter ISO code representing the currency in which the order was made.
    */
  var currency: String = js.native
  /**
    * The customer used for the order. [Expandable]
    */
  var customer: String | ICustomer = js.native
  /**
    * The email address of the customer placing the order.
    */
  var email: String = js.native
  var external_coupon_code: String = js.native
  /**
    * List of items constituting the order.
    */
  var items: js.Array[IOrderItem] = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is "order"
    */
  @JSName("object")
  var object_IOrder: order = js.native
  /**
    * The shipping method that is currently selected for this order, if any. If present, it is equal to one of the ids of shipping methods
    * in the shipping_methods array. At order creation time, if there are multiple shipping methods, Stripe will automatically selected
    * the first method.
    */
  var selected_shipping_method: String = js.native
  /**
    * The shipping address for the order. Present if the order is for goods to be shipped.
    */
  var shipping: IShippingInformation = js.native
  /**
    * A list of supported shipping methods for this order. The desired shipping method can be specified either by updating the order, or
    * when paying it.
    */
  var shipping_methods: js.Array[IShippingMethod] = js.native
  var status: OrderStatus = js.native
  /**
    * The timestamps at which the order status was updated
    */
  var status_transitions: AnonCanceled = js.native
  var updated: Double = js.native
}

object IOrder {
  @scala.inline
  def apply(
    amount: Double,
    amount_returned: Double,
    application: String,
    application_fee: Double,
    charge: String | ICharge,
    created: Double,
    currency: String,
    customer: String | ICustomer,
    email: String,
    external_coupon_code: String,
    id: String,
    items: js.Array[IOrderItem],
    livemode: Boolean,
    metadata: IMetadata,
    `object`: order,
    selected_shipping_method: String,
    shipping: IShippingInformation,
    shipping_methods: js.Array[IShippingMethod],
    status: OrderStatus,
    status_transitions: AnonCanceled,
    updated: Double
  ): IOrder = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_coupon_code = external_coupon_code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], selected_shipping_method = selected_shipping_method.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], shipping_methods = shipping_methods.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrder]
  }
  @scala.inline
  implicit class IOrderOps[Self <: IOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_returned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_returned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication_fee(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharge(value: String | ICharge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: String | ICustomer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_coupon_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_coupon_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IOrderItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected_shipping_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected_shipping_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShipping(value: IShippingInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShipping_methods(value: js.Array[IShippingMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: OrderStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus_transitions(value: AnonCanceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

