package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsData extends StObject {
  
  /**
    * Notification data needed
    */
  var data: StringDictionary[js.Any] = js.native
  
  /**
    * List of users who should get the notification
    */
  var identities: StringDictionary[js.Any] = js.native
  
  /**
    * Type of Mail Notification.Can be Qna , review or CustomerContact
    */
  var `type`: NotificationTemplateType = js.native
}
object NotificationsData {
  
  @scala.inline
  def apply(
    data: StringDictionary[js.Any],
    identities: StringDictionary[js.Any],
    `type`: NotificationTemplateType
  ): NotificationsData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsData]
  }
  
  @scala.inline
  implicit class NotificationsDataMutableBuilder[Self <: NotificationsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentities(value: StringDictionary[js.Any]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationTemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
