package typingsSlinky.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents physical identification data for a specific NetworkAdapter object. */
@JSGlobal("Windows.Networking.Connectivity.LanIdentifier")
@js.native
abstract class LanIdentifier ()
  extends typingsSlinky.winrtUwp.Windows.Networking.Connectivity.LanIdentifier {
  /** Gets a LanIdentifierData object containing locality identification information for the network adapter's connection. */
  /* CompleteClass */
  override var infrastructureId: typingsSlinky.winrtUwp.Windows.Networking.Connectivity.LanIdentifierData = js.native
  /** Gets the adapter GUID that identifies the network adapter to associate with the locality information. */
  /* CompleteClass */
  override var networkAdapterId: String = js.native
  /** Gets a LanIdentifierData object containing the port ID from the Link Layer Discovery Protocol (LLDP) locality information for an Ethernet type network adapter. */
  /* CompleteClass */
  override var portId: typingsSlinky.winrtUwp.Windows.Networking.Connectivity.LanIdentifierData = js.native
}

