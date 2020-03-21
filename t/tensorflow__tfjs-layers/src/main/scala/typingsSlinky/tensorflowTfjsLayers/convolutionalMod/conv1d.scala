package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank], strides: Double): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank], strides: Double, padding: String): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank], strides: Double, padding: String, dataFormat: DataFormat): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    kernel: Tensor_[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor_[Rank] = js.native
}

