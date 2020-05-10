package typingsSlinky.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIterable[T] extends js.Object {
  def first(): IIterator[T] = js.native
}

object IIterable {
  @scala.inline
  def apply[T](first: () => IIterator[T]): IIterable[T] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[IIterable[T]]
  }
  @scala.inline
  implicit class IIterableOps[Self[t] <: IIterable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFirst(value: () => IIterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

