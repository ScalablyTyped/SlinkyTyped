package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAborted extends js.Object {
  var aborted: Double = js.native
  var blocked: Double = js.native
  var error: Double = js.native
  var failed: Double = js.native
  var inProgress: Double = js.native
  var inconclusive: Double = js.native
  var maxValue: Double = js.native
  var none: Double = js.native
  var notApplicable: Double = js.native
  var notExecuted: Double = js.native
  var notImpacted: Double = js.native
  var passed: Double = js.native
  var paused: Double = js.native
  var timeout: Double = js.native
  var unspecified: Double = js.native
  var warning: Double = js.native
}

object AnonAborted {
  @scala.inline
  def apply(
    aborted: Double,
    blocked: Double,
    error: Double,
    failed: Double,
    inProgress: Double,
    inconclusive: Double,
    maxValue: Double,
    none: Double,
    notApplicable: Double,
    notExecuted: Double,
    notImpacted: Double,
    passed: Double,
    paused: Double,
    timeout: Double,
    unspecified: Double,
    warning: Double
  ): AnonAborted = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], inconclusive = inconclusive.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notExecuted = notExecuted.asInstanceOf[js.Any], notImpacted = notImpacted.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAborted]
  }
  @scala.inline
  implicit class AnonAbortedOps[Self <: AnonAborted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAborted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aborted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInconclusive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inconclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotApplicable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotExecuted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notExecuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotImpacted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notImpacted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnspecified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

