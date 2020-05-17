package typingsSlinky.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogInfo extends LogInput {
  var msg: String = js.native
}

object LogInfo {
  @scala.inline
  def apply(msg: String): LogInfo = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogInfo]
  }
  @scala.inline
  implicit class LogInfoOps[Self <: LogInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

