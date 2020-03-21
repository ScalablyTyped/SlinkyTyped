package typingsSlinky.stripeV2.stripe

import typingsSlinky.stripeV2.stripeV2Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV2.stripeV2Strings.credit
  - typingsSlinky.stripeV2.stripeV2Strings.debit
  - typingsSlinky.stripeV2.stripeV2Strings.prepaid
  - typingsSlinky.stripeV2.stripeV2Strings.unknown_
*/
trait StripeCardDataFunding extends js.Object

object StripeCardDataFunding {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typingsSlinky.stripeV2.stripeV2Strings.credit = this.cast("credit")
  @scala.inline
  def debit: typingsSlinky.stripeV2.stripeV2Strings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typingsSlinky.stripeV2.stripeV2Strings.prepaid = this.cast("prepaid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

