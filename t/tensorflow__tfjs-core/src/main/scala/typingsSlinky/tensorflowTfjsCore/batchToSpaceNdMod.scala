package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchToSpaceNdMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/batch_to_space_nd", "batchToSpaceND")
  @js.native
  def batchToSpaceND[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/batch_to_space_nd", "batchToSpaceND")
  @js.native
  def batchToSpaceND[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
}
