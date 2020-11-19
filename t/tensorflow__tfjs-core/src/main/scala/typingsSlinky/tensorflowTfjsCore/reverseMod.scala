package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/reverse", JSImport.Namespace)
@js.native
object reverseMod extends js.Object {
  
  val reverse1d: js.Function1[/* x */ Tensor1D | TensorLike, Tensor1D] = js.native
  
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
  
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
  
  val reverse4d: js.Function2[
    /* x */ Tensor4D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor4D
  ] = js.native
  
  @js.native
  object reverse extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  }
}
