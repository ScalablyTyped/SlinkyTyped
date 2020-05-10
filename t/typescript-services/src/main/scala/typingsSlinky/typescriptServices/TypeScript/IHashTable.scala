package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashTable[T] extends js.Object {
  def add(key: String, data: T): Boolean = js.native
  def addOrUpdate(key: String, data: T): Boolean = js.native
  def count(): Double = js.native
  def every(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
  def getAllKeys(): js.Array[String] = js.native
  def lookup(key: String): T = js.native
  def map(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Unit = js.native
  def some(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
}

object IHashTable {
  @scala.inline
  def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: () => Double,
    every: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean,
    getAllKeys: () => js.Array[String],
    lookup: String => T,
    map: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Unit,
    some: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean
  ): IHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = js.Any.fromFunction0(count), every = js.Any.fromFunction2(every), getAllKeys = js.Any.fromFunction0(getAllKeys), lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2(map), some = js.Any.fromFunction2(some))
    __obj.asInstanceOf[IHashTable[T]]
  }
  @scala.inline
  implicit class IHashTableOps[Self[t] <: IHashTable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdd(value: (String, T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddOrUpdate(value: (String, T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvery(
      value: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAllKeys(value: () => js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLookup(value: String => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMap(value: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSome(
      value: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("some")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

