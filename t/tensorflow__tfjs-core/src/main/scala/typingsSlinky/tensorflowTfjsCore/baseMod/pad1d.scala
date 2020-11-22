package typingsSlinky.tensorflowTfjsCore.baseMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "pad1d")
@js.native
object pad1d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor1D | TensorLike, 
        /* paddings */ js.Tuple2[Double, Double], 
        /* constantValue */ js.UndefOr[Double], 
        Tensor1D
      ]
    ]
