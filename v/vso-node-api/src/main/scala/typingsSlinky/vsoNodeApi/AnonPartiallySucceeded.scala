package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPartiallySucceeded extends js.Object {
  var canceled: Double = js.native
  var inProgress: Double = js.native
  var notStarted: Double = js.native
  var partiallySucceeded: Double = js.native
  var queued: Double = js.native
  var rejected: Double = js.native
  var scheduled: Double = js.native
  var succeeded: Double = js.native
  var undefined: Double = js.native
}

object AnonPartiallySucceeded {
  @scala.inline
  def apply(
    canceled: Double,
    inProgress: Double,
    notStarted: Double,
    partiallySucceeded: Double,
    queued: Double,
    rejected: Double,
    scheduled: Double,
    succeeded: Double,
    undefined: Double
  ): AnonPartiallySucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartiallySucceeded]
  }
  @scala.inline
  implicit class AnonPartiallySucceededOps[Self <: AnonPartiallySucceeded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartiallySucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallySucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

