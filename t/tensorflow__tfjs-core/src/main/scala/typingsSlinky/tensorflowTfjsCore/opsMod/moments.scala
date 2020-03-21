package typingsSlinky.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.AnonMean
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "moments")
@js.native
object moments
  extends TopLevel[
      js.Function3[
        /* x */ Tensor[Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        /* keepDims */ js.UndefOr[Boolean], 
        AnonMean
      ]
    ]

