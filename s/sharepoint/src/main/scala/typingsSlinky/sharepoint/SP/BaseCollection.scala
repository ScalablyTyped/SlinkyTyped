package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.IEnumerable
import typingsSlinky.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseCollection[T] extends IEnumerable[T] {
  def get_count(): Double = js.native
  def itemAtIndex(index: Double): T = js.native
}

object BaseCollection {
  @scala.inline
  def apply[T](getEnumerator: () => IEnumerator[T], get_count: () => Double, itemAtIndex: Double => T): BaseCollection[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), itemAtIndex = js.Any.fromFunction1(itemAtIndex))
    __obj.asInstanceOf[BaseCollection[T]]
  }
  @scala.inline
  implicit class BaseCollectionOps[Self[t] <: BaseCollection[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGet_count(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemAtIndex(value: Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAtIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

