package typingsSlinky.upngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageFrame extends js.Object {
  var blend: Double = js.native
  var delay: Double = js.native
  var dispose: Double = js.native
  var rect: ImageFrameRect = js.native
}

object ImageFrame {
  @scala.inline
  def apply(blend: Double, delay: Double, dispose: Double, rect: ImageFrameRect): ImageFrame = {
    val __obj = js.Dynamic.literal(blend = blend.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFrame]
  }
  @scala.inline
  implicit class ImageFrameOps[Self <: ImageFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRect(value: ImageFrameRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

