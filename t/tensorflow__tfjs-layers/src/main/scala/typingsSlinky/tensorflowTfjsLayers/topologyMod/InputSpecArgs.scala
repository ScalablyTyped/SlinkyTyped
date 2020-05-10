package typingsSlinky.tensorflowTfjsLayers.topologyMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSpecArgs extends js.Object {
  /** Dictionary mapping integer axes to a specific dimension value. */
  var axes: js.UndefOr[NumberDictionary[Double]] = js.native
  /** Expected datatype of the input. */
  var dtype: js.UndefOr[DataType] = js.native
  /** Maximum rank of the input. */
  var maxNDim: js.UndefOr[Double] = js.native
  /** Minimum rank of the input. */
  var minNDim: js.UndefOr[Double] = js.native
  /** Expected rank of the input. */
  var ndim: js.UndefOr[Double] = js.native
  /** Expected shape of the input (may include null for unchecked axes). */
  var shape: js.UndefOr[Shape] = js.native
}

object InputSpecArgs {
  @scala.inline
  def apply(): InputSpecArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSpecArgs]
  }
  @scala.inline
  implicit class InputSpecArgsOps[Self <: InputSpecArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: NumberDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
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
    def withMaxNDim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNDim")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNDim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNDim")(js.undefined)
        ret
    }
    @scala.inline
    def withNdim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ndim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNdim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ndim")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
  }
  
}

