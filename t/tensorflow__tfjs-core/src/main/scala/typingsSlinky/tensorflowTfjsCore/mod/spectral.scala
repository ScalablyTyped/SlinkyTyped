package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "spectral")
@js.native
object spectral extends js.Object {
  
  val fft: js.Function1[
    /* input */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  
  val ifft: js.Function1[
    /* input */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  
  val irfft: js.Function1[
    /* input */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  
  val rfft: js.Function2[
    /* input */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    /* fftLength */ js.UndefOr[Double], 
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
}
