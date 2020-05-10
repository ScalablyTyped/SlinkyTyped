package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleRNNLayerArgs extends BaseRNNLayerArgs {
  /**
    * Activation function to use.
    *
    * Defaults to  hyperbolic tangent (`tanh`)
    *
    * If you pass `null`, no activation will be applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.native
  /**
    * Constraint function applied to the bias vector.
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
    * Number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the inputs.
    */
  var dropout: js.UndefOr[Double] = js.native
  /**
    * Constraint function applied to the kernel weights matrix.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the `kernel` weights matrix, used for the linear
    * transformation of the inputs.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint function applied to the recurrentKernel weights matrix.
    */
  var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the recurrent state.
    */
  var recurrentDropout: js.UndefOr[Double] = js.native
  /**
    * Initializer for the `recurrentKernel` weights matrix, used for
    * linear transformation of the recurrent state.
    */
  var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the recurrentKernel weights matrix.
    */
  var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Positive integer, dimensionality of the output space.
    */
  var units: Double = js.native
  /**
    * Whether the layer uses a bias vector.
    */
  var useBias: js.UndefOr[Boolean] = js.native
}

object SimpleRNNLayerArgs {
  @scala.inline
  def apply(units: Double): SimpleRNNLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNLayerArgs]
  }
  @scala.inline
  implicit class SimpleRNNLayerArgsOps[Self <: SimpleRNNLayerArgs] (val x: Self) extends AnyVal {
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
    def withRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrentConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrentDropout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentDropout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrentDropout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentDropout")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrentInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrentRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrentRegularizer")(js.undefined)
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

