package typingsSlinky.tstl

import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsSlinky.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/iterator/ArrayIterator", JSImport.Namespace)
@js.native
object arrayIteratorMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.iarraycontainerMod.IArrayContainer.Iterator because var conflicts: equals_Original, value. Inlined  */ @js.native
  class ArrayIterator[T, SourceT /* <: ArrayContainer[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T] */] () extends ArrayIteratorBase[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T]
}
