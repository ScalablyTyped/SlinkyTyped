package typingsSlinky.tensorflowTfjsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "metrics")
@js.native
object metrics extends js.Object {
  @JSName("MAPE")
  def MAPE_(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSName("MSE")
  def MSE_(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryAccuracy(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryCrossentropy(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalAccuracy(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalCrossentropy(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def cosineProximity(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mape(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsoluteError(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsolutePercentageError(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanSquaredError(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mse(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def precision(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def recall(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def sparseCategoricalAccuracy(
    yTrue: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

