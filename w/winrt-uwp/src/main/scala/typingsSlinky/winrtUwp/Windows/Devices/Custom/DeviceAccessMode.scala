package typingsSlinky.winrtUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceAccessMode extends js.Object
/** The device access mode. */
@JSGlobal("Windows.Devices.Custom.DeviceAccessMode")
@js.native
object DeviceAccessMode extends js.Object {
  
  /** Read access. */
  @js.native
  sealed trait read extends DeviceAccessMode
  
  /** Read/write access. */
  @js.native
  sealed trait readWrite extends DeviceAccessMode
  
  /** Write access. */
  @js.native
  sealed trait write extends DeviceAccessMode
}
