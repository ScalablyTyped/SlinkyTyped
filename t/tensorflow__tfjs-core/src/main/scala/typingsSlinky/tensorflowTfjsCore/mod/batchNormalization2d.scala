package typingsSlinky.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "batchNormalization2d")
@js.native
object batchNormalization2d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor2D | TensorLike, 
        /* mean */ Tensor2D | Tensor1D | TensorLike, 
        /* variance */ Tensor2D | Tensor1D | TensorLike, 
        /* varianceEpsilon */ js.UndefOr[Double], 
        /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        Tensor2D
      ]
    ]

