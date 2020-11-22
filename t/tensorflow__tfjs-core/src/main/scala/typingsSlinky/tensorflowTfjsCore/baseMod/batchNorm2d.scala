package typingsSlinky.tensorflowTfjsCore.baseMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "batchNorm2d")
@js.native
object batchNorm2d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor2D | TensorLike, 
        /* mean */ Tensor2D | Tensor1D | TensorLike, 
        /* variance */ Tensor2D | Tensor1D | TensorLike, 
        /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        /* varianceEpsilon */ js.UndefOr[Double], 
        Tensor2D
      ]
    ]
