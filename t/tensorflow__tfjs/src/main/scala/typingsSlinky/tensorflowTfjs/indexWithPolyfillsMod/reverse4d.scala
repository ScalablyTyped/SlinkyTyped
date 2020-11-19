package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "reverse4d")
@js.native
object reverse4d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor4D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor4D
      ]
    ]
