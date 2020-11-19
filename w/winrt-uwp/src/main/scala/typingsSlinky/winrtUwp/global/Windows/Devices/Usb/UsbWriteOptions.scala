package typingsSlinky.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB OUT endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbWriteOptions")
@js.native
object UsbWriteOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbWriteOptions with Double] = js.native
  
  /* 1 */ val autoClearStall: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.autoClearStall with Double = js.native
  
  /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.none with Double = js.native
  
  /* 2 */ val shortPacketTerminate: typingsSlinky.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.shortPacketTerminate with Double = js.native
}
