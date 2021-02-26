package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventTypeCategory extends StObject {
  
  /**
    * Gets or sets the unique identifier of this category.
    */
  var id: String = js.native
  
  /**
    * Gets or sets the friendly name of this category.
    */
  var name: String = js.native
}
object NotificationEventTypeCategory {
  
  @scala.inline
  def apply(id: String, name: String): NotificationEventTypeCategory = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventTypeCategory]
  }
  
  @scala.inline
  implicit class NotificationEventTypeCategoryMutableBuilder[Self <: NotificationEventTypeCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
