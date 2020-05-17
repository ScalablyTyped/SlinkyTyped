package typingsSlinky.winrtUwp.Windows.Devices.Usb

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the USB interface including its endpoints, the number of alternate settings the interface supports, and gets the entire descriptor set for those settings. It also obtains pipes associated with the endpoints that the interface supports. */
@js.native
trait UsbInterface extends js.Object {
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk IN endpoints defined in the current setting of the USB interface setting. */
  var bulkInPipes: IVectorView[UsbBulkInPipe] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk OUT endpoints defined in the current setting of the USB interface. */
  var bulkOutPipes: IVectorView[UsbBulkOutPipe] = js.native
  /** Gets an array of objects that represent descriptors for all alternate settings that are part of this USB interface. */
  var descriptors: IVectorView[UsbDescriptor] = js.native
  /** Gets the interface number that identifies the USB interface. This value is the bInterfaceNumber field of a standard USB interface descriptor. */
  var interfaceNumber: Double = js.native
  /** Gets an array of objects that represent alternate settings defined for the USB interface. */
  var interfaceSettings: IVectorView[UsbInterfaceSetting] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt IN endpoints defined in the current setting of the USB interface. */
  var interruptInPipes: IVectorView[UsbInterruptInPipe] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt OUT endpoints defined in the current setting of the USB interface. */
  var interruptOutPipes: IVectorView[UsbInterruptOutPipe] = js.native
}

object UsbInterface {
  @scala.inline
  def apply(
    bulkInPipes: IVectorView[UsbBulkInPipe],
    bulkOutPipes: IVectorView[UsbBulkOutPipe],
    descriptors: IVectorView[UsbDescriptor],
    interfaceNumber: Double,
    interfaceSettings: IVectorView[UsbInterfaceSetting],
    interruptInPipes: IVectorView[UsbInterruptInPipe],
    interruptOutPipes: IVectorView[UsbInterruptOutPipe]
  ): UsbInterface = {
    val __obj = js.Dynamic.literal(bulkInPipes = bulkInPipes.asInstanceOf[js.Any], bulkOutPipes = bulkOutPipes.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any], interfaceSettings = interfaceSettings.asInstanceOf[js.Any], interruptInPipes = interruptInPipes.asInstanceOf[js.Any], interruptOutPipes = interruptOutPipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterface]
  }
  @scala.inline
  implicit class UsbInterfaceOps[Self <: UsbInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulkInPipes(value: IVectorView[UsbBulkInPipe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulkInPipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulkOutPipes(value: IVectorView[UsbBulkOutPipe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulkOutPipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptors(value: IVectorView[UsbDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceSettings(value: IVectorView[UsbInterfaceSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterruptInPipes(value: IVectorView[UsbInterruptInPipe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptInPipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterruptOutPipes(value: IVectorView[UsbInterruptOutPipe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptOutPipes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

