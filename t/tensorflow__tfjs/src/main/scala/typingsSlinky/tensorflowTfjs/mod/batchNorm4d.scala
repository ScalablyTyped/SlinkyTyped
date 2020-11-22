package typingsSlinky.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "batchNorm4d")
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
