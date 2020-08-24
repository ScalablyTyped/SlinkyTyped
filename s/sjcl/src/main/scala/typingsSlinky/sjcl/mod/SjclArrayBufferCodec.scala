package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclArrayBufferCodec
  extends SjclCodec[js.typedarray.ArrayBuffer] {
  def fromBits(bits: BitArray_, padding: js.UndefOr[scala.Nothing], padding_count: Double): js.typedarray.ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Boolean): js.typedarray.ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Boolean, padding_count: Double): js.typedarray.ArrayBuffer = js.native
  def hexDumpBuffer(buffer: js.typedarray.ArrayBuffer): Unit = js.native
}

