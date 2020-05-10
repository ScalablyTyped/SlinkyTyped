package typingsSlinky.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
@js.native
trait TaskData extends js.Object {
  /**
    * Delay in milliseconds when the Task will run.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * identifier returned by the native setTimeout.
    */
  var handleId: js.UndefOr[Double] = js.native
  /**
    * A periodic [MacroTask] is such which get automatically rescheduled after it is executed.
    */
  var isPeriodic: js.UndefOr[Boolean] = js.native
}

object TaskData {
  @scala.inline
  def apply(): TaskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskData]
  }
  @scala.inline
  implicit class TaskDataOps[Self <: TaskData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPeriodic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPeriodic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPeriodic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPeriodic")(js.undefined)
        ret
    }
  }
  
}

