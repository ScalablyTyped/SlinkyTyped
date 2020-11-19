package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "gatherND")
@js.native
object gatherND
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* indices */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
