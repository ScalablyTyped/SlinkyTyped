package typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod

import typingsSlinky.tensorflowTfjsBackendCpu.anon.Imag
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TensorData[D /* <: DataType */] extends js.Object {
  
  var complexTensorInfos: js.UndefOr[Imag] = js.native
  
  var dtype: D = js.native
  
  var refCount: Double = js.native
  
  var values: js.UndefOr[BackendValues] = js.native
}
object TensorData {
  
  @scala.inline
  def apply[D /* <: DataType */](dtype: D, refCount: Double): TensorData[D] = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData[D]]
  }
  
  @scala.inline
  implicit class TensorDataOps[Self <: TensorData[_], D /* <: DataType */] (val x: Self with TensorData[D]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDtype(value: D): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefCount(value: Double): Self = this.set("refCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexTensorInfos(value: Imag): Self = this.set("complexTensorInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplexTensorInfos: Self = this.set("complexTensorInfos", js.undefined)
    
    @scala.inline
    def setValues(value: BackendValues): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesInt32Array(value: js.typedarray.Int32Array): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesFloat32Array(value: js.typedarray.Float32Array): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUint8Array(value: js.typedarray.Uint8Array): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.typedarray.Uint8Array*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
