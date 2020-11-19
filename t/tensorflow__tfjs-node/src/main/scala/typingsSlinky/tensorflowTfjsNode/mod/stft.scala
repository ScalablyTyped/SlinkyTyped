package typingsSlinky.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "stft")
@js.native
object stft
  extends TopLevel[
      js.Function5[
        /* signal */ Tensor1D, 
        /* frameLength */ Double, 
        /* frameStep */ Double, 
        /* fftLength */ js.UndefOr[Double], 
        /* windowFn */ js.UndefOr[js.Function1[/* length */ Double, Tensor1D]], 
        Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
