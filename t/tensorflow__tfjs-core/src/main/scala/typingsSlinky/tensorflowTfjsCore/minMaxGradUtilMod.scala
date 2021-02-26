package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.X
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMaxGradUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/gradients/min_max_grad_util", "gradForMinAndMax")
  @js.native
  def gradForMinAndMax[T /* <: Tensor[Rank] */](dy: T, y: T, xOrig: Tensor[Rank], origAxes: js.Array[Double]): X = js.native
}
