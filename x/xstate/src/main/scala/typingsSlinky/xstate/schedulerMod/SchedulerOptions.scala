package typingsSlinky.xstate.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerOptions extends js.Object {
  var deferEvents: Boolean = js.native
}

object SchedulerOptions {
  @scala.inline
  def apply(deferEvents: Boolean): SchedulerOptions = {
    val __obj = js.Dynamic.literal(deferEvents = deferEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerOptions]
  }
  @scala.inline
  implicit class SchedulerOptionsOps[Self <: SchedulerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

