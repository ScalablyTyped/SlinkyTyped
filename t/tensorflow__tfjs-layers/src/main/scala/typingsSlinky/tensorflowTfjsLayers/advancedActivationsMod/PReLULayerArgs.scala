package typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod

import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PReLULayerArgs extends LayerArgs {
  /**
    * Constraint for the learnable alpha.
    */
  var alphaConstraint: js.UndefOr[Constraint] = js.native
  /**
    * Initializer for the learnable alpha.
    */
  var alphaInitializer: js.UndefOr[Initializer | InitializerIdentifier] = js.native
  /**
    * Regularizer for the learnable alpha.
    */
  var alphaRegularizer: js.UndefOr[Regularizer] = js.native
  /**
    * The axes along which to share learnable parameters for the activation
    * function. For example, if the incoming feature maps are from a 2D
    * convolution with output shape `[numExamples, height, width, channels]`,
    * and you wish to share parameters across space (height and width) so that
    * each filter channels has only one set of parameters, set
    * `shared_axes: [1, 2]`.
    */
  var sharedAxes: js.UndefOr[Double | js.Array[Double]] = js.native
}

object PReLULayerArgs {
  @scala.inline
  def apply(): PReLULayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PReLULayerArgs]
  }
  @scala.inline
  implicit class PReLULayerArgsOps[Self <: PReLULayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaConstraint(value: Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaInitializer(value: Initializer | InitializerIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaRegularizer(value: Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedAxes(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAxes")(js.undefined)
        ret
    }
  }
  
}

