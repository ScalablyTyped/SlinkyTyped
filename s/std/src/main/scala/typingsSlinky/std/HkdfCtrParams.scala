package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HkdfCtrParams extends Algorithm {
  var context: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
  var hash: java.lang.String | org.scalajs.dom.crypto.Algorithm = js.native
  var label: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer = js.native
}

object HkdfCtrParams {
  @scala.inline
  def apply(
    context: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    hash: java.lang.String | org.scalajs.dom.crypto.Algorithm,
    label: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    name: java.lang.String
  ): HkdfCtrParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HkdfCtrParams]
  }
  @scala.inline
  implicit class HkdfCtrParamsOps[Self <: org.scalajs.dom.crypto.HkdfCtrParams] (val x: Self) extends AnyVal {
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
    def setContextUint32Array(value: js.typedarray.Uint32Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextInt8Array(value: js.typedarray.Int8Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextFloat64Array(value: js.typedarray.Float64Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextFloat32Array(value: js.typedarray.Float32Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextInt16Array(value: js.typedarray.Int16Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextDataView(value: js.typedarray.DataView): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextInt32Array(value: js.typedarray.Int32Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextUint16Array(value: js.typedarray.Uint16Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextUint8Array(value: js.typedarray.Uint8Array): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: java.lang.String | org.scalajs.dom.crypto.Algorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelUint8Array(value: js.typedarray.Uint8Array): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelUint32Array(value: js.typedarray.Uint32Array): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelDataView(value: js.typedarray.DataView): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelFloat32Array(value: js.typedarray.Float32Array): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelInt32Array(value: js.typedarray.Int32Array): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelUint16Array(value: js.typedarray.Uint16Array): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelInt8Array(value: js.typedarray.Int8Array): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelFloat64Array(value: js.typedarray.Float64Array): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelInt16Array(value: js.typedarray.Int16Array): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

