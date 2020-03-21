package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank], strides: js.Array[Double]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank], strides: js.Array[Double], padding: String): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    kernel: Tensor_[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    kernel: Tensor_[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor_[Rank] = js.native
}

