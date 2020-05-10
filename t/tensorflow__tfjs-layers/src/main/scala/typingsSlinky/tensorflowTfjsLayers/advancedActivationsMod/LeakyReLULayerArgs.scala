package typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeakyReLULayerArgs extends LayerArgs {
  /**
    * Float `>= 0`. Negative slope coefficient. Defaults to `0.3`.
    */
  var alpha: js.UndefOr[Double] = js.native
}

object LeakyReLULayerArgs {
  @scala.inline
  def apply(): LeakyReLULayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeakyReLULayerArgs]
  }
  @scala.inline
  implicit class LeakyReLULayerArgsOps[Self <: LeakyReLULayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
  }
  
}

