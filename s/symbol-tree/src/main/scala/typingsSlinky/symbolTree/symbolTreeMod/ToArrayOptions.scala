package typingsSlinky.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToArrayOptions[T /* <: js.Object */] extends js.Object {
  /**
  		 * The array to initialize the operation with.
  		 *
  		 * @default
  		 * ```ts
  		 * new Array(0);
  		 * ```
  		 */
  var array: js.UndefOr[js.Array[T]] = js.native
  /**
  		 * Function to test each object before it is added to the array.
  		 * Invoked with arguments (object).
  		 *
  		 * Should return `true` if an object is to be included.
  		 *
  		 * @param object
  		 */
  var filter: js.UndefOr[js.Function1[/* object */ T, _]] = js.native
  /** Value to use as `this` when executing `filter`. */
  var thisArg: js.UndefOr[js.Any] = js.native
}

object ToArrayOptions {
  @scala.inline
  def apply[T](): ToArrayOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToArrayOptions[T]]
  }
  @scala.inline
  implicit class ToArrayOptionsOps[Self[t] <: ToArrayOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withArray(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArray: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* object */ T => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withThisArg(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisArg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThisArg: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisArg")(js.undefined)
        ret
    }
  }
  
}

