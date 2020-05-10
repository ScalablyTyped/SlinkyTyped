package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputInfo extends js.Object {
  var channels: Double = js.native
  /** Only defined when using a crop strategy */
  var cropOffsetLeft: js.UndefOr[Double] = js.native
  /** Only defined when using a crop strategy */
  var cropOffsetTop: js.UndefOr[Double] = js.native
  var format: String = js.native
  var height: Double = js.native
  /** indicating if premultiplication was used */
  var premultiplied: Boolean = js.native
  var size: Double = js.native
  var width: Double = js.native
}

object OutputInfo {
  @scala.inline
  def apply(
    channels: Double,
    format: String,
    height: Double,
    premultiplied: Boolean,
    size: Double,
    width: Double
  ): OutputInfo = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], premultiplied = premultiplied.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputInfo]
  }
  @scala.inline
  implicit class OutputInfoOps[Self <: OutputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPremultiplied(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultiplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropOffsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropOffsetLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCropOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropOffsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropOffsetTop")(js.undefined)
        ret
    }
  }
  
}

