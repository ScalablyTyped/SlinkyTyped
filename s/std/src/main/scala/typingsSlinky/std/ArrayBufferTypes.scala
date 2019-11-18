package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
trait ArrayBufferTypes extends js.Object {
  var ArrayBuffer: scala.scalajs.js.typedarray.ArrayBuffer
  var SharedArrayBuffer: typingsSlinky.std.SharedArrayBuffer
}

object ArrayBufferTypes {
  @scala.inline
  def apply(ArrayBuffer: scala.scalajs.js.typedarray.ArrayBuffer, SharedArrayBuffer: SharedArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArrayBufferTypes]
  }
}

