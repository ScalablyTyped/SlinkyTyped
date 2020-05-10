package typingsSlinky.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderDashes extends js.Object {
  var borderDashes: js.UndefOr[Boolean | js.Array[Double]] = js.native
   // only for borders
  var borderRadius: js.UndefOr[Double] = js.native
       // only for box shape
  var interpolation: js.UndefOr[Boolean] = js.native
    // only for image and circularImage shapes
  var useBorderWithImage: js.UndefOr[Boolean] = js.native
    // only for image and circularImage shapes
  var useImageSize: js.UndefOr[Boolean] = js.native
}

object AnonBorderDashes {
  @scala.inline
  def apply(): AnonBorderDashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBorderDashes]
  }
  @scala.inline
  implicit class AnonBorderDashesOps[Self <: AnonBorderDashes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderDashes(value: Boolean | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashes")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBorderWithImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBorderWithImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBorderWithImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBorderWithImage")(js.undefined)
        ret
    }
    @scala.inline
    def withUseImageSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useImageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useImageSize")(js.undefined)
        ret
    }
  }
  
}

