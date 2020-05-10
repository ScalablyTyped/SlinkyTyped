package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider[T /* <: SlickData */] extends js.Object {
  /**
  		 * Returns the metadata for the item at a given index (optional).
  		 * @param index
  		 */
  var getItemMetadata: js.UndefOr[js.Function1[/* index */ Double, RowMetadata[T]]] = js.native
  /**
  		 * Returns the item at a given index.
  		 * @param index
  		 */
  def getItem(index: Double): T = js.native
  /**
  		 * Returns the number of data items in the set.
  		 */
  def getLength(): Double = js.native
}

object DataProvider {
  @scala.inline
  def apply[T](getItem: Double => T, getLength: () => Double): DataProvider[T] = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getLength = js.Any.fromFunction0(getLength))
    __obj.asInstanceOf[DataProvider[T]]
  }
  @scala.inline
  implicit class DataProviderOps[Self[t] <: DataProvider[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetItem(value: Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemMetadata(value: /* index */ Double => RowMetadata[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemMetadata: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemMetadata")(js.undefined)
        ret
    }
  }
  
}

