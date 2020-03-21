package typingsSlinky.sjcl.mod

import typingsSlinky.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclArrayBufferCodec extends SjclCodec[ArrayBuffer] {
  def fromBits(bits: BitArray_, padding: Boolean): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Boolean, padding_count: Double): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def hexDumpBuffer(buffer: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
}

