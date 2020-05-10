package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PoolMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "pool2d")
@js.native
object pool2d extends js.Object {
  def apply(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = js.native
}

