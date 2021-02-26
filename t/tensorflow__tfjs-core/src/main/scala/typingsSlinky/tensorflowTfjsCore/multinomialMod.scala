package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multinomialMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/multinomial", "multinomial")
  @js.native
  val multinomial: js.Function4[
    /* logits */ Tensor1D | Tensor2D | TensorLike, 
    /* numSamples */ Double, 
    /* seed */ js.UndefOr[Double], 
    /* normalized */ js.UndefOr[Boolean], 
    Tensor1D | Tensor2D
  ] = js.native
}
