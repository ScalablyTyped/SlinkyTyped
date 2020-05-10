package typingsSlinky.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateAnimation extends js.Object {
  def rotate(deg: Double): Animation = js.native
  def rotate3d(): Animation = js.native
  def rotateX(deg: Double): Animation = js.native
  def rotateY(deg: Double): Animation = js.native
  def rotateZ(deg: Double): Animation = js.native
}

object RotateAnimation {
  @scala.inline
  def apply(
    rotate: Double => Animation,
    rotate3d: () => Animation,
    rotateX: Double => Animation,
    rotateY: Double => Animation,
    rotateZ: Double => Animation
  ): RotateAnimation = {
    val __obj = js.Dynamic.literal(rotate = js.Any.fromFunction1(rotate), rotate3d = js.Any.fromFunction0(rotate3d), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ))
    __obj.asInstanceOf[RotateAnimation]
  }
  @scala.inline
  implicit class RotateAnimationOps[Self <: RotateAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotate(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotate3d(value: () => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate3d")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRotateX(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotateY(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotateZ(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateZ")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

