package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait ByteLengthQueuingStrategy
  extends QueuingStrategy[js.typedarray.ArrayBufferView] {
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}

object ByteLengthQueuingStrategy {
  @scala.inline
  def apply(highWaterMark: Double, size: js.typedarray.ArrayBufferView => Double): ByteLengthQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[ByteLengthQueuingStrategy]
  }
  @scala.inline
  implicit class ByteLengthQueuingStrategyOps[Self <: ByteLengthQueuingStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: js.typedarray.ArrayBufferView => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

