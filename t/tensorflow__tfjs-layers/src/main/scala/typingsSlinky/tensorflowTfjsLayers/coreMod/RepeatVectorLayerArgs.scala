package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepeatVectorLayerArgs extends LayerArgs {
  /**
    * The integer number of times to repeat the input.
    */
  var n: Double = js.native
}

object RepeatVectorLayerArgs {
  @scala.inline
  def apply(n: Double): RepeatVectorLayerArgs = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatVectorLayerArgs]
  }
  @scala.inline
  implicit class RepeatVectorLayerArgsOps[Self <: RepeatVectorLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

