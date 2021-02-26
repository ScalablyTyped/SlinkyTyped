package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pbkdf2Params extends Algorithm {
  
  var hash: HashAlgorithmIdentifier = js.native
  
  var iterations: Double = js.native
  
  var salt: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
}
object Pbkdf2Params {
  
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    iterations: Double,
    name: java.lang.String,
    salt: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): org.scalajs.dom.crypto.Pbkdf2Params = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.Pbkdf2Params]
  }
  
  @scala.inline
  implicit class Pbkdf2ParamsMutableBuilder[Self <: org.scalajs.dom.crypto.Pbkdf2Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
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
