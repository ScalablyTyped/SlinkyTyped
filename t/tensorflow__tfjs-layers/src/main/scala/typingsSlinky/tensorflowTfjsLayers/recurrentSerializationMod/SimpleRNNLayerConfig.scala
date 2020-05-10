package typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleRNNLayerConfig extends BaseRNNLayerConfig {
  var activation: js.UndefOr[ActivationSerialization] = js.native
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var dropout: js.UndefOr[Double] = js.native
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var recurrent_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var recurrent_dropout: js.UndefOr[Double] = js.native
  var recurrent_initializer: js.UndefOr[InitializerSerialization] = js.native
  var recurrent_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var units: Double = js.native
  var use_bias: js.UndefOr[Boolean] = js.native
}

object SimpleRNNLayerConfig {
  @scala.inline
  def apply(units: Double): SimpleRNNLayerConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNLayerConfig]
  }
  @scala.inline
  implicit class SimpleRNNLayerConfigOps[Self <: SimpleRNNLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivation(value: ActivationSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(js.undefined)
        ret
    }
    @scala.inline
    def withBias_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withBias_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withBias_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias_regularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withDropout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropout")(js.undefined)
        ret
    }
    @scala.inline
    def withKernel_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernel_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withKernel_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernel_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withKernel_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernel_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_regularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrent_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrent_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrent_dropout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_dropout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrent_dropout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_dropout")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrent_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrent_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrent_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrent_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_regularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_bias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_bias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_bias")(js.undefined)
        ret
    }
  }
  
}

