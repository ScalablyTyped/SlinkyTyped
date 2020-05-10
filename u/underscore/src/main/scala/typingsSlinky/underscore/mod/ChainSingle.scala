package typingsSlinky.underscore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainSingle[T] extends js.Object {
  def value(): T = js.native
}

object ChainSingle {
  @scala.inline
  def apply[T](value: () => T): ChainSingle[T] = {
    val __obj = js.Dynamic.literal(value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[ChainSingle[T]]
  }
  @scala.inline
  implicit class ChainSingleOps[Self[t] <: ChainSingle[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

