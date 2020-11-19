package typingsSlinky.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.anon.Mean
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "moments")
@js.native
object moments
  extends TopLevel[
      js.Function3[
        /* x */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        /* keepDims */ js.UndefOr[Boolean], 
        Mean
      ]
    ]
