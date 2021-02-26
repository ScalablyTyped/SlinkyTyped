package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensor4dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor4d", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D): Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor4d", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor4d", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor4d", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = js.native
}
