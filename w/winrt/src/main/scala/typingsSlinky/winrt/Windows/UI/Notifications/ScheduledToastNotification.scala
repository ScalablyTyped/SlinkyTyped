package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
@js.native
class ScheduledToastNotification protected () extends IScheduledToastNotification {
  def this(content: XmlDocument, deliveryTime: js.Date) = this()
  def this(content: XmlDocument, deliveryTime: js.Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
}

