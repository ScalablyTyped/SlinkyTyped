package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/dot", "dot")
  @js.native
  val dot: js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]] = js.native
}
