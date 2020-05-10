package typingsSlinky.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWarning extends js.Object {
  var warning: js.Error = js.native
}

object AnonWarning {
  @scala.inline
  def apply(warning: js.Error): AnonWarning = {
    val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWarning]
  }
  @scala.inline
  implicit class AnonWarningOps[Self <: AnonWarning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWarning(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

