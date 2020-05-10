package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRTPStreamStats extends RTCStats {
  var associateStatsId: js.UndefOr[java.lang.String] = js.native
  var codecId: js.UndefOr[java.lang.String] = js.native
  var firCount: js.UndefOr[Double] = js.native
  var isRemote: js.UndefOr[scala.Boolean] = js.native
  var mediaTrackId: js.UndefOr[java.lang.String] = js.native
  var mediaType: js.UndefOr[java.lang.String] = js.native
  var nackCount: js.UndefOr[Double] = js.native
  var pliCount: js.UndefOr[Double] = js.native
  var sliCount: js.UndefOr[Double] = js.native
  var ssrc: js.UndefOr[java.lang.String] = js.native
  var transportId: js.UndefOr[java.lang.String] = js.native
}

object RTCRTPStreamStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType): RTCRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRTPStreamStats]
  }
  @scala.inline
  implicit class RTCRTPStreamStatsOps[Self <: RTCRTPStreamStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociateStatsId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associateStatsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociateStatsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associateStatsId")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecId")(js.undefined)
        ret
    }
    @scala.inline
    def withFirCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRemote(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemote")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaTrackId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTrackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaTrackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTrackId")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withNackCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nackCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNackCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nackCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPliCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pliCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPliCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pliCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSliCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrc(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrc")(js.undefined)
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
  }
  
}

