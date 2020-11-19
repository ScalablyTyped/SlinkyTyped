package typingsSlinky.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information and enables pairing for a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing")
@js.native
abstract class DeviceInformationPairing ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformationPairing
/* static members */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing")
@js.native
object DeviceInformationPairing extends js.Object {
  
  /**
    * Attempts to pair for all inbound pairing requests
    * @param pairingKindsSupported The pairing kinds this device supports.
    * @return Whether or not the attempt was successful.
    */
  def tryRegisterForAllInboundPairingRequests(pairingKindsSupported: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds): Boolean = js.native
}
