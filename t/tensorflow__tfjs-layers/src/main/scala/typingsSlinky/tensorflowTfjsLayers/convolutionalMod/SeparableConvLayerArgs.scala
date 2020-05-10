package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

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
trait SeparableConvLayerArgs extends ConvLayerArgs {
  /**
    * The number of depthwise convolution output channels for each input
    * channel.
    * The total number of depthwise convolution output channels will be equal
    * to `filtersIn * depthMultiplier`. Default: 1.
    */
  var depthMultiplier: js.UndefOr[Double] = js.native
  /**
    * Constraint function applied to the depthwise kernel matrix.
    */
  var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the depthwise kernel matrix.
    */
  var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the depthwise kernel matrix.
    */
  var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint function applied to the pointwise kernel matrix.
    */
  var pointwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the pointwise kernel matrix.
    */
  var pointwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the pointwise kernel matrix.
    */
  var pointwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
}

object SeparableConvLayerArgs {
  @scala.inline
  def apply(filters: Double, kernelSize: Double | js.Array[Double]): SeparableConvLayerArgs = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableConvLayerArgs]
  }
  @scala.inline
  implicit class SeparableConvLayerArgsOps[Self <: SeparableConvLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepthMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthwiseConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwiseConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthwiseConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwiseConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthwiseInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwiseInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthwiseInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwiseInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwiseRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthwiseRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwiseRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withPointwiseConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwiseConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointwiseConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwiseConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withPointwiseInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwiseInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointwiseInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwiseInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withPointwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwiseRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointwiseRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwiseRegularizer")(js.undefined)
        ret
    }
  }
  
}

