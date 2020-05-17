package typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.anon.FirstIMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An unchangeable view into a map of ResourceMap objects. */
@js.native
trait ResourceMapMapView extends js.Object {
  /** Gets the number of ResourceMap objects in the map. */
  var size: Double = js.native
  /**
    * Returns an iterator to enumerate the items in the map view.
    * @return The iterator. The current position of the iterator is index 0, or the end of the map if the map is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return TRUE if the key is found, otherwise FALSE if it is not found.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Returns the ResourceMap at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The ResourceMap associated with the specified key.
    */
  def lookup(key: String): ResourceMap = js.native
  /**
    * Splits the map view into two views.
    */
  def split(): FirstIMapView = js.native
}

object ResourceMapMapView {
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    lookup: String => ResourceMap,
    size: Double,
    split: () => FirstIMapView
  ): ResourceMapMapView = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[ResourceMapMapView]
  }
  @scala.inline
  implicit class ResourceMapMapViewOps[Self <: ResourceMapMapView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLookup(value: String => ResourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: () => FirstIMapView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

