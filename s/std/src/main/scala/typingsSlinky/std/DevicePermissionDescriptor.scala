package typingsSlinky.std

import typingsSlinky.std.stdStrings.camera
import typingsSlinky.std.stdStrings.microphone
import typingsSlinky.std.stdStrings.speaker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicePermissionDescriptor extends PermissionDescriptor {
  
  var deviceId: js.UndefOr[java.lang.String] = js.native
  
  @JSName("name")
  var name_DevicePermissionDescriptor: camera | microphone | speaker = js.native
}
object DevicePermissionDescriptor {
  
  @scala.inline
  def apply(name: camera | microphone | speaker): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
  
  @scala.inline
  implicit class DevicePermissionDescriptorMutableBuilder[Self <: DevicePermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setName(value: camera | microphone | speaker): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
