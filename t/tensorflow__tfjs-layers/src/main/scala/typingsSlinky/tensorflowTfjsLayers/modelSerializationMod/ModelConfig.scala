package typingsSlinky.tensorflowTfjsLayers.modelSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typingsSlinky.tensorflowTfjsLayers.nodeConfigMod.TensorKeyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelConfig extends js.Object {
  var input_layers: js.Array[TensorKeyArray] = js.native
  var layers: js.Array[LayerSerialization] = js.native
  var name: String = js.native
  var output_layers: js.Array[TensorKeyArray] = js.native
}

object ModelConfig {
  @scala.inline
  def apply(
    input_layers: js.Array[TensorKeyArray],
    layers: js.Array[LayerSerialization],
    name: String,
    output_layers: js.Array[TensorKeyArray]
  ): ModelConfig = {
    val __obj = js.Dynamic.literal(input_layers = input_layers.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output_layers = output_layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelConfig]
  }
  @scala.inline
  implicit class ModelConfigOps[Self <: ModelConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput_layers(value: js.Array[TensorKeyArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[LayerSerialization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_layers(value: js.Array[TensorKeyArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_layers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

