package typingsSlinky.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "slice3d")
@js.native
object slice3d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor3D | TensorLike, 
        /* begin */ js.Tuple3[Double, Double, Double], 
        /* size */ js.Tuple3[Double, Double, Double], 
        Tensor3D
      ]
    ]
