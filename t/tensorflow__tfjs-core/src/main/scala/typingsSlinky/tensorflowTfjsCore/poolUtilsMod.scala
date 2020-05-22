package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.tensorMod.TensorBuffer
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/pool_utils", JSImport.Namespace)
@js.native
object poolUtilsMod extends js.Object {
  def maxPoolPositions(xValues: TypedArray, xShape: js.Array[Double], dtype: DataType, convInfo: Conv2DInfo): TensorBuffer[Rank, int32] = js.native
  def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: Boolean
  ): TensorBuffer[Rank, int32] = js.native
  def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: Boolean,
    includeBatchInIndex: Boolean
  ): TensorBuffer[Rank, int32] = js.native
  @JSName("pool")
  def pool_avg(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    strides: js.Array[Double],
    convInfo: Conv2DInfo,
    poolType: avg
  ): TensorBuffer[Rank, DataType] = js.native
  @JSName("pool")
  def pool_max(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    strides: js.Array[Double],
    convInfo: Conv2DInfo,
    poolType: max
  ): TensorBuffer[Rank, DataType] = js.native
}

