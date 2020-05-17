package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishTimeAscending extends js.Object {
  var finishTimeAscending: scala.Double = js.native
  var finishTimeDescending: scala.Double = js.native
  var queueTimeAscending: scala.Double = js.native
  var queueTimeDescending: scala.Double = js.native
  var startTimeAscending: scala.Double = js.native
  var startTimeDescending: scala.Double = js.native
}

object FinishTimeAscending {
  @scala.inline
  def apply(
    finishTimeAscending: scala.Double,
    finishTimeDescending: scala.Double,
    queueTimeAscending: scala.Double,
    queueTimeDescending: scala.Double,
    startTimeAscending: scala.Double,
    startTimeDescending: scala.Double
  ): FinishTimeAscending = {
    val __obj = js.Dynamic.literal(finishTimeAscending = finishTimeAscending.asInstanceOf[js.Any], finishTimeDescending = finishTimeDescending.asInstanceOf[js.Any], queueTimeAscending = queueTimeAscending.asInstanceOf[js.Any], queueTimeDescending = queueTimeDescending.asInstanceOf[js.Any], startTimeAscending = startTimeAscending.asInstanceOf[js.Any], startTimeDescending = startTimeDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishTimeAscending]
  }
  @scala.inline
  implicit class FinishTimeAscendingOps[Self <: FinishTimeAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishTimeAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTimeAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTimeDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTimeDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTimeAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTimeAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTimeDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTimeDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimeAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimeDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeDescending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

