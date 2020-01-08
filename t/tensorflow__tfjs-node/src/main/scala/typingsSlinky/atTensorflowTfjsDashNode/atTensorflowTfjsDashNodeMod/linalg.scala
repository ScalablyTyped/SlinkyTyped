package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "linalg")
@js.native
object linalg extends js.Object {
  val gramSchmidt: js.Function1[/* xs */ js.Array[Tensor1D] | Tensor2D, js.Array[Tensor1D] | Tensor2D] = js.native
  val qr: js.Function2[
    /* x */ typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[
      typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank], 
      typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ] = js.native
  @js.native
  object bandPart extends js.Object {
    def apply[T /* <: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    def apply[T /* <: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
  }
  
}

