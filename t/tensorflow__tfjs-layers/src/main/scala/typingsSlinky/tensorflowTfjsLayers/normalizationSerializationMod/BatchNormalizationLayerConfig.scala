package typingsSlinky.tensorflowTfjsLayers.normalizationSerializationMod

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchNormalizationLayerConfig extends LayerConfig {
  var axis: js.UndefOr[Double] = js.native
  var beta_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var beta_initializer: js.UndefOr[InitializerSerialization] = js.native
  var beta_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var center: js.UndefOr[Boolean] = js.native
  var epsilon: js.UndefOr[Double] = js.native
  var gamma_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var gamma_initializer: js.UndefOr[InitializerSerialization] = js.native
  var gamma_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var momentum: js.UndefOr[Double] = js.native
  var moving_mean_initializer: js.UndefOr[InitializerSerialization] = js.native
  var moving_variance_initializer: js.UndefOr[InitializerSerialization] = js.native
  var scale: js.UndefOr[Boolean] = js.native
}

object BatchNormalizationLayerConfig {
  @scala.inline
  def apply(): BatchNormalizationLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchNormalizationLayerConfig]
  }
  @scala.inline
  implicit class BatchNormalizationLayerConfigOps[Self <: BatchNormalizationLayerConfig] (val x: Self) extends AnyVal {
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
    def withBeta_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeta_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withBeta_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeta_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withBeta_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeta_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta_regularizer")(js.undefined)
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
    def withGamma_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamma_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withGamma_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamma_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withGamma_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamma_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma_regularizer")(js.undefined)
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
    def withMoving_mean_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moving_mean_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoving_mean_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moving_mean_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withMoving_variance_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moving_variance_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoving_variance_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moving_variance_initializer")(js.undefined)
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

