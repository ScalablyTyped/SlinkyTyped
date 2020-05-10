package typingsSlinky.smtpServer.mod

import typingsSlinky.smtpServer.smtpServerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerEnvelope extends js.Object {
  /**
    * includes an address object or is set to false
    */
  var mailFrom: SMTPServerAddress | `false` = js.native
  /**
    * includes an array of address objects
    */
  var rcptTo: js.Array[SMTPServerAddress] = js.native
}

object SMTPServerEnvelope {
  @scala.inline
  def apply(mailFrom: SMTPServerAddress | `false`, rcptTo: js.Array[SMTPServerAddress]): SMTPServerEnvelope = {
    val __obj = js.Dynamic.literal(mailFrom = mailFrom.asInstanceOf[js.Any], rcptTo = rcptTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPServerEnvelope]
  }
  @scala.inline
  implicit class SMTPServerEnvelopeOps[Self <: SMTPServerEnvelope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMailFrom(value: SMTPServerAddress | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRcptTo(value: js.Array[SMTPServerAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcptTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

