package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelledFailed extends js.Object {
  var cancelled: scala.Double = js.native
  var failed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var notSet: scala.Double = js.native
  var queued: scala.Double = js.native
  var succeeded: scala.Double = js.native
}

object CancelledFailed {
  @scala.inline
  def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double
  ): CancelledFailed = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelledFailed]
  }
  @scala.inline
  implicit class CancelledFailedOps[Self <: CancelledFailed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSet(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

