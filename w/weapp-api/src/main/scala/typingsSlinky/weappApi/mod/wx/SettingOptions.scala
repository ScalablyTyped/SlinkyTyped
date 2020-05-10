package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设置
@js.native
trait SettingOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_SettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.native
}

object SettingOptions {
  @scala.inline
  def apply(): SettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingOptions]
  }
  @scala.inline
  implicit class SettingOptionsOps[Self <: SettingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ AuthSetting => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

