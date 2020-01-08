package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "broadcastTo")
@js.native
object broadcastTo extends js.Object {
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
}

