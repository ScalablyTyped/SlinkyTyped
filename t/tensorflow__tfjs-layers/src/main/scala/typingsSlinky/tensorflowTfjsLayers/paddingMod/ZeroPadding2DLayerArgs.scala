package typingsSlinky.tensorflowTfjsLayers.paddingMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroPadding2DLayerArgs extends LayerArgs {
  /**
    * One of `'channelsLast'` (default) and `'channelsFirst'`.
    *
    * The ordering of the dimensions in the inputs.
    * `channelsLast` corresponds to inputs with shape
    * `[batch, height, width, channels]` while `channelsFirst`
    * corresponds to inputs with shape
    * `[batch, channels, height, width]`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  /**
    * Integer, or `Array` of 2 integers, or `Array` of 2 `Array`s, each of
    * which is an `Array` of 2 integers.
    * - If integer, the same symmetric padding is applied to width and height.
    * - If Array` of 2 integers, interpreted as two different symmetric values
    *   for height and width:
    *   `[symmetricHeightPad, symmetricWidthPad]`.
    * - If `Array` of 2 `Array`s, interpreted as:
    *   `[[topPad, bottomPad], [leftPad, rightPad]]`.
    */
  var padding: js.UndefOr[
    Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ] = js.native
}

object ZeroPadding2DLayerArgs {
  @scala.inline
  def apply(): ZeroPadding2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeroPadding2DLayerArgs]
  }
  @scala.inline
  implicit class ZeroPadding2DLayerArgsOps[Self <: ZeroPadding2DLayerArgs] (val x: Self) extends AnyVal {
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
    def withPadding(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = {
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
  }
  
}

