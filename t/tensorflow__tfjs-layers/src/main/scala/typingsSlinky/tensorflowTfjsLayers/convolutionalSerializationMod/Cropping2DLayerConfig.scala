package typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cropping2DLayerConfig extends LayerConfig {
  var cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]) = js.native
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
}

object Cropping2DLayerConfig {
  @scala.inline
  def apply(
    cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ): Cropping2DLayerConfig = {
    val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropping2DLayerConfig]
  }
  @scala.inline
  implicit class Cropping2DLayerConfigOps[Self <: Cropping2DLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropping(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropping")(value.asInstanceOf[js.Any])
        ret
    }
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

