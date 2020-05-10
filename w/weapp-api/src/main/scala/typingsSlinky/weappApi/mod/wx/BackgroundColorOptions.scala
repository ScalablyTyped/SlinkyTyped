package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorOptions extends CommonCallbackOptions {
  // 窗口的背景色，必须为十六进制颜色值
  var backgroundColor: js.UndefOr[String] = js.native
  //  底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorBottom: js.UndefOr[String] = js.native
  // 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorTop: js.UndefOr[String] = js.native
}

object BackgroundColorOptions {
  @scala.inline
  def apply(): BackgroundColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorOptions]
  }
  @scala.inline
  implicit class BackgroundColorOptionsOps[Self <: BackgroundColorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorTop")(js.undefined)
        ret
    }
  }
  
}

