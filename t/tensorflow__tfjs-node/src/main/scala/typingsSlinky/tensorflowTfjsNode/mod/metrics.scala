package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "metrics")
@js.native
object metrics extends js.Object {
  @JSName("MAPE")
  def MAPE_(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSName("MSE")
  def MSE_(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryAccuracy(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryCrossentropy(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalAccuracy(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalCrossentropy(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def cosineProximity(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mape(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsoluteError(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsolutePercentageError(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanSquaredError(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mse(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def precision(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def recall(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def sparseCategoricalAccuracy(
    yTrue: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

