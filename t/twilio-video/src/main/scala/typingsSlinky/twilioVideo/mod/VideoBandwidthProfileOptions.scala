package typingsSlinky.twilioVideo.mod

import typingsSlinky.twilioVideo.mod.Track.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoBandwidthProfileOptions extends js.Object {
  var dominantSpeakerPriority: js.UndefOr[Priority] = js.native
  var maxSubscriptionBitrate: js.UndefOr[Double] = js.native
  var maxTracks: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[BandwidthProfileMode] = js.native
  var renderDimensions: js.UndefOr[VideoRenderDimensions] = js.native
}

object VideoBandwidthProfileOptions {
  @scala.inline
  def apply(): VideoBandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoBandwidthProfileOptions]
  }
  @scala.inline
  implicit class VideoBandwidthProfileOptionsOps[Self <: VideoBandwidthProfileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDominantSpeakerPriority(value: Priority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantSpeakerPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominantSpeakerPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantSpeakerPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSubscriptionBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSubscriptionBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSubscriptionBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSubscriptionBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTracks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTracks")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: BandwidthProfileMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDimensions(value: VideoRenderDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDimensions")(js.undefined)
        ret
    }
  }
  
}

