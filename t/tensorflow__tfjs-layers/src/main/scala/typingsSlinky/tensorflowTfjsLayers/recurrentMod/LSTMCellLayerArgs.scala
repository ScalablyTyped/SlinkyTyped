package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LSTMCellLayerArgs extends SimpleRNNCellLayerArgs {
  /**
    * Implementation mode, either 1 or 2.
    *
    * Mode 1 will structure its operations as a larger number of
    *   smaller dot products and additions.
    *
    * Mode 2 will batch them into fewer, larger operations. These modes will
    * have different performance profiles on different hardware and
    * for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this configuration field.
    */
  var implementation: js.UndefOr[Double] = js.native
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.native
  /**
    * If `true`, add 1 to the bias of the forget gate at initialization.
    * Setting it to `true` will also force `biasInitializer = 'zeros'`.
    * This is recommended in
    * [Jozefowicz et
    * al.](http://www.jmlr.org/proceedings/papers/v37/jozefowicz15.pdf).
    */
  var unitForgetBias: js.UndefOr[Boolean] = js.native
}

object LSTMCellLayerArgs {
  @scala.inline
  def apply(units: Double): LSTMCellLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSTMCellLayerArgs]
  }
  @scala.inline
  implicit class LSTMCellLayerArgsOps[Self <: LSTMCellLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplementation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrentActivation(value: ActivationIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentActivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrentActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentActivation")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitForgetBias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitForgetBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitForgetBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitForgetBias")(js.undefined)
        ret
    }
  }
  
}

