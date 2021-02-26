package typingsSlinky.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthSetting extends StObject {
  
  var authSetting: keyinScopeboolean = js.native
}
object AuthSetting {
  
  @scala.inline
  def apply(authSetting: keyinScopeboolean): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit class AuthSettingMutableBuilder[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSetting(value: keyinScopeboolean): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
