package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeferred extends js.Object {
  var all: Double = js.native
  var approved: Double = js.native
  var canceled: Double = js.native
  var cancelling: Double = js.native
  var deferred: Double = js.native
  var evaluatingGates: Double = js.native
  var gateFailed: Double = js.native
  var manualInterventionPending: Double = js.native
  var pending: Double = js.native
  var phaseCanceled: Double = js.native
  var phaseFailed: Double = js.native
  var phaseInProgress: Double = js.native
  var phasePartiallySucceeded: Double = js.native
  var phaseSucceeded: Double = js.native
  var queued: Double = js.native
  var queuedForAgent: Double = js.native
  var queuedForPipeline: Double = js.native
  var rejected: Double = js.native
  var scheduled: Double = js.native
  var undefined: Double = js.native
}

object AnonDeferred {
  @scala.inline
  def apply(
    all: Double,
    approved: Double,
    canceled: Double,
    cancelling: Double,
    deferred: Double,
    evaluatingGates: Double,
    gateFailed: Double,
    manualInterventionPending: Double,
    pending: Double,
    phaseCanceled: Double,
    phaseFailed: Double,
    phaseInProgress: Double,
    phasePartiallySucceeded: Double,
    phaseSucceeded: Double,
    queued: Double,
    queuedForAgent: Double,
    queuedForPipeline: Double,
    rejected: Double,
    scheduled: Double,
    undefined: Double
  ): AnonDeferred = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], evaluatingGates = evaluatingGates.asInstanceOf[js.Any], gateFailed = gateFailed.asInstanceOf[js.Any], manualInterventionPending = manualInterventionPending.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], phaseCanceled = phaseCanceled.asInstanceOf[js.Any], phaseFailed = phaseFailed.asInstanceOf[js.Any], phaseInProgress = phaseInProgress.asInstanceOf[js.Any], phasePartiallySucceeded = phasePartiallySucceeded.asInstanceOf[js.Any], phaseSucceeded = phaseSucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], queuedForAgent = queuedForAgent.asInstanceOf[js.Any], queuedForPipeline = queuedForPipeline.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeferred]
  }
  @scala.inline
  implicit class AnonDeferredOps[Self <: AnonDeferred] (val x: Self) extends AnyVal {
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
    def withApproved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeferred(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluatingGates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluatingGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGateFailed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualInterventionPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualInterventionPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseCanceled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseFailed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseInProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhasePartiallySucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phasePartiallySucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseSucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuedForAgent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedForAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuedForPipeline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedForPipeline")(value.asInstanceOf[js.Any])
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
    def withUndefined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

