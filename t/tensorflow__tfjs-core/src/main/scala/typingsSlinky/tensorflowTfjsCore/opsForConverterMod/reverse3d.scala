package typingsSlinky.tensorflowTfjsCore.opsForConverterMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse3d")
@js.native
object reverse3d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor3D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor3D
      ]
    ]
