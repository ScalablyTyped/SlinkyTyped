package typingsSlinky.tensorflowTfjsLayers.modelSerializationMod

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Model
import typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelSerialization extends BaseSerialization[Model, ModelConfig] {
  var backend: js.UndefOr[String] = js.native
  var keras_version: js.UndefOr[String] = js.native
}

object ModelSerialization {
  @scala.inline
  def apply(class_name: Model, config: ModelConfig): ModelSerialization = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSerialization]
  }
  @scala.inline
  implicit class ModelSerializationOps[Self <: ModelSerialization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.undefined)
        ret
    }
    @scala.inline
    def withKeras_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keras_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeras_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keras_version")(js.undefined)
        ret
    }
  }
  
}

