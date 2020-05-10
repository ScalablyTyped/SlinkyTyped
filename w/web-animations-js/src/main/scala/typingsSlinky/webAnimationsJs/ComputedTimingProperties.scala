package typingsSlinky.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedTimingProperties extends js.Object {
  var activeDuration: Double = js.native
  var currentIteration: Double | Null = js.native
  var endTime: Double = js.native
  var localTime: Double | Null = js.native
  var progress: Double | Null = js.native
}

object ComputedTimingProperties {
  @scala.inline
  def apply(activeDuration: Double, endTime: Double): ComputedTimingProperties = {
    val __obj = js.Dynamic.literal(activeDuration = activeDuration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedTimingProperties]
  }
  @scala.inline
  implicit class ComputedTimingPropertiesOps[Self <: ComputedTimingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIteration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIterationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIteration")(null)
        ret
    }
    @scala.inline
    def withLocalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTime")(null)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(null)
        ret
    }
  }
  
}

