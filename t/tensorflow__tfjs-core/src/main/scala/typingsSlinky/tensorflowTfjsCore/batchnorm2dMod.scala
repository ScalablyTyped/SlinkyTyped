package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm2d", JSImport.Namespace)
@js.native
object batchnorm2dMod extends js.Object {
  
  val batchNorm2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
}
