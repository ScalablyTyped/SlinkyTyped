package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stftMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/signal/stft", "stft")
  @js.native
  val stft: js.Function5[
    /* signal */ Tensor1D, 
    /* frameLength */ Double, 
    /* frameStep */ Double, 
    /* fftLength */ js.UndefOr[Double], 
    /* windowFn */ js.UndefOr[js.Function1[/* length */ Double, Tensor1D]], 
    Tensor[Rank]
  ] = js.native
}
