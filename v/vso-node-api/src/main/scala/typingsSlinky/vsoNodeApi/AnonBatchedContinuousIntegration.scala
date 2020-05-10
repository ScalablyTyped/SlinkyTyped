package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBatchedContinuousIntegration extends js.Object {
  var all: Double = js.native
  var batchedContinuousIntegration: Double = js.native
  var batchedGatedCheckIn: Double = js.native
  var continuousIntegration: Double = js.native
  var gatedCheckIn: Double = js.native
  var none: Double = js.native
  var pullRequest: Double = js.native
  var schedule: Double = js.native
}

object AnonBatchedContinuousIntegration {
  @scala.inline
  def apply(
    all: Double,
    batchedContinuousIntegration: Double,
    batchedGatedCheckIn: Double,
    continuousIntegration: Double,
    gatedCheckIn: Double,
    none: Double,
    pullRequest: Double,
    schedule: Double
  ): AnonBatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedContinuousIntegration = batchedContinuousIntegration.asInstanceOf[js.Any], batchedGatedCheckIn = batchedGatedCheckIn.asInstanceOf[js.Any], continuousIntegration = continuousIntegration.asInstanceOf[js.Any], gatedCheckIn = gatedCheckIn.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatchedContinuousIntegration]
  }
  @scala.inline
  implicit class AnonBatchedContinuousIntegrationOps[Self <: AnonBatchedContinuousIntegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchedContinuousIntegration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchedContinuousIntegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchedGatedCheckIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchedGatedCheckIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuousIntegration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousIntegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatedCheckIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatedCheckIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

