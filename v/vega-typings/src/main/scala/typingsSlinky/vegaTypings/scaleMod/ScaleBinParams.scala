package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleBinParams extends ScaleBins {
  /**
    * The starting (lowest-valued) bin boundary.
    *
    * __Default value:__ The lowest value of the scale domain will be used.
    */
  var start: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The step size defining the bin interval width.
    */
  var step: Double | SignalRef = js.native
  /**
    * The stopping (highest-valued) bin boundary.
    *
    * __Default value:__ The highest value of the scale domain will be used.
    *
    */
  var stop: js.UndefOr[Double | SignalRef] = js.native
}

object ScaleBinParams {
  @scala.inline
  def apply(step: Double | SignalRef): ScaleBinParams = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleBinParams]
  }
  @scala.inline
  implicit class ScaleBinParamsOps[Self <: ScaleBinParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
  }
  
}

