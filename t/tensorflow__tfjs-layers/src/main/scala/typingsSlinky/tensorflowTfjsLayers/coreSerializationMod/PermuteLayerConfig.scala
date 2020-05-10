package typingsSlinky.tensorflowTfjsLayers.coreSerializationMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermuteLayerConfig extends LayerConfig {
  var dims: js.Array[Double] = js.native
}

object PermuteLayerConfig {
  @scala.inline
  def apply(dims: js.Array[Double]): PermuteLayerConfig = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermuteLayerConfig]
  }
  @scala.inline
  implicit class PermuteLayerConfigOps[Self <: PermuteLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDims(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dims")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

