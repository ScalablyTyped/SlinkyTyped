package typingsSlinky.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item[T] extends js.Object {
  def Item(index: js.Any): T = js.native
}

object Item {
  @scala.inline
  def apply[T](Item: js.Any => T): Item[T] = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Item[T]]
  }
  @scala.inline
  implicit class ItemOps[Self[t] <: Item[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withItem(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

