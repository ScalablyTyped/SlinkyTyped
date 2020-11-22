package typingsSlinky.tensorflowTfjsCore.opsForConverterMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R2
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg")
@js.native
object linalg extends js.Object {
  
  def bandPart[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: String, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: js.Array[js.typedarray.Uint8Array], numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: Double, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: js.typedarray.Float32Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: js.typedarray.Int32Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: js.typedarray.Uint8Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](
    a: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    numLower: Double,
    numUpper: Double
  ): T = js.native
  
  def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  
  def qr(x: Tensor[Rank]): js.Tuple2[Tensor[Rank], Tensor[Rank]] = js.native
  def qr(x: Tensor[Rank], fullMatrices: Boolean): js.Tuple2[Tensor[Rank], Tensor[Rank]] = js.native
}
