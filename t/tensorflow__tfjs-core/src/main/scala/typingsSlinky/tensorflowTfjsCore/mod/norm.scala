package typingsSlinky.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "norm")
@js.native
object norm
  extends TopLevel[
      js.Function4[
        /* x */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* ord */ js.UndefOr[Double | euclidean | fro], 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        /* keepDims */ js.UndefOr[Boolean], 
        Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

