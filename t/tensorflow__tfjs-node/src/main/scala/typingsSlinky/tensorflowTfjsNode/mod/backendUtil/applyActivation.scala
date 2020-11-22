package typingsSlinky.tensorflowTfjsNode.mod.backendUtil

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "backend_util.applyActivation")
@js.native
object applyActivation extends js.Object {
  
  def apply(x: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], activation: Activation, preluActivationWeights: Tensor[Rank]): Tensor[Rank] = js.native
}
