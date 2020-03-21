package typingsSlinky.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "booleanMaskAsync")
@js.native
object booleanMaskAsync
  extends TopLevel[
      js.Function3[
        /* tensor */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* mask */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Promise[Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]]
      ]
    ]

