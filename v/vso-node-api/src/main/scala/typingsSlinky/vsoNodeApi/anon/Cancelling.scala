package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelling extends js.Object {
  var all: scala.Double = js.native
  var cancelling: scala.Double = js.native
  var completed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var none: scala.Double = js.native
  var notStarted: scala.Double = js.native
  var postponed: scala.Double = js.native
}

object Cancelling {
  @scala.inline
  def apply(
    all: scala.Double,
    cancelling: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    none: scala.Double,
    notStarted: scala.Double,
    postponed: scala.Double
  ): Cancelling = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], postponed = postponed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelling]
  }
  @scala.inline
  implicit class CancellingOps[Self <: Cancelling] (val x: Self) extends AnyVal {
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
    def withCancelling(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelling")(value.asInstanceOf[js.Any])
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
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotStarted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostponed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postponed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

