package typingsSlinky.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSendOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.native
  var api_user: js.UndefOr[String] = js.native
  var files: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var fromname: js.UndefOr[String] = js.native
  var gzip_compress: js.UndefOr[String] = js.native
  var headers: js.UndefOr[String] = js.native
  var label: js.UndefOr[Double] = js.native
  var replyTo: js.UndefOr[String] = js.native
  var resp_email_id: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var substitution_vars: js.UndefOr[String] = js.native
  var template_invoke_name: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
  var use_maillist: js.UndefOr[String] = js.native
}

object TemplateSendOptions {
  @scala.inline
  def apply(): TemplateSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSendOptions]
  }
  @scala.inline
  implicit class TemplateSendOptionsOps[Self <: TemplateSendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_key")(js.undefined)
        ret
    }
    @scala.inline
    def withApi_user(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_user: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_user")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withFromname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromname")(js.undefined)
        ret
    }
    @scala.inline
    def withGzip_compress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip_compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzip_compress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip_compress")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withResp_email_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resp_email_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResp_email_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resp_email_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitution_vars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitution_vars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_vars")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate_invoke_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_invoke_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_invoke_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_invoke_name")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_maillist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_maillist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_maillist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_maillist")(js.undefined)
        ret
    }
  }
  
}

