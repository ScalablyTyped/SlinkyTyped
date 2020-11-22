package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.X
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/gradients/min_max_grad_util", JSImport.Namespace)
@js.native
object minMaxGradUtilMod extends js.Object {
  
  def gradForMinAndMax[T /* <: Tensor[Rank] */](dy: T, y: T, xOrig: Tensor[Rank], origAxes: js.Array[Double]): X = js.native
}
