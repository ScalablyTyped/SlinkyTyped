package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesCtrParams extends Algorithm {
  
  var counter: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
  
  var length: Double = js.native
}
object AesCtrParams {
  
  @scala.inline
  def apply(
    counter: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    length: Double,
    name: java.lang.String
  ): org.scalajs.dom.crypto.AesCtrParams = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.AesCtrParams]
  }
  
  @scala.inline
  implicit class AesCtrParamsMutableBuilder[Self <: org.scalajs.dom.crypto.AesCtrParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterDataView(value: js.typedarray.DataView): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
