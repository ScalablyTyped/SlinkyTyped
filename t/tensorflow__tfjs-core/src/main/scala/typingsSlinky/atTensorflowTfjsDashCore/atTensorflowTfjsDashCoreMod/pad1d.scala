package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "pad1d")
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

