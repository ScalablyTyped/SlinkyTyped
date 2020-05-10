package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateContent extends js.Object {
  /**
    * Address "from" : "deals@company.com" or JSON object composed of the "name" and "email" fields.
    * "from" : { "name" : "My Company", "email" : "deals@company.com" } used to compose the email’s "From" header.
    *
    */
  var from: Address | String = js.native
  /**  JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To”. */
  var headers: js.UndefOr[js.Any] = js.native
  /** HTML content for the email’s text/html MIME part */
  var html: String = js.native
  /** Email address used to compose the email’s “Reply-To” header. */
  var reply_to: js.UndefOr[String] = js.native
  /** Email subject line. */
  var subject: String = js.native
  /** Text content for the email’s text/plain MIME part */
  var text: String = js.native
}

object TemplateContent {
  @scala.inline
  def apply(from: Address | String, html: String, subject: String, text: String): TemplateContent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateContent]
  }
  @scala.inline
  implicit class TemplateContentOps[Self <: TemplateContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Address | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
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
    def withReply_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_to")(js.undefined)
        ret
    }
  }
  
}

