package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelling extends js.Object {
  var all: Double = js.native
  var cancelling: Double = js.native
  var completed: Double = js.native
  var inProgress: Double = js.native
  var none: Double = js.native
  var notStarted: Double = js.native
  var postponed: Double = js.native
}

object AnonCancelling {
  @scala.inline
  def apply(
    all: Double,
    cancelling: Double,
    completed: Double,
    inProgress: Double,
    none: Double,
    notStarted: Double,
    postponed: Double
  ): AnonCancelling = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], postponed = postponed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelling]
  }
  @scala.inline
  implicit class AnonCancellingOps[Self <: AnonCancelling] (val x: Self) extends AnyVal {
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
    def withCancelling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelling")(value.asInstanceOf[js.Any])
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
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostponed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postponed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

