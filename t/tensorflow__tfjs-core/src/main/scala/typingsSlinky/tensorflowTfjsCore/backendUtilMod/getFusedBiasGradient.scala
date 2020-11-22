package typingsSlinky.tensorflowTfjsCore.backendUtilMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "getFusedBiasGradient")
@js.native
object getFusedBiasGradient extends js.Object {
  
  def apply(bias: Tensor[Rank], dyActivation: Tensor[Rank]): Tensor[Rank] = js.native
}
