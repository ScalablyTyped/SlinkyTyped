package typingsSlinky.tensorflowTfjsLayers.paddingMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "spatial2dPadding")
@js.native
object spatial2dPadding extends js.Object {
  def apply(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
}

