package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbortedBySystem extends js.Object {
  var abortedBySystem: Double = js.native
  var analyzed: Double = js.native
  var canceledByUser: Double = js.native
  var cancellationInProgress: Double = js.native
  var creatingEnvironment: Double = js.native
  var none: Double = js.native
  var pendingAnalysis: Double = js.native
  var runningTests: Double = js.native
  var timedOut: Double = js.native
}

object AnonAbortedBySystem {
  @scala.inline
  def apply(
    abortedBySystem: Double,
    analyzed: Double,
    canceledByUser: Double,
    cancellationInProgress: Double,
    creatingEnvironment: Double,
    none: Double,
    pendingAnalysis: Double,
    runningTests: Double,
    timedOut: Double
  ): AnonAbortedBySystem = {
    val __obj = js.Dynamic.literal(abortedBySystem = abortedBySystem.asInstanceOf[js.Any], analyzed = analyzed.asInstanceOf[js.Any], canceledByUser = canceledByUser.asInstanceOf[js.Any], cancellationInProgress = cancellationInProgress.asInstanceOf[js.Any], creatingEnvironment = creatingEnvironment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pendingAnalysis = pendingAnalysis.asInstanceOf[js.Any], runningTests = runningTests.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbortedBySystem]
  }
  @scala.inline
  implicit class AnonAbortedBySystemOps[Self <: AnonAbortedBySystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortedBySystem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortedBySystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalyzed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceledByUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancellationInProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatingEnvironment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatingEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingAnalysis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunningTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimedOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

