package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesGcmParams extends Algorithm {
  
  var additionalData: js.UndefOr[
    js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ] = js.native
  
  var iv: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
  
  var tagLength: js.UndefOr[Double] = js.native
}
object AesGcmParams {
  
  @scala.inline
  def apply(
    iv: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    name: java.lang.String
  ): org.scalajs.dom.crypto.AesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.AesGcmParams]
  }
  
  @scala.inline
  implicit class AesGcmParamsMutableBuilder[Self <: org.scalajs.dom.crypto.AesGcmParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalData(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataDataView(value: js.typedarray.DataView): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
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
    
    @scala.inline
    def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
  }
}
