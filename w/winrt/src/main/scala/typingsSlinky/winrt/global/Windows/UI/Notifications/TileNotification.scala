package typingsSlinky.winrt.global.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.TileNotification")
@js.native
class TileNotification protected ()
  extends typingsSlinky.winrt.Windows.UI.Notifications.TileNotification {
  def this(content: XmlDocument) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var expirationTime: js.Date = js.native
  /* CompleteClass */
  override var tag: String = js.native
}

