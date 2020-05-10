package typingsSlinky.tstl.idequecontainerMod.IDequeContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link IDequeContainer}.
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined tstl.tstl/base/container/ILinearContainer.ILinearContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, ElemT> */
@js.native
trait ReverseIterator[T /* <: ElemT */, SourceT /* <: typingsSlinky.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] extends js.Object {
  val value: T = js.native
  def base(): IteratorT = js.native
  def next(): ReverseT = js.native
  def prev(): ReverseT = js.native
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): SourceT = js.native
}

object ReverseIterator {
  @scala.inline
  def apply[T, SourceT, IteratorT, ReverseT, ElemT](base: () => IteratorT, next: () => ReverseT, prev: () => ReverseT, source: () => SourceT, value: T): ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT]]
  }
  @scala.inline
  implicit class ReverseIteratorOps[Self[t, sourcet, iteratort, reverset, elemt] <: ReverseIterator[t, sourcet, iteratort, reverset, elemt], T, SourceT, IteratorT, ReverseT, ElemT] (val x: Self[T, SourceT, IteratorT, ReverseT, ElemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, SourceT, IteratorT, ReverseT, ElemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, SourceT, IteratorT, ReverseT, ElemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, SourceT, IteratorT, ReverseT, ElemT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, SourceT, IteratorT, ReverseT, ElemT]) with Other]
    @scala.inline
    def withBase(value: () => IteratorT): Self[T, SourceT, IteratorT, ReverseT, ElemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => ReverseT): Self[T, SourceT, IteratorT, ReverseT, ElemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => ReverseT): Self[T, SourceT, IteratorT, ReverseT, ElemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSource(value: () => SourceT): Self[T, SourceT, IteratorT, ReverseT, ElemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T, SourceT, IteratorT, ReverseT, ElemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

