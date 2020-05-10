package typingsSlinky.winrtUwp.Windows.Foundation.Collections

import typingsSlinky.winrtUwp.AnonItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports simple iteration over a collection. */
@js.native
trait IIterator[T] extends js.Object {
  /** Gets the current item in the collection. */
  var current: T = js.native
  /** Gets a value that indicates whether the iterator refers to a current item or is at the end of the collection. */
  var hasCurrent: Boolean = js.native
  /**
    * Retrieves all items in the collection.
    */
  def getMany(): AnonItems[T] = js.native
  /**
    * Advances the iterator to the next item in the collection.
    * @return True if the iterator refers to a valid item in the collection; false if the iterator passes the end of the collection.
    */
  def moveNext(): Boolean = js.native
}

object IIterator {
  @scala.inline
  def apply[T](current: T, getMany: () => AnonItems[T], hasCurrent: Boolean, moveNext: () => Boolean): IIterator[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[IIterator[T]]
  }
  @scala.inline
  implicit class IIteratorOps[Self[t] <: IIterator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMany(value: () => AnonItems[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMany")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasCurrent(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

