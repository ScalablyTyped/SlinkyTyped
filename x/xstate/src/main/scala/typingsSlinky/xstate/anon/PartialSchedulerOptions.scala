package typingsSlinky.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<xstate.xstate/lib/scheduler.SchedulerOptions> */
@js.native
trait PartialSchedulerOptions extends js.Object {
  var deferEvents: js.UndefOr[Boolean] = js.native
}

object PartialSchedulerOptions {
  @scala.inline
  def apply(): PartialSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSchedulerOptions]
  }
  @scala.inline
  implicit class PartialSchedulerOptionsOps[Self <: PartialSchedulerOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutDeferEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvents")(js.undefined)
        ret
    }
  }
  
}

