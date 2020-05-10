package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageData extends js.Object {
  var bottom: Double = js.native
  // width: number;
  // height: number;
  var left: Double = js.native
  var originHeight: Double = js.native
  var originWidth: Double = js.native
  var right: Double = js.native
  var scaleHeight: Double = js.native
  var scaleWidth: Double = js.native
  var scaled: Boolean = js.native
  var top: Double = js.native
}

object ImageData {
  @scala.inline
  def apply(
    bottom: Double,
    left: Double,
    originHeight: Double,
    originWidth: Double,
    right: Double,
    scaleHeight: Double,
    scaleWidth: Double,
    scaled: Boolean,
    top: Double
  ): ImageData = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], originHeight = originHeight.asInstanceOf[js.Any], originWidth = originWidth.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], scaleHeight = scaleHeight.asInstanceOf[js.Any], scaleWidth = scaleWidth.asInstanceOf[js.Any], scaled = scaled.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
  @scala.inline
  implicit class ImageDataOps[Self <: ImageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

