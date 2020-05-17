package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousIntegration extends js.Object {
  var continuousIntegration: scala.Double = js.native
  var manual: scala.Double = js.native
  var none: scala.Double = js.native
  var schedule: scala.Double = js.native
}

object ContinuousIntegration {
  @scala.inline
  def apply(
    continuousIntegration: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    schedule: scala.Double
  ): ContinuousIntegration = {
    val __obj = js.Dynamic.literal(continuousIntegration = continuousIntegration.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousIntegration]
  }
  @scala.inline
  implicit class ContinuousIntegrationOps[Self <: ContinuousIntegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuousIntegration(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousIntegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManual(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

