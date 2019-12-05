package typingsSlinky.atTensorflowTfjsDashLayers

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.temporal
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreUtilsMod.ClassWeight
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreUtilsMod.ClassWeightMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", JSImport.Namespace)
@js.native
object distEngineTrainingUnderscoreUtilsMod extends js.Object {
  def computeWeightedLoss(losses: Tensor[Rank], sampleWeights: Tensor[Rank]): Tensor[Rank] = js.native
  def standardizeClassWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeWeights(y: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight): js.Promise[Tensor[Rank]] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = js.native
  type ClassWeight = NumberDictionary[Double]
  type ClassWeightMap = StringDictionary[ClassWeight]
}

