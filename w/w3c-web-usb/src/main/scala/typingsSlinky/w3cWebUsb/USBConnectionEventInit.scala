package typingsSlinky.w3cWebUsb

import typingsSlinky.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBConnectionEventInit extends EventInit {
  
  var device: USBDevice = js.native
}
object USBConnectionEventInit {
  
  @scala.inline
  def apply(device: USBDevice): USBConnectionEventInit = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBConnectionEventInit]
  }
  
  @scala.inline
  implicit class USBConnectionEventInitMutableBuilder[Self <: USBConnectionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: USBDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
