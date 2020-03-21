package typingsSlinky.tensorflowTfjsLayers.regularizersMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.tensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/regularizers", "Regularizer")
@js.native
abstract class Regularizer () extends Serializable {
  @JSName("apply")
  def apply(x: Tensor_[Rank]): Scalar = js.native
}

