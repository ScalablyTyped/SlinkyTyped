package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "buffer")
@js.native
object buffer_bool extends js.Object {
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, bool] = js.native
  def apply[R /* <: typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: scala.scalajs.js.typedarray.Uint8Array
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, bool] = js.native
}

