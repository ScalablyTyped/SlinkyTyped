package typingsSlinky.tstl.ibidirectionalcontainerMod

import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.ireversableiteratorMod.IReversableIterator
import typingsSlinky.tstl.ireverseiteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBidirectionalContainer_[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */] extends IForwardContainer[IteratorT] {
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  def rbegin(): ReverseIteratorT = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  def rend(): ReverseIteratorT = js.native
}

object IBidirectionalContainer_ {
  @scala.inline
  def apply[IteratorT, ReverseIteratorT](
    begin: () => IteratorT,
    end: () => IteratorT,
    rbegin: () => ReverseIteratorT,
    rend: () => ReverseIteratorT,
    size: () => Double
  ): IBidirectionalContainer_[IteratorT, ReverseIteratorT] = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), rbegin = js.Any.fromFunction0(rbegin), rend = js.Any.fromFunction0(rend), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[IBidirectionalContainer_[IteratorT, ReverseIteratorT]]
  }
  @scala.inline
  implicit class IBidirectionalContainer_Ops[Self[iteratort, reverseiteratort] <: IBidirectionalContainer_[iteratort, reverseiteratort], IteratorT, ReverseIteratorT] (val x: Self[IteratorT, ReverseIteratorT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[IteratorT, ReverseIteratorT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[IteratorT, ReverseIteratorT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[IteratorT, ReverseIteratorT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[IteratorT, ReverseIteratorT]) with Other]
    @scala.inline
    def withRbegin(value: () => ReverseIteratorT): Self[IteratorT, ReverseIteratorT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbegin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRend(value: () => ReverseIteratorT): Self[IteratorT, ReverseIteratorT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rend")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

