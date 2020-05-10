package typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatenateLayerConfig extends LayerConfig {
  var axis: js.UndefOr[Double] = js.native
}

object ConcatenateLayerConfig {
  @scala.inline
  def apply(): ConcatenateLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcatenateLayerConfig]
  }
  @scala.inline
  implicit class ConcatenateLayerConfigOps[Self <: ConcatenateLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
  }
  
}

