package typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotLayerConfig extends LayerConfig {
  var axes: Double | (js.Tuple2[Double, Double]) = js.native
  var normalize: js.UndefOr[Boolean] = js.native
}

object DotLayerConfig {
  @scala.inline
  def apply(axes: Double | (js.Tuple2[Double, Double])): DotLayerConfig = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotLayerConfig]
  }
  @scala.inline
  implicit class DotLayerConfigOps[Self <: DotLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: Double | (js.Tuple2[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
  }
  
}

