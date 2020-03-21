package typingsSlinky.tensorflowTfjsLayers

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.temporal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", JSImport.Namespace)
@js.native
object trainingUtilsMod extends js.Object {
  def computeWeightedLoss(losses: Tensor_[Rank], sampleWeights: Tensor_[Rank]): Tensor_[Rank] = js.native
  def standardizeClassWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeClassWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeSampleWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  def standardizeWeights(y: Tensor_[Rank]): js.Promise[Tensor_[Rank]] = js.native
  def standardizeWeights(y: Tensor_[Rank], sampleWeight: Tensor_[Rank]): js.Promise[Tensor_[Rank]] = js.native
  def standardizeWeights(y: Tensor_[Rank], sampleWeight: Tensor_[Rank], classWeight: ClassWeight): js.Promise[Tensor_[Rank]] = js.native
  @JSName("standardizeWeights")
  def standardizeWeights_temporal(
    y: Tensor_[Rank],
    sampleWeight: Tensor_[Rank],
    classWeight: ClassWeight,
    sampleWeightMode: temporal
  ): js.Promise[Tensor_[Rank]] = js.native
  type ClassWeight = NumberDictionary[Double]
  type ClassWeightMap = StringDictionary[ClassWeight]
}

