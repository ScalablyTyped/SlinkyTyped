package typingsSlinky.atTensorflowTfjsDashLayers.distActivationsMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/activations", "Activation")
@js.native
abstract class Activation () extends Serializable {
  @JSName("apply")
  def apply(tensor: Tensor[Rank]): Tensor[Rank] = js.native
  @JSName("apply")
  def apply(tensor: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
}

