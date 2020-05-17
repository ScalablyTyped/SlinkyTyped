package typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.anon.ItemsIKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports iteration over a ResourceMap . */
@js.native
trait ResourceMapIterator extends js.Object {
  /** Gets the current item in the ResourceMap . */
  var current: IKeyValuePair[String, NamedResource] = js.native
  /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMap . */
  var hasCurrent: Boolean = js.native
  /**
    * Returns all the items in the ResourceMap .
    */
  def getMany(): ItemsIKeyValuePair = js.native
  /**
    * Moves the iterator forward to the next item and returns HasCurrent .
    * @return TRUE if the iterator refers to a valid item that is in the map, and otherwise FALSE.
    */
  def moveNext(): Boolean = js.native
}

object ResourceMapIterator {
  @scala.inline
  def apply(
    current: IKeyValuePair[String, NamedResource],
    getMany: () => ItemsIKeyValuePair,
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): ResourceMapIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[ResourceMapIterator]
  }
  @scala.inline
  implicit class ResourceMapIteratorOps[Self <: ResourceMapIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: IKeyValuePair[String, NamedResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMany(value: () => ItemsIKeyValuePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMany")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

