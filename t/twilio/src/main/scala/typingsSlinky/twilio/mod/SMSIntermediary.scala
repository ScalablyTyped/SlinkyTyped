package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSIntermediary extends js.Object {
  var messages: SMSMessageResource = js.native
  var shortCodes: SMSShortCodeResource = js.native
}

object SMSIntermediary {
  @scala.inline
  def apply(messages: SMSMessageResource, shortCodes: SMSShortCodeResource): SMSIntermediary = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], shortCodes = shortCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSIntermediary]
  }
  @scala.inline
  implicit class SMSIntermediaryOps[Self <: SMSIntermediary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: SMSMessageResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortCodes(value: SMSShortCodeResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortCodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

