package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshapeLayerArgs extends LayerArgs {
  /** The target shape. Does not include the batch axis. */
  var targetShape: Shape = js.native
}

object ReshapeLayerArgs {
  @scala.inline
  def apply(targetShape: Shape): ReshapeLayerArgs = {
    val __obj = js.Dynamic.literal(targetShape = targetShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerArgs]
  }
  @scala.inline
  implicit class ReshapeLayerArgsOps[Self <: ReshapeLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetShape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

