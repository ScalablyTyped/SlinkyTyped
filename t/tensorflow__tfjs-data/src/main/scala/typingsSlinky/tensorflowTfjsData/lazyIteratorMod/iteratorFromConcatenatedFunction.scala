package typingsSlinky.tensorflowTfjsData.lazyIteratorMod

import typingsSlinky.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "iteratorFromConcatenatedFunction")
@js.native
object iteratorFromConcatenatedFunction extends js.Object {
  def apply[T](iteratorFunc: js.Function0[IteratorResult[LazyIterator[T], _]], count: Double): LazyIterator[T] = js.native
  def apply[T](
    iteratorFunc: js.Function0[IteratorResult[LazyIterator[T], _]],
    count: Double,
    baseErrorHandler: js.Function1[/* e */ js.Error, Boolean]
  ): LazyIterator[T] = js.native
}

