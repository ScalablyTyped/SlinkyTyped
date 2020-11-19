package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/elu", JSImport.Namespace)
@js.native
object eluMod extends js.Object {
  
  @js.native
  object elu extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  }
}
