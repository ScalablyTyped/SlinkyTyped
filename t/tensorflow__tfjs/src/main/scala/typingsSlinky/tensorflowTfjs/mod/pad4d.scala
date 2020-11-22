package typingsSlinky.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "pad4d")
@js.native
object pad4d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike, 
        /* paddings */ js.Tuple4[
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double]
        ], 
        /* constantValue */ js.UndefOr[Double], 
        Tensor4D
      ]
    ]
