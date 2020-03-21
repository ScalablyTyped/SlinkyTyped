package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.bool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "buffer")
@js.native
object buffer_bool extends js.Object {
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): typingsSlinky.tensorflowTfjsCore.tensorMod.TensorBuffer[R, bool] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: scala.scalajs.js.typedarray.Uint8Array
  ): typingsSlinky.tensorflowTfjsCore.tensorMod.TensorBuffer[R, bool] = js.native
}

