package typingsSlinky.tensorflowTfjsLayers.convolutionalDepthwiseSerializationMod

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.BaseConvLayerConfig
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthwiseConv2DLayerConfig extends BaseConvLayerConfig {
  var depth_multiplier: js.UndefOr[Double] = js.native
  var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.native
  var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  @JSName("kernel_size")
  var kernel_size_DepthwiseConv2DLayerConfig: Double | (js.Tuple2[Double, Double]) = js.native
}

object DepthwiseConv2DLayerConfig {
  @scala.inline
  def apply(kernel_size: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerConfig = {
    val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthwiseConv2DLayerConfig]
  }
  @scala.inline
  implicit class DepthwiseConv2DLayerConfigOps[Self <: DepthwiseConv2DLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernel_size(value: Double | (js.Tuple2[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth_multiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth_multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth_multiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth_multiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthwise_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwise_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthwise_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwise_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthwise_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwise_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthwise_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwise_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthwise_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwise_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthwise_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthwise_regularizer")(js.undefined)
        ret
    }
  }
  
}

