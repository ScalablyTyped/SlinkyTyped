package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "localResponseNormalization")
@js.native
object localResponseNormalization extends js.Object {
  def apply(x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4]): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4], depthRadius: Double): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    depthRadius: Double,
    bias: Double
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    depthRadius: Double,
    bias: Double,
    alpha: Double
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    depthRadius: Double,
    bias: Double,
    alpha: Double,
    beta: Double
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
}

