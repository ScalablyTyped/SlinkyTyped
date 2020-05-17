package typingsSlinky.winrtUwp.Windows.Networking.Proximity

import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies a peer. */
@js.native
trait PeerInformation extends js.Object {
  /** Gets the device data included during device discovery. */
  var discoveryData: IBuffer = js.native
  /** Gets the display name of the peer. */
  var displayName: String = js.native
  /** Gets the hostname or IP address of the peer. */
  var hostName: HostName = js.native
  /** Gets the app id for the peer app. */
  var id: String = js.native
  /** Gets the service name or TCP port number of the peer. */
  var serviceName: String = js.native
}

object PeerInformation {
  @scala.inline
  def apply(discoveryData: IBuffer, displayName: String, hostName: HostName, id: String, serviceName: String): PeerInformation = {
    val __obj = js.Dynamic.literal(discoveryData = discoveryData.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInformation]
  }
  @scala.inline
  implicit class PeerInformationOps[Self <: PeerInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscoveryData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostName(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

