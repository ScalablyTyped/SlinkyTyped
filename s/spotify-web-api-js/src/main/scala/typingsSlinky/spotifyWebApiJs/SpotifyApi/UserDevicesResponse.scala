package typingsSlinky.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDevicesResponse extends StObject {
  
  var devices: js.Array[UserDevice] = js.native
}
object UserDevicesResponse {
  
  @scala.inline
  def apply(devices: js.Array[UserDevice]): UserDevicesResponse = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDevicesResponse]
  }
  
  @scala.inline
  implicit class UserDevicesResponseMutableBuilder[Self <: UserDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[UserDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: UserDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
