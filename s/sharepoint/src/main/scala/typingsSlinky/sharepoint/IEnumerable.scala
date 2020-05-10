package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEnumerable[T] extends js.Object {
  def getEnumerator(): IEnumerator[T] = js.native
}

object IEnumerable {
  @scala.inline
  def apply[T](getEnumerator: () => IEnumerator[T]): IEnumerable[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator))
    __obj.asInstanceOf[IEnumerable[T]]
  }
  @scala.inline
  implicit class IEnumerableOps[Self[t] <: IEnumerable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetEnumerator(value: () => IEnumerator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnumerator")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

