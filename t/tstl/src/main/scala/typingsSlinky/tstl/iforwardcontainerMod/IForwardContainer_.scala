package typingsSlinky.tstl.iforwardcontainerMod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IForwardContainer_[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends ISize {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  def begin(): Iterator = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  def end(): Iterator = js.native
}

object IForwardContainer_ {
  @scala.inline
  def apply[Iterator](begin: () => Iterator, end: () => Iterator, size: () => Double): IForwardContainer_[Iterator] = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[IForwardContainer_[Iterator]]
  }
  @scala.inline
  implicit class IForwardContainer_Ops[Self[iterator] <: IForwardContainer_[iterator], Iterator] (val x: Self[Iterator]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Iterator] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Iterator]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Iterator] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Iterator] with Other]
    @scala.inline
    def withBegin(value: () => Iterator): Self[Iterator] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Iterator): Self[Iterator] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

