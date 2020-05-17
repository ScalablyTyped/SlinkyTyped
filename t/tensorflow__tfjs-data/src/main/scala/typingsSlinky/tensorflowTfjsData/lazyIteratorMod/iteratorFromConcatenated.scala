package typingsSlinky.tensorflowTfjsData.lazyIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "iteratorFromConcatenated")
@js.native
object iteratorFromConcatenated extends js.Object {
  def apply[T](baseIterators: LazyIterator[LazyIterator[T]]): LazyIterator[T] = js.native
  def apply[T](
    baseIterators: LazyIterator[LazyIterator[T]],
    baseErrorHandler: js.Function1[/* e */ js.Error, Boolean]
  ): LazyIterator[T] = js.native
}

