package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropoutMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/dropout", "dropout")
  @js.native
  val dropout: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* rate */ Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double | String], 
    Tensor[Rank]
  ] = js.native
}
