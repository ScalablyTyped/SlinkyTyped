package typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
@js.native
class Softmax () extends Layer {
  def this(args: SoftmaxLayerArgs) = this()
  
  val DEFAULT_AXIS: /* 1 */ Double = js.native
  
  val axis: Double = js.native
  
  def softmax(t: Tensor[Rank]): Tensor[Rank] = js.native
  def softmax(t: Tensor[Rank], a: Double): Tensor[Rank] = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
@js.native
object Softmax extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
