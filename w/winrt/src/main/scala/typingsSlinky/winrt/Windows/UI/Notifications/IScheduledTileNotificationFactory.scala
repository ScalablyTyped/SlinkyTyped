package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledTileNotificationFactory extends js.Object {
  def createScheduledTileNotification(content: XmlDocument, deliveryTime: js.Date): ScheduledTileNotification
}

object IScheduledTileNotificationFactory {
  @scala.inline
  def apply(createScheduledTileNotification: (XmlDocument, js.Date) => ScheduledTileNotification): IScheduledTileNotificationFactory = {
    val __obj = js.Dynamic.literal(createScheduledTileNotification = js.Any.fromFunction2(createScheduledTileNotification))
    __obj.asInstanceOf[IScheduledTileNotificationFactory]
  }
}

