package typingsSlinky.tensorflowTfjsLayers.inputConfigMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLayerConfig extends js.Object {
  var batch_input_shape: js.UndefOr[Shape] = js.native
  var batch_size: js.UndefOr[Double] = js.native
  var dtype: js.UndefOr[DataType] = js.native
  var input_shape: js.UndefOr[Shape] = js.native
  var name: js.UndefOr[String] = js.native
  var sparse: js.UndefOr[Boolean] = js.native
}

object InputLayerConfig {
  @scala.inline
  def apply(): InputLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLayerConfig]
  }
  @scala.inline
  implicit class InputLayerConfigOps[Self <: InputLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatch_input_shape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_input_shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch_input_shape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_input_shape")(js.undefined)
        ret
    }
    @scala.inline
    def withBatch_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_size")(js.undefined)
        ret
    }
    @scala.inline
    def withDtype(value: DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_shape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_shape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_shape")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSparse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(js.undefined)
        ret
    }
  }
  
}

