package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling2D")
@js.native
abstract class Pooling2D protected () extends Layer {
  def this(args: Pooling2DLayerArgs) = this()
  val dataFormat: DataFormat = js.native
  val padding: PaddingMode = js.native
  val poolSize: js.Tuple2[Double, Double] = js.native
  val strides: js.Tuple2[Double, Double] = js.native
  /* protected */ def poolingFunction(
    inputs: Tensor_[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
}

