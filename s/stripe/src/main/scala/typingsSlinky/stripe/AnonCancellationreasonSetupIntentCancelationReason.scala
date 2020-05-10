package typingsSlinky.stripe

import typingsSlinky.stripe.mod.setupIntents.SetupIntentCancelationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancellationreasonSetupIntentCancelationReason extends js.Object {
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.native
}

object AnonCancellationreasonSetupIntentCancelationReason {
  @scala.inline
  def apply(): AnonCancellationreasonSetupIntentCancelationReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCancellationreasonSetupIntentCancelationReason]
  }
  @scala.inline
  implicit class AnonCancellationreasonSetupIntentCancelationReasonOps[Self <: AnonCancellationreasonSetupIntentCancelationReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellation_reason(value: SetupIntentCancelationReason): Self = {
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

