package typingsSlinky.tstl.uniqueSetMod.UniqueSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link UniqueSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.ReverseIterator<Key, true, SourceT, IteratorT, ReverseT> */
@js.native
trait ReverseIterator[Key, SourceT /* <: typingsSlinky.tstl.uniqueSetMod.UniqueSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key = js.native
  def base(): IteratorT = js.native
  def next(): ReverseT = js.native
  def prev(): ReverseT = js.native
  def source(): SourceT = js.native
}

object ReverseIterator {
  @scala.inline
  def apply[Key, SourceT, IteratorT, ReverseT](
    base: () => IteratorT,
    next: () => ReverseT,
    prev: () => ReverseT,
    source: () => SourceT,
    value: Key
  ): ReverseIterator[Key, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[Key, SourceT, IteratorT, ReverseT]]
  }
  @scala.inline
  implicit class ReverseIteratorOps[Self[key, sourcet, iteratort, reverset] <: ReverseIterator[key, sourcet, iteratort, reverset], Key, SourceT, IteratorT, ReverseT] (val x: Self[Key, SourceT, IteratorT, ReverseT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Key, SourceT, IteratorT, ReverseT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Key, SourceT, IteratorT, ReverseT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Key, SourceT, IteratorT, ReverseT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Key, SourceT, IteratorT, ReverseT]) with Other]
    @scala.inline
    def withBase(value: () => IteratorT): Self[Key, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => ReverseT): Self[Key, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => ReverseT): Self[Key, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSource(value: () => SourceT): Self[Key, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: Key): Self[Key, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

