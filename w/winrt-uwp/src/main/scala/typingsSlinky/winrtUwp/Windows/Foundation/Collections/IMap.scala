package typingsSlinky.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an associative collection, also known as a map or a dictionary. */
@js.native
trait IMap[K, V]
  extends IIterable[IKeyValuePair[js.Any, js.Any]] {
  /** Gets the number of items in the map. */
  var size: Double = js.native
  /** Removes all items from the map. */
  def clear(): Unit = js.native
  /**
    * Returns an immutable view of the map.
    * @return The view of the map.
    */
  def getView(): IMapView[K, V] = js.native
  /**
    * Determines whether the map contains the specified key.
    * @param key The key associated with the item to locate.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: K): Boolean = js.native
  /**
    * Inserts or replaces an item in the map.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return True if an item with the specified key is an existing item that was replaced; otherwise, false.
    */
  def insert(key: K, value: V): Boolean = js.native
  /**
    * Returns the item at the specified key in the map.
    * @param key The key associated with the item to locate.
    * @return The item associated with the specified key.
    */
  def lookup(key: K): V = js.native
  /**
    * Removes an item from the map.
    * @param key The key associated with the item to remove.
    */
  def remove(key: K): Unit = js.native
}

object IMap {
  @scala.inline
  def apply[K, V](
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    getView: () => IMapView[K, V],
    hasKey: K => Boolean,
    insert: (K, V) => Boolean,
    lookup: K => V,
    remove: K => Unit,
    size: Double
  ): IMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMap[K, V]]
  }
  @scala.inline
  implicit class IMapOps[Self[k, v] <: IMap[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetView(value: () => IMapView[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: (K, V) => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLookup(value: K => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: K => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

