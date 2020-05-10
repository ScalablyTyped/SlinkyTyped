package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogger extends js.Object {
  def debug(): Boolean = js.native
  def error(): Boolean = js.native
  def fatal(): Boolean = js.native
  def information(): Boolean = js.native
  def log(s: String): Unit = js.native
  def warning(): Boolean = js.native
}

object ILogger {
  @scala.inline
  def apply(
    debug: () => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    information: () => Boolean,
    log: String => Unit,
    warning: () => Boolean
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[ILogger]
  }
  @scala.inline
  implicit class ILoggerOps[Self <: ILogger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFatal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInformation(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("information")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLog(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

