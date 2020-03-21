package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.complex64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "buffer")
@js.native
object buffer_complex64 extends js.Object {
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): typingsSlinky.tensorflowTfjsCore.tensorMod.TensorBuffer[R, complex64] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: scala.scalajs.js.typedarray.Float32Array
  ): typingsSlinky.tensorflowTfjsCore.tensorMod.TensorBuffer[R, complex64] = js.native
}

