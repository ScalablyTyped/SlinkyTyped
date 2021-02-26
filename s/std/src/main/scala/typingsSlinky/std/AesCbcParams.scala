package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesCbcParams extends Algorithm {
  
  var iv: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
}
object AesCbcParams {
  
  @scala.inline
  def apply(
    iv: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    name: java.lang.String
  ): org.scalajs.dom.crypto.AesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.AesCbcParams]
  }
  
  @scala.inline
  implicit class AesCbcParamsMutableBuilder[Self <: org.scalajs.dom.crypto.AesCbcParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIv(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvDataView(value: js.typedarray.DataView): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
