package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.ipairMod.IPair
import typingsSlinky.tstl.multiMapMod.MultiMap
import typingsSlinky.tstl.multiMapMod.MultiMap.Iterator
import typingsSlinky.tstl.multiMapMod.MultiMap.ReverseIterator
import typingsSlinky.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/container/associative/MultiTreeMap", JSImport.Namespace)
@js.native
object multiTreeMapMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.isizeMod.ISize because Already inherited
  - typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsSlinky.tstl.ipushMod.IPush because Already inherited
  - typingsSlinky.tstl.iemptyMod.IEmpty because Already inherited
  - typingsSlinky.std.Iterable because Already inherited
  - typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsSlinky.tstl.icontainerMod.IContainer because Already inherited
  - typingsSlinky.tstl.iassociativecontainerMod.IAssociativeContainer because Already inherited
  - typingsSlinky.tstl.itreecontainerMod.ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @js.native
  abstract class MultiTreeMap[Key, T, Source /* <: MultiTreeMap[Key, T, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Source, IteratorT, ReverseT] */] () extends MultiMap[Key, T, Source, IteratorT, ReverseT] {
    
    /**
      * @inheritDoc
      */
    /**
      * Get range of equal elements.
      *
      * @param key Key to search for.
      * @return Pair of {@link lower_bound} and {@link upper_bound}.
      */
    def equal_range(key: Key): Pair[IteratorT, IteratorT] = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Get key comparison function.
      *
      * @return The key comparison function.
      */
    def key_comp(): Comparator[Key, Key] = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Get iterator to lower bound.
      *
      * @param key Key to search for.
      * @return Iterator to the first element equal or after to the key.
      */
    def lower_bound(key: Key): IteratorT = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Get iterator to upper bound.
      *
      * @param key Key to search for.
      * @return Iterator to the first element after the key.
      */
    def upper_bound(key: Key): IteratorT = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Get value comparison function.
      *
      * @return The value comparison function.
      */
    def value_comp(): Comparator[IPair[Key, T], IPair[Key, T]] = js.native
  }
}
