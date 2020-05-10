package typingsSlinky.yogLog.mod

import typingsSlinky.yogLog.yogLogNumbers.`0`
import typingsSlinky.yogLog.yogLogNumbers.`16`
import typingsSlinky.yogLog.yogLogNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfig extends js.Object {
  var IS_ODP: js.UndefOr[Boolean] = js.native
  var IS_OMP: js.UndefOr[`0` | `1`] = js.native
  var LogIdName: js.UndefOr[String] = js.native
  var access: js.UndefOr[String] = js.native
  var access_error_log_path: js.UndefOr[String] = js.native
  var access_log_path: js.UndefOr[String] = js.native
  var auto_rotate: js.UndefOr[`0` | `1`] = js.native
  // 模板文件地址，可以不填
  var data_path: js.UndefOr[String] = js.native
  var debug: js.UndefOr[`0` | `1`] = js.native
  var format_wf: js.UndefOr[String] = js.native
  var intLevel: js.UndefOr[`16`] = js.native
  // 用户只需要填写log_path配置
  var log_path: js.UndefOr[String] = js.native
  var use_sub_dir: js.UndefOr[`0` | `1`] = js.native
}

object LogConfig {
  @scala.inline
  def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIS_ODP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_ODP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIS_ODP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_ODP")(js.undefined)
        ret
    }
    @scala.inline
    def withIS_OMP(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_OMP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIS_OMP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_OMP")(js.undefined)
        ret
    }
    @scala.inline
    def withLogIdName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogIdName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogIdName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogIdName")(js.undefined)
        ret
    }
    @scala.inline
    def withAccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withAccess_error_log_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_error_log_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_error_log_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_error_log_path")(js.undefined)
        ret
    }
    @scala.inline
    def withAccess_log_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_log_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_log_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_log_path")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto_rotate(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_rotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withData_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_path")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_wf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_wf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_wf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_wf")(js.undefined)
        ret
    }
    @scala.inline
    def withIntLevel(value: `16`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLog_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_path")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_sub_dir(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_sub_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_sub_dir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_sub_dir")(js.undefined)
        ret
    }
  }
  
}

