package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred extends js.Object {
  var all: scala.Double = js.native
  var approved: scala.Double = js.native
  var canceled: scala.Double = js.native
  var cancelling: scala.Double = js.native
  var deferred: scala.Double = js.native
  var evaluatingGates: scala.Double = js.native
  var gateFailed: scala.Double = js.native
  var manualInterventionPending: scala.Double = js.native
  var pending: scala.Double = js.native
  var phaseCanceled: scala.Double = js.native
  var phaseFailed: scala.Double = js.native
  var phaseInProgress: scala.Double = js.native
  var phasePartiallySucceeded: scala.Double = js.native
  var phaseSucceeded: scala.Double = js.native
  var queued: scala.Double = js.native
  var queuedForAgent: scala.Double = js.native
  var queuedForPipeline: scala.Double = js.native
  var rejected: scala.Double = js.native
  var scheduled: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object Deferred {
  @scala.inline
  def apply(
    all: scala.Double,
    approved: scala.Double,
    canceled: scala.Double,
    cancelling: scala.Double,
    deferred: scala.Double,
    evaluatingGates: scala.Double,
    gateFailed: scala.Double,
    manualInterventionPending: scala.Double,
    pending: scala.Double,
    phaseCanceled: scala.Double,
    phaseFailed: scala.Double,
    phaseInProgress: scala.Double,
    phasePartiallySucceeded: scala.Double,
    phaseSucceeded: scala.Double,
    queued: scala.Double,
    queuedForAgent: scala.Double,
    queuedForPipeline: scala.Double,
    rejected: scala.Double,
    scheduled: scala.Double,
    undefined: scala.Double
  ): Deferred = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], evaluatingGates = evaluatingGates.asInstanceOf[js.Any], gateFailed = gateFailed.asInstanceOf[js.Any], manualInterventionPending = manualInterventionPending.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], phaseCanceled = phaseCanceled.asInstanceOf[js.Any], phaseFailed = phaseFailed.asInstanceOf[js.Any], phaseInProgress = phaseInProgress.asInstanceOf[js.Any], phasePartiallySucceeded = phasePartiallySucceeded.asInstanceOf[js.Any], phaseSucceeded = phaseSucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], queuedForAgent = queuedForAgent.asInstanceOf[js.Any], queuedForPipeline = queuedForPipeline.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferred]
  }
  @scala.inline
  implicit class DeferredOps[Self <: Deferred] (val x: Self) extends AnyVal {
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
    def withApproved(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelling(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeferred(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluatingGates(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluatingGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGateFailed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualInterventionPending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualInterventionPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseCanceled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseFailed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseInProgress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhasePartiallySucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phasePartiallySucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseSucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuedForAgent(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedForAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuedForPipeline(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedForPipeline")(value.asInstanceOf[js.Any])
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
    def withUndefined(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

