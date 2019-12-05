package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense_util", JSImport.Namespace)
@js.native
object distOpsSparseUnderscoreToUnderscoreDenseUnderscoreUtilMod extends js.Object {
  def validateInput(
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: js.Array[Double],
    defaultValues: Tensor[Rank]
  ): Unit = js.native
}

