package typingsSlinky.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pad3d")
@js.native
object pad3d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor3D | TensorLike, 
        /* paddings */ js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
        /* constantValue */ js.UndefOr[Double], 
        Tensor3D
      ]
    ]
