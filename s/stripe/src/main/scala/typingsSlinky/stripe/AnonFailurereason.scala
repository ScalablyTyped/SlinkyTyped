package typingsSlinky.stripe

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

@js.native
trait AnonFailurereason extends js.Object {
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.native
  var return_url: String = js.native
  var status: pending | succeeded | not_required | failed = js.native
  var url: String = js.native
}

object AnonFailurereason {
  @scala.inline
  def apply(return_url: String, status: pending | succeeded | not_required | failed, url: String): AnonFailurereason = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailurereason]
  }
  @scala.inline
  implicit class AnonFailurereasonOps[Self <: AnonFailurereason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturn_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: pending | succeeded | not_required | failed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure_reason(value: user_abort | declined | processing_error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_reason")(js.undefined)
        ret
    }
  }
  
}

