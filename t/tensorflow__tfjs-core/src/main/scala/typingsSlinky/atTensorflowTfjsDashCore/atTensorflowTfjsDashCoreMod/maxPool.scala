package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same_
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid_
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "maxPool")
@js.native
object maxPool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): T = js.native
}

