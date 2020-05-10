package typingsSlinky.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateAnimation extends js.Object {
  def translate(tx: Double): Animation = js.native
  def translate3d(): Animation = js.native
  def translateX(tx: Double): Animation = js.native
  def translateY(ty: Double): Animation = js.native
  def translateZ(tz: Double): Animation = js.native
}

object TranslateAnimation {
  @scala.inline
  def apply(
    translate: Double => Animation,
    translate3d: () => Animation,
    translateX: Double => Animation,
    translateY: Double => Animation,
    translateZ: Double => Animation
  ): TranslateAnimation = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction1(translate), translate3d = js.Any.fromFunction0(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ))
    __obj.asInstanceOf[TranslateAnimation]
  }
  @scala.inline
  implicit class TranslateAnimationOps[Self <: TranslateAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslate(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslate3d(value: () => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate3d")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTranslateX(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslateY(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslateZ(value: Double => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateZ")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

