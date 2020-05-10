package typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalPooling2DLayerConfig extends LayerConfig {
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
}

object GlobalPooling2DLayerConfig {
  @scala.inline
  def apply(): GlobalPooling2DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPooling2DLayerConfig]
  }
  @scala.inline
  implicit class GlobalPooling2DLayerConfigOps[Self <: GlobalPooling2DLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData_format(value: DataFormatSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_format")(js.undefined)
        ret
    }
  }
  
}

