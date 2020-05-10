package typingsSlinky.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkewAnimation extends js.Object {
  def skew(ax: Double): Animation = js.native
  def skewX(ax: Double): Animation = js.native
  def skewY(ay: Double): Animation = js.native
}

object SkewAnimation {
  @scala.inline
  def apply(skew: Double => Animation, skewX: Double => Animation, skewY: Double => Animation): SkewAnimation = {
    val __obj = js.Dynamic.literal(skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY))
    __obj.asInstanceOf[SkewAnimation]
  }
  @scala.inline
  implicit class SkewAnimationOps[Self <: SkewAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkew(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skew")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkewX(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkewY(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

