package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "expandDims")
@js.native
object expandDims extends js.Object {
  def apply[R2 /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank],
    axis: Double
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](x: TensorLike): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](x: TensorLike, axis: Double): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
}

