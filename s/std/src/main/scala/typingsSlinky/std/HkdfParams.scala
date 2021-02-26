package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HkdfParams extends Algorithm {
  
  var hash: HashAlgorithmIdentifier = js.native
  
  var info: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
  
  var salt: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
}
object HkdfParams {
  
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    info: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    name: java.lang.String,
    salt: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): HkdfParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[HkdfParams]
  }
  
  @scala.inline
  implicit class HkdfParamsMutableBuilder[Self <: HkdfParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoDataView(value: js.typedarray.DataView): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalt(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltDataView(value: js.typedarray.DataView): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
