package typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeakyReLULayerConfig extends LayerConfig {
  var alpha: js.UndefOr[Double] = js.native
}

object LeakyReLULayerConfig {
  @scala.inline
  def apply(): LeakyReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeakyReLULayerConfig]
  }
  @scala.inline
  implicit class LeakyReLULayerConfigOps[Self <: LeakyReLULayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
  }
  
}

