package typingsSlinky.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectConnectionStatus extends StObject
/** Describes the connection status of a WiFiDirectDevice object. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionStatus")
@js.native
object WiFiDirectConnectionStatus extends StObject {
  
  /** The device is connected to an associated Wi-Fi Direct device. */
  @js.native
  sealed trait connected extends WiFiDirectConnectionStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait disconnected extends WiFiDirectConnectionStatus
}
