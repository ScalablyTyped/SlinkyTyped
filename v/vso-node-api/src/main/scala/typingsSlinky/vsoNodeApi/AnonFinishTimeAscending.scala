package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFinishTimeAscending extends js.Object {
  var finishTimeAscending: Double = js.native
  var finishTimeDescending: Double = js.native
  var queueTimeAscending: Double = js.native
  var queueTimeDescending: Double = js.native
  var startTimeAscending: Double = js.native
  var startTimeDescending: Double = js.native
}

object AnonFinishTimeAscending {
  @scala.inline
  def apply(
    finishTimeAscending: Double,
    finishTimeDescending: Double,
    queueTimeAscending: Double,
    queueTimeDescending: Double,
    startTimeAscending: Double,
    startTimeDescending: Double
  ): AnonFinishTimeAscending = {
    val __obj = js.Dynamic.literal(finishTimeAscending = finishTimeAscending.asInstanceOf[js.Any], finishTimeDescending = finishTimeDescending.asInstanceOf[js.Any], queueTimeAscending = queueTimeAscending.asInstanceOf[js.Any], queueTimeDescending = queueTimeDescending.asInstanceOf[js.Any], startTimeAscending = startTimeAscending.asInstanceOf[js.Any], startTimeDescending = startTimeDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFinishTimeAscending]
  }
  @scala.inline
  implicit class AnonFinishTimeAscendingOps[Self <: AnonFinishTimeAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishTimeAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTimeAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTimeDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTimeDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTimeAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTimeAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTimeDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTimeDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimeAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimeDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeDescending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

