package typingsSlinky.tensorflowTfjsLayers.topologyConfigMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerConfig extends PyJsonDict {
  var batch_input_shape: js.UndefOr[Shape] = js.native
  var batch_size: js.UndefOr[Double] = js.native
  var dtype: js.UndefOr[DataType] = js.native
  var input_dtype: js.UndefOr[DataType] = js.native
  var input_shape: js.UndefOr[Shape] = js.native
  var name: js.UndefOr[String] = js.native
  var trainable: js.UndefOr[Boolean] = js.native
}

object LayerConfig {
  @scala.inline
  def apply(): LayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerConfig]
  }
  @scala.inline
  implicit class LayerConfigOps[Self <: LayerConfig] (val x: Self) extends AnyVal {
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
    def withInput_dtype(value: DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_dtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_dtype")(js.undefined)
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
    def withTrainable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainable")(js.undefined)
        ret
    }
  }
  
}

