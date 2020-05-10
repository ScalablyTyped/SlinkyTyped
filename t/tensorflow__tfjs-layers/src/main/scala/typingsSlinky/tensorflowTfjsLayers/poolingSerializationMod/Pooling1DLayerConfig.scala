package typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pooling1DLayerConfig extends LayerConfig {
  var padding: js.UndefOr[PaddingMode] = js.native
  var pool_size: js.UndefOr[js.Array[Double]] = js.native
  var strides: js.UndefOr[js.Array[Double]] = js.native
}

object Pooling1DLayerConfig {
  @scala.inline
  def apply(): Pooling1DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pooling1DLayerConfig]
  }
  @scala.inline
  implicit class Pooling1DLayerConfigOps[Self <: Pooling1DLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: PaddingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPool_size(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool_size")(js.undefined)
        ret
    }
    @scala.inline
    def withStrides(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(js.undefined)
        ret
    }
  }
  
}

