package typingsSlinky.atTensorflowTfjsDashLayers.distLayersPoolingMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PaddingMode
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
    inputs: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
}

