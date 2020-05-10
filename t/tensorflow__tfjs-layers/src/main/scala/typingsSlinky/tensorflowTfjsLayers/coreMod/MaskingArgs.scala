package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskingArgs extends LayerArgs {
  /**
    * Masking Value. Defaults to `0.0`.
    */
  var maskValue: js.UndefOr[Double] = js.native
}

object MaskingArgs {
  @scala.inline
  def apply(): MaskingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskingArgs]
  }
  @scala.inline
  implicit class MaskingArgsOps[Self <: MaskingArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaskValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskValue")(js.undefined)
        ret
    }
  }
  
}

