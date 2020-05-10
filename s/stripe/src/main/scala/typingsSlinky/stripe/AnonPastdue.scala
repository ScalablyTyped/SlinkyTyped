package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.listed
import typingsSlinky.stripe.stripeStrings.rejectedDotlisted
import typingsSlinky.stripe.stripeStrings.under_review
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPastdue extends js.Object {
  /**
    * If the cardholder is disabled, this string describes why. Can be one of listed, rejected.listed, or under_review.
    */
  var disabled_reason: listed | rejectedDotlisted | under_review = js.native
  /**
    * If not empty, this field contains the list of fields that need to be collected in order to verify and re-enabled the cardholder.
    */
  var past_due: js.Array[String] = js.native
}

object AnonPastdue {
  @scala.inline
  def apply(disabled_reason: listed | rejectedDotlisted | under_review, past_due: js.Array[String]): AnonPastdue = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPastdue]
  }
  @scala.inline
  implicit class AnonPastdueOps[Self <: AnonPastdue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled_reason(value: listed | rejectedDotlisted | under_review): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPast_due(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past_due")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

