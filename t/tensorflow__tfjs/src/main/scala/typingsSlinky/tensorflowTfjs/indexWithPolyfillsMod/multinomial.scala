package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "multinomial")
@js.native
object multinomial
  extends TopLevel[
      js.Function4[
        /* logits */ Tensor1D | Tensor2D | TensorLike, 
        /* numSamples */ Double, 
        /* seed */ js.UndefOr[Double], 
        /* normalized */ js.UndefOr[Boolean], 
        Tensor1D | Tensor2D
      ]
    ]
