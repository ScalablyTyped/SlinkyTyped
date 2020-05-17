package typingsSlinky.tensorflowTfjsData.datasetMod

import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typingsSlinky.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/dataset", "datasetFromIteratorFn")
@js.native
object datasetFromIteratorFn extends js.Object {
  def apply[T /* <: TensorContainer */](iteratorFn: js.Function0[js.Promise[LazyIterator[T]]]): Dataset[T] = js.native
  def apply[T /* <: TensorContainer */](iteratorFn: js.Function0[js.Promise[LazyIterator[T]]], size: Double): Dataset[T] = js.native
}

