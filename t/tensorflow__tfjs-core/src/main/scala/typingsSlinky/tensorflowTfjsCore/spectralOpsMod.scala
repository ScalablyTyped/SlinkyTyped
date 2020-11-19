package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/spectral_ops", JSImport.Namespace)
@js.native
object spectralOpsMod extends js.Object {
  
  val fft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  val ifft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  val irfft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
}
