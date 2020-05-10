package typingsSlinky.tstl.icontainerMod.IContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link IContainer}
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined parent std.Readonly<tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, IteratorT, ReverseT>> */
@js.native
trait ReverseIterator[T /* <: Elem */, Source /* <: typingsSlinky.tstl.icontainerMod.IContainer[T, Source, IteratorT, ReverseT, Elem] */, IteratorT /* <: Iterator[T, Source, IteratorT, ReverseT, Elem] */, ReverseT /* <: ReverseIterator[T, Source, IteratorT, ReverseT, Elem] */, Elem] extends js.Object {
  val value: T = js.native
  def base(): IteratorT = js.native
  def next(): ReverseT = js.native
  def prev(): ReverseT = js.native
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): Source = js.native
}

object ReverseIterator {
  @scala.inline
  def apply[T, Source, IteratorT, ReverseT, Elem](base: () => IteratorT, next: () => ReverseT, prev: () => ReverseT, source: () => Source, value: T): ReverseIterator[T, Source, IteratorT, ReverseT, Elem] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[T, Source, IteratorT, ReverseT, Elem]]
  }
  @scala.inline
  implicit class ReverseIteratorOps[Self[t, source, iteratort, reverset, elem] <: ReverseIterator[t, source, iteratort, reverset, elem], T, Source, IteratorT, ReverseT, Elem] (val x: Self[T, Source, IteratorT, ReverseT, Elem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Source, IteratorT, ReverseT, Elem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Source, IteratorT, ReverseT, Elem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Source, IteratorT, ReverseT, Elem]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Source, IteratorT, ReverseT, Elem]) with Other]
    @scala.inline
    def withBase(value: () => IteratorT): Self[T, Source, IteratorT, ReverseT, Elem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => ReverseT): Self[T, Source, IteratorT, ReverseT, Elem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => ReverseT): Self[T, Source, IteratorT, ReverseT, Elem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSource(value: () => Source): Self[T, Source, IteratorT, ReverseT, Elem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T, Source, IteratorT, ReverseT, Elem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

