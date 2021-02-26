package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventRole extends StObject {
  
  /**
    * Gets or sets an Id for that role, this id is used by the event.
    */
  var id: String = js.native
  
  /**
    * Gets or sets the Name for that role, this name is used for UI display.
    */
  var name: String = js.native
  
  /**
    * Gets or sets whether this role can be a group or just an individual user
    */
  var supportsGroups: Boolean = js.native
}
object NotificationEventRole {
  
  @scala.inline
  def apply(id: String, name: String, supportsGroups: Boolean): NotificationEventRole = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsGroups = supportsGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventRole]
  }
  
  @scala.inline
  implicit class NotificationEventRoleMutableBuilder[Self <: NotificationEventRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsGroups(value: Boolean): Self = StObject.set(x, "supportsGroups", value.asInstanceOf[js.Any])
  }
}
