package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropoutLayerArgs extends LayerArgs {
  /**
    * Integer array representing the shape of the binary dropout mask that will
    * be multiplied with the input.
    *
    * For instance, if your inputs have shape `(batchSize, timesteps, features)`
    * and you want the dropout mask to be the same for all timesteps, you can use
    * `noise_shape=(batch_size, 1, features)`.
    */
  var noiseShape: js.UndefOr[js.Array[Double]] = js.native
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double = js.native
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.native
}

object DropoutLayerArgs {
  @scala.inline
  def apply(rate: Double): DropoutLayerArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropoutLayerArgs]
  }
  @scala.inline
  implicit class DropoutLayerArgsOps[Self <: DropoutLayerArgs] (val x: Self) extends AnyVal {
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
    def withNoiseShape(value: js.Array[Double]): Self = {
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
    @scala.inline
    def withSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
  }
  
}

