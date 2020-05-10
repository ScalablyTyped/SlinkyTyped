package typingsSlinky.zipkinTransportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorLogger extends js.Object {
  def error(args: js.Any*): Unit = js.native
}

object ErrorLogger {
  @scala.inline
  def apply(error: /* repeated */ js.Any => Unit): ErrorLogger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[ErrorLogger]
  }
  @scala.inline
  implicit class ErrorLoggerOps[Self <: ErrorLogger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

