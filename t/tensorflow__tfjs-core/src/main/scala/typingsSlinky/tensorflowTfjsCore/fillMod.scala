package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fill", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/fill", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String,
    dtype: DataType
  ): Tensor[R] = js.native
  /**
    * Creates a `tf.Tensor` filled with a scalar value.
    *
    * ```js
    * tf.fill([2, 2], 4).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param value The scalar value to fill the tensor with.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    * 'float'.
    *
    * @doc {heading: 'Tensors', subheading: 'Creation'}
    */
  @JSImport("@tensorflow/tfjs-core/dist/ops/fill", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/fill", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): Tensor[R] = js.native
}
