package typingsSlinky.tstl

import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsSlinky.tstl.icontainerMod.IContainer
import typingsSlinky.tstl.reverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayReverseIteratorBase", JSImport.Namespace)
@js.native
object arrayReverseIteratorBaseMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator because var conflicts: value. Inlined equals_Original
  - typingsSlinky.tstl.ibidirectionaliteratorMod.IBidirectionalIterator because var conflicts: value. Inlined 
  - typingsSlinky.tstl.irandomaccessiteratorMod.IRandomAccessIterator because var conflicts: value. Inlined index, advance */ @js.native
  abstract class ArrayReverseIteratorBase[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] () extends ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] {
    @JSName("equals")
    var equals_Original: js.Function1[ReverseT, Boolean] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Advance iterator.
      *
      * @param n Step to advance.
      * @return The advanced iterator.
      */
    def advance(n: Double): ReverseT = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get index.
      *
      * @return The index.
      */
    def index(): Double = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MArrayReverseIteratorBase(): T = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MArrayReverseIteratorBase(`val`: T): js.Any = js.native
  }
  
}

