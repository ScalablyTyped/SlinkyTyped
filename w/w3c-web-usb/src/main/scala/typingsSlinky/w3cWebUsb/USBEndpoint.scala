package typingsSlinky.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBEndpoint extends StObject {
  
  val direction: USBDirection = js.native
  
  val endpointNumber: Double = js.native
  
  val packetSize: Double = js.native
  
  val `type`: USBEndpointType = js.native
}
object USBEndpoint {
  
  @scala.inline
  def apply(direction: USBDirection, endpointNumber: Double, packetSize: Double, `type`: USBEndpointType): USBEndpoint = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpointNumber = endpointNumber.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBEndpoint]
  }
  
  @scala.inline
  implicit class USBEndpointMutableBuilder[Self <: USBEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: USBDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNumber(value: Double): Self = StObject.set(x, "endpointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: USBEndpointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
