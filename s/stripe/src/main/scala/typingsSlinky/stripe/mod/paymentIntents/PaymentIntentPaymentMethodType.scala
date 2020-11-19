package typingsSlinky.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Payment methods supported by Payment Intents. This is a subsetset of all Payment Method types. See https://stripe.com/docs/api/payment_methods/create#create_payment_method-type */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.card
  - typingsSlinky.stripe.stripeStrings.ideal
  - typingsSlinky.stripe.stripeStrings.sepa_debit
*/
trait PaymentIntentPaymentMethodType extends js.Object
object PaymentIntentPaymentMethodType {
  
  @scala.inline
  def card: typingsSlinky.stripe.stripeStrings.card = "card".asInstanceOf[typingsSlinky.stripe.stripeStrings.card]
  
  @scala.inline
  def ideal: typingsSlinky.stripe.stripeStrings.ideal = "ideal".asInstanceOf[typingsSlinky.stripe.stripeStrings.ideal]
  
  @scala.inline
  def sepa_debit: typingsSlinky.stripe.stripeStrings.sepa_debit = "sepa_debit".asInstanceOf[typingsSlinky.stripe.stripeStrings.sepa_debit]
}
