package typingsSlinky.tensorflowTfjsLayers.noiseMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
class AlphaDropout protected () extends Layer {
  def this(args: AlphaDropoutArgs) = this()
  
  def _getNoiseShape(inputs: js.Array[Tensor[Rank]]): js.Array[Double] = js.native
  def _getNoiseShape(inputs: Tensor[Rank]): js.Array[Double] = js.native
  
  val noiseShape: Shape = js.native
  
  val rate: Double = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
object AlphaDropout extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
