package typingsSlinky.tensorflowTfjsData.datasetMod

import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/dataset", "array")
@js.native
object array extends js.Object {
  def apply[T /* <: TensorContainer */](items: js.Array[T]): Dataset[T] = js.native
}

