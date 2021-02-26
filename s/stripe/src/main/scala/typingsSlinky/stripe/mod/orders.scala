package typingsSlinky.stripe.mod

import typingsSlinky.stripe.anon.Canceled
import typingsSlinky.stripe.anon.Earliest
import typingsSlinky.stripe.anon.Fulfilled
import typingsSlinky.stripe.mod.cards.ICardSourceCreationOptions
import typingsSlinky.stripe.mod.charges.ICharge
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.skus.ISku
import typingsSlinky.stripe.stripeStrings.discount
import typingsSlinky.stripe.stripeStrings.order
import typingsSlinky.stripe.stripeStrings.order_item
import typingsSlinky.stripe.stripeStrings.shipping
import typingsSlinky.stripe.stripeStrings.sku
import typingsSlinky.stripe.stripeStrings.tax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orders {
  
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
    var status_transitions: Canceled = js.native
    
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
      status_transitions: Canceled,
      updated: Double
    ): IOrder = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_coupon_code = external_coupon_code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], selected_shipping_method = selected_shipping_method.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], shipping_methods = shipping_methods.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOrder]
    }
    
    @scala.inline
    implicit class IOrderMutableBuilder[Self <: IOrder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_returned(value: Double): Self = StObject.set(x, "amount_returned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_fee(value: Double): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharge(value: String | ICharge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_coupon_code(value: String): Self = StObject.set(x, "external_coupon_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[IOrderItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: IOrderItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: order): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected_shipping_method(value: String): Self = StObject.set(x, "selected_shipping_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_methods(value: js.Array[IShippingMethod]): Self = StObject.set(x, "shipping_methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_methodsVarargs(value: IShippingMethod*): Self = StObject.set(x, "shipping_methods", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: OrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus_transitions(value: Canceled): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class IOrderCreationOptionsMutableBuilder[Self <: IOrderCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[IOrderItemCreationHash]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: IOrderItemCreationHash*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    }
  }
  
  @js.native
  trait IOrderItem extends IObject {
    
    /**
      * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
      * representing the total amount for the line item.
      */
    var amount: Double = js.native
    
    /**
      * 3-letter ISO code representing the currency of the line item.
      */
    var currency: String = js.native
    
    /**
      * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
      */
    var description: String = js.native
    
    /**
      * value is "order_item"
      */
    @JSName("object")
    var object_IOrderItem: order_item = js.native
    
    /**
      * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to a SKU). [Expandable]
      */
    var parent: String | ISku = js.native
    
    /**
      * A positive integer representing the number of instances of parent that are included in this order item.
      * Applicable/present only if type is sku.
      */
    var quantity: Double = js.native
    
    /**
      * The type of line item. One of "sku", "tax", "shipping", or "discount".
      */
    var `type`: sku | tax | shipping | discount = js.native
  }
  object IOrderItem {
    
    @scala.inline
    def apply(
      amount: Double,
      currency: String,
      description: String,
      `object`: order_item,
      parent: String | ISku,
      quantity: Double,
      `type`: sku | tax | shipping | discount
    ): IOrderItem = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOrderItem]
    }
    
    @scala.inline
    implicit class IOrderItemMutableBuilder[Self <: IOrderItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: order_item): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: String | ISku): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: sku | tax | shipping | discount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOrderItemCreationHash extends StObject {
    
    /**
      * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
      * representing the total amount for the line item.
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * 3-letter ISO code representing the currency of the line item.
      */
    var currency: js.UndefOr[String] = js.native
    
    /**
      * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The ID of the SKU being ordered.
      */
    var parent: String = js.native
    
    /**
      * The quantity of this order item. When type is sku, this is the number of instances of the SKU to be ordered.
      */
    var quantity: js.UndefOr[Double] = js.native
    
    /**
      * The type of line item. One of "sku", "tax", "shipping", or "discount".
      */
    var `type`: js.UndefOr[sku | tax | shipping | discount] = js.native
  }
  object IOrderItemCreationHash {
    
    @scala.inline
    def apply(parent: String): IOrderItemCreationHash = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOrderItemCreationHash]
    }
    
    @scala.inline
    implicit class IOrderItemCreationHashMutableBuilder[Self <: IOrderItemCreationHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setType(value: sku | tax | shipping | discount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IOrderListOptions extends IListOptionsCreated {
    
    /**
      * Only return orders for the given customer
      */
    var customer: js.UndefOr[String] = js.native
    
    /**
      * Only return orders with the given IDs
      */
    var ids: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Only return orders that have the given status. One of "created", "paid", "fulfilled", or "refunded".
      */
    var status: OrderStatus = js.native
    
    /**
      * Filter orders based on when they were "paid", "fulfilled", "canceled", or "returned"
      */
    var status_transitions: js.UndefOr[Fulfilled] = js.native
  }
  object IOrderListOptions {
    
    @scala.inline
    def apply(status: OrderStatus): IOrderListOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOrderListOptions]
    }
    
    @scala.inline
    implicit class IOrderListOptionsMutableBuilder[Self <: IOrderListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: OrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus_transitions(value: Fulfilled): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus_transitionsUndefined: Self = StObject.set(x, "status_transitions", js.undefined)
    }
  }
  
  @js.native
  trait IOrderPayOptions extends IDataOptionsWithMetadata {
    
    /**
      * A fee in cents/pence that will be applied to the order and transferred to the application owner's Stripe account. To use an application
      * fee, the request must be made on behalf of another account, using the Stripe-Account header or OAuth key. For more information, see
      * the application fees documentation.
      */
    var application_fee: js.UndefOr[Double] = js.native
    
    /**
      * The ID of an existing customer that will be charged in this request.
      *
      * Either customer or source is required
      */
    var customer: js.UndefOr[String] = js.native
    
    /**
      * The email address of the customer placing the order. If a customer is specified, that customer's email address will be used.
      *
      * Optional, but required if not previously specified.
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * A payment source to be charged, such as a credit card. If you also pass a customer ID, the source must be the ID of a source belonging
      * to the customer. Otherwise, if you do not pass a customer ID, the source you provide must either be a token, like the ones returned
      * by Stripe.js, or a object containing a user's credit card details, with the options described below. Although not all information is
      * required, the extra info helps prevent fraud.
      *
      * Either source or customer is required
      */
    var source: js.UndefOr[String | ICardSourceCreationOptions] = js.native
  }
  object IOrderPayOptions {
    
    @scala.inline
    def apply(): IOrderPayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOrderPayOptions]
    }
    
    @scala.inline
    implicit class IOrderPayOptionsMutableBuilder[Self <: IOrderPayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication_fee(value: Double): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_feeUndefined: Self = StObject.set(x, "application_fee", js.undefined)
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setSource(value: String | ICardSourceCreationOptions): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait IOrderUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
      */
    var coupon: js.UndefOr[String] = js.native
    
    /**
      * The shipping method to select for fulfilling this order. If specified, must be one of the ids of a shipping method in the
      * shipping_methods array. If specified, will overwrite the existing selected shipping method, updating items as necessary.
      */
    var selected_shipping_method: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[OrderStatus] = js.native
  }
  object IOrderUpdateOptions {
    
    @scala.inline
    def apply(): IOrderUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOrderUpdateOptions]
    }
    
    @scala.inline
    implicit class IOrderUpdateOptionsMutableBuilder[Self <: IOrderUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      @scala.inline
      def setSelected_shipping_method(value: String): Self = StObject.set(x, "selected_shipping_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected_shipping_methodUndefined: Self = StObject.set(x, "selected_shipping_method", js.undefined)
      
      @scala.inline
      def setStatus(value: OrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait IShippingMethod extends StObject {
    
    /**
      * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
      * representing the total amount for the line item.
      */
    var amount: Double = js.native
    
    /**
      * 3-letter ISO code representing the currency of the line item.
      */
    var currency: String = js.native
    
    /**
      * The estimated delivery date for the given shipping method. Can be either a specific date or a range.
      */
    var delivery_estimate: Earliest = js.native
    
    /**
      * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
      */
    var description: String = js.native
    
    var id: String = js.native
  }
  object IShippingMethod {
    
    @scala.inline
    def apply(amount: Double, currency: String, delivery_estimate: Earliest, description: String, id: String): IShippingMethod = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delivery_estimate = delivery_estimate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShippingMethod]
    }
    
    @scala.inline
    implicit class IShippingMethodMutableBuilder[Self <: IShippingMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelivery_estimate(value: Earliest): Self = StObject.set(x, "delivery_estimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Current order status. One of created, paid, canceled, fulfilled, or returned. More detail in the Relay API Overview.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.created
    - typingsSlinky.stripe.stripeStrings.paid
    - typingsSlinky.stripe.stripeStrings.canceled
    - typingsSlinky.stripe.stripeStrings.fulfilled
    - typingsSlinky.stripe.stripeStrings.returned
  */
  trait OrderStatus extends StObject
  object OrderStatus {
    
    @scala.inline
    def canceled: typingsSlinky.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.canceled]
    
    @scala.inline
    def created: typingsSlinky.stripe.stripeStrings.created = "created".asInstanceOf[typingsSlinky.stripe.stripeStrings.created]
    
    @scala.inline
    def fulfilled: typingsSlinky.stripe.stripeStrings.fulfilled = "fulfilled".asInstanceOf[typingsSlinky.stripe.stripeStrings.fulfilled]
    
    @scala.inline
    def paid: typingsSlinky.stripe.stripeStrings.paid = "paid".asInstanceOf[typingsSlinky.stripe.stripeStrings.paid]
    
    @scala.inline
    def returned: typingsSlinky.stripe.stripeStrings.returned = "returned".asInstanceOf[typingsSlinky.stripe.stripeStrings.returned]
  }
}
