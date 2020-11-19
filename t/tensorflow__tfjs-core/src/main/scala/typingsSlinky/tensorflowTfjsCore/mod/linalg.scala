package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "linalg")
@js.native
object linalg extends js.Object {
  
  val gramSchmidt: js.Function1[/* xs */ js.Array[Tensor1D] | Tensor2D, js.Array[Tensor1D] | Tensor2D] = js.native
  
  val qr: js.Function2[
    /* x */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[
      Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
      Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = js.native
  
  @js.native
  object bandPart extends js.Object {
    
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
  }
}
