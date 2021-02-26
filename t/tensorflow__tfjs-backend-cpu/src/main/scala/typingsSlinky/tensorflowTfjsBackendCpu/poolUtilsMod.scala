package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.avg
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.max
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/pool_utils", "maxPoolPositions")
  @js.native
  def maxPoolPositions(xValues: TypedArray, xShape: js.Array[Double], dtype: DataType, convInfo: Conv2DInfo): TensorBuffer[Rank, int32] = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/pool_utils", "maxPoolPositions")
  @js.native
  def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: js.UndefOr[scala.Nothing],
    includeBatchInIndex: Boolean
  ): TensorBuffer[Rank, int32] = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/pool_utils", "maxPoolPositions")
  @js.native
  def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: Boolean
  ): TensorBuffer[Rank, int32] = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/pool_utils", "maxPoolPositions")
  @js.native
  def maxPoolPositions(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    convInfo: Conv2DInfo,
    flattenPositions: Boolean,
    includeBatchInIndex: Boolean
  ): TensorBuffer[Rank, int32] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/pool_utils", "pool")
  @js.native
  def pool_avg(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    strides: js.Array[Double],
    convInfo: Conv2DInfo,
    poolType: avg
  ): TensorBuffer[Rank, DataType] = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/pool_utils", "pool")
  @js.native
  def pool_max(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    strides: js.Array[Double],
    convInfo: Conv2DInfo,
    poolType: max
  ): TensorBuffer[Rank, DataType] = js.native
}
