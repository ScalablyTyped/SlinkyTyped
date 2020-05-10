package typingsSlinky.tensorflowTfjsLayers.normalizationMod

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
trait BatchNormalizationLayerArgs extends LayerArgs {
  /**
    * The integer axis that should be normalized (typically the features axis).
    * Defaults to -1.
    *
    * For instance, after a `Conv2D` layer with `data_format="channels_first"`,
    * set `axis=1` in `batchNormalization`.
    */
  var axis: js.UndefOr[Double] = js.native
  /**
    * Constraint for the beta weight.
    */
  var betaConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the beta weight.
    *  Defaults to 'zeros'.
    */
  var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer for the beta weight.
    */
  var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * If `true`, add offset of `beta` to normalized tensor.
    * If `false`, `beta` is ignored.
    * Defaults to `true`.
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * Small float added to the variance to avoid dividing by zero. Defaults to
    * 1e-3.
    */
  var epsilon: js.UndefOr[Double] = js.native
  /**
    * Constraint for gamma weight.
    */
  var gammaConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the gamma weight.
    *  Defaults to `ones`.
    */
  var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer for the gamma weight.
    */
  var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Momentum of the moving average. Defaults to 0.99.
    */
  var momentum: js.UndefOr[Double] = js.native
  /**
    * Initializer for the moving mean.
    * Defaults to `zeros`
    */
  var movingMeanInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Initializer for the moving variance.
    *  Defaults to 'Ones'.
    */
  var movingVarianceInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * If `true`, multiply by `gamma`.
    * If `false`, `gamma` is not used.
    * When the next layer is linear (also e.g. `nn.relu`),
    * this can be disabled since the scaling will be done by the next layer.
    * Defaults to `true`.
    */
  var scale: js.UndefOr[Boolean] = js.native
}

object BatchNormalizationLayerArgs {
  @scala.inline
  def apply(): BatchNormalizationLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchNormalizationLayerArgs]
  }
  @scala.inline
  implicit class BatchNormalizationLayerArgsOps[Self <: BatchNormalizationLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBetaConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetaConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withBetaInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetaInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withBetaRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetaRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withEpsilon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpsilon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(js.undefined)
        ret
    }
    @scala.inline
    def withGammaConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGammaConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withGammaInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGammaInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withGammaRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGammaRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMomentum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingMeanInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingMeanInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingMeanInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingMeanInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withMovingVarianceInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingVarianceInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingVarianceInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingVarianceInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

