package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pooling3DLayerArgs extends LayerArgs {
  /** The data format to use for the pooling layer. */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  /** The padding type to use for the pooling layer. */
  var padding: js.UndefOr[PaddingMode] = js.native
  /**
    * Factors by which to downscale in each dimension [depth, height, width].
    * Expects an integer or an array of 3 integers.
    *
    * For example, `[2, 2, 2]` will halve the input in three dimensions.
    * If only one integer is specified, the same window length
    * will be used for all dimensions.
    */
  var poolSize: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.native
  /**
    * The size of the stride in each dimension of the pooling window. Expects
    * an integer or an array of 3 integers. Integer, tuple of 3 integers, or
    * None.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.native
}

object Pooling3DLayerArgs {
  @scala.inline
  def apply(): Pooling3DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pooling3DLayerArgs]
  }
  @scala.inline
  implicit class Pooling3DLayerArgsOps[Self <: Pooling3DLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFormat(value: DataFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(js.undefined)
        ret
    }
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
    def withPoolSize(value: Double | (js.Tuple3[Double, Double, Double])): Self = {
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
    def withStrides(value: Double | (js.Tuple3[Double, Double, Double])): Self = {
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

