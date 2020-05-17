package typingsSlinky.tampermonkey.Tampermonkey

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
  implicit def apply(value: HighlightNotification): NotificationDetails = value.asInstanceOf[NotificationDetails]
  @scala.inline
  implicit def apply(value: TextNotification): NotificationDetails = value.asInstanceOf[NotificationDetails]
}

