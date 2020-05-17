package typingsSlinky.sharepoint.CUI

import typingsSlinky.sharepoint.IEnumerable
import typingsSlinky.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends IEnumerable[T] {
  def add(data: T): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def getEnumeratorAtPos(): ListEnumerator[T] = js.native
  def get_count(): Double = js.native
  def get_item(index: Double): T = js.native
  def indexOf(data: T): Double = js.native
  def insert(index: Double, data: T): scala.Unit = js.native
  def remove(data: T): scala.Unit = js.native
}

object List {
  @scala.inline
  def apply[T](
    add: T => scala.Unit,
    clear: () => scala.Unit,
    getEnumerator: () => IEnumerator[T],
    getEnumeratorAtPos: () => ListEnumerator[T],
    get_count: () => Double,
    get_item: Double => T,
    indexOf: T => Double,
    insert: (Double, T) => scala.Unit,
    remove: T => scala.Unit
  ): List[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), getEnumerator = js.Any.fromFunction0(getEnumerator), getEnumeratorAtPos = js.Any.fromFunction0(getEnumeratorAtPos), get_count = js.Any.fromFunction0(get_count), get_item = js.Any.fromFunction1(get_item), indexOf = js.Any.fromFunction1(indexOf), insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[List[T]]
  }
  @scala.inline
  implicit class ListOps[Self[t] <: List[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdd(value: T => scala.Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => scala.Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnumeratorAtPos(value: () => ListEnumerator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnumeratorAtPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_count(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_item(value: Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndexOf(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, T) => scala.Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: T => scala.Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

