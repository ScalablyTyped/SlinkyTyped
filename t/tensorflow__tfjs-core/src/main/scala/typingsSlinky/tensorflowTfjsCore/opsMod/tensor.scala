package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "tensor")
@js.native
object tensor extends js.Object {
  
  /**
    * Creates a `tf.Tensor` with the provided values, shape and dtype.
    *
    * ```js
    * // Pass an array of values to create a vector.
    * tf.tensor([1, 2, 3, 4]).print();
    * ```
    *
    * ```js
    * // Pass a nested array of values to make a matrix or a higher
    * // dimensional tensor.
    * tf.tensor([[1, 2], [3, 4]]).print();
    * ```
    *
    * ```js
    * // Pass a flat array and specify a shape yourself.
    * tf.tensor([1, 2, 3, 4], [2, 2]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`. If the values are strings,
    *     they will be encoded as utf-8 and kept as `Uint8Array[]`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply[R /* <: Rank */](values: TensorLike): Tensor[R] = js.native
  def apply[R /* <: Rank */](values: TensorLike, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
}
