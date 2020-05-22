package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.declined
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.not_required
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.processing_error
import typingsSlinky.stripe.stripeStrings.succeeded
import typingsSlinky.stripe.stripeStrings.user_abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failurereason extends js.Object {
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.undefined
  var return_url: String
  var status: pending | succeeded | not_required | failed
  var url: String
}

object Failurereason {
  @scala.inline
  def apply(
    return_url: String,
    status: pending | succeeded | not_required | failed,
    url: String,
    failure_reason: user_abort | declined | processing_error = null
  ): Failurereason = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failurereason]
  }
}

