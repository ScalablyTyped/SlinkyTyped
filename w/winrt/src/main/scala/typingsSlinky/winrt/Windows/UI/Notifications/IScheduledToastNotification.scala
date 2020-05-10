package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledToastNotification extends js.Object {
  var content: XmlDocument = js.native
  var deliveryTime: js.Date = js.native
  var id: String = js.native
  var maximumSnoozeCount: Double = js.native
  var snoozeInterval: Double = js.native
}

object IScheduledToastNotification {
  @scala.inline
  def apply(
    content: XmlDocument,
    deliveryTime: js.Date,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double
  ): IScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledToastNotification]
  }
  @scala.inline
  implicit class IScheduledToastNotificationOps[Self <: IScheduledToastNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: XmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumSnoozeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSnoozeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnoozeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snoozeInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

