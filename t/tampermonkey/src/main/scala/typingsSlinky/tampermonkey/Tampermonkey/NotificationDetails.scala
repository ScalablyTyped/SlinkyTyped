package typingsSlinky.tampermonkey.Tampermonkey

import typingsSlinky.tampermonkey.tampermonkeyBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tampermonkey.Tampermonkey.TextNotification
  - typingsSlinky.tampermonkey.Tampermonkey.HighlightNotification
*/
trait NotificationDetails extends js.Object

object NotificationDetails {
  @scala.inline
  def TextNotification(text: String): NotificationDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
  @scala.inline
  def HighlightNotification(highlight: `true`): NotificationDetails = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
}

