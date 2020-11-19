package typingsSlinky.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.euclidean
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.fro
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "norm")
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
