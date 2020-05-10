package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCTransportStats extends RTCStats {
  var activeConnection: js.UndefOr[scala.Boolean] = js.native
  var bytesReceived: js.UndefOr[Double] = js.native
  var bytesSent: js.UndefOr[Double] = js.native
  var localCertificateId: js.UndefOr[java.lang.String] = js.native
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.native
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.native
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.native
}

object RTCTransportStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType): RTCTransportStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
  @scala.inline
  implicit class RTCTransportStatsOps[Self <: RTCTransportStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveConnection(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalCertificateId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteCertificateId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcpTransportStatsId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpTransportStatsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcpTransportStatsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpTransportStatsId")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedCandidatePairId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCandidatePairId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCandidatePairId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCandidatePairId")(js.undefined)
        ret
    }
  }
  
}

