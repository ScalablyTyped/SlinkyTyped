package typingsSlinky.weappApi.mod.wx

import typingsSlinky.weappApi.weappApiStrings.easeIn
import typingsSlinky.weappApi.weappApiStrings.easeInOut
import typingsSlinky.weappApi.weappApiStrings.easeOut
import typingsSlinky.weappApi.weappApiStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBarColorAnimationOptions extends js.Object {
  //  动画变化时间，单位 ms，默认0
  var animation: js.UndefOr[Double] = js.native
  //  动画变化方式.动画从头到尾的速度是相同的,动画以低速开始,动画以低速结束,动画以低速开始和结束
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.native
}

object NavigationBarColorAnimationOptions {
  @scala.inline
  def apply(): NavigationBarColorAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarColorAnimationOptions]
  }
  @scala.inline
  implicit class NavigationBarColorAnimationOptionsOps[Self <: NavigationBarColorAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunc")(js.undefined)
        ret
    }
  }
  
}

