package typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentumOptimizerConfig extends js.Object {
  var learning_rate: Double = js.native
  var momentum: Double = js.native
  var use_nesterov: js.UndefOr[Boolean] = js.native
}

object MomentumOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double, momentum: Double): MomentumOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentumOptimizerConfig]
  }
  @scala.inline
  implicit class MomentumOptimizerConfigOps[Self <: MomentumOptimizerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLearning_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learning_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMomentum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse_nesterov(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_nesterov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_nesterov: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_nesterov")(js.undefined)
        ret
    }
  }
  
}

