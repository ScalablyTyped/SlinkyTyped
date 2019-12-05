package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "tensor_util")
@js.native
object tensor_util extends js.Object {
  def assertTypesMatch(
    a: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank],
    b: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ): Unit = js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[
    typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  def isTensorInList(
    tensor: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank],
    tensorList: js.Array[
      typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ): Boolean = js.native
  def makeTypesMatch[T /* <: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}

