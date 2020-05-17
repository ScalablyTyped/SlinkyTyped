package typingsSlinky.winrtUwp.Windows.Storage.Pickers

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of display names mapped to the associated file types (extensions). Each element in this collection maps a display name to a corresponding collection of file name extensions. The key is a single string, the value is a list/vector of strings representing one or more extension choices. */
@js.native
trait FilePickerFileTypesOrderedMap extends js.Object {
  /** Gets the number of items in the mapped collection of display names and associated file types. */
  var size: Double = js.native
  /** Removes all display names and associated file name extensions from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator that iterates through the display names and associated file types in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the collection of display names and associated file types.
    * @return The view of the collection.
    */
  def getView(): IMapView[String, IVector[String]] = js.native
  /**
    * Determines whether the mapped collection of display names and associated file types contains the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Inserts or replaces an item in the mapped collection of display names and associated file types.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return true if an item with the specified key is an existing item and was replaced; otherwise false.
    */
  def insert(key: String, value: IVector[String]): Boolean = js.native
  /**
    * Returns the item at the specified key in the mapped collection of display names and associated file types.
    * @param key The key to use to locate the item.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): IVector[String] = js.native
  /**
    * Removes an item from the mapped collection of display names and associated file types.
    * @param key The key associated with the item to remove.
    */
  def remove(key: String): Unit = js.native
}

object FilePickerFileTypesOrderedMap {
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[_, _]],
    getView: () => IMapView[String, IVector[String]],
    hasKey: String => Boolean,
    insert: (String, IVector[String]) => Boolean,
    lookup: String => IVector[String],
    remove: String => Unit,
    size: Double
  ): FilePickerFileTypesOrderedMap = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerFileTypesOrderedMap]
  }
  @scala.inline
  implicit class FilePickerFileTypesOrderedMapOps[Self <: FilePickerFileTypesOrderedMap] (val x: Self) extends AnyVal {
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
    def withGetView(value: () => IMapView[String, IVector[String]]): Self = {
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
    def withInsert(value: (String, IVector[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLookup(value: String => IVector[String]): Self = {
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

