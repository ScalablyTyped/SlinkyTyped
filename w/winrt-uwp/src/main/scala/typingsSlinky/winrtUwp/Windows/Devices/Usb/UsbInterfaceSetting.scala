package typingsSlinky.winrtUwp.Windows.Devices.Usb

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
@js.native
trait UsbInterfaceSetting extends js.Object {
  /** Gets an array of objects that represent descriptors associated with USB bulk IN endpoints that are defined in the alternate setting. */
  var bulkInEndpoints: IVectorView[UsbBulkInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB bulk OUT endpoints that are defined in the alternate setting. */
  var bulkOutEndpoints: IVectorView[UsbBulkOutEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with the alternate setting. */
  var descriptors: IVectorView[UsbDescriptor] = js.native
  /** Gets an object that represents the descriptor that describes the alternate setting. */
  var interfaceDescriptor: UsbInterfaceDescriptor = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt IN endpoints that are defined in the alternate setting. */
  var interruptInEndpoints: IVectorView[UsbInterruptInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt OUT endpoints that are defined in the alternate setting. */
  var interruptOutEndpoints: IVectorView[UsbInterruptOutEndpointDescriptor] = js.native
  /** Determines whether the alternate setting is currently selected. */
  var selected: Boolean = js.native
  /**
    * Selects the alternate setting as the current setting in the USB interface.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def selectSettingAsync(): IPromiseWithIAsyncAction = js.native
}

object UsbInterfaceSetting {
  @scala.inline
  def apply(
    bulkInEndpoints: IVectorView[UsbBulkInEndpointDescriptor],
    bulkOutEndpoints: IVectorView[UsbBulkOutEndpointDescriptor],
    descriptors: IVectorView[UsbDescriptor],
    interfaceDescriptor: UsbInterfaceDescriptor,
    interruptInEndpoints: IVectorView[UsbInterruptInEndpointDescriptor],
    interruptOutEndpoints: IVectorView[UsbInterruptOutEndpointDescriptor],
    selectSettingAsync: () => IPromiseWithIAsyncAction,
    selected: Boolean
  ): UsbInterfaceSetting = {
    val __obj = js.Dynamic.literal(bulkInEndpoints = bulkInEndpoints.asInstanceOf[js.Any], bulkOutEndpoints = bulkOutEndpoints.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], interfaceDescriptor = interfaceDescriptor.asInstanceOf[js.Any], interruptInEndpoints = interruptInEndpoints.asInstanceOf[js.Any], interruptOutEndpoints = interruptOutEndpoints.asInstanceOf[js.Any], selectSettingAsync = js.Any.fromFunction0(selectSettingAsync), selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterfaceSetting]
  }
  @scala.inline
  implicit class UsbInterfaceSettingOps[Self <: UsbInterfaceSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulkInEndpoints(value: IVectorView[UsbBulkInEndpointDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulkInEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulkOutEndpoints(value: IVectorView[UsbBulkOutEndpointDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulkOutEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptors(value: IVectorView[UsbDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceDescriptor(value: UsbInterfaceDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterruptInEndpoints(value: IVectorView[UsbInterruptInEndpointDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptInEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterruptOutEndpoints(value: IVectorView[UsbInterruptOutEndpointDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptOutEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectSettingAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSettingAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

