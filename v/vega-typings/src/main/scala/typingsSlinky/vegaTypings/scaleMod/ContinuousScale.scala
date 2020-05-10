package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousScale extends BaseScale {
  var bins: js.UndefOr[ScaleBins] = js.native
  var clamp: js.UndefOr[Boolean | SignalRef] = js.native
  var interpolate: js.UndefOr[ScaleInterpolate] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var range: js.UndefOr[RangeScheme] = js.native
}

object ContinuousScale {
  @scala.inline
  def apply(name: String): ContinuousScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousScale]
  }
  @scala.inline
  implicit class ContinuousScaleOps[Self <: ContinuousScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBins(value: ScaleBins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bins")(js.undefined)
        ret
    }
    @scala.inline
    def withClamp(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolate(value: ScaleInterpolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: RangeScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

