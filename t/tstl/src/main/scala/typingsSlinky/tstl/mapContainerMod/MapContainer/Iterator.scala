package typingsSlinky.tstl.mapContainerMod.MapContainer

import typingsSlinky.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.IteratorBase<Key, T> & std.Readonly<tstl.tstl/base/container/IContainer.IContainer.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, SourceT, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>> */
@js.native
trait Iterator[Key, T, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key = js.native
  /**
    * The second, stored element.
    */
  var second: T = js.native
  val value: Entry[Key, T] = js.native
  def next(): IteratorT = js.native
  def prev(): IteratorT = js.native
  def reverse(): ReverseT = js.native
  def source(): SourceT = js.native
}

object Iterator {
  @scala.inline
  def apply[Key, T, Unique, SourceT, IteratorT, ReverseT](
    first: Key,
    next: () => IteratorT,
    prev: () => IteratorT,
    reverse: () => ReverseT,
    second: T,
    source: () => SourceT,
    value: Entry[Key, T]
  ): Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), reverse = js.Any.fromFunction0(reverse), second = second.asInstanceOf[js.Any], source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT]]
  }
  @scala.inline
  implicit class IteratorOps[Self[key, t, unique, sourcet, iteratort, reverset] <: Iterator[key, t, unique, sourcet, iteratort, reverset], Key, T, Unique, SourceT, IteratorT, ReverseT] (val x: Self[Key, T, Unique, SourceT, IteratorT, ReverseT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Key, T, Unique, SourceT, IteratorT, ReverseT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Key, T, Unique, SourceT, IteratorT, ReverseT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Key, T, Unique, SourceT, IteratorT, ReverseT]) with Other]
    @scala.inline
    def withFirst(value: Key): Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: () => IteratorT): Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => IteratorT): Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReverse(value: () => ReverseT): Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: T): Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: () => SourceT): Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: Entry[Key, T]): Self[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

