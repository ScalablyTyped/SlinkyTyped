package typingsSlinky.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB interrupt OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint to send data. */
@js.native
trait UsbInterruptOutEndpointDescriptor extends js.Object {
  /** Gets the USB endpoint number of the interrupt OUT endpoint. */
  var endpointNumber: Double = js.native
  /** Gets the poling interval of the USB interrupt endpoint. */
  var interval: Double = js.native
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: Double = js.native
  /** Gets the object that represents the pipe that the host opens to communicate with the interrupt OUT endpoint. */
  var pipe: UsbInterruptOutPipe = js.native
}

object UsbInterruptOutEndpointDescriptor {
  @scala.inline
  def apply(endpointNumber: Double, interval: Double, maxPacketSize: Double, pipe: UsbInterruptOutPipe): UsbInterruptOutEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptOutEndpointDescriptor]
  }
  @scala.inline
  implicit class UsbInterruptOutEndpointDescriptorOps[Self <: UsbInterruptOutEndpointDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPacketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipe(value: UsbInterruptOutPipe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

