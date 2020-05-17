package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure extends js.Object {
  var canceled: scala.Double = js.native
  var failed: scala.Double = js.native
  var failure: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var partiallySucceeded: scala.Double = js.native
  var pending: scala.Double = js.native
  var skipped: scala.Double = js.native
  var succeeded: scala.Double = js.native
  var success: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object Failure {
  @scala.inline
  def apply(
    canceled: scala.Double,
    failed: scala.Double,
    failure: scala.Double,
    inProgress: scala.Double,
    partiallySucceeded: scala.Double,
    pending: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    success: scala.Double,
    unknown: scala.Double
  ): Failure = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
  @scala.inline
  implicit class FailureOps[Self <: Failure] (val x: Self) extends AnyVal {
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
    def withFailed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartiallySucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallySucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipped(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

