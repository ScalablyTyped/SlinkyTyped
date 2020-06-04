package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialDescriptor extends js.Object {
  var id: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | Null
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  var `type`: ScopedCredentialType
}

object ScopedCredentialDescriptor {
  @scala.inline
  def apply(`type`: ScopedCredentialType): ScopedCredentialDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialDescriptor]
  }
  @scala.inline
  implicit class ScopedCredentialDescriptorOps[Self <: ScopedCredentialDescriptor] (val x: Self) extends AnyVal {
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
    def setType(value: ScopedCredentialType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdInt32Array(value: js.typedarray.Int32Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdUint8Array(value: js.typedarray.Uint8Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdDataView(value: js.typedarray.DataView): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdFloat32Array(value: js.typedarray.Float32Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdUint16Array(value: js.typedarray.Uint16Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdFloat64Array(value: js.typedarray.Float64Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdInt8Array(value: js.typedarray.Int8Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdInt16Array(value: js.typedarray.Int16Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdUint32Array(value: js.typedarray.Uint32Array): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setTransports(value: js.Array[Transport]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
  }
  
}

