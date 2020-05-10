package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConvLayerArgs extends LayerArgs {
  /**
    * Activation function of the layer.
    *
    * If you don't specify the activation, none is applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.native
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint for the bias vector.
    */
  var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the bias vector.
    */
  var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the bias vector.
    */
  var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `channels_last` corresponds to inputs with shape
    *   `(batch, ..., channels)`
    *
    *  `channels_first` corresponds to inputs with shape `(batch, channels,
    * ...)`.
    *
    * Defaults to `channels_last`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  /**
    * The dilation rate to use for the dilated convolution in each dimension.
    * Should be an integer or array of two or three integers.
    *
    * Currently, specifying any `dilationRate` value != 1 is incompatible with
    * specifying any `strides` value != 1.
    */
  var dilationRate: js.UndefOr[
    Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
  ] = js.native
  /**
    * Constraint for the convolutional kernel weights.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the convolutional kernel weights matrix.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * The dimensions of the convolution window. If kernelSize is a number, the
    * convolutional window will be square.
    */
  var kernelSize: Double | js.Array[Double] = js.native
  /**
    * Padding mode.
    */
  var padding: js.UndefOr[PaddingMode] = js.native
  /**
    * The strides of the convolution in each dimension. If strides is a number,
    * strides in both dimensions are equal.
    *
    * Specifying any stride value != 1 is incompatible with specifying any
    * `dilationRate` value != 1.
    */
  var strides: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Whether the layer uses a bias vector. Defaults to `true`.
    */
  var useBias: js.UndefOr[Boolean] = js.native
}

object BaseConvLayerArgs {
  @scala.inline
  def apply(kernelSize: Double | js.Array[Double]): BaseConvLayerArgs = {
    val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConvLayerArgs]
  }
  @scala.inline
  implicit class BaseConvLayerArgsOps[Self <: BaseConvLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernelSize(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivation(value: ActivationIdentifier): Self = {
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
    def withActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withBiasConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biasConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiasConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biasConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withBiasInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biasInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiasInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biasInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biasRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiasRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biasRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFormat(value: DataFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDilationRate(
      value: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dilationRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDilationRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dilationRate")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelRegularizer")(js.undefined)
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
    def withUseBias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBias")(js.undefined)
        ret
    }
  }
  
}

