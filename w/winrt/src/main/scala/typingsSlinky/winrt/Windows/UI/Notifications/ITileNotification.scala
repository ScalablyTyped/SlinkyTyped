package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileNotification extends js.Object {
  var content: XmlDocument
  var expirationTime: js.Date
  var tag: String
}

object ITileNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: js.Date, tag: String): ITileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITileNotification]
  }
}

