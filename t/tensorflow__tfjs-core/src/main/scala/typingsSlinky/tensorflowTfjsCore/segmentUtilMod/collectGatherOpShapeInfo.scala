package typingsSlinky.tensorflowTfjsCore.segmentUtilMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/segment_util", "collectGatherOpShapeInfo")
@js.native
object collectGatherOpShapeInfo extends js.Object {
  def apply(x: Tensor[Rank], indices: Tensor[Rank], axis: Double): GatherOpShapeInfo = js.native
}

