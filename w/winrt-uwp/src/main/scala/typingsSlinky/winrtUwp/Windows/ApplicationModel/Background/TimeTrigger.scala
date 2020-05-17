package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a time event that triggers a background task to run. */
@js.native
trait TimeTrigger extends js.Object {
  /** Gets the interval of a time event trigger. */
  var freshnessTime: Double = js.native
  /** Gets whether the time event trigger will be used only once or each time the FreshnessTime interval elapses. */
  var oneShot: Boolean = js.native
}

object TimeTrigger {
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): TimeTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeTrigger]
  }
  @scala.inline
  implicit class TimeTriggerOps[Self <: TimeTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreshnessTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freshnessTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneShot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneShot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

