package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.setupIntents.SetupIntentCancelationReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationreasonSetupIntentCancelationReason extends js.Object {
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.undefined
}

object CancellationreasonSetupIntentCancelationReason {
  @scala.inline
  def apply(cancellation_reason: SetupIntentCancelationReason = null): CancellationreasonSetupIntentCancelationReason = {
    val __obj = js.Dynamic.literal()
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationreasonSetupIntentCancelationReason]
  }
}

