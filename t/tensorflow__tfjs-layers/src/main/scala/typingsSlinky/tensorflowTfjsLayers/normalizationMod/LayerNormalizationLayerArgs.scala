package typingsSlinky.tensorflowTfjsLayers.normalizationMod

import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerNormalizationLayerArgs extends LayerArgs {
  /**
    * The axis or axes that should be normalized (typically, the feature axis.)
    * Defaults to -1 (the last axis.)
    */
  var axis: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Initializer for the beta weight.
    * Default: `'zeros'`.
    */
  var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /** Regularizer for the beta weight. */
  var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * If `true`, add offset of `beta` to normalized tensor.
    * If `false`, `beta` is ignored.
    * Default: `true`.
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * A small positive float added to variance to avoid divison by zero.
    * Defaults to 1e-3.
    */
  var epsilon: js.UndefOr[Double] = js.native
  /**
    * Initializer for the gamma weight.
    * Default: `'ones'`.
    */
  var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /** Regularizer for the gamma weight. */
  var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * If `true`, multiply output by `gamma`.
    * If `false`, `gamma` is not used.
    * When the next layer is linear, this can be disabled since scaling will
    * be done by the next layer.
    * Default: `true`.
    */
  var scale: js.UndefOr[Boolean] = js.native
}

object LayerNormalizationLayerArgs {
  @scala.inline
  def apply(): LayerNormalizationLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerNormalizationLayerArgs]
  }
  @scala.inline
  implicit class LayerNormalizationLayerArgsOps[Self <: LayerNormalizationLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Double | js.Array[Double]): Self = {
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

