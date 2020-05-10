package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNeedsInvestigation extends js.Object {
  var aborted: Double = js.native
  var completed: Double = js.native
  var inProgress: Double = js.native
  var needsInvestigation: Double = js.native
  var notStarted: Double = js.native
  var unspecified: Double = js.native
  var waiting: Double = js.native
}

object AnonNeedsInvestigation {
  @scala.inline
  def apply(
    aborted: Double,
    completed: Double,
    inProgress: Double,
    needsInvestigation: Double,
    notStarted: Double,
    unspecified: Double,
    waiting: Double
  ): AnonNeedsInvestigation = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], needsInvestigation = needsInvestigation.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNeedsInvestigation]
  }
  @scala.inline
  implicit class AnonNeedsInvestigationOps[Self <: AnonNeedsInvestigation] (val x: Self) extends AnyVal {
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
    def withCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsInvestigation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsInvestigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnspecified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

