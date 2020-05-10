package typingsSlinky.semanticRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonError extends js.Object {
  def error(message: String, vars: js.Any*): Unit = js.native
  def log(message: String, vars: js.Any*): Unit = js.native
}

object AnonError {
  @scala.inline
  def apply(error: (String, /* repeated */ js.Any) => Unit, log: (String, /* repeated */ js.Any) => Unit): AnonError = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[AnonError]
  }
  @scala.inline
  implicit class AnonErrorOps[Self <: AnonError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLog(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

