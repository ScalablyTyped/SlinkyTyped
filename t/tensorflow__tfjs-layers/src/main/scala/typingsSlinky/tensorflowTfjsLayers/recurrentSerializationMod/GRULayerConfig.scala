package typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GRULayerConfig extends SimpleRNNLayerConfig {
  var implementation: js.UndefOr[Double] = js.native
  var recurrent_activation: js.UndefOr[ActivationSerialization] = js.native
}

object GRULayerConfig {
  @scala.inline
  def apply(units: Double): GRULayerConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRULayerConfig]
  }
  @scala.inline
  implicit class GRULayerConfigOps[Self <: GRULayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplementation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrent_activation(value: ActivationSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_activation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrent_activation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_activation")(js.undefined)
        ret
    }
  }
  
}

