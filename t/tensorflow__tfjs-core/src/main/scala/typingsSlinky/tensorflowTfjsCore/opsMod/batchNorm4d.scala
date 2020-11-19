package typingsSlinky.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "batchNorm4d")
@js.native
object batchNorm4d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor4D | TensorLike, 
        /* mean */ Tensor4D | Tensor1D | TensorLike, 
        /* variance */ Tensor4D | Tensor1D | TensorLike, 
        /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
        /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
        /* varianceEpsilon */ js.UndefOr[Double], 
        Tensor4D
      ]
    ]
