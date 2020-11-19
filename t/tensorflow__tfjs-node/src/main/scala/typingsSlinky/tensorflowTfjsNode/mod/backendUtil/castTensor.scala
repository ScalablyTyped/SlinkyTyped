package typingsSlinky.tensorflowTfjsNode.mod.backendUtil

import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "backend_util.castTensor")
@js.native
object castTensor extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T, dtype: DataType, backend: KernelBackend): T = js.native
}
