package typingsSlinky.tensorflowTfjsCore.scatterNdUtilMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "validateInput")
@js.native
object validateInput extends js.Object {
  
  def apply(updates: Tensor[Rank], indices: Tensor[Rank], shape: js.Array[Double]): Unit = js.native
}
