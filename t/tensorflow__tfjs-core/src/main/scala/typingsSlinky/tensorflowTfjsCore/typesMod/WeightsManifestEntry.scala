package typingsSlinky.tensorflowTfjsCore.typesMod

import typingsSlinky.tensorflowTfjsCore.AnonDtype
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightsManifestEntry extends js.Object {
  /**
    * Data type of the weight.
    */
  var dtype: float32 | int32 | bool | string = js.native
  /**
    * Type of the weight.
    *
    * Optional.
    *
    * The value 'optimizer' indicates the weight belongs to an optimizer
    * (i.e., used only during model training and not during inference).
    */
  var group: js.UndefOr[WeightGroup] = js.native
  /**
    * Name of the weight, e.g., 'Dense_1/bias'
    */
  var name: String = js.native
  /**
    * Information for dequantization of the weight.
    */
  var quantization: js.UndefOr[AnonDtype] = js.native
  /**
    * Shape of the weight.
    */
  var shape: js.Array[Double] = js.native
}

object WeightsManifestEntry {
  @scala.inline
  def apply(dtype: float32 | int32 | bool | string, name: String, shape: js.Array[Double]): WeightsManifestEntry = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightsManifestEntry]
  }
  @scala.inline
  implicit class WeightsManifestEntryOps[Self <: WeightsManifestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDtype(value: float32 | int32 | bool | string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: WeightGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantization(value: AnonDtype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantization")(js.undefined)
        ret
    }
  }
  
}

