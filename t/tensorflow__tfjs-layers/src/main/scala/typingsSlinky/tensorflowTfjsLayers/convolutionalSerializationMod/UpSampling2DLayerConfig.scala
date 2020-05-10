package typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpSampling2DLayerConfig extends LayerConfig {
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
  var size: js.UndefOr[js.Array[Double]] = js.native
}

object UpSampling2DLayerConfig {
  @scala.inline
  def apply(): UpSampling2DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpSampling2DLayerConfig]
  }
  @scala.inline
  implicit class UpSampling2DLayerConfigOps[Self <: UpSampling2DLayerConfig] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

