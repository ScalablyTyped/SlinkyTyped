package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMembership extends StObject {
  
  var active: Boolean = js.native
  
  var descriptor: IdentityDescriptor = js.native
  
  var id: String = js.native
  
  var queriedId: String = js.native
}
object GroupMembership {
  
  @scala.inline
  def apply(active: Boolean, descriptor: IdentityDescriptor, id: String, queriedId: String): GroupMembership = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queriedId = queriedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembership]
  }
  
  @scala.inline
  implicit class GroupMembershipMutableBuilder[Self <: GroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptor(value: IdentityDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriedId(value: String): Self = StObject.set(x, "queriedId", value.asInstanceOf[js.Any])
  }
}
