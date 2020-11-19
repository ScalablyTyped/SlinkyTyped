package typingsSlinky.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "reverse3d")
@js.native
object reverse3d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor3D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor3D
      ]
    ]
