package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm4d", JSImport.Namespace)
@js.native
object batchnorm4dMod extends js.Object {
  
  val batchNorm4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
}
