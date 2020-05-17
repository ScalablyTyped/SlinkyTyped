package typingsSlinky.typescriptServices.TypeScript.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashTable[TKey, TValue] extends js.Object {
  var count: js.Any = js.native
  var entries: js.Any = js.native
  var hash: js.Any = js.native
  def add(key: TKey, value: TValue): Unit = js.native
  /* private */ def addEntry(key: js.Any, value: js.Any, hashCode: js.Any): js.Any = js.native
  /* private */ def addOrSet(key: js.Any, value: js.Any, throwOnExistingEntry: js.Any): js.Any = js.native
  /* private */ def computeHashCode(key: js.Any): js.Any = js.native
  def containsKey(key: TKey): Boolean = js.native
  /* private */ def findEntry(key: js.Any, hashCode: js.Any): js.Any = js.native
  def get(key: TKey): TValue = js.native
  /* private */ def grow(): js.Any = js.native
  def set(key: TKey, value: TValue): Unit = js.native
}

object HashTable {
  @scala.inline
  def apply[TKey, TValue](
    add: (TKey, TValue) => Unit,
    addEntry: (js.Any, js.Any, js.Any) => js.Any,
    addOrSet: (js.Any, js.Any, js.Any) => js.Any,
    computeHashCode: js.Any => js.Any,
    containsKey: TKey => Boolean,
    count: js.Any,
    entries: js.Any,
    findEntry: (js.Any, js.Any) => js.Any,
    get: TKey => TValue,
    grow: () => js.Any,
    hash: js.Any,
    set: (TKey, TValue) => Unit
  ): HashTable[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addEntry = js.Any.fromFunction3(addEntry), addOrSet = js.Any.fromFunction3(addOrSet), computeHashCode = js.Any.fromFunction1(computeHashCode), containsKey = js.Any.fromFunction1(containsKey), count = count.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], findEntry = js.Any.fromFunction2(findEntry), get = js.Any.fromFunction1(get), grow = js.Any.fromFunction0(grow), hash = hash.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[HashTable[TKey, TValue]]
  }
  @scala.inline
  implicit class HashTableOps[Self[tkey, tvalue] <: HashTable[tkey, tvalue], TKey, TValue] (val x: Self[TKey, TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TValue]) with Other]
    @scala.inline
    def withAdd(value: (TKey, TValue) => Unit): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddEntry(value: (js.Any, js.Any, js.Any) => js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEntry")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddOrSet(value: (js.Any, js.Any, js.Any) => js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrSet")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withComputeHashCode(value: js.Any => js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeHashCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsKey(value: TKey => Boolean): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindEntry(value: (js.Any, js.Any) => js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findEntry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: TKey => TValue): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGrow(value: () => js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHash(value: js.Any): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (TKey, TValue) => Unit): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

