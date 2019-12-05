package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "buffer")
@js.native
object buffer_string extends js.Object {
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, string] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, string] = js.native
}

