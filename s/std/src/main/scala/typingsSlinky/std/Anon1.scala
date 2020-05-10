package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1[T] extends js.Object {
  def Item(index: js.Any): T = js.native
}

object Anon1 {
  @scala.inline
  def apply[T](Item: js.Any => T): Anon1[T] = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Anon1[T]]
  }
  @scala.inline
  implicit class Anon1Ops[Self[t] <: Anon1[t], T] (val x: Self[T]) extends AnyVal {
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

