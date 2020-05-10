package typingsSlinky.tensorflowTfjsLayers.paddingSerializationMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroPadding2DLayerConfig extends LayerConfig {
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
  var padding: js.UndefOr[
    Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ] = js.native
}

object ZeroPadding2DLayerConfig {
  @scala.inline
  def apply(): ZeroPadding2DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeroPadding2DLayerConfig]
  }
  @scala.inline
  implicit class ZeroPadding2DLayerConfigOps[Self <: ZeroPadding2DLayerConfig] (val x: Self) extends AnyVal {
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
    def withPadding(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

