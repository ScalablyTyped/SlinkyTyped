package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermuteLayerArgs extends LayerArgs {
  /**
    * Array of integers. Permutation pattern. Does not include the
    * sample (batch) dimension. Index starts at 1.
    * For instance, `[2, 1]` permutes the first and second dimensions
    * of the input.
    */
  var dims: js.Array[Double] = js.native
}

object PermuteLayerArgs {
  @scala.inline
  def apply(dims: js.Array[Double]): PermuteLayerArgs = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermuteLayerArgs]
  }
  @scala.inline
  implicit class PermuteLayerArgsOps[Self <: PermuteLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDims(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dims")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

