package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attemptsremaining extends js.Object {
  var attempts_remaining: Double
  var status: pending | succeeded | failed
}

object Attemptsremaining {
  @scala.inline
  def apply(attempts_remaining: Double, status: pending | succeeded | failed): Attemptsremaining = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attemptsremaining]
  }
}

