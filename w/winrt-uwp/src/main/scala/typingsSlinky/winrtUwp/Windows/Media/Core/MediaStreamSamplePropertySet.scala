package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties for the MediaStreamSample . */
@js.native
trait MediaStreamSamplePropertySet extends js.Object {
  /** Gets the number of items contained in the property set. */
  var size: Double = js.native
  /** Removes all items from the property set. */
  def clear(): Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, _] = js.native
  /**
    * Indicates if the specified key exists in the property set.
    * @param key The key to check.
    * @return true if the key exists; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Adds the specified key and value to the property set.
    * @param key The key to add.
    * @param value The value of the key.
    * @return True if the method replaces a value that already exists for the key; false if this is a new key.
    */
  def insert(key: String, value: js.Any): Boolean = js.native
  /**
    * Retrieves the value for the specified key.
    * @param key The key to retrieve the value for.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  def lookup(key: String): js.Any = js.native
  /**
    * Removes an item from the property set.
    * @param key The key to remove.
    */
  def remove(key: String): Unit = js.native
}

object MediaStreamSamplePropertySet {
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[_, _]],
    getView: () => IMapView[String, _],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    lookup: String => js.Any,
    remove: String => Unit,
    size: Double
  ): MediaStreamSamplePropertySet = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSamplePropertySet]
  }
  @scala.inline
  implicit class MediaStreamSamplePropertySetOps[Self <: MediaStreamSamplePropertySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetView(value: () => IMapView[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: (String, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLookup(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

