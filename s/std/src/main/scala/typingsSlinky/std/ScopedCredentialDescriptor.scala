package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopedCredentialDescriptor extends StObject {
  
  var id: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | Null = js.native
  
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  
  var `type`: ScopedCredentialType = js.native
}
object ScopedCredentialDescriptor {
  
  @scala.inline
  def apply(`type`: ScopedCredentialType): ScopedCredentialDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialDescriptor]
  }
  
  @scala.inline
  implicit class ScopedCredentialDescriptorMutableBuilder[Self <: ScopedCredentialDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDataView(value: js.typedarray.DataView): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ScopedCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
