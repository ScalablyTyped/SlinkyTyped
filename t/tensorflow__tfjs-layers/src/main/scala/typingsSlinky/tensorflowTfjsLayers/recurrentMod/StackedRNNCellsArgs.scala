package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedRNNCellsArgs extends LayerArgs {
  /**
    * A `Array` of `RNNCell` instances.
    */
  var cells: js.Array[RNNCell] = js.native
}

object StackedRNNCellsArgs {
  @scala.inline
  def apply(cells: js.Array[RNNCell]): StackedRNNCellsArgs = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedRNNCellsArgs]
  }
  @scala.inline
  implicit class StackedRNNCellsArgsOps[Self <: StackedRNNCellsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[RNNCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

