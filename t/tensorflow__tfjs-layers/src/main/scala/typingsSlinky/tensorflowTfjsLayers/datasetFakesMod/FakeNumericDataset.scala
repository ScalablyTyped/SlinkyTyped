package typingsSlinky.tensorflowTfjsLayers.datasetFakesMod

import typingsSlinky.tensorflowTfjsLayers.datasetStubMod.Dataset
import typingsSlinky.tensorflowTfjsLayers.trainingDatasetMod.FitDatasetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_fakes", "FakeNumericDataset")
@js.native
class FakeNumericDataset protected () extends Dataset[FitDatasetElement] {
  def this(args: FakeDatasetArgs) = this()
  
  val args: FakeDatasetArgs = js.native
}
