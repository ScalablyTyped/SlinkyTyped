package typingsSlinky.tstl

import typingsSlinky.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsSlinky.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typingsSlinky.tstl.itreesetMod.ITreeSet
import typingsSlinky.tstl.setElementVectorMod.SetElementVector.Iterator
import typingsSlinky.tstl.setElementVectorMod.SetElementVector.ReverseIterator
import typingsSlinky.tstl.vectorContainerMod.VectorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/container/associative/SetElementVector", JSImport.Namespace)
@js.native
object setElementVectorMod extends js.Object {
  
  @js.native
  class SetElementVector[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends VectorContainer[
          Key, 
          Source, 
          SetElementVector[Key, Unique, Source], 
          Iterator[Key, Unique, Source], 
          ReverseIterator[Key, Unique, Source]
        ] {
    def this(associative: Source) = this()
    
    var associative_ : js.Any = js.native
  }
  @js.native
  object SetElementVector extends js.Object {
    
    /**
      * Iterator of set container storing elements in a vector.
      *
      * @template Key Key type
      * @template Unique Whether duplicated key is blocked or not
      * @template Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.tstl.itreesetMod.ITreeSet.Iterator because var conflicts: value. Inlined  */ @js.native
    class Iterator[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayIteratorBase[
              Key, 
              Source, 
              SetElementVector[Key, Unique, Source], 
              Iterator[Key, Unique, Source], 
              ReverseIterator[Key, Unique, Source], 
              Key
            ]
    
    /**
      * Reverse iterator of set container storing elements in a vector.
      *
      * @template Key Key type
      * @template Unique Whether duplicated key is blocked or not
      * @template Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.tstl.itreesetMod.ITreeSet.ReverseIterator because var conflicts: value. Inlined  */ @js.native
    class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayReverseIteratorBase[
              Key, 
              Source, 
              SetElementVector[Key, Unique, Source], 
              Iterator[Key, Unique, Source], 
              ReverseIterator[Key, Unique, Source], 
              Key
            ]
  }
}
