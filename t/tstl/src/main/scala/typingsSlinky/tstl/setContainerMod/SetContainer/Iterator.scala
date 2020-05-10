package typingsSlinky.tstl.setContainerMod.SetContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link SetContainer}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined std.Readonly<tstl.tstl/base/container/IContainer.IContainer.Iterator<Key, SourceT, IteratorT, ReverseT, Key>> */
@js.native
trait Iterator[Key, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key = js.native
  def next(): IteratorT = js.native
  def prev(): IteratorT = js.native
  def reverse(): ReverseT = js.native
  def source(): SourceT = js.native
}

object Iterator {
  @scala.inline
  def apply[Key, Unique, SourceT, IteratorT, ReverseT](
    next: () => IteratorT,
    prev: () => IteratorT,
    reverse: () => ReverseT,
    source: () => SourceT,
    value: Key
  ): Iterator[Key, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), reverse = js.Any.fromFunction0(reverse), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterator[Key, Unique, SourceT, IteratorT, ReverseT]]
  }
  @scala.inline
  implicit class IteratorOps[Self[key, unique, sourcet, iteratort, reverset] <: Iterator[key, unique, sourcet, iteratort, reverset], Key, Unique, SourceT, IteratorT, ReverseT] (val x: Self[Key, Unique, SourceT, IteratorT, ReverseT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Key, Unique, SourceT, IteratorT, ReverseT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Key, Unique, SourceT, IteratorT, ReverseT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Key, Unique, SourceT, IteratorT, ReverseT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Key, Unique, SourceT, IteratorT, ReverseT]) with Other]
    @scala.inline
    def withNext(value: () => IteratorT): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => IteratorT): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReverse(value: () => ReverseT): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSource(value: () => SourceT): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: Key): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

