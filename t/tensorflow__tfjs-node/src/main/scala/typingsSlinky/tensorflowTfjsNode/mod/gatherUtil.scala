package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatherUtil {
  
  @JSImport("@tensorflow/tfjs-node", "gather_util.prepareAndValidate")
  @js.native
  def prepareAndValidate(
    tensor: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
}
