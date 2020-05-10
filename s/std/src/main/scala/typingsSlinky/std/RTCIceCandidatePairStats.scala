package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceCandidatePairStats extends RTCStats {
  var availableIncomingBitrate: js.UndefOr[Double] = js.native
  var availableOutgoingBitrate: js.UndefOr[Double] = js.native
  var bytesReceived: js.UndefOr[Double] = js.native
  var bytesSent: js.UndefOr[Double] = js.native
  var localCandidateId: js.UndefOr[java.lang.String] = js.native
  var nominated: js.UndefOr[scala.Boolean] = js.native
  var priority: js.UndefOr[Double] = js.native
  var readable: js.UndefOr[scala.Boolean] = js.native
  var remoteCandidateId: js.UndefOr[java.lang.String] = js.native
  var roundTripTime: js.UndefOr[Double] = js.native
  var state: js.UndefOr[RTCStatsIceCandidatePairState] = js.native
  var transportId: js.UndefOr[java.lang.String] = js.native
  var writable: js.UndefOr[scala.Boolean] = js.native
}

object RTCIceCandidatePairStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
  @scala.inline
  implicit class RTCIceCandidatePairStatsOps[Self <: RTCIceCandidatePairStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableIncomingBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableIncomingBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableIncomingBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableIncomingBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableOutgoingBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableOutgoingBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableOutgoingBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableOutgoingBitrate")(js.undefined)
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
    def withLocalCandidateId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localCandidateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalCandidateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localCandidateId")(js.undefined)
        ret
    }
    @scala.inline
    def withNominated(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nominated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNominated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nominated")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withReadable(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteCandidateId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteCandidateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteCandidateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteCandidateId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundTripTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundTripTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundTripTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundTripTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: RTCStatsIceCandidatePairState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportId")(js.undefined)
        ret
    }
    @scala.inline
    def withWritable(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(js.undefined)
        ret
    }
  }
  
}

