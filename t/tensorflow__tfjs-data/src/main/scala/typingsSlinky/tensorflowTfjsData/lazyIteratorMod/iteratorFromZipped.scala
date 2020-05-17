package typingsSlinky.tensorflowTfjsData.lazyIteratorMod

import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "iteratorFromZipped")
@js.native
object iteratorFromZipped extends js.Object {
  def apply[O /* <: TensorContainer */](iterators: IteratorContainer): LazyIterator[O] = js.native
  def apply[O /* <: TensorContainer */](iterators: IteratorContainer, mismatchMode: ZipMismatchMode): LazyIterator[O] = js.native
}

