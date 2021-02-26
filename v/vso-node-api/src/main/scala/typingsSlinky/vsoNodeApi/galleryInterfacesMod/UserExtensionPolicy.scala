package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserExtensionPolicy extends StObject {
  
  /**
    * User display name that this policy refers to
    */
  var displayName: String = js.native
  
  /**
    * The extension policy applied to the user
    */
  var permissions: ExtensionPolicy = js.native
  
  /**
    * User id that this policy refers to
    */
  var userId: String = js.native
}
object UserExtensionPolicy {
  
  @scala.inline
  def apply(displayName: String, permissions: ExtensionPolicy, userId: String): UserExtensionPolicy = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserExtensionPolicy]
  }
  
  @scala.inline
  implicit class UserExtensionPolicyMutableBuilder[Self <: UserExtensionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: ExtensionPolicy): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
