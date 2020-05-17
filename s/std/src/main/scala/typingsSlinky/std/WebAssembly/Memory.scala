package typingsSlinky.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Memory extends ExportValue {
  val buffer: js.typedarray.ArrayBuffer = js.native
  def grow(delta: Double): Double = js.native
}

object Memory {
  @scala.inline
  def apply(buffer: js.typedarray.ArrayBuffer, grow: Double => Double): Memory = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
    __obj.asInstanceOf[Memory]
  }
  @scala.inline
  implicit class MemoryOps[Self <: Memory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrow(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

