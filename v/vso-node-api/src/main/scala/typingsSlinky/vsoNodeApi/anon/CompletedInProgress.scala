package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedInProgress extends js.Object {
  var completed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var queued: scala.Double = js.native
}

object CompletedInProgress {
  @scala.inline
  def apply(completed: scala.Double, inProgress: scala.Double, queued: scala.Double): CompletedInProgress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedInProgress]
  }
  @scala.inline
  implicit class CompletedInProgressOps[Self <: CompletedInProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withQueued(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

