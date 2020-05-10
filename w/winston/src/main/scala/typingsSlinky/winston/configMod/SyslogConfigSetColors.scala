package typingsSlinky.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyslogConfigSetColors extends AbstractConfigSetColors {
  var alert: String | js.Array[String] = js.native
  var crit: String | js.Array[String] = js.native
  var debug: String | js.Array[String] = js.native
  var emerg: String | js.Array[String] = js.native
  var error: String | js.Array[String] = js.native
  var info: String | js.Array[String] = js.native
  var notice: String | js.Array[String] = js.native
  var warning: String | js.Array[String] = js.native
}

object SyslogConfigSetColors {
  @scala.inline
  def apply(
    alert: String | js.Array[String],
    crit: String | js.Array[String],
    debug: String | js.Array[String],
    emerg: String | js.Array[String],
    error: String | js.Array[String],
    info: String | js.Array[String],
    notice: String | js.Array[String],
    warning: String | js.Array[String]
  ): SyslogConfigSetColors = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyslogConfigSetColors]
  }
  @scala.inline
  implicit class SyslogConfigSetColorsOps[Self <: SyslogConfigSetColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrit(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmerg(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emerg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotice(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

