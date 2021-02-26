package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBadgeNotification extends StObject {
  
  var content: XmlDocument = js.native
  
  var expirationTime: js.Date = js.native
}
object IBadgeNotification {
  
  @scala.inline
  def apply(content: XmlDocument, expirationTime: js.Date): IBadgeNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBadgeNotification]
  }
  
  @scala.inline
  implicit class IBadgeNotificationMutableBuilder[Self <: IBadgeNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
  }
}
