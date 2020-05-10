package typingsSlinky.tensorflowTfjsLayers.noiseMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlphaDropoutArgs extends LayerArgs {
  /**
    * A 1-D `Tensor` of type `int32`, representing the
    * shape for randomly generated keep/drop flags.
    */
  var noiseShape: js.UndefOr[Shape] = js.native
  /** drop probability.  */
  var rate: Double = js.native
}

object AlphaDropoutArgs {
  @scala.inline
  def apply(rate: Double): AlphaDropoutArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaDropoutArgs]
  }
  @scala.inline
  implicit class AlphaDropoutArgsOps[Self <: AlphaDropoutArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoiseShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoiseShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseShape")(js.undefined)
        ret
    }
  }
  
}

