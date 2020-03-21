package typingsSlinky.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.per_authorization
  - typingsSlinky.stripe.stripeStrings.daily
  - typingsSlinky.stripe.stripeStrings.weekly
  - typingsSlinky.stripe.stripeStrings.monthly
  - typingsSlinky.stripe.stripeStrings.yearly
  - typingsSlinky.stripe.stripeStrings.all_time
*/
trait SpendingLimitInterval extends js.Object

object SpendingLimitInterval {
  @scala.inline
  def all_time: typingsSlinky.stripe.stripeStrings.all_time = this.cast("all_time")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def daily: typingsSlinky.stripe.stripeStrings.daily = this.cast("daily")
  @scala.inline
  def monthly: typingsSlinky.stripe.stripeStrings.monthly = this.cast("monthly")
  @scala.inline
  def per_authorization: typingsSlinky.stripe.stripeStrings.per_authorization = this.cast("per_authorization")
  @scala.inline
  def weekly: typingsSlinky.stripe.stripeStrings.weekly = this.cast("weekly")
  @scala.inline
  def yearly: typingsSlinky.stripe.stripeStrings.yearly = this.cast("yearly")
}

