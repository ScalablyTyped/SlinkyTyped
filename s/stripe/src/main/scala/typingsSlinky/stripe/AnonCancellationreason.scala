package typingsSlinky.stripe

import typingsSlinky.stripe.mod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancellationreason extends js.Object {
  var cancellation_reason: js.UndefOr[PaymentIntentUserProvidedCancellationReason] = js.native
}

object AnonCancellationreason {
  @scala.inline
  def apply(): AnonCancellationreason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCancellationreason]
  }
  @scala.inline
  implicit class AnonCancellationreasonOps[Self <: AnonCancellationreason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellation_reason(value: PaymentIntentUserProvidedCancellationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellation_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_reason")(js.undefined)
        ret
    }
  }
  
}

