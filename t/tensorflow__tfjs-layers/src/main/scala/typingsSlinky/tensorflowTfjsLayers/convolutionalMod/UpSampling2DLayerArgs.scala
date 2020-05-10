package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpSampling2DLayerArgs extends LayerArgs {
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `"channelsLast"` corresponds to inputs with shape
    *   `[batch, ..., channels]`
    *
    *  `"channelsFirst"` corresponds to inputs with shape `[batch, channels,
    * ...]`.
    *
    * Defaults to `"channelsLast"`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  /**
    * The upsampling factors for rows and columns.
    *
    * Defaults to `[2, 2]`.
    */
  var size: js.UndefOr[js.Array[Double]] = js.native
}

object UpSampling2DLayerArgs {
  @scala.inline
  def apply(): UpSampling2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpSampling2DLayerArgs]
  }
  @scala.inline
  implicit class UpSampling2DLayerArgsOps[Self <: UpSampling2DLayerArgs] (val x: Self) extends AnyVal {
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
    def withSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

