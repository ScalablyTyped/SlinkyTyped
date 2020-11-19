package typingsSlinky.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the status of the access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessStatus")
@js.native
object DeviceAccessStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus with Double
  ] = js.native
  
  /* 1 */ val allowed: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.allowed with Double = js.native
  
  /* 3 */ val deniedBySystem: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedBySystem with Double = js.native
  
  /* 2 */ val deniedByUser: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedByUser with Double = js.native
  
  /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.unspecified with Double = js.native
}
