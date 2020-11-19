package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "slice4d")
@js.native
object slice4d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike, 
        /* begin */ js.Tuple4[Double, Double, Double, Double], 
        /* size */ js.Tuple4[Double, Double, Double, Double], 
        Tensor4D
      ]
    ]
