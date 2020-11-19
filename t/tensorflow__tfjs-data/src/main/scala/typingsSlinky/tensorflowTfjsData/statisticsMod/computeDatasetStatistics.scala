package typingsSlinky.tensorflowTfjsData.statisticsMod

import typingsSlinky.tensorflowTfjsData.datasetMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-data/dist/statistics", "computeDatasetStatistics")
@js.native
object computeDatasetStatistics extends js.Object {
  
  def apply(dataset: Dataset[TabularRecord]): js.Promise[DatasetStatistics] = js.native
  def apply(dataset: Dataset[TabularRecord], sampleSize: js.UndefOr[scala.Nothing], shuffleWindowSize: Double): js.Promise[DatasetStatistics] = js.native
  def apply(dataset: Dataset[TabularRecord], sampleSize: Double): js.Promise[DatasetStatistics] = js.native
  def apply(dataset: Dataset[TabularRecord], sampleSize: Double, shuffleWindowSize: Double): js.Promise[DatasetStatistics] = js.native
}
