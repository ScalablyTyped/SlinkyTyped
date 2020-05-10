package typingsSlinky.tstl.itreesetMod.ITreeSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link ITreeSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.ReverseIterator<Key, Unique, SourceT, IteratorT, ReverseT> */
@js.native
trait ReverseIterator[Key, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key = js.native
  def base(): IteratorT = js.native
  def next(): ReverseT = js.native
  def prev(): ReverseT = js.native
  def source(): SourceT = js.native
}

object ReverseIterator {
  @scala.inline
  def apply[Key, Unique, SourceT, IteratorT, ReverseT](
    base: () => IteratorT,
    next: () => ReverseT,
    prev: () => ReverseT,
    source: () => SourceT,
    value: Key
  ): ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT]]
  }
  @scala.inline
  implicit class ReverseIteratorOps[Self[key, unique, sourcet, iteratort, reverset] <: ReverseIterator[key, unique, sourcet, iteratort, reverset], Key, Unique, SourceT, IteratorT, ReverseT] (val x: Self[Key, Unique, SourceT, IteratorT, ReverseT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Key, Unique, SourceT, IteratorT, ReverseT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Key, Unique, SourceT, IteratorT, ReverseT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Key, Unique, SourceT, IteratorT, ReverseT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Key, Unique, SourceT, IteratorT, ReverseT]) with Other]
    @scala.inline
    def withBase(value: () => IteratorT): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => ReverseT): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => ReverseT): Self[Key, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
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

