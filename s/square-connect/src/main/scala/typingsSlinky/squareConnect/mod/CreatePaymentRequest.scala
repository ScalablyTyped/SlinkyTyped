package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreatePaymentRequest")
@js.native
class CreatePaymentRequest () extends js.Object {
  
  /**
    * If set to true and charging a Square Gift Card, a payment may be returned with amount_money equal to less than what was requested.
    * Example, a request for $20 when charging a Square Gift Card with balance of $5 wil result in an APPROVED payment of $5.
    * You may choose to prompt the buyer for an additional payment to cover the remainder, or cancel the gift card payment.
    * Cannot be `true` when `autocomplete = true`. For more information, see [Partial amount with Square gift cards]
    * (https://developer.squareup.com/docs/payments-api/take-payments#partial-payment-gift-card). Default: false.
    */
  var accept_partial_authorization: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of money to accept for this payment, not including `tip_money`.
    * Must be specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
    * See [Working with monetary amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for details.
    * The currency code must match the currency associated with the business that is accepting the payment.
    */
  var amount_money: Money = js.native
  
  /**
    * The amount of money the developer is taking as a fee for facilitating the payment on behalf of the seller.
    * Cannot be more than 90% of the total amount of the Payment. Must be specified in the smallest denomination of
    * the applicable currency. For example, US dollar amounts are specified in cents.
    * See [Working with monetary amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for details.
    * The fee currency code must match the currency associated with the merchant that is accepting the payment.
    * The application must be from a developer account in the same country, and using the same currency code, as the merchant.
    * For more information about the application fee scenario,
    * see [Collect Fees](https://developer.squareup.com/docs/payments-api/take-payments-and-collect-fees).
    */
  var app_fee_money: js.UndefOr[Money] = js.native
  
  /**
    * If set to `true`, this payment will be completed when possible.
    * If set to `false`, this payment will be held in an approved state until either explicitly completed (captured) or canceled (voided).
    * For more information, see [Delayed Payments](https://developer.squareup.com/docs/payments-api/take-payments#delayed-payments).
    * Default: true.
    */
  var autocomplete: js.UndefOr[Boolean] = js.native
  
  /**
    * The buyer's billing address.
    */
  var billing_address: js.UndefOr[Address] = js.native
  
  /**
    * The buyer's e-mail address
    */
  var buyer_email_address: js.UndefOr[String] = js.native
  
  /**
    * The ID of the customer associated with the payment.
    * Required if the `source_id` refers to a card on file created using the Customers API.
    */
  var customer_id: js.UndefOr[String] = js.native
  
  /**
    * The duration of time after the payment's creation when Square automatically cancels the payment.
    * This automatic cancellation applies only to payments that don't reach a terminal state (COMPLETED, CANCELED, or FAILED)
    * before the `delay_duration` time period. This parameter should be specified as a time duration, in RFC 3339 format,
    * with a minimum value of 1 minute. Notes: This feature is only supported for card payments.
    * This parameter can only be set for a delayed capture payment (`autocomplete=false`).
    * Default:
    *  - Card Present payments: "PT36H" (36 hours) from the creation time.
    *  - Card Not Present payments: "P7D" (7 days) from the creation time.
    */
  var delay_duration: js.UndefOr[String] = js.native
  
  /**
    * A unique string that identifies this CreatePayment request. Keys can be any valid string but must be unique
    * for every CreatePayment request. Max: 45 characters.
    * See [Idempotency keys](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    */
  var idempotency_key: String = js.native
  
  /**
    * The location ID to associate with the payment. If not specified, the default location is used.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * An optional note to be entered by the developer when creating a payment. Limit 500 characters.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * Associate a previously created order with this payment.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * A user-defined ID to associate with the payment. You can use this field to associate the payment to an entity
    * in an external system. For example, you might specify an order ID that is generated by a third-party shopping cart.
    * Limit 40 characters.
    */
  var reference_id: js.UndefOr[String] = js.native
  
  /**
    * The buyer's shipping address.
    */
  var shipping_address: js.UndefOr[Address] = js.native
  
  /**
    * The ID for the source of funds for this payment.
    * This can be a nonce generated by the Payment Form or a card on file made with the Customers API.
    */
  var source_id: String = js.native
  
  /**
    * Optional additional payment information to include on the customer's card statement as part of statement description.
    * This can be, for example, an invoice number, ticket number, or short description that uniquely identifies the purchase.
    * Limit 20 characters. Note that the statement_description_identifier may get truncated on the statement description
    * to fit the required information including the Square identifier (SQ *) and name of the merchant taking the payment.
    */
  var statement_description_identifier: js.UndefOr[String] = js.native
  
  /**
    * The amount designated as a tip, in addition to `amount_money`. Must be specified in the smallest denomination of
    * the applicable currency. For example, US dollar amounts are specified in cents.
    * See [Working with monetary amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for details.
    * The currency code must match the currency associated with the business that is accepting the payment.
    */
  var tip_money: js.UndefOr[Money] = js.native
  
  /**
    * An identifying token generated by `SqPaymentForm.verifyBuyer()`. Verification tokens encapsulate customer device
    * information and 3-D Secure challenge results to indicate that Square has verified the buyer identity.
    * See the [SCA Overview](https://developer.squareup.com/docs/sca-overview).
    */
  var verification_token: js.UndefOr[String] = js.native
}
