package typingsSlinky.std

import typingsSlinky.std.stdNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait CountQueuingStrategy
  extends QueuingStrategy[js.Any] {
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: Double = js.native
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): `1` = js.native
}

object CountQueuingStrategy {
  @scala.inline
  def apply(highWaterMark: Double, size: js.Any => `1`): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  @scala.inline
  implicit class CountQueuingStrategyOps[Self <: CountQueuingStrategy] (val x: Self) extends AnyVal {
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
    def withSize(value: js.Any => `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

