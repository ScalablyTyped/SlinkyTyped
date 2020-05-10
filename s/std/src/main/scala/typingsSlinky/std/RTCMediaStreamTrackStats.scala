package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCMediaStreamTrackStats extends RTCStats {
  var audioLevel: js.UndefOr[Double] = js.native
  var echoReturnLoss: js.UndefOr[Double] = js.native
  var echoReturnLossEnhancement: js.UndefOr[Double] = js.native
  var frameHeight: js.UndefOr[Double] = js.native
  var frameWidth: js.UndefOr[Double] = js.native
  var framesCorrupted: js.UndefOr[Double] = js.native
  var framesDecoded: js.UndefOr[Double] = js.native
  var framesDropped: js.UndefOr[Double] = js.native
  var framesPerSecond: js.UndefOr[Double] = js.native
  var framesReceived: js.UndefOr[Double] = js.native
  var framesSent: js.UndefOr[Double] = js.native
  var remoteSource: js.UndefOr[scala.Boolean] = js.native
  var ssrcIds: js.UndefOr[js.Array[java.lang.String]] = js.native
  var trackIdentifier: js.UndefOr[java.lang.String] = js.native
}

object RTCMediaStreamTrackStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
  @scala.inline
  implicit class RTCMediaStreamTrackStatsOps[Self <: RTCMediaStreamTrackStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoReturnLoss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoReturnLoss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoReturnLoss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoReturnLoss")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoReturnLossEnhancement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoReturnLossEnhancement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoReturnLossEnhancement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoReturnLossEnhancement")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFramesCorrupted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesCorrupted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramesCorrupted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesCorrupted")(js.undefined)
        ret
    }
    @scala.inline
    def withFramesDecoded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesDecoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramesDecoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesDecoded")(js.undefined)
        ret
    }
    @scala.inline
    def withFramesDropped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesDropped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramesDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withFramesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withFramesReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramesReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withFramesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramesSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesSent")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteSource(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSource")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrcIds(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrcIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrcIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrcIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackIdentifier(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIdentifier")(js.undefined)
        ret
    }
  }
  
}

