package typingsSlinky.tensorflowTfjsLayers.coreSerializationMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshapeLayerConfig extends LayerConfig {
  var target_shape: Shape = js.native
}

object ReshapeLayerConfig {
  @scala.inline
  def apply(target_shape: Shape): ReshapeLayerConfig = {
    val __obj = js.Dynamic.literal(target_shape = target_shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerConfig]
  }
  @scala.inline
  implicit class ReshapeLayerConfigOps[Self <: ReshapeLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget_shape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_shape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

