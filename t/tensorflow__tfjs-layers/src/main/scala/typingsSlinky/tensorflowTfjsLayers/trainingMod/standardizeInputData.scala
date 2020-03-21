package typingsSlinky.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "standardizeInputData")
@js.native
object standardizeInputData extends js.Object {
  def apply(data: js.Array[Tensor_[Rank]], names: js.Array[String]): js.Array[Tensor_[Rank]] = js.native
  def apply(data: js.Array[Tensor_[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor_[Rank]] = js.native
  def apply(
    data: js.Array[Tensor_[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor_[Rank]] = js.native
  def apply(
    data: js.Array[Tensor_[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor_[Rank]] = js.native
  def apply(data: StringDictionary[Tensor_[Rank]], names: js.Array[String]): js.Array[Tensor_[Rank]] = js.native
  def apply(data: StringDictionary[Tensor_[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor_[Rank]] = js.native
  def apply(
    data: StringDictionary[Tensor_[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor_[Rank]] = js.native
  def apply(
    data: StringDictionary[Tensor_[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor_[Rank]] = js.native
  def apply(data: Tensor_[Rank], names: js.Array[String]): js.Array[Tensor_[Rank]] = js.native
  def apply(data: Tensor_[Rank], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor_[Rank]] = js.native
  def apply(data: Tensor_[Rank], names: js.Array[String], shapes: js.Array[Shape], checkBatchAxis: Boolean): js.Array[Tensor_[Rank]] = js.native
  def apply(
    data: Tensor_[Rank],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor_[Rank]] = js.native
}

