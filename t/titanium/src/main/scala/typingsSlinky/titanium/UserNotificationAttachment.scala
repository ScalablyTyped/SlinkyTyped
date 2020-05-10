package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provide at least the property `identifier` and `url` property to identify a local
  * image, sound or video. If your media is invalid, the API will throw an error log and
  * skip the invalid attachment.
  */
@js.native
trait UserNotificationAttachment extends js.Object {
  /**
  	 * The identifier of this attachment.
  	 */
  var identifier: java.lang.String = js.native
  /**
  	 * An additional dictionary of options to provide.
  	 */
  var options: js.UndefOr[js.Any] = js.native
  /**
  	 * The URL to the attachment's data. If you have obtained this attachment from
  	 * the notification-center then the URL will be security-scoped.
  	 */
  var url: java.lang.String = js.native
}

object UserNotificationAttachment {
  @scala.inline
  def apply(identifier: java.lang.String, url: java.lang.String): UserNotificationAttachment = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationAttachment]
  }
  @scala.inline
  implicit class UserNotificationAttachmentOps[Self <: UserNotificationAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

