package typingsSlinky.tensorflowTfjsLayers.convolutionalMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String, dataFormat: DataFormat): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
}

