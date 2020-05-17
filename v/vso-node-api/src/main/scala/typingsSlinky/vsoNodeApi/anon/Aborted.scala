package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aborted extends js.Object {
  var aborted: scala.Double = js.native
  var blocked: scala.Double = js.native
  var error: scala.Double = js.native
  var failed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var inconclusive: scala.Double = js.native
  var maxValue: scala.Double = js.native
  var none: scala.Double = js.native
  var notApplicable: scala.Double = js.native
  var notExecuted: scala.Double = js.native
  var notImpacted: scala.Double = js.native
  var passed: scala.Double = js.native
  var paused: scala.Double = js.native
  var timeout: scala.Double = js.native
  var unspecified: scala.Double = js.native
  var warning: scala.Double = js.native
}

object Aborted {
  @scala.inline
  def apply(
    aborted: scala.Double,
    blocked: scala.Double,
    error: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    inconclusive: scala.Double,
    maxValue: scala.Double,
    none: scala.Double,
    notApplicable: scala.Double,
    notExecuted: scala.Double,
    notImpacted: scala.Double,
    passed: scala.Double,
    paused: scala.Double,
    timeout: scala.Double,
    unspecified: scala.Double,
    warning: scala.Double
  ): Aborted = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], inconclusive = inconclusive.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notExecuted = notExecuted.asInstanceOf[js.Any], notImpacted = notImpacted.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aborted]
  }
  @scala.inline
  implicit class AbortedOps[Self <: Aborted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAborted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aborted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocked(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
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
    def withInconclusive(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inconclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotApplicable(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotExecuted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notExecuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotImpacted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notImpacted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnspecified(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

