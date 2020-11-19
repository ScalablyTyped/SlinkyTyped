package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "unsortedSegmentSum")
@js.native
object unsortedSegmentSum extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T, segmentIds: TensorLike, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: TensorLike, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: Tensor1D, numSegments: Double): T = js.native
}
