package typingsSlinky.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the setup packet for a USB control transfer. For an explanation of the setup packet, see Table 9.2 in the Universal Serial Bus (USB) specification. */
@js.native
trait UsbSetupPacket extends js.Object {
  /** Gets or sets the wIndex field in the setup packet of the USB control transfer. */
  var index: Double = js.native
  /** Gets the length, in bytes, of the setup packet. */
  var length: Double = js.native
  /** Gets or sets the bRequest field in the setup packet of the USB control transfer. */
  var request: Double = js.native
  /** Gets or sets the bmRequestType field in the setup packet of the USB control transfer. That field is represented by a UsbControlRequestType object. */
  var requestType: UsbControlRequestType = js.native
  /** Gets or sets the wValue field in the setup packet of the USB control transfer. */
  var value: Double = js.native
}

object UsbSetupPacket {
  @scala.inline
  def apply(index: Double, length: Double, request: Double, requestType: UsbControlRequestType, value: Double): UsbSetupPacket = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbSetupPacket]
  }
  @scala.inline
  implicit class UsbSetupPacketOps[Self <: UsbSetupPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestType(value: UsbControlRequestType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

