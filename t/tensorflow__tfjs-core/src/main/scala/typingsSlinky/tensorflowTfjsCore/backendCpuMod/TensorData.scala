package typingsSlinky.tensorflowTfjsCore.backendCpuMod

import typingsSlinky.tensorflowTfjsCore.anon.ImagReal
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorData[D /* <: DataType */] extends js.Object {
  var complexTensors: js.UndefOr[ImagReal] = js.native
  var dtype: D = js.native
  var values: js.UndefOr[BackendValues] = js.native
}

object TensorData {
  @scala.inline
  def apply[D](dtype: D): TensorData[D] = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData[D]]
  }
  @scala.inline
  implicit class TensorDataOps[Self[d] <: TensorData[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withDtype(value: D): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplexTensors(value: ImagReal): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplexTensors: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexTensors")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesInt32Array(value: js.typedarray.Int32Array): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuesFloat32Array(value: js.typedarray.Float32Array): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuesUint8Array(value: js.typedarray.Uint8Array): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: BackendValues): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

