package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.Indices
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "addImpl")
  @js.native
  val addImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "ceilImpl")
  @js.native
  val ceilImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "expImpl")
  @js.native
  val expImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "expm1Impl")
  @js.native
  val expm1Impl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "floorImpl")
  @js.native
  val floorImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "logImpl")
  @js.native
  val logImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "maxImpl")
  @js.native
  def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "multiplyImpl")
  @js.native
  val multiplyImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "notEqualImpl")
  @js.native
  val notEqualImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "rsqrtImpl")
  @js.native
  val rsqrtImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "simpleAbsImpl")
  @js.native
  def simpleAbsImpl(vals: TypedArray): js.typedarray.Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "sliceImpl")
  @js.native
  def sliceImpl(
    vals: TypedArray,
    begin: js.Array[Double],
    size: js.Array[Double],
    shape: js.Array[Double],
    dtype: DataType
  ): TypedArray = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "squaredDifferenceImpl")
  @js.native
  val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "subImpl")
  @js.native
  val subImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "transposeImpl")
  @js.native
  def transposeImpl(
    xVals: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    perm: js.Array[Double],
    newShape: js.Array[Double]
  ): TypedArray = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "uniqueImpl")
  @js.native
  def uniqueImpl(values: BackendValues, axis: Double, shape: js.Array[Double], dtype: DataType): Indices = js.native
}
