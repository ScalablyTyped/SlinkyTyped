package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/linalg_ops", JSImport.Namespace)
@js.native
object distOpsLinalgUnderscoreOpsMod extends js.Object {
  val gramSchmidt: js.Function1[/* xs */ js.Array[Tensor1D] | Tensor2D, js.Array[Tensor1D] | Tensor2D] = js.native
  val qr: js.Function2[
    /* x */ Tensor[Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[Tensor[Rank], Tensor[Rank]]
  ] = js.native
  @js.native
  object bandPart extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
  }
  
}

