package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a MessageWebSocket . */
@js.native
trait MessageWebSocketInformation extends js.Object {
  /** Gets bandwidth information for network data transfer on a MessageWebSocket object. */
  var bandwidthStatistics: BandwidthStatistics = js.native
  /** Gets the IP address associated with a MessageWebSocket object. */
  var localAddress: HostName = js.native
  /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a MessageWebSocket object. */
  var protocol: String = js.native
}

object MessageWebSocketInformation {
  @scala.inline
  def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): MessageWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketInformation]
  }
  @scala.inline
  implicit class MessageWebSocketInformationOps[Self <: MessageWebSocketInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidthStatistics(value: BandwidthStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

