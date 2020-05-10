package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackSupportedConstraints extends js.Object {
  var aspectRatio: js.UndefOr[scala.Boolean] = js.native
  var autoGainControl: js.UndefOr[scala.Boolean] = js.native
  var channelCount: js.UndefOr[scala.Boolean] = js.native
  var deviceId: js.UndefOr[scala.Boolean] = js.native
  var echoCancellation: js.UndefOr[scala.Boolean] = js.native
  var facingMode: js.UndefOr[scala.Boolean] = js.native
  var frameRate: js.UndefOr[scala.Boolean] = js.native
  var groupId: js.UndefOr[scala.Boolean] = js.native
  var height: js.UndefOr[scala.Boolean] = js.native
  var latency: js.UndefOr[scala.Boolean] = js.native
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.native
  var resizeMode: js.UndefOr[scala.Boolean] = js.native
  var sampleRate: js.UndefOr[scala.Boolean] = js.native
  var sampleSize: js.UndefOr[scala.Boolean] = js.native
  var width: js.UndefOr[scala.Boolean] = js.native
}

object MediaTrackSupportedConstraints {
  @scala.inline
  def apply(): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
  @scala.inline
  implicit class MediaTrackSupportedConstraintsOps[Self <: org.scalajs.dom.experimental.mediastream.MediaTrackSupportedConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGainControl(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGainControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGainControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGainControl")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelCount(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoCancellation(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoCancellation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoCancellation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoCancellation")(js.undefined)
        ret
    }
    @scala.inline
    def withFacingMode(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withNoiseSuppression(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseSuppression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoiseSuppression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseSuppression")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeMode(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleSize(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

