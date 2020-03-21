package typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`1`
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
@js.native
class Softmax () extends Layer {
  def this(args: SoftmaxLayerArgs) = this()
  val DEFAULT_AXIS: `1` = js.native
  val axis: Double = js.native
  def softmax(t: Tensor_[Rank]): Tensor_[Rank] = js.native
  def softmax(t: Tensor_[Rank], a: Double): Tensor_[Rank] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
@js.native
object Softmax extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

