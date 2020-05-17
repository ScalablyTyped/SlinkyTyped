package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of input and output VideoEncodingProperties for a video stream */
@js.native
trait VideoStreamConfiguration extends js.Object {
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  var inputProperties: VideoEncodingProperties = js.native
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  var outputProperties: VideoEncodingProperties = js.native
}

object VideoStreamConfiguration {
  @scala.inline
  def apply(inputProperties: VideoEncodingProperties, outputProperties: VideoEncodingProperties): VideoStreamConfiguration = {
    val __obj = js.Dynamic.literal(inputProperties = inputProperties.asInstanceOf[js.Any], outputProperties = outputProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamConfiguration]
  }
  @scala.inline
  implicit class VideoStreamConfigurationOps[Self <: VideoStreamConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputProperties(value: VideoEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputProperties(value: VideoEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

