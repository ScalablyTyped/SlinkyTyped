package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "batchNormalization")
@js.native
object batchNormalization extends js.Object {
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    offset: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
}

