package typingsSlinky.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB bulk IN endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbReadOptions")
@js.native
object UsbReadOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbReadOptions with Double] = js.native
  
  /* 4 */ val allowPartialReads: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbReadOptions.allowPartialReads with Double = js.native
  
  /* 1 */ val autoClearStall: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbReadOptions.autoClearStall with Double = js.native
  
  /* 3 */ val ignoreShortPacket: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbReadOptions.ignoreShortPacket with Double = js.native
  
  /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbReadOptions.none with Double = js.native
  
  /* 2 */ val overrideAutomaticBufferManagement: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbReadOptions.overrideAutomaticBufferManagement with Double = js.native
}
