package typingsSlinky.tensorflowTfjsData.lazyIteratorMod

import typingsSlinky.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "iteratorFromFunction")
@js.native
object iteratorFromFunction extends js.Object {
  def apply[T](func: js.Function0[(IteratorResult[T, _]) | (js.Promise[IteratorResult[T, _]])]): LazyIterator[T] = js.native
}

