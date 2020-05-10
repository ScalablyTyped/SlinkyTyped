package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
@js.native
trait ArrayBufferTypes extends js.Object {
  var ArrayBuffer: js.typedarray.ArrayBuffer = js.native
  var SharedArrayBuffer: typingsSlinky.std.SharedArrayBuffer = js.native
}

object ArrayBufferTypes {
  @scala.inline
  def apply(ArrayBuffer: js.typedarray.ArrayBuffer, SharedArrayBuffer: SharedArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferTypes]
  }
  @scala.inline
  implicit class ArrayBufferTypesOps[Self <: ArrayBufferTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedArrayBuffer(value: SharedArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedArrayBuffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

