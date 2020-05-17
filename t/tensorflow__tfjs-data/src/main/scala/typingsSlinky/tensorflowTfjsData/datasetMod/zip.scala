package typingsSlinky.tensorflowTfjsData.datasetMod

import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/dataset", "zip")
@js.native
object zip extends js.Object {
  def apply[O /* <: TensorContainer */](datasets: DatasetContainer): Dataset[O] = js.native
}

