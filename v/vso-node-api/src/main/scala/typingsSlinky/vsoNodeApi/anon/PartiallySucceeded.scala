package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartiallySucceeded extends js.Object {
  var canceled: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var notStarted: scala.Double = js.native
  var partiallySucceeded: scala.Double = js.native
  var queued: scala.Double = js.native
  var rejected: scala.Double = js.native
  var scheduled: scala.Double = js.native
  var succeeded: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object PartiallySucceeded {
  @scala.inline
  def apply(
    canceled: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    partiallySucceeded: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    scheduled: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): PartiallySucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallySucceeded]
  }
  @scala.inline
  implicit class PartiallySucceededOps[Self <: PartiallySucceeded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotStarted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartiallySucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallySucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

