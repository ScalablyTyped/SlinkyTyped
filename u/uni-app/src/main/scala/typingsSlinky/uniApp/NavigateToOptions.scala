package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.`fade-in`
import typingsSlinky.uniApp.uniAppStrings.`pop-in`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-bottom`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-left`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-right`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-top`
import typingsSlinky.uniApp.uniAppStrings.`zoom-fade-out`
import typingsSlinky.uniApp.uniAppStrings.`zoom-out`
import typingsSlinky.uniApp.uniAppStrings.auto
import typingsSlinky.uniApp.uniAppStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToOptions extends js.Object {
  /**
    * 窗口显示动画的持续时间，单位为 ms
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * 窗口显示的动画类型
    * - auto: 自动选择动画效果
    * - none: 无动画效果
    * - slide-in-right: 从右侧横向滑动效果
    * - slide-in-left: 左侧横向滑动效果
    * - slide-in-top: 从上侧竖向滑动效果
    * - slide-in-bottom: 从下侧竖向滑动效果
    * - fade-in: 从透明到不透明逐渐显示效果
    * - zoom-out: 从小到大逐渐放大显示效果
    * - zoom-fade-out: 从小到大逐渐放大并且从透明到不透明逐渐显示效果
    * - pop-in: 从右侧平移入栈动画效果
    */
  var animationType: js.UndefOr[
    auto | none | `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
  ] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 需要跳转的应用内非 tabBar 的页面的路径 , 路径后可以带参数
    */
  var url: js.UndefOr[String] = js.native
}

object NavigateToOptions {
  @scala.inline
  def apply(): NavigateToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateToOptions]
  }
  @scala.inline
  implicit class NavigateToOptionsOps[Self <: NavigateToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationType(
      value: auto | none | `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

