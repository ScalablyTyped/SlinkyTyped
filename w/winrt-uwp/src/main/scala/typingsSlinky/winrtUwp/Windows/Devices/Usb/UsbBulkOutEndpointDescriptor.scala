package typingsSlinky.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
@js.native
trait UsbBulkOutEndpointDescriptor extends StObject {
  
  /** Gets the USB endpoint number of the bulk OUT endpoint. */
  var endpointNumber: Double = js.native
  
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: Double = js.native
  
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  var pipe: UsbBulkOutPipe = js.native
}
object UsbBulkOutEndpointDescriptor {
  
  @scala.inline
  def apply(endpointNumber: Double, maxPacketSize: Double, pipe: UsbBulkOutPipe): UsbBulkOutEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkOutEndpointDescriptor]
  }
  
  @scala.inline
  implicit class UsbBulkOutEndpointDescriptorMutableBuilder[Self <: UsbBulkOutEndpointDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointNumber(value: Double): Self = StObject.set(x, "endpointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipe(value: UsbBulkOutPipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
  }
}
