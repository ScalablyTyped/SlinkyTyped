package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Networking.HostName
import typingsSlinky.winrt.Windows.Storage.Streams.DataReader
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatagramSocketMessageReceivedEventArgs extends js.Object {
  var localAddress: HostName = js.native
  var remoteAddress: HostName = js.native
  var remotePort: String = js.native
  def getDataReader(): DataReader = js.native
  def getDataStream(): IInputStream = js.native
}

object IDatagramSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(
    getDataReader: () => DataReader,
    getDataStream: () => IInputStream,
    localAddress: HostName,
    remoteAddress: HostName,
    remotePort: String
  ): IDatagramSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), localAddress = localAddress.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatagramSocketMessageReceivedEventArgs]
  }
  @scala.inline
  implicit class IDatagramSocketMessageReceivedEventArgsOps[Self <: IDatagramSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDataReader(value: () => DataReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataReader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataStream(value: () => IInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocalAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
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

