package typingsSlinky.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "pad3d")
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
