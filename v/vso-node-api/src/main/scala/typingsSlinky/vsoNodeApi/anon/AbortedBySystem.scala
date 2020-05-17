package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortedBySystem extends js.Object {
  var abortedBySystem: scala.Double = js.native
  var analyzed: scala.Double = js.native
  var canceledByUser: scala.Double = js.native
  var cancellationInProgress: scala.Double = js.native
  var creatingEnvironment: scala.Double = js.native
  var none: scala.Double = js.native
  var pendingAnalysis: scala.Double = js.native
  var runningTests: scala.Double = js.native
  var timedOut: scala.Double = js.native
}

object AbortedBySystem {
  @scala.inline
  def apply(
    abortedBySystem: scala.Double,
    analyzed: scala.Double,
    canceledByUser: scala.Double,
    cancellationInProgress: scala.Double,
    creatingEnvironment: scala.Double,
    none: scala.Double,
    pendingAnalysis: scala.Double,
    runningTests: scala.Double,
    timedOut: scala.Double
  ): AbortedBySystem = {
    val __obj = js.Dynamic.literal(abortedBySystem = abortedBySystem.asInstanceOf[js.Any], analyzed = analyzed.asInstanceOf[js.Any], canceledByUser = canceledByUser.asInstanceOf[js.Any], cancellationInProgress = cancellationInProgress.asInstanceOf[js.Any], creatingEnvironment = creatingEnvironment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pendingAnalysis = pendingAnalysis.asInstanceOf[js.Any], runningTests = runningTests.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortedBySystem]
  }
  @scala.inline
  implicit class AbortedBySystemOps[Self <: AbortedBySystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortedBySystem(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortedBySystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalyzed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceledByUser(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancellationInProgress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatingEnvironment(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatingEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingAnalysis(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunningTests(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimedOut(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

