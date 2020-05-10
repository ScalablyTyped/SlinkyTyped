package typingsSlinky.storybookReactNative

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranslateXTranslateY extends js.Object {
  var translateX: js.UndefOr[scala.Nothing] = js.native
  var translateY: AnimatedInterpolation = js.native
}

object AnonTranslateXTranslateY {
  @scala.inline
  def apply(translateY: AnimatedInterpolation): AnonTranslateXTranslateY = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateXTranslateY]
  }
  @scala.inline
  implicit class AnonTranslateXTranslateYOps[Self <: AnonTranslateXTranslateY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslateY(value: AnimatedInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateX(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(js.undefined)
        ret
    }
  }
  
}

