package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatagramSocketInformation extends js.Object {
  var localAddress: HostName = js.native
  var localPort: String = js.native
  var remoteAddress: HostName = js.native
  var remotePort: String = js.native
}

object IDatagramSocketInformation {
  @scala.inline
  def apply(localAddress: HostName, localPort: String, remoteAddress: HostName, remotePort: String): IDatagramSocketInformation = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatagramSocketInformation]
  }
  @scala.inline
  implicit class IDatagramSocketInformationOps[Self <: IDatagramSocketInformation] (val x: Self) extends AnyVal {
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

