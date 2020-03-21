package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PoolMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "pool3d")
@js.native
object pool3d extends js.Object {
  def apply(x: Tensor5D, poolSize: js.Tuple3[Double, Double, Double]): Tensor_[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double]
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor_[Rank] = js.native
}

