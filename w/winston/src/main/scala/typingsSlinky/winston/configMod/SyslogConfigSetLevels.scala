package typingsSlinky.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyslogConfigSetLevels extends AbstractConfigSetLevels {
  var alert: Double = js.native
  var crit: Double = js.native
  var debug: Double = js.native
  var emerg: Double = js.native
  var error: Double = js.native
  var info: Double = js.native
  var notice: Double = js.native
  var warning: Double = js.native
}

object SyslogConfigSetLevels {
  @scala.inline
  def apply(
    alert: Double,
    crit: Double,
    debug: Double,
    emerg: Double,
    error: Double,
    info: Double,
    notice: Double,
    warning: Double
  ): SyslogConfigSetLevels = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyslogConfigSetLevels]
  }
  @scala.inline
  implicit class SyslogConfigSetLevelsOps[Self <: SyslogConfigSetLevels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmerg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emerg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

