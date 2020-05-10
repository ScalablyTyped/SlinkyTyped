package typingsSlinky.tensorflowTfjsLayers.initializersMod

import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.Distribution
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.FanMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VarianceScalingArgs extends js.Object {
  /** Probabilistic distribution of the values. */
  var distribution: js.UndefOr[Distribution] = js.native
  /** Fanning mode for inputs and outputs. */
  var mode: js.UndefOr[FanMode] = js.native
  /** Scaling factor (positive float). */
  var scale: js.UndefOr[Double] = js.native
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.native
}

object VarianceScalingArgs {
  @scala.inline
  def apply(): VarianceScalingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VarianceScalingArgs]
  }
  @scala.inline
  implicit class VarianceScalingArgsOps[Self <: VarianceScalingArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistribution(value: Distribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: FanMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
  }
  
}

