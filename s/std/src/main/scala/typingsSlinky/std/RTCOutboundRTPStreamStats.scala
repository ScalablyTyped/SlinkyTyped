package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCOutboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesSent: js.UndefOr[Double] = js.native
  var packetsSent: js.UndefOr[Double] = js.native
  var roundTripTime: js.UndefOr[Double] = js.native
  var targetBitrate: js.UndefOr[Double] = js.native
}

object RTCOutboundRTPStreamStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
  @scala.inline
  implicit class RTCOutboundRTPStreamStatsOps[Self <: RTCOutboundRTPStreamStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPacketsSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketsSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsSent")(js.undefined)
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
    def withTargetBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBitrate")(js.undefined)
        ret
    }
  }
  
}

