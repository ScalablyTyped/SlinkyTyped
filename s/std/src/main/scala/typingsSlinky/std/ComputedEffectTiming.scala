package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedEffectTiming extends EffectTiming {
  var activeDuration: js.UndefOr[Double] = js.native
  var currentIteration: js.UndefOr[Double | Null] = js.native
  var endTime: js.UndefOr[Double] = js.native
  var localTime: js.UndefOr[Double | Null] = js.native
  var progress: js.UndefOr[Double | Null] = js.native
}

object ComputedEffectTiming {
  @scala.inline
  def apply(): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedEffectTiming]
  }
  @scala.inline
  implicit class ComputedEffectTimingOps[Self <: ComputedEffectTiming] (val x: Self) extends AnyVal {
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
    def withoutActiveDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentIteration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentIterationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIteration")(null)
        ret
    }
    @scala.inline
    def withEndTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTime")(js.undefined)
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
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
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

