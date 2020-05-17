package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineContent extends js.Object {
  /** JSON array of attachments. */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  /** "deals@company.com" or JSON object composed of the “name” and “email” fields “from” : { “name” : “My Company”, “email” : "deals@company.com" } used to compose the email’s “From” header */
  var from: js.UndefOr[String | Email] = js.native
  /** JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To” */
  var headers: js.UndefOr[js.Any] = js.native
  /** HTML content for the email’s text/html MIME part  At a minimum, html, text, or push is required. */
  var html: js.UndefOr[String] = js.native
  /** JSON array of inline images. */
  var inline_images: js.UndefOr[js.Array[Attachment]] = js.native
  /**  Content of push notifications  At a minimum, html, text, or push is required.  SparkPost Enterprise API only. */
  var push: js.UndefOr[PushData] = js.native
  /** Email address used to compose the email’s “Reply-To” header */
  var reply_to: js.UndefOr[String] = js.native
  /** Email subject line  required for email transmissions  Expected in the UTF-8 charset without RFC2047 encoding. Substitution syntax is supported. */
  var subject: js.UndefOr[String] = js.native
  /** Text content for the email’s text/plain MIME part  At a minimum, html, text, or push is required. */
  var text: js.UndefOr[String] = js.native
}

object InlineContent {
  @scala.inline
  def apply(): InlineContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineContent]
  }
  @scala.inline
  implicit class InlineContentOps[Self <: InlineContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String | Email): Self = {
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
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_images(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_images: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_images")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: PushData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

