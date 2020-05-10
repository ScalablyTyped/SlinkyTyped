package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationTracing extends NotificationTracingSetParameters {
  /**
    * Trace until the specified end date.
    */
  var endDate: js.Date = js.native
  /**
    * The maximum number of result details to trace.
    */
  var maxTracedEntries: Double = js.native
  /**
    * The date and time tracing started.
    */
  var startDate: js.Date = js.native
  /**
    * Trace until remaining count reaches 0.
    */
  var tracedEntries: Double = js.native
}

object NotificationTracing {
  @scala.inline
  def apply(
    enabled: Boolean,
    endDate: js.Date,
    maxTracedEntries: Double,
    startDate: js.Date,
    tracedEntries: Double
  ): NotificationTracing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], maxTracedEntries = maxTracedEntries.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], tracedEntries = tracedEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationTracing]
  }
  @scala.inline
  implicit class NotificationTracingOps[Self <: NotificationTracing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTracedEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTracedEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracedEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracedEntries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

