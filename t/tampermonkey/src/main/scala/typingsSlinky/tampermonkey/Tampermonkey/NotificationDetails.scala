package typingsSlinky.tampermonkey.Tampermonkey

import typingsSlinky.tampermonkey.tampermonkeyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tampermonkey.Tampermonkey.TextNotification
  - typingsSlinky.tampermonkey.Tampermonkey.HighlightNotification
*/
trait NotificationDetails extends StObject
object NotificationDetails {
  
  @scala.inline
  def HighlightNotification(highlight: `true`): typingsSlinky.tampermonkey.Tampermonkey.HighlightNotification = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tampermonkey.Tampermonkey.HighlightNotification]
  }
  
  @scala.inline
  def TextNotification(text: String): typingsSlinky.tampermonkey.Tampermonkey.TextNotification = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tampermonkey.Tampermonkey.TextNotification]
  }
}
