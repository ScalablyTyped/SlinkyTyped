package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends StObject {
  
  var backend: KernelBackend = js.native
  
  var bytes: Double = js.native
  
  var dtype: string | float32 | int32 | bool | complex64 = js.native
  
  var refCount: Double = js.native
  
  var shape: js.Array[Double] = js.native
}
object Backend {
  
  @scala.inline
  def apply(
    backend: KernelBackend,
    bytes: Double,
    dtype: string | float32 | int32 | bool | complex64,
    refCount: Double,
    shape: js.Array[Double]
  ): Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit class BackendMutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: KernelBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtype(value: string | float32 | int32 | bool | complex64): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefCount(value: Double): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}
