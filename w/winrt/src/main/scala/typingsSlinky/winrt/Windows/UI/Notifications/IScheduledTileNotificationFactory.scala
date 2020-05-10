package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledTileNotificationFactory extends js.Object {
  def createScheduledTileNotification(content: XmlDocument, deliveryTime: js.Date): ScheduledTileNotification = js.native
}

object IScheduledTileNotificationFactory {
  @scala.inline
  def apply(createScheduledTileNotification: (XmlDocument, js.Date) => ScheduledTileNotification): IScheduledTileNotificationFactory = {
    val __obj = js.Dynamic.literal(createScheduledTileNotification = js.Any.fromFunction2(createScheduledTileNotification))
    __obj.asInstanceOf[IScheduledTileNotificationFactory]
  }
  @scala.inline
  implicit class IScheduledTileNotificationFactoryOps[Self <: IScheduledTileNotificationFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateScheduledTileNotification(value: (XmlDocument, js.Date) => ScheduledTileNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScheduledTileNotification")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

