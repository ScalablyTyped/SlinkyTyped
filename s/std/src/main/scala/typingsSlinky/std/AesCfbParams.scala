package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesCfbParams extends Algorithm {
  
  var iv: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
}
object AesCfbParams {
  
  @scala.inline
  def apply(
    iv: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    name: java.lang.String
  ): AesCfbParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCfbParams]
  }
  
  @scala.inline
  implicit class AesCfbParamsOps[Self <: org.scalajs.dom.crypto.AesCfbParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIvDataView(value: js.typedarray.DataView): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint32Array(value: js.typedarray.Uint32Array): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint16Array(value: js.typedarray.Uint16Array): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvFloat32Array(value: js.typedarray.Float32Array): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvInt8Array(value: js.typedarray.Int8Array): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvInt16Array(value: js.typedarray.Int16Array): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvFloat64Array(value: js.typedarray.Float64Array): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIv(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint8Array(value: js.typedarray.Uint8Array): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvInt32Array(value: js.typedarray.Int32Array): Self = this.set("iv", value.asInstanceOf[js.Any])
  }
}
