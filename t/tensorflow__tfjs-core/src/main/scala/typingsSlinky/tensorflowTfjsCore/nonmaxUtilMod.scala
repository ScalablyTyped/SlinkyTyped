package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.IouThreshold
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/nonmax_util", JSImport.Namespace)
@js.native
object nonmaxUtilMod extends js.Object {
  
  def nonMaxSuppSanityCheck(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): IouThreshold = js.native
  def nonMaxSuppSanityCheck(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): IouThreshold = js.native
}
