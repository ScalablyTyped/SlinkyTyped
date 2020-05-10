package typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparableConvLayerConfig extends ConvLayerConfig {
  var depth_multiplier: js.UndefOr[Double] = js.native
  var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.native
  var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var pointwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var pointwise_initializer: js.UndefOr[InitializerSerialization] = js.native
  var pointwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
}

object SeparableConvLayerConfig {
  @scala.inline
  def apply(filters: Double, kernel_size: Double | js.Array[Double]): SeparableConvLayerConfig = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernel_size = kernel_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableConvLayerConfig]
  }
  @scala.inline
  implicit class SeparableConvLayerConfigOps[Self <: SeparableConvLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPointwise_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwise_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointwise_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwise_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withPointwise_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwise_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointwise_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwise_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withPointwise_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwise_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointwise_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointwise_regularizer")(js.undefined)
        ret
    }
  }
  
}

