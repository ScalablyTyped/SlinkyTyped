package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.TensorBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/tile_impl", JSImport.Namespace)
@js.native
object tileImplMod extends js.Object {
  def tile[R /* <: Rank */](xBuf: TensorBuffer[R, DataType], reps: js.Array[Double]): Tensor[R] = js.native
}

