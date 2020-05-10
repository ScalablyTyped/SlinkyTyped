package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DenseLayerArgs extends LayerArgs {
  /**
    * Activation function to use.
    *
    * If unspecified, no activation is applied.
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
    * If specified, defines inputShape as `[inputDim]`.
    */
  var inputDim: js.UndefOr[Double] = js.native
  /**
    * Constraint for the kernel weights.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the dense kernel weights matrix.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the dense kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /** Positive integer, dimensionality of the output space. */
  var units: Double = js.native
  /** Whether to apply a bias. */
  var useBias: js.UndefOr[Boolean] = js.native
}

object DenseLayerArgs {
  @scala.inline
  def apply(units: Double): DenseLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseLayerArgs]
  }
  @scala.inline
  implicit class DenseLayerArgsOps[Self <: DenseLayerArgs] (val x: Self) extends AnyVal {
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
    def withInputDim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDim")(js.undefined)
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

