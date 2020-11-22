package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor6D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike6D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "tensor6d")
@js.native
object tensor6d extends js.Object {
  
  def apply(values: TensorLike6D): Tensor6D = js.native
  def apply(values: TensorLike6D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor6D = js.native
  def apply(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = js.native
  def apply(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = js.native
}
