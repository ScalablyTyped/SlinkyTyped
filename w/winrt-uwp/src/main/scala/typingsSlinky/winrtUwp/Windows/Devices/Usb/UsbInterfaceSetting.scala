package typingsSlinky.winrtUwp.Windows.Devices.Usb

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
@js.native
trait UsbInterfaceSetting extends StObject {
  
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
  
  /**
    * Selects the alternate setting as the current setting in the USB interface.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def selectSettingAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Determines whether the alternate setting is currently selected. */
  var selected: Boolean = js.native
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
  implicit class UsbInterfaceSettingMutableBuilder[Self <: UsbInterfaceSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkInEndpoints(value: IVectorView[UsbBulkInEndpointDescriptor]): Self = StObject.set(x, "bulkInEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkOutEndpoints(value: IVectorView[UsbBulkOutEndpointDescriptor]): Self = StObject.set(x, "bulkOutEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptors(value: IVectorView[UsbDescriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceDescriptor(value: UsbInterfaceDescriptor): Self = StObject.set(x, "interfaceDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptInEndpoints(value: IVectorView[UsbInterruptInEndpointDescriptor]): Self = StObject.set(x, "interruptInEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptOutEndpoints(value: IVectorView[UsbInterruptOutEndpointDescriptor]): Self = StObject.set(x, "interruptOutEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectSettingAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "selectSettingAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
