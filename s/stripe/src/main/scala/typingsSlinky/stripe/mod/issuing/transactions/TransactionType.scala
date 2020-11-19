package typingsSlinky.stripe.mod.issuing.transactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.capture
  - typingsSlinky.stripe.stripeStrings.refund
  - typingsSlinky.stripe.stripeStrings.cash_withdrawal
  - typingsSlinky.stripe.stripeStrings.refund_reversal
  - typingsSlinky.stripe.stripeStrings.dispute
  - typingsSlinky.stripe.stripeStrings.dispute_loss
*/
trait TransactionType extends js.Object
object TransactionType {
  
  @scala.inline
  def capture: typingsSlinky.stripe.stripeStrings.capture = "capture".asInstanceOf[typingsSlinky.stripe.stripeStrings.capture]
  
  @scala.inline
  def cash_withdrawal: typingsSlinky.stripe.stripeStrings.cash_withdrawal = "cash_withdrawal".asInstanceOf[typingsSlinky.stripe.stripeStrings.cash_withdrawal]
  
  @scala.inline
  def dispute: typingsSlinky.stripe.stripeStrings.dispute = "dispute".asInstanceOf[typingsSlinky.stripe.stripeStrings.dispute]
  
  @scala.inline
  def dispute_loss: typingsSlinky.stripe.stripeStrings.dispute_loss = "dispute_loss".asInstanceOf[typingsSlinky.stripe.stripeStrings.dispute_loss]
  
  @scala.inline
  def refund: typingsSlinky.stripe.stripeStrings.refund = "refund".asInstanceOf[typingsSlinky.stripe.stripeStrings.refund]
  
  @scala.inline
  def refund_reversal: typingsSlinky.stripe.stripeStrings.refund_reversal = "refund_reversal".asInstanceOf[typingsSlinky.stripe.stripeStrings.refund_reversal]
}
