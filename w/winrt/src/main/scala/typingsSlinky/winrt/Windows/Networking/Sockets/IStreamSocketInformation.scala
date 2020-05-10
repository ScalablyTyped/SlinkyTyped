package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Networking.HostName
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamSocketInformation extends js.Object {
  var bandwidthStatistics: BandwidthStatistics = js.native
  var localAddress: HostName = js.native
  var localPort: String = js.native
  var protectionLevel: SocketProtectionLevel = js.native
  var remoteAddress: HostName = js.native
  var remoteHostName: HostName = js.native
  var remotePort: String = js.native
  var remoteServiceName: String = js.native
  var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  var sessionKey: IBuffer = js.native
}

object IStreamSocketInformation {
  @scala.inline
  def apply(
    bandwidthStatistics: BandwidthStatistics,
    localAddress: HostName,
    localPort: String,
    protectionLevel: SocketProtectionLevel,
    remoteAddress: HostName,
    remoteHostName: HostName,
    remotePort: String,
    remoteServiceName: String,
    roundTripTimeStatistics: RoundTripTimeStatistics,
    sessionKey: IBuffer
  ): IStreamSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any], roundTripTimeStatistics = roundTripTimeStatistics.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketInformation]
  }
  @scala.inline
  implicit class IStreamSocketInformationOps[Self <: IStreamSocketInformation] (val x: Self) extends AnyVal {
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
    def withLocalPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectionLevel(value: SocketProtectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteHostName(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteHostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundTripTimeStatistics(value: RoundTripTimeStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundTripTimeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionKey(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

