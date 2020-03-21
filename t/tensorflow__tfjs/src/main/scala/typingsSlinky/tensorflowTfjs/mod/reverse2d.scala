package typingsSlinky.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "reverse2d")
@js.native
object reverse2d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor2D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor2D
      ]
    ]

