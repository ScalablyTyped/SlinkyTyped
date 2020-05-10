package typingsSlinky.uploadcare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInfo extends js.Object {
  var datetime_original: Null = js.native
  var dpi: js.Array[Double] = js.native
  var format: String = js.native
  var geo_location: Null = js.native
  var height: Double = js.native
  var orientation: Null = js.native
  var sequence: Boolean = js.native
  var width: Double = js.native
}

object ImageInfo {
  @scala.inline
  def apply(
    datetime_original: Null,
    dpi: js.Array[Double],
    format: String,
    geo_location: Null,
    height: Double,
    orientation: Null,
    sequence: Boolean,
    width: Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(datetime_original = datetime_original.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], geo_location = geo_location.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  @scala.inline
  implicit class ImageInfoOps[Self <: ImageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatetime_original(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime_original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpi(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeo_location(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
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

