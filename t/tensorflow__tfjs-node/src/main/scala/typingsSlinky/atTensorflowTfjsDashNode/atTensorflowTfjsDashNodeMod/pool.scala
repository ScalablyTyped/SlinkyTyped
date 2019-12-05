package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.avg
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "pool")
@js.native
object pool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.max,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
}

