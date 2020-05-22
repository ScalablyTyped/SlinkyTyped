package typingsSlinky.winrtUwp.global.Windows.Devices.WiFiDirect

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest")
@js.native
abstract class WiFiDirectConnectionRequest ()
  extends typingsSlinky.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest {
  /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
  /* CompleteClass */
  override var deviceInformation: DeviceInformation = js.native
  /** Closes the WiFiDirectConnectionRequest object. */
  /* CompleteClass */
  override def close(): Unit = js.native
}

