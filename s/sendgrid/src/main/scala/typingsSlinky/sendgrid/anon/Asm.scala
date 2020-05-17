package typingsSlinky.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asm extends js.Object {
  var asm: js.Any = js.native
  var attachments: js.Array[_] = js.native
  var batch_id: String = js.native
  var categories: js.Array[_] = js.native
  var content: String = js.native
  var custom_args: js.Array[_] = js.native
  var from: js.Any = js.native
  var headers: js.Array[_] = js.native
  var ip_pool_name: String = js.native
  var mail_settings: js.Any = js.native
  var personalizations: js.Array[_] = js.native
  var reply_to: js.Any = js.native
  var sections: js.Array[_] = js.native
  var send_at: Double = js.native
  var subject: String = js.native
  var template_id: String = js.native
  var tracking_settings: js.Any = js.native
}

object Asm {
  @scala.inline
  def apply(
    asm: js.Any,
    attachments: js.Array[_],
    batch_id: String,
    categories: js.Array[_],
    content: String,
    custom_args: js.Array[_],
    from: js.Any,
    headers: js.Array[_],
    ip_pool_name: String,
    mail_settings: js.Any,
    personalizations: js.Array[_],
    reply_to: js.Any,
    sections: js.Array[_],
    send_at: Double,
    subject: String,
    template_id: String,
    tracking_settings: js.Any
  ): Asm = {
    val __obj = js.Dynamic.literal(asm = asm.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip_pool_name = ip_pool_name.asInstanceOf[js.Any], mail_settings = mail_settings.asInstanceOf[js.Any], personalizations = personalizations.asInstanceOf[js.Any], reply_to = reply_to.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], tracking_settings = tracking_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asm]
  }
  @scala.inline
  implicit class AsmOps[Self <: Asm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsm(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatch_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_args(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp_pool_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_pool_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMail_settings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonalizations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReply_to(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracking_settings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

