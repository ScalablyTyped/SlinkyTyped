package typingsSlinky.stripe.mod.creditNotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reason for issuing a credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.duplicate
  - typingsSlinky.stripe.stripeStrings.fraudulent
  - typingsSlinky.stripe.stripeStrings.order_change
  - typingsSlinky.stripe.stripeStrings.product_unsatisfactory
*/
trait CreditNoteReason extends js.Object

object CreditNoteReason {
  @scala.inline
  def duplicate: typingsSlinky.stripe.stripeStrings.duplicate = "duplicate".asInstanceOf[typingsSlinky.stripe.stripeStrings.duplicate]
  @scala.inline
  def fraudulent: typingsSlinky.stripe.stripeStrings.fraudulent = "fraudulent".asInstanceOf[typingsSlinky.stripe.stripeStrings.fraudulent]
  @scala.inline
  def order_change: typingsSlinky.stripe.stripeStrings.order_change = "order_change".asInstanceOf[typingsSlinky.stripe.stripeStrings.order_change]
  @scala.inline
  def product_unsatisfactory: typingsSlinky.stripe.stripeStrings.product_unsatisfactory = "product_unsatisfactory".asInstanceOf[typingsSlinky.stripe.stripeStrings.product_unsatisfactory]
}

