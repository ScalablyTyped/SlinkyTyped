package typingsSlinky.winrtUwp.global.Windows.Devices.Usb

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
@JSGlobal("Windows.Devices.Usb.UsbInterfaceSetting")
@js.native
abstract class UsbInterfaceSetting ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbInterfaceSetting {
  /** Gets an array of objects that represent descriptors associated with USB bulk IN endpoints that are defined in the alternate setting. */
  /* CompleteClass */
  override var bulkInEndpoints: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB bulk OUT endpoints that are defined in the alternate setting. */
  /* CompleteClass */
  override var bulkOutEndpoints: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with the alternate setting. */
  /* CompleteClass */
  override var descriptors: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbDescriptor] = js.native
  /** Gets an object that represents the descriptor that describes the alternate setting. */
  /* CompleteClass */
  override var interfaceDescriptor: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt IN endpoints that are defined in the alternate setting. */
  /* CompleteClass */
  override var interruptInEndpoints: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbInterruptInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt OUT endpoints that are defined in the alternate setting. */
  /* CompleteClass */
  override var interruptOutEndpoints: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor] = js.native
  /** Determines whether the alternate setting is currently selected. */
  /* CompleteClass */
  override var selected: Boolean = js.native
  /**
    * Selects the alternate setting as the current setting in the USB interface.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def selectSettingAsync(): IPromiseWithIAsyncAction = js.native
}

