package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    VoxImplant roster item
  */
@js.native
trait RosterItem extends StObject {
  
  /**
    *    Groups this roster item belongs to
    */
  var groups: js.Array[String] = js.native
  
  /**
    *    User id
    */
  var id: String = js.native
  
  /**
    *    User display name
    */
  var name: String = js.native
  
  /**
    *    Resources
    */
  var resources: js.Array[String] = js.native
  
  /**
    *    Subscription type
    */
  var subscription_type: Double = js.native
}
object RosterItem {
  
  @scala.inline
  def apply(
    groups: js.Array[String],
    id: String,
    name: String,
    resources: js.Array[String],
    subscription_type: Double
  ): RosterItem = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], subscription_type = subscription_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterItem]
  }
  
  @scala.inline
  implicit class RosterItemMutableBuilder[Self <: RosterItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSubscription_type(value: Double): Self = StObject.set(x, "subscription_type", value.asInstanceOf[js.Any])
  }
}
