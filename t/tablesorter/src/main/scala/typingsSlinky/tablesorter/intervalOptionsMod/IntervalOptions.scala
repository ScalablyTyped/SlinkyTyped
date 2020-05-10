package typingsSlinky.tablesorter.intervalOptionsMod

import typingsSlinky.tablesorter.numericOptionsMod.NumericOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntervalOptions extends NumericOptions {
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.native
}

object IntervalOptions {
  @scala.inline
  def apply(): IntervalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalOptions]
  }
  @scala.inline
  implicit class IntervalOptionsOps[Self <: IntervalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

