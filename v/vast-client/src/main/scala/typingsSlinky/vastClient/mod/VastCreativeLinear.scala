package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastCreativeLinear extends VastCreative {
  var adParameters: String | Null = js.native
  var duration: Double = js.native
  var icons: js.Array[VastIcon] = js.native
  var mediaFiles: js.Array[VastMediaFile] = js.native
  var skipDelay: Double | Null = js.native
  var videoClickThroughURLTemplate: String | Null = js.native
  var videoClickTrackingURLTemplates: js.Array[String] = js.native
  var videoCustomClickURLTemplates: js.Array[String] = js.native
}

object VastCreativeLinear {
  @scala.inline
  def apply(
    duration: Double,
    icons: js.Array[VastIcon],
    mediaFiles: js.Array[VastMediaFile],
    trackingEvents: VastTrackingEvents,
    `type`: String,
    videoClickTrackingURLTemplates: js.Array[String],
    videoCustomClickURLTemplates: js.Array[String]
  ): VastCreativeLinear = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], mediaFiles = mediaFiles.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], videoClickTrackingURLTemplates = videoClickTrackingURLTemplates.asInstanceOf[js.Any], videoCustomClickURLTemplates = videoCustomClickURLTemplates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeLinear]
  }
  @scala.inline
  implicit class VastCreativeLinearOps[Self <: VastCreativeLinear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[VastIcon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaFiles(value: js.Array[VastMediaFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoClickTrackingURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoClickTrackingURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoCustomClickURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCustomClickURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adParameters")(null)
        ret
    }
    @scala.inline
    def withSkipDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipDelayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDelay")(null)
        ret
    }
    @scala.inline
    def withVideoClickThroughURLTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoClickThroughURLTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoClickThroughURLTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoClickThroughURLTemplate")(null)
        ret
    }
  }
  
}

