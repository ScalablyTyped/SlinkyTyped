package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.bool
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.complex64
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.string
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Div_impl", JSImport.Namespace)
@js.native
object divImplMod extends js.Object {
  @JSName("divImpl")
  def divImpl_bool(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: bool
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_complex64(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: complex64
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_float32(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: float32
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_int32(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: int32
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_string(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: string
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
}

