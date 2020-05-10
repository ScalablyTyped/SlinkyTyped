package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParsedReturnValue extends js.Object {
  /** Receives a UsbEndpointDescriptor object. */ var parsed: UsbEndpointDescriptor = js.native
  /** True, if the specified UsbDescriptor object is a USB endpoint descriptor. Otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonParsedReturnValue {
  @scala.inline
  def apply(parsed: UsbEndpointDescriptor, returnValue: Boolean): AnonParsedReturnValue = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParsedReturnValue]
  }
  @scala.inline
  implicit class AnonParsedReturnValueOps[Self <: AnonParsedReturnValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParsed(value: UsbEndpointDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

