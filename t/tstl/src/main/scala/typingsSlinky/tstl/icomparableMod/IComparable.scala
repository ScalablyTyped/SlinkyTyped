package typingsSlinky.tstl.icomparableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComparable[T] extends js.Object {
  /**
    * Test whether less than some object.
    *
    * @param obj The object to compare.
    * @return Whether less or not.
    */
  def less(obj: T): Boolean = js.native
}

object IComparable {
  @scala.inline
  def apply[T](less: T => Boolean): IComparable[T] = {
    val __obj = js.Dynamic.literal(less = js.Any.fromFunction1(less))
    __obj.asInstanceOf[IComparable[T]]
  }
  @scala.inline
  implicit class IComparableOps[Self[t] <: IComparable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLess(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

