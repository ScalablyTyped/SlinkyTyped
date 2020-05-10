package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pooling1DLayerArgs extends LayerArgs {
  /** How to fill in data that's not an integer multiple of poolSize. */
  var padding: js.UndefOr[PaddingMode] = js.native
  /**
    * Size of the window to pool over, should be an integer.
    */
  var poolSize: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Period at which to sample the pooled values.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[Double | js.Array[Double]] = js.native
}

object Pooling1DLayerArgs {
  @scala.inline
  def apply(): Pooling1DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pooling1DLayerArgs]
  }
  @scala.inline
  implicit class Pooling1DLayerArgsOps[Self <: Pooling1DLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: PaddingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolSize(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStrides(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(js.undefined)
        ret
    }
  }
  
}

