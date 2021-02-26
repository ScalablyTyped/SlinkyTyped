package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R2
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linalg {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: String, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.Array[js.typedarray.Uint8Array], numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.typedarray.Float32Array, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.typedarray.Int32Array, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.typedarray.Uint8Array, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: Double, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    a: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    numLower: Double,
    numUpper: Double
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.gramSchmidt")
  @js.native
  def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.gramSchmidt")
  @js.native
  def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.qr")
  @js.native
  def qr(x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): js.Tuple2[
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg.qr")
  @js.native
  def qr(x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], fullMatrices: Boolean): js.Tuple2[
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
}
