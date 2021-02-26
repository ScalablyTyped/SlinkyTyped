package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whereAsyncMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/where_async", "whereAsync")
  @js.native
  val whereAsync: js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]] = js.native
}
