package typingsSlinky.tensorflowTfjsLayers.activationsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/activations", "Activation")
@js.native
abstract class Activation () extends Serializable {
  
  @JSName("apply")
  def apply(tensor: Tensor[Rank]): Tensor[Rank] = js.native
  @JSName("apply")
  def apply(tensor: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
}
