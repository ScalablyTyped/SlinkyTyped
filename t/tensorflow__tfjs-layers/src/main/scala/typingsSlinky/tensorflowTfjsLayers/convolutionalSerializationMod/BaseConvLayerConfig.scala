package typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConvLayerConfig extends LayerConfig {
  var activation: js.UndefOr[String] = js.native
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
  var dilation_rate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var kernel_size: Double | js.Array[Double] = js.native
  var padding: js.UndefOr[PaddingMode] = js.native
  var strides: js.UndefOr[Double | js.Array[Double]] = js.native
  var use_bias: js.UndefOr[Boolean] = js.native
}

object BaseConvLayerConfig {
  @scala.inline
  def apply(kernel_size: Double | js.Array[Double]): BaseConvLayerConfig = {
    val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConvLayerConfig]
  }
  @scala.inline
  implicit class BaseConvLayerConfigOps[Self <: BaseConvLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernel_size(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivation(value: String): Self = {
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
    def withActivity_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity_regularizer")(js.undefined)
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
    def withData_format(value: DataFormatSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_format")(js.undefined)
        ret
    }
    @scala.inline
    def withDilation_rate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dilation_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDilation_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dilation_rate")(js.undefined)
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
    def withPadding(value: PaddingMode): Self = {
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
    def withStrides(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(js.undefined)
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

