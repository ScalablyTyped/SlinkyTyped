package typingsSlinky.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVideoEncodingProperties extends IMediaEncodingProperties {
  var bitrate: Double = js.native
  var frameRate: MediaRatio = js.native
  var height: Double = js.native
  var pixelAspectRatio: MediaRatio = js.native
  var width: Double = js.native
}

object IVideoEncodingProperties {
  @scala.inline
  def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    height: Double,
    pixelAspectRatio: MediaRatio,
    properties: MediaPropertySet,
    subtype: String,
    `type`: String,
    width: Double
  ): IVideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEncodingProperties]
  }
  @scala.inline
  implicit class IVideoEncodingPropertiesOps[Self <: IVideoEncodingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameRate(value: MediaRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelAspectRatio(value: MediaRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

