package typingsSlinky.tensorflowTfjsCore.opsForConverterMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.ScalarLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
@js.native
object sparseToDense extends js.Object {
  
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
}
