package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.getFusedDyActivation")
@js.native
object getFusedDyActivation extends js.Object {
  
  def apply(dy: Tensor[Rank], y: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
}
