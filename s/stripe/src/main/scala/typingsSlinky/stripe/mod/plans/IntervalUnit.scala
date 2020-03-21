package typingsSlinky.stripe.mod.plans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.day
  - typingsSlinky.stripe.stripeStrings.week
  - typingsSlinky.stripe.stripeStrings.month
  - typingsSlinky.stripe.stripeStrings.year
*/
trait IntervalUnit extends js.Object

object IntervalUnit {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typingsSlinky.stripe.stripeStrings.day = this.cast("day")
  @scala.inline
  def month: typingsSlinky.stripe.stripeStrings.month = this.cast("month")
  @scala.inline
  def week: typingsSlinky.stripe.stripeStrings.week = this.cast("week")
  @scala.inline
  def year: typingsSlinky.stripe.stripeStrings.year = this.cast("year")
}

