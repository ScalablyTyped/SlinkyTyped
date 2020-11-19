package typingsSlinky.tstl.setContainerMod.SetContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Iterator of {@link SetContainer}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined std.Readonly<tstl.tstl/base/container/IContainer.IContainer.Iterator<Key, SourceT, IteratorT, ReverseT, Key>> */
@js.native
trait Iterator[Key, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  
  def next(): IteratorT = js.native
  
  def prev(): IteratorT = js.native
  
  def reverse(): ReverseT = js.native
  
  def source(): SourceT = js.native
  
  val value: Key = js.native
}
object Iterator {
  
  @scala.inline
  def apply[Key, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */](
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
  implicit class IteratorOps[Self <: Iterator[_, _, _, _, _], Key, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] (val x: Self with (Iterator[Key, Unique, SourceT, IteratorT, ReverseT])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNext(value: () => IteratorT): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => IteratorT): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverse(value: () => ReverseT): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSource(value: () => SourceT): Self = this.set("source", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: Key): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
