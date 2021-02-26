package typingsSlinky.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The endpoint descriptor for a USB interrupt IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint for data. */
@js.native
trait UsbInterruptInEndpointDescriptor extends StObject {
  
  /** Gets the USB endpoint number of the interrupt IN endpoint. */
  var endpointNumber: Double = js.native
  
  /** Gets the poling interval of the USB interrupt endpoint. */
  var interval: Double = js.native
  
  /** Gets the maximum number of bytes that can be sent to or received (in a packet) from this endpoint. */
  var maxPacketSize: Double = js.native
  
  /** Gets the object that represents the pipe that the host opens to communicate with the interrupt IN endpoint. */
  var pipe: UsbInterruptInPipe = js.native
}
object UsbInterruptInEndpointDescriptor {
  
  @scala.inline
  def apply(endpointNumber: Double, interval: Double, maxPacketSize: Double, pipe: UsbInterruptInPipe): UsbInterruptInEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptInEndpointDescriptor]
  }
  
  @scala.inline
  implicit class UsbInterruptInEndpointDescriptorMutableBuilder[Self <: UsbInterruptInEndpointDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointNumber(value: Double): Self = StObject.set(x, "endpointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipe(value: UsbInterruptInPipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
  }
}
