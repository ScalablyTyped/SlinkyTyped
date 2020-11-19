package typingsSlinky.tensorflowTfjsCore.tapeMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/tape", "backpropagateGradients")
@js.native
object backpropagateGradients extends js.Object {
  
  def apply(
    tensorAccumulatedGradientMap: NumberDictionary[Tensor[Rank]],
    filteredTape: js.Array[TapeNode],
    tidy: js.Function1[/* f */ js.Function, Tensor[Rank]]
  ): Unit = js.native
}
