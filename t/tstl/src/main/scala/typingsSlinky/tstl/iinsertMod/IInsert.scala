package typingsSlinky.tstl.iinsertMod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInsert[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends js.Object {
  def insert(it: Iterator, value: ValueType[Iterator]): Iterator = js.native
}

object IInsert {
  @scala.inline
  def apply[Iterator](insert: (Iterator, ValueType[Iterator]) => Iterator): IInsert[Iterator] = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert))
    __obj.asInstanceOf[IInsert[Iterator]]
  }
  @scala.inline
  implicit class IInsertOps[Self[iterator] <: IInsert[iterator], Iterator] (val x: Self[Iterator]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Iterator] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Iterator]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Iterator] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Iterator] with Other]
    @scala.inline
    def withInsert(value: (Iterator, ValueType[Iterator]) => Iterator): Self[Iterator] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

