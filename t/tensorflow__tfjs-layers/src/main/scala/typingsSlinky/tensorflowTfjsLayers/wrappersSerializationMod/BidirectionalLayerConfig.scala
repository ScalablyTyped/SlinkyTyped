package typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.BidirectionalMergeMode
import typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidirectionalLayerConfig extends LayerConfig {
  var layer: RecurrentLayerSerialization = js.native
  var merge_mode: js.UndefOr[BidirectionalMergeMode] = js.native
}

object BidirectionalLayerConfig {
  @scala.inline
  def apply(layer: RecurrentLayerSerialization): BidirectionalLayerConfig = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidirectionalLayerConfig]
  }
  @scala.inline
  implicit class BidirectionalLayerConfigOps[Self <: BidirectionalLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: RecurrentLayerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge_mode(value: BidirectionalMergeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_mode")(js.undefined)
        ret
    }
  }
  
}

