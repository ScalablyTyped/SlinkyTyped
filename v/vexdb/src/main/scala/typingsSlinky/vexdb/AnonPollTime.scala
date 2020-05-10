package typingsSlinky.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPollTime extends js.Object {
  var pollTime: Double = js.native
}

object AnonPollTime {
  @scala.inline
  def apply(pollTime: Double): AnonPollTime = {
    val __obj = js.Dynamic.literal(pollTime = pollTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPollTime]
  }
  @scala.inline
  implicit class AnonPollTimeOps[Self <: AnonPollTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPollTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

