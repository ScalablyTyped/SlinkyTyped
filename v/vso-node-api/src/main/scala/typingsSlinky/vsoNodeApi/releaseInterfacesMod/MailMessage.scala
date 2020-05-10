package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMessage extends js.Object {
  var body: String = js.native
  var cC: EmailRecipients = js.native
  var inReplyTo: String = js.native
  var messageId: String = js.native
  var replyBy: js.Date = js.native
  var replyTo: EmailRecipients = js.native
  var sections: js.Array[MailSectionType] = js.native
  var senderType: SenderType = js.native
  var subject: String = js.native
  var to: EmailRecipients = js.native
}

object MailMessage {
  @scala.inline
  def apply(
    body: String,
    cC: EmailRecipients,
    inReplyTo: String,
    messageId: String,
    replyBy: js.Date,
    replyTo: EmailRecipients,
    sections: js.Array[MailSectionType],
    senderType: SenderType,
    subject: String,
    to: EmailRecipients
  ): MailMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cC = cC.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], replyBy = replyBy.asInstanceOf[js.Any], replyTo = replyTo.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], senderType = senderType.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMessage]
  }
  @scala.inline
  implicit class MailMessageOps[Self <: MailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCC(value: EmailRecipients): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyBy(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyTo(value: EmailRecipients): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSections(value: js.Array[MailSectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderType(value: SenderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: EmailRecipients): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

