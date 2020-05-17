package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a DatagramSocket object. */
@js.native
trait DatagramSocketInformation extends js.Object {
  /** The local IP address associated with a DatagramSocket object. */
  var localAddress: HostName = js.native
  /** The local service name or UDP port number associated with a DatagramSocket . */
  var localPort: String = js.native
  /** The IP address of the remote network destination associated with a DatagramSocket object. */
  var remoteAddress: HostName = js.native
  /** The UDP port number of the remote network destination associated with a DatagramSocket object. */
  var remotePort: String = js.native
}

object DatagramSocketInformation {
  @scala.inline
  def apply(localAddress: HostName, localPort: String, remoteAddress: HostName, remotePort: String): DatagramSocketInformation = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketInformation]
  }
  @scala.inline
  implicit class DatagramSocketInformationOps[Self <: DatagramSocketInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

