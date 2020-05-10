package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNNLayerArgs extends BaseRNNLayerArgs {
  @JSName("cell")
  var cell_RNNLayerArgs: RNNCell | js.Array[RNNCell] = js.native
}

object RNNLayerArgs {
  @scala.inline
  def apply(cell: RNNCell | js.Array[RNNCell]): RNNLayerArgs = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNNLayerArgs]
  }
  @scala.inline
  implicit class RNNLayerArgsOps[Self <: RNNLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: RNNCell | js.Array[RNNCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

