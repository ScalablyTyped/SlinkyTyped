package typingsSlinky.tensorflowTfjsLayers.convolutionalDepthwiseMod

import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsSlinky.tensorflowTfjsLayers.convolutionalMod.BaseConvLayerArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthwiseConv2DLayerArgs extends BaseConvLayerArgs {
  /**
    * The number of depthwise convolution output channels for each input
    * channel.
    * The total number of depthwise convolution output channels will be equal to
    * `filtersIn * depthMultiplier`.
    * Default: 1.
    */
  var depthMultiplier: js.UndefOr[Double] = js.native
  /**
    * Constraint for the depthwise kernel matrix.
    */
  var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the depthwise kernel matrix.
    * Default: GlorotNormal.
    */
  var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regulzarizer function for the depthwise kernel matrix.
    */
  var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * An integer or Array of 2 integers, specifying the width and height of the
    * 2D convolution window. Can be a single integer to specify the same value
    * for all spatial dimensions.
    */
  @JSName("kernelSize")
  var kernelSize_DepthwiseConv2DLayerArgs: Double | (js.Tuple2[Double, Double]) = js.native
}

object DepthwiseConv2DLayerArgs {
  @scala.inline
  def apply(kernelSize: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerArgs = {
    val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthwiseConv2DLayerArgs]
  }
  @scala.inline
  implicit class DepthwiseConv2DLayerArgsOps[Self <: DepthwiseConv2DLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernelSize(value: Double | (js.Tuple2[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelSize")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

