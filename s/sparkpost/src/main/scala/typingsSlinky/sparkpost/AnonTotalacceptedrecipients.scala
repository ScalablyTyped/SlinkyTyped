package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotalacceptedrecipients extends js.Object {
  var id: String = js.native
  var total_accepted_recipients: Double = js.native
  var total_rejected_recipients: Double = js.native
}

object AnonTotalacceptedrecipients {
  @scala.inline
  def apply(id: String, total_accepted_recipients: Double, total_rejected_recipients: Double): AnonTotalacceptedrecipients = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any], total_rejected_recipients = total_rejected_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalacceptedrecipients]
  }
  @scala.inline
  implicit class AnonTotalacceptedrecipientsOps[Self <: AnonTotalacceptedrecipients] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_accepted_recipients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_accepted_recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_rejected_recipients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_rejected_recipients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

