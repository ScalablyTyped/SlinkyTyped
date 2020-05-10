package typingsSlinky.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleAnimation extends js.Object {
  def scale(sx: Double): Animation = js.native
  def scale3d(): Animation = js.native
  def scaleX(sx: Double): Animation = js.native
  def scaleY(sy: Double): Animation = js.native
  def scaleZ(sz: Double): Animation = js.native
}

object ScaleAnimation {
  @scala.inline
  def apply(
    scale: Double => Animation,
    scale3d: () => Animation,
    scaleX: Double => Animation,
    scaleY: Double => Animation,
    scaleZ: Double => Animation
  ): ScaleAnimation = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), scale3d = js.Any.fromFunction0(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ))
    __obj.asInstanceOf[ScaleAnimation]
  }
  @scala.inline
  implicit class ScaleAnimationOps[Self <: ScaleAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScale(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScale3d(value: () => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale3d")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScaleX(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScaleY(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScaleZ(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleZ")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

