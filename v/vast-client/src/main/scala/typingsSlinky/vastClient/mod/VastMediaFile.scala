package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastMediaFile extends js.Object {
  var apiFramework: String | Null = js.native
  var bitrate: Double = js.native
  var codec: String | Null = js.native
  var deliveryType: String = js.native
  var fileURL: String | Null = js.native
  var height: Double = js.native
  var id: String | Null = js.native
  var maintainAspectRatio: Boolean | Null = js.native
  var maxBitrate: Double = js.native
  var mimeType: String | Null = js.native
  var minBitrate: Double = js.native
  var scalable: Boolean | Null = js.native
  var width: Double = js.native
}

object VastMediaFile {
  @scala.inline
  def apply(
    bitrate: Double,
    deliveryType: String,
    height: Double,
    maxBitrate: Double,
    minBitrate: Double,
    width: Double
  ): VastMediaFile = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], deliveryType = deliveryType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxBitrate = maxBitrate.asInstanceOf[js.Any], minBitrate = minBitrate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastMediaFile]
  }
  @scala.inline
  implicit class VastMediaFileOps[Self <: VastMediaFile] (val x: Self) extends AnyVal {
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
    def withDeliveryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiFrameworkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiFramework")(null)
        ret
    }
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodecNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(null)
        ret
    }
    @scala.inline
    def withFileURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileURLNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileURL")(null)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withMaintainAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainAspectRatioNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainAspectRatio")(null)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(null)
        ret
    }
    @scala.inline
    def withScalable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalable")(null)
        ret
    }
  }
  
}

