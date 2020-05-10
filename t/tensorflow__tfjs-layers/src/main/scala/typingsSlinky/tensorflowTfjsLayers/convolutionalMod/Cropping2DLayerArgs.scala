package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cropping2DLayerArgs extends LayerArgs {
  /**
    * Dimension of the cropping along the width and the height.
    * - If integer: the same symmetric cropping
    *  is applied to width and height.
    * - If list of 2 integers:
    *   interpreted as two different
    *   symmetric cropping values for height and width:
    *   `[symmetric_height_crop, symmetric_width_crop]`.
    * - If a list of 2 list of 2 integers:
    *   interpreted as
    *   `[[top_crop, bottom_crop], [left_crop, right_crop]]`
    */
  var cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]) = js.native
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `channels_last` corresponds to inputs with shape
    *   `(batch, ..., channels)`
    *
    *  `channels_first` corresponds to inputs with shape `(batch, channels,
    * ...)`.
    *
    * Defaults to `channels_last`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
}

object Cropping2DLayerArgs {
  @scala.inline
  def apply(
    cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ): Cropping2DLayerArgs = {
    val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropping2DLayerArgs]
  }
  @scala.inline
  implicit class Cropping2DLayerArgsOps[Self <: Cropping2DLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropping(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropping")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

