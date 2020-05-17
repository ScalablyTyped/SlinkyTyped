package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeedsInvestigation extends js.Object {
  var aborted: scala.Double = js.native
  var completed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var needsInvestigation: scala.Double = js.native
  var notStarted: scala.Double = js.native
  var unspecified: scala.Double = js.native
  var waiting: scala.Double = js.native
}

object NeedsInvestigation {
  @scala.inline
  def apply(
    aborted: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    needsInvestigation: scala.Double,
    notStarted: scala.Double,
    unspecified: scala.Double,
    waiting: scala.Double
  ): NeedsInvestigation = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], needsInvestigation = needsInvestigation.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsInvestigation]
  }
  @scala.inline
  implicit class NeedsInvestigationOps[Self <: NeedsInvestigation] (val x: Self) extends AnyVal {
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
    def withCompleted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsInvestigation(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsInvestigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotStarted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnspecified(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

