package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaOaepParams extends Algorithm {
  var label: js.UndefOr[
    js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ] = js.native
}

object RsaOaepParams {
  @scala.inline
  def apply(name: java.lang.String): RsaOaepParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOaepParams]
  }
  @scala.inline
  implicit class RsaOaepParamsOps[Self <: org.scalajs.dom.crypto.RsaOaepParams] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

