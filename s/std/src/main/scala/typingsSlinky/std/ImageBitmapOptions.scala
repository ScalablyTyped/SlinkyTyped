package typingsSlinky.std

import typingsSlinky.std.stdStrings.default
import typingsSlinky.std.stdStrings.flipY
import typingsSlinky.std.stdStrings.high
import typingsSlinky.std.stdStrings.low
import typingsSlinky.std.stdStrings.medium
import typingsSlinky.std.stdStrings.none
import typingsSlinky.std.stdStrings.pixelated
import typingsSlinky.std.stdStrings.premultiply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[none | default] = js.native
  var imageOrientation: js.UndefOr[none | flipY] = js.native
  var premultiplyAlpha: js.UndefOr[none | premultiply | default] = js.native
  var resizeHeight: js.UndefOr[Double] = js.native
  var resizeQuality: js.UndefOr[pixelated | low | medium | high] = js.native
  var resizeWidth: js.UndefOr[Double] = js.native
}

object ImageBitmapOptions {
  @scala.inline
  def apply(): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapOptions]
  }
  @scala.inline
  implicit class ImageBitmapOptionsOps[Self <: ImageBitmapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorSpaceConversion(value: none | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpaceConversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSpaceConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpaceConversion")(js.undefined)
        ret
    }
    @scala.inline
    def withImageOrientation(value: none | flipY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPremultiplyAlpha(value: none | premultiply | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultiplyAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremultiplyAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultiplyAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeQuality(value: pixelated | low | medium | high): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeWidth")(js.undefined)
        ret
    }
  }
  
}

