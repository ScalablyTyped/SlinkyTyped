package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/signal/stft", JSImport.Namespace)
@js.native
object stftMod extends js.Object {
  
  val stft: js.Function5[
    /* signal */ Tensor1D, 
    /* frameLength */ Double, 
    /* frameStep */ Double, 
    /* fftLength */ js.UndefOr[Double], 
    /* windowFn */ js.UndefOr[js.Function1[/* length */ Double, Tensor1D]], 
    Tensor[Rank]
  ] = js.native
}
