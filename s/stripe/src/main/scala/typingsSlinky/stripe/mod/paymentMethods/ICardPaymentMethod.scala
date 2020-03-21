package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.AnonChecks
import typingsSlinky.stripe.AnonEmail
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var card: AnonChecks
  var `type`: card
}

object ICardPaymentMethod {
  @scala.inline
  def apply(
    card: AnonChecks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card,
    billing_details: AnonEmail = null,
    customer: String | ICustomer = null
  ): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethod]
  }
}

