package typingsSlinky.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoSettings extends js.Object {
  var fillLightMode: js.UndefOr[FillLightMode] = js.native
  var imageHeight: js.UndefOr[Double] = js.native
  var imageWidth: js.UndefOr[Double] = js.native
  var redEyeReduction: js.UndefOr[Boolean] = js.native
}

object PhotoSettings {
  @scala.inline
  def apply(): PhotoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoSettings]
  }
  @scala.inline
  implicit class PhotoSettingsOps[Self <: PhotoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillLightMode(value: FillLightMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillLightMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillLightMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillLightMode")(js.undefined)
        ret
    }
    @scala.inline
    def withImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRedEyeReduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redEyeReduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedEyeReduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redEyeReduction")(js.undefined)
        ret
    }
  }
  
}

