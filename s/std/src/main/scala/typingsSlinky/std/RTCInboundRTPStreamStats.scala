package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCInboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesReceived: js.UndefOr[Double] = js.native
  var fractionLost: js.UndefOr[Double] = js.native
  var jitter: js.UndefOr[Double] = js.native
  var packetsLost: js.UndefOr[Double] = js.native
  var packetsReceived: js.UndefOr[Double] = js.native
}

object RTCInboundRTPStreamStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType): RTCInboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRTPStreamStats]
  }
  @scala.inline
  implicit class RTCInboundRTPStreamStatsOps[Self <: RTCInboundRTPStreamStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFractionLost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFractionLost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionLost")(js.undefined)
        ret
    }
    @scala.inline
    def withJitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketsLost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketsLost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsLost")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketsReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketsReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsReceived")(js.undefined)
        ret
    }
  }
  
}

