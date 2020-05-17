package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.setupIntents.SetupIntentCancelationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellationreasonSetupIntentCancelationReason extends js.Object {
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.native
}

object CancellationreasonSetupIntentCancelationReason {
  @scala.inline
  def apply(): CancellationreasonSetupIntentCancelationReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancellationreasonSetupIntentCancelationReason]
  }
  @scala.inline
  implicit class CancellationreasonSetupIntentCancelationReasonOps[Self <: CancellationreasonSetupIntentCancelationReason] (val x: Self) extends AnyVal {
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

