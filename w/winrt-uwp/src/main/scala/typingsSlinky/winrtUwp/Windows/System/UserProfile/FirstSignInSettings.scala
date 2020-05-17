package typingsSlinky.winrtUwp.Windows.System.UserProfile

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.anon.Second
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of settings that a user can opt-in to during the first run experience. */
@js.native
trait FirstSignInSettings extends js.Object {
  /** Returns the number of elements in the map. */
  var size: Double = js.native
  /**
    * Returns an iterator for the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Returns the item in the map view with the specified key.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): js.Any = js.native
  /**
    * Splits the map view into two views.
    */
  def split(): Second = js.native
}

object FirstSignInSettings {
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    lookup: String => js.Any,
    size: Double,
    split: () => Second
  ): FirstSignInSettings = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[FirstSignInSettings]
  }
  @scala.inline
  implicit class FirstSignInSettingsOps[Self <: FirstSignInSettings] (val x: Self) extends AnyVal {
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
    def withLookup(value: String => js.Any): Self = {
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
    def withSplit(value: () => Second): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

