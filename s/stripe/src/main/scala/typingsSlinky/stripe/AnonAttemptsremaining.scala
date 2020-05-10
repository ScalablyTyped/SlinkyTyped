package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttemptsremaining extends js.Object {
  var attempts_remaining: Double = js.native
  var status: pending | succeeded | failed = js.native
}

object AnonAttemptsremaining {
  @scala.inline
  def apply(attempts_remaining: Double, status: pending | succeeded | failed): AnonAttemptsremaining = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttemptsremaining]
  }
  @scala.inline
  implicit class AnonAttemptsremainingOps[Self <: AnonAttemptsremaining] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempts_remaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts_remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: pending | succeeded | failed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

