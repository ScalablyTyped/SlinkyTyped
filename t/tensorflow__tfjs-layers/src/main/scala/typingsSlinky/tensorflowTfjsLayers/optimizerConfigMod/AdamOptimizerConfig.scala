package typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdamOptimizerConfig extends js.Object {
  var beta1: Double = js.native
  var beta2: Double = js.native
  var epsilon: js.UndefOr[Double] = js.native
  var learning_rate: Double = js.native
}

object AdamOptimizerConfig {
  @scala.inline
  def apply(beta1: Double, beta2: Double, learning_rate: Double): AdamOptimizerConfig = {
    val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdamOptimizerConfig]
  }
  @scala.inline
  implicit class AdamOptimizerConfigOps[Self <: AdamOptimizerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeta1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeta2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLearning_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learning_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpsilon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpsilon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(js.undefined)
        ret
    }
  }
  
}

