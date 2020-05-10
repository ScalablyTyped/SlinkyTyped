package typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdagradOptimizerConfig extends js.Object {
  var initial_accumulator_value: js.UndefOr[Double] = js.native
  var learning_rate: Double = js.native
}

object AdagradOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double): AdagradOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdagradOptimizerConfig]
  }
  @scala.inline
  implicit class AdagradOptimizerConfigOps[Self <: AdagradOptimizerConfig] (val x: Self) extends AnyVal {
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
    def withInitial_accumulator_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_accumulator_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial_accumulator_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_accumulator_value")(js.undefined)
        ret
    }
  }
  
}

