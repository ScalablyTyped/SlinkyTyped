package typingsSlinky.shimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLogger extends js.Object {
  var logger: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
}

object AnonLogger {
  @scala.inline
  def apply(): AnonLogger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLogger]
  }
  @scala.inline
  implicit class AnonLoggerOps[Self <: AnonLogger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogger(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
  }
  
}

