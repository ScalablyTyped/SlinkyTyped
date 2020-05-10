package typingsSlinky.tensorflowTfjsLayers.wrappersMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.BidirectionalMergeMode
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNN_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidirectionalLayerArgs extends WrapperLayerArgs {
  /**
    * The instance of an `RNN` layer to be wrapped.
    */
  @JSName("layer")
  var layer_BidirectionalLayerArgs: RNN_ = js.native
  /**
    * Mode by which outputs of the forward and backward RNNs are
    * combined. If `null` or `undefined`, the output will not be
    * combined, they will be returned as an `Array`.
    *
    * If `undefined` (i.e., not provided), defaults to `'concat'`.
    */
  var mergeMode: js.UndefOr[BidirectionalMergeMode] = js.native
}

object BidirectionalLayerArgs {
  @scala.inline
  def apply(layer: RNN_): BidirectionalLayerArgs = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidirectionalLayerArgs]
  }
  @scala.inline
  implicit class BidirectionalLayerArgsOps[Self <: BidirectionalLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: RNN_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeMode(value: BidirectionalMergeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMode")(js.undefined)
        ret
    }
  }
  
}

