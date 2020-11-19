package typingsSlinky.tensorflowTfjsLayers.constraintsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/constraints", "Constraint")
@js.native
abstract class Constraint () extends Serializable {
  
  @JSName("apply")
  def apply(w: Tensor[Rank]): Tensor[Rank] = js.native
}
