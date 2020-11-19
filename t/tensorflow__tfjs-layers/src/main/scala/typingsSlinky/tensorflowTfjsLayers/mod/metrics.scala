package typingsSlinky.tensorflowTfjsLayers.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers", "metrics")
@js.native
object metrics extends js.Object {
  
  @JSName("MAPE")
  def MAPE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSName("MSE")
  def MSE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def categoricalCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def mape(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def mse(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
}
