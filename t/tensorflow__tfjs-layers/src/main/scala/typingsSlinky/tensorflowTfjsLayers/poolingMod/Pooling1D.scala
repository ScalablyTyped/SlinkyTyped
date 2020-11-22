package typingsSlinky.tensorflowTfjsLayers.poolingMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling1D")
@js.native
abstract class Pooling1D protected () extends Layer {
  /**
    *
    * @param args Parameters for the Pooling layer.
    *
    * config.poolSize defaults to 2.
    */
  def this(args: Pooling1DLayerArgs) = this()
  
  val padding: PaddingMode = js.native
  
  val poolSize: js.Array[Double] = js.native
  
  /* protected */ def poolingFunction(
    inputs: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  
  val strides: js.Array[Double] = js.native
}
