package typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdedReLULayerConfig extends LayerConfig {
  var theta: js.UndefOr[Double] = js.native
}

object ThresholdedReLULayerConfig {
  @scala.inline
  def apply(): ThresholdedReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdedReLULayerConfig]
  }
  @scala.inline
  implicit class ThresholdedReLULayerConfigOps[Self <: ThresholdedReLULayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(js.undefined)
        ret
    }
  }
  
}

