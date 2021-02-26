package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledTileNotification extends StObject {
  
  var content: XmlDocument = js.native
  
  var deliveryTime: js.Date = js.native
  
  var expirationTime: js.Date = js.native
  
  var id: String = js.native
  
  var tag: String = js.native
}
object IScheduledTileNotification {
  
  @scala.inline
  def apply(content: XmlDocument, deliveryTime: js.Date, expirationTime: js.Date, id: String, tag: String): IScheduledTileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledTileNotification]
  }
  
  @scala.inline
  implicit class IScheduledTileNotificationMutableBuilder[Self <: IScheduledTileNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTime(value: js.Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
