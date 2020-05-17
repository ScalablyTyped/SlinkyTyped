package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InProgress_ extends js.Object {
  var abandoned: scala.Double = js.native
  var completed: scala.Double = js.native
  var failed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var queued: scala.Double = js.native
}

object InProgress_ {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    completed: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    queued: scala.Double
  ): InProgress_ = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgress_]
  }
  @scala.inline
  implicit class InProgress_Ops[Self <: InProgress_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbandoned(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandoned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
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

