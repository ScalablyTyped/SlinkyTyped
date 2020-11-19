package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledToastNotification extends IScheduledToastNotification
object ScheduledToastNotification {
  
  @scala.inline
  def apply(
    content: XmlDocument,
    deliveryTime: js.Date,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double
  ): ScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledToastNotification]
  }
}
