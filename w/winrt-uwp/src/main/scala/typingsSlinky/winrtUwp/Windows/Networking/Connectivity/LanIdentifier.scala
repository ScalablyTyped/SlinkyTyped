package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents physical identification data for a specific NetworkAdapter object. */
@js.native
trait LanIdentifier extends js.Object {
  /** Gets a LanIdentifierData object containing locality identification information for the network adapter's connection. */
  var infrastructureId: LanIdentifierData = js.native
  /** Gets the adapter GUID that identifies the network adapter to associate with the locality information. */
  var networkAdapterId: String = js.native
  /** Gets a LanIdentifierData object containing the port ID from the Link Layer Discovery Protocol (LLDP) locality information for an Ethernet type network adapter. */
  var portId: LanIdentifierData = js.native
}

object LanIdentifier {
  @scala.inline
  def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): LanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanIdentifier]
  }
  @scala.inline
  implicit class LanIdentifierOps[Self <: LanIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfrastructureId(value: LanIdentifierData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkAdapterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAdapterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortId(value: LanIdentifierData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

