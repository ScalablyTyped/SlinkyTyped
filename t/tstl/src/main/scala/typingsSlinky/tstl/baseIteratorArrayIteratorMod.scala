package typingsSlinky.tstl

import typingsSlinky.tstl.baseContainerArrayContainerMod.ArrayContainer
import typingsSlinky.tstl.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typingsSlinky.tstl.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/ArrayIterator", JSImport.Namespace)
@js.native
object baseIteratorArrayIteratorMod extends js.Object {
  @js.native
  class ArrayIterator[T, SourceT /* <: ArrayContainer[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T] */] () extends ArrayIteratorBase[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T]
  
  @js.native
  class ArrayReverseIterator[T, SourceT /* <: ArrayContainer[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T] */] () extends ArrayReverseIteratorBase[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T]
  
}

