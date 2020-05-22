package typingsSlinky.winrt.global.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
@js.native
class ScheduledTileNotification protected ()
  extends typingsSlinky.winrt.Windows.UI.Notifications.ScheduledTileNotification {
  def this(content: XmlDocument, deliveryTime: js.Date) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var deliveryTime: js.Date = js.native
  /* CompleteClass */
  override var expirationTime: js.Date = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var tag: String = js.native
}

