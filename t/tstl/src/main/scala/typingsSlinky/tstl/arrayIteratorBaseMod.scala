package typingsSlinky.tstl

import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typingsSlinky.tstl.icontainerMod.IContainer
import typingsSlinky.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayIteratorBase", JSImport.Namespace)
@js.native
object arrayIteratorBaseMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.icontainerMod.IContainer.Iterator because var conflicts: value. Inlined source, reverse */ @js.native
  abstract class ArrayIteratorBase[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] protected () extends IRandomAccessIterator[T, IteratorT] {
    /**
      * Initializer Constructor.
      *
      * @param source Source container.
      * @param index Index number.
      */
    def this(array: ArrayT, index: Double) = this()
    var array_ : js.Any = js.native
    var index_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    /**
      * @inheritDoc
      */
    def reverse(): ReverseT = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get source container.
      *
      * @return The source container.
      */
    def source(): SourceT = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MArrayIteratorBase(): T = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MArrayIteratorBase(`val`: T): js.Any = js.native
  }
  
}

