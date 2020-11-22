package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/linalg/band_part", JSImport.Namespace)
@js.native
object bandPartMod extends js.Object {
  
  @js.native
  object bandPart extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
  }
}
