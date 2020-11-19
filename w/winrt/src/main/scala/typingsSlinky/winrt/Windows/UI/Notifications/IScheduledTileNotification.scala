package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledTileNotification extends js.Object {
  
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
  implicit class IScheduledTileNotificationOps[Self <: IScheduledTileNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: XmlDocument): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTime(value: js.Date): Self = this.set("deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: js.Date): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
