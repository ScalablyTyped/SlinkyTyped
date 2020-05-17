package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchedContinuousIntegration extends js.Object {
  var all: scala.Double = js.native
  var batchedContinuousIntegration: scala.Double = js.native
  var batchedGatedCheckIn: scala.Double = js.native
  var continuousIntegration: scala.Double = js.native
  var gatedCheckIn: scala.Double = js.native
  var none: scala.Double = js.native
  var pullRequest: scala.Double = js.native
  var schedule: scala.Double = js.native
}

object BatchedContinuousIntegration {
  @scala.inline
  def apply(
    all: scala.Double,
    batchedContinuousIntegration: scala.Double,
    batchedGatedCheckIn: scala.Double,
    continuousIntegration: scala.Double,
    gatedCheckIn: scala.Double,
    none: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double
  ): BatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedContinuousIntegration = batchedContinuousIntegration.asInstanceOf[js.Any], batchedGatedCheckIn = batchedGatedCheckIn.asInstanceOf[js.Any], continuousIntegration = continuousIntegration.asInstanceOf[js.Any], gatedCheckIn = gatedCheckIn.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchedContinuousIntegration]
  }
  @scala.inline
  implicit class BatchedContinuousIntegrationOps[Self <: BatchedContinuousIntegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchedContinuousIntegration(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchedContinuousIntegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchedGatedCheckIn(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchedGatedCheckIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuousIntegration(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousIntegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatedCheckIn(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatedCheckIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequest(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
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

