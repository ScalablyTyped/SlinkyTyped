package typingsSlinky.tensorflowTfjsLayers.coreSerializationMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepeatVectorLayerConfig extends LayerConfig {
  var n: Double = js.native
}

object RepeatVectorLayerConfig {
  @scala.inline
  def apply(n: Double): RepeatVectorLayerConfig = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatVectorLayerConfig]
  }
  @scala.inline
  implicit class RepeatVectorLayerConfigOps[Self <: RepeatVectorLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

