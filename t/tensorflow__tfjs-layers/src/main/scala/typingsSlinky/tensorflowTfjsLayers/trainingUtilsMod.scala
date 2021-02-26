package typingsSlinky.tensorflowTfjsLayers

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trainingUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "computeWeightedLoss")
  @js.native
  def computeWeightedLoss(losses: Tensor[Rank], sampleWeights: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeClassWeights")
  @js.native
  def standardizeClassWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeClassWeights")
  @js.native
  def standardizeClassWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeClassWeights")
  @js.native
  def standardizeClassWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeSampleWeights")
  @js.native
  def standardizeSampleWeights(classWeight: js.Array[ClassWeight], outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeSampleWeights")
  @js.native
  def standardizeSampleWeights(classWeight: ClassWeightMap, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeSampleWeights")
  @js.native
  def standardizeSampleWeights(classWeight: ClassWeight, outputNames: js.Array[String]): js.Array[ClassWeight] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights(y: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: js.UndefOr[scala.Nothing], classWeight: ClassWeight): js.Promise[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight): js.Promise[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights_temporal(
    y: Tensor[Rank],
    sampleWeight: js.UndefOr[scala.Nothing],
    classWeight: js.UndefOr[scala.Nothing],
    sampleWeightMode: temporal
  ): js.Promise[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights_temporal(
    y: Tensor[Rank],
    sampleWeight: js.UndefOr[scala.Nothing],
    classWeight: ClassWeight,
    sampleWeightMode: temporal
  ): js.Promise[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights_temporal(
    y: Tensor[Rank],
    sampleWeight: Tensor[Rank],
    classWeight: js.UndefOr[scala.Nothing],
    sampleWeightMode: temporal
  ): js.Promise[Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_utils", "standardizeWeights")
  @js.native
  def standardizeWeights_temporal(y: Tensor[Rank], sampleWeight: Tensor[Rank], classWeight: ClassWeight, sampleWeightMode: temporal): js.Promise[Tensor[Rank]] = js.native
  
  type ClassWeight = NumberDictionary[Double]
  
  type ClassWeightMap = StringDictionary[ClassWeight]
}
