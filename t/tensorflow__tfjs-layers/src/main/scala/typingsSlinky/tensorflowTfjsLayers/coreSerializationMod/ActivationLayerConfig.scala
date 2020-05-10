package typingsSlinky.tensorflowTfjsLayers.coreSerializationMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivationLayerConfig extends LayerConfig {
  var activation: ActivationSerialization = js.native
}

object ActivationLayerConfig {
  @scala.inline
  def apply(activation: ActivationSerialization): ActivationLayerConfig = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationLayerConfig]
  }
  @scala.inline
  implicit class ActivationLayerConfigOps[Self <: ActivationLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivation(value: ActivationSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

