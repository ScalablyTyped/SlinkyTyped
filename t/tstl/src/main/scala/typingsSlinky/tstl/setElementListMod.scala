package typingsSlinky.tstl

import typingsSlinky.tstl.listContainerMod.ListContainer
import typingsSlinky.tstl.listIteratorMod.ListIterator
import typingsSlinky.tstl.setContainerMod.SetContainer
import typingsSlinky.tstl.setElementListMod.SetElementList.Iterator
import typingsSlinky.tstl.setElementListMod.SetElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/SetElementList", JSImport.Namespace)
@js.native
object setElementListMod extends js.Object {
  @js.native
  class SetElementList[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends ListContainer[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  @js.native
  object SetElementList extends js.Object {
    /**
      * Iterator of set container storing elements in a list.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsSlinky.tstl.setContainerMod.SetContainer.Iterator because var conflicts: value. Inlined  */ @js.native
    class Iterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends ListIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key] {
      var source_ : js.Any = js.native
    }
    
    /**
      * Reverser iterator of set container storing elements in a list.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsSlinky.tstl.setContainerMod.SetContainer.ReverseIterator because var conflicts: value. Inlined  */ @js.native
    class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] ()
      extends typingsSlinky.tstl.reverseIteratorMod.ReverseIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key]
    
  }
  
}

