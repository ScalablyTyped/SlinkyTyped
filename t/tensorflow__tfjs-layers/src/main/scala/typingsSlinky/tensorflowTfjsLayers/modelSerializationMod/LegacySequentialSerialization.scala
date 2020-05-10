package typingsSlinky.tensorflowTfjsLayers.modelSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Sequential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacySequentialSerialization extends js.Object {
  var backend: js.UndefOr[String] = js.native
  var class_name: Sequential = js.native
  var config: js.Array[LayerSerialization] = js.native
  var keras_version: js.UndefOr[String] = js.native
}

object LegacySequentialSerialization {
  @scala.inline
  def apply(class_name: Sequential, config: js.Array[LayerSerialization]): LegacySequentialSerialization = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacySequentialSerialization]
  }
  @scala.inline
  implicit class LegacySequentialSerializationOps[Self <: LegacySequentialSerialization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass_name(value: Sequential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: js.Array[LayerSerialization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
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

