package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait SjclCodec[T] extends js.Object {
  def fromBits(bits: BitArray_): T = js.native
  def toBits(value: T): BitArray_ = js.native
}

object SjclCodec {
  @scala.inline
  def apply[T](fromBits: BitArray_ => T, toBits: T => BitArray_): SjclCodec[T] = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits), toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[SjclCodec[T]]
  }
  @scala.inline
  implicit class SjclCodecOps[Self[t] <: SjclCodec[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFromBits(value: BitArray_ => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToBits(value: T => BitArray_): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBits")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

