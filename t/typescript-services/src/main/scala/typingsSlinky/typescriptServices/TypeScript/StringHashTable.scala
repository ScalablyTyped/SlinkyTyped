package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringHashTable[T] extends IHashTable[T] {
  var itemCount: js.Any = js.native
  var table: js.Any = js.native
  def remove(key: String): Unit = js.native
}

object StringHashTable {
  @scala.inline
  def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: () => Double,
    every: (js.Function3[/* k */ String, T, /* context */ js.Any, Unit], js.Any) => Boolean,
    getAllKeys: () => js.Array[String],
    itemCount: js.Any,
    lookup: String => T,
    map: (js.Function3[/* k */ String, T, /* context */ js.Any, Unit], js.Any) => Unit,
    remove: String => Unit,
    some: (js.Function3[/* k */ String, T, /* context */ js.Any, Unit], js.Any) => Boolean,
    table: js.Any
  ): StringHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = js.Any.fromFunction0(count), every = js.Any.fromFunction2(every), getAllKeys = js.Any.fromFunction0(getAllKeys), itemCount = itemCount.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2(map), remove = js.Any.fromFunction1(remove), some = js.Any.fromFunction2(some), table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringHashTable[T]]
  }
  @scala.inline
  implicit class StringHashTableOps[Self[t] <: StringHashTable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withItemCount(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTable(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

