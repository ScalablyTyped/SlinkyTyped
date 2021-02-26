package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameworkIdentityInfo extends StObject {
  
  var displayName: String = js.native
  
  var identifier: String = js.native
  
  var identityType: FrameworkIdentityType = js.native
  
  var role: String = js.native
}
object FrameworkIdentityInfo {
  
  @scala.inline
  def apply(displayName: String, identifier: String, identityType: FrameworkIdentityType, role: String): FrameworkIdentityInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameworkIdentityInfo]
  }
  
  @scala.inline
  implicit class FrameworkIdentityInfoMutableBuilder[Self <: FrameworkIdentityInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityType(value: FrameworkIdentityType): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
