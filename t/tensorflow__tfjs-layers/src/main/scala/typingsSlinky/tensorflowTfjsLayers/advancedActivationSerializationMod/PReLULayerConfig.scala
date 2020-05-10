package typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PReLULayerConfig extends LayerConfig {
  var alpha_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var alpha_initializer: js.UndefOr[InitializerSerialization] = js.native
  var alpha_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var shared_axes: js.UndefOr[Double | js.Array[Double]] = js.native
}

object PReLULayerConfig {
  @scala.inline
  def apply(): PReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PReLULayerConfig]
  }
  @scala.inline
  implicit class PReLULayerConfigOps[Self <: PReLULayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withAlpha_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withAlpha_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha_regularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withShared_axes(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared_axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared_axes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared_axes")(js.undefined)
        ret
    }
  }
  
}

