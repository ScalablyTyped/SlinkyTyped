package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsData extends js.Object {
  /**
    * Notification data needed
    */
  var data: StringDictionary[js.Any] = js.native
  /**
    * List of users who should get the notification
    */
  var identities: StringDictionary[js.Any] = js.native
  /**
    * Type of Mail Notification.Can be Qna , review or CustomerContact
    */
  var `type`: NotificationTemplateType = js.native
}

object NotificationsData {
  @scala.inline
  def apply(
    data: StringDictionary[js.Any],
    identities: StringDictionary[js.Any],
    `type`: NotificationTemplateType
  ): NotificationsData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsData]
  }
  @scala.inline
  implicit class NotificationsDataOps[Self <: NotificationsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentities(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NotificationTemplateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

