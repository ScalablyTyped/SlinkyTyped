package typingsSlinky.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "setdiff1dAsync")
@js.native
object setdiff1dAsync
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* y */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        js.Promise[
          js.Tuple2[
            Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
            Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
          ]
        ]
      ]
    ]

