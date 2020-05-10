package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasImageSmoothing extends js.Object {
  var imageSmoothingEnabled: scala.Boolean = js.native
  var imageSmoothingQuality: ImageSmoothingQuality = js.native
}

object CanvasImageSmoothing {
  @scala.inline
  def apply(imageSmoothingEnabled: scala.Boolean, imageSmoothingQuality: ImageSmoothingQuality): CanvasImageSmoothing = {
    val __obj = js.Dynamic.literal(imageSmoothingEnabled = imageSmoothingEnabled.asInstanceOf[js.Any], imageSmoothingQuality = imageSmoothingQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasImageSmoothing]
  }
  @scala.inline
  implicit class CanvasImageSmoothingOps[Self <: CanvasImageSmoothing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSmoothingEnabled(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSmoothingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSmoothingQuality(value: ImageSmoothingQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSmoothingQuality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

