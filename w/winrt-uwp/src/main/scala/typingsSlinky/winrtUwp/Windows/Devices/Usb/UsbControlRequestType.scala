package typingsSlinky.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the USB control transfer, the type of control request, whether the data is sent from or to the host, and the recipient of the request in the device. */
@js.native
trait UsbControlRequestType extends js.Object {
  /** Gets or sets the bmRequestType value as a byte. */
  var asByte: Double = js.native
  /** Gets or sets the type of USB control transfer: standard, class, or vendor. */
  var controlTransferType: UsbControlTransferType = js.native
  /** Gets or sets the direction of the USB control transfer. */
  var direction: UsbTransferDirection = js.native
  /** Gets or sets the recipient of the USB control transfer. */
  var recipient: UsbControlRecipient = js.native
}

object UsbControlRequestType {
  @scala.inline
  def apply(
    asByte: Double,
    controlTransferType: UsbControlTransferType,
    direction: UsbTransferDirection,
    recipient: UsbControlRecipient
  ): UsbControlRequestType = {
    val __obj = js.Dynamic.literal(asByte = asByte.asInstanceOf[js.Any], controlTransferType = controlTransferType.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbControlRequestType]
  }
  @scala.inline
  implicit class UsbControlRequestTypeOps[Self <: UsbControlRequestType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsByte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlTransferType(value: UsbControlTransferType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlTransferType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: UsbTransferDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: UsbControlRecipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

