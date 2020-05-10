package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalPooling2DLayerArgs extends LayerArgs {
  /**
    * One of `CHANNEL_LAST` (default) or `CHANNEL_FIRST`.
    *
    * The ordering of the dimensions in the inputs. `CHANNEL_LAST` corresponds
    * to inputs with shape `[batch, height, width, channels[` while
    * `CHANNEL_FIRST` corresponds to inputs with shape
    * `[batch, channels, height, width]`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
}

object GlobalPooling2DLayerArgs {
  @scala.inline
  def apply(): GlobalPooling2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPooling2DLayerArgs]
  }
  @scala.inline
  implicit class GlobalPooling2DLayerArgsOps[Self <: GlobalPooling2DLayerArgs] (val x: Self) extends AnyVal {
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
  }
  
}

