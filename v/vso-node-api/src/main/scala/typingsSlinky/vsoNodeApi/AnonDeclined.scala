package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeclined extends js.Object {
  var completed: Double = js.native
  var declined: Double = js.native
  var inProgress: Double = js.native
  var notStarted: Double = js.native
  var paused: Double = js.native
  var unspecified: Double = js.native
}

object AnonDeclined {
  @scala.inline
  def apply(
    completed: Double,
    declined: Double,
    inProgress: Double,
    notStarted: Double,
    paused: Double,
    unspecified: Double
  ): AnonDeclined = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], declined = declined.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeclined]
  }
  @scala.inline
  implicit class AnonDeclinedOps[Self <: AnonDeclined] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnspecified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unspecified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

