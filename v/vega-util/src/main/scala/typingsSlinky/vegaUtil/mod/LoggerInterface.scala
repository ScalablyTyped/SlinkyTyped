package typingsSlinky.vegaUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerInterface extends js.Object {
  def debug(args: js.Any*): LoggerInterface = js.native
  def error(args: js.Any*): LoggerInterface = js.native
  def info(args: js.Any*): LoggerInterface = js.native
  def level(_underscore: Double): Double | LoggerInterface = js.native
  def warn(args: js.Any*): LoggerInterface = js.native
}

object LoggerInterface {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => LoggerInterface,
    error: /* repeated */ js.Any => LoggerInterface,
    info: /* repeated */ js.Any => LoggerInterface,
    level: Double => Double | LoggerInterface,
    warn: /* repeated */ js.Any => LoggerInterface
  ): LoggerInterface = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), level = js.Any.fromFunction1(level), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LoggerInterface]
  }
  @scala.inline
  implicit class LoggerInterfaceOps[Self <: LoggerInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: /* repeated */ js.Any => LoggerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: /* repeated */ js.Any => LoggerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: /* repeated */ js.Any => LoggerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevel(value: Double => Double | LoggerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarn(value: /* repeated */ js.Any => LoggerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

