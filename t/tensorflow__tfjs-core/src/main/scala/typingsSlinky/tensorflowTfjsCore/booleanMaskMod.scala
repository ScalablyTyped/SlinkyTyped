package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMaskMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/boolean_mask", "booleanMaskAsync")
  @js.native
  val booleanMaskAsync: js.Function3[
    /* tensor */ Tensor[Rank] | TensorLike, 
    /* mask */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Promise[Tensor[Rank]]
  ] = js.native
}
