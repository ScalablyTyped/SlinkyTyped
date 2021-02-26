package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.TensorBuffer
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileImplMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/tile_impl", "tile")
  @js.native
  def tile[R /* <: Rank */](xBuf: TensorBuffer[R, DataType], reps: js.Array[Double]): Tensor[R] = js.native
}
