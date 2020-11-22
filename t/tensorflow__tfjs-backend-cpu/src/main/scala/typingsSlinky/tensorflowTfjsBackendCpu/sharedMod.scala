package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.Indices
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", JSImport.Namespace)
@js.native
object sharedMod extends js.Object {
  
  val addImpl: SimpleBinaryKernelImpl = js.native
  
  val ceilImpl: SimpleUnaryImpl = js.native
  
  val expImpl: SimpleUnaryImpl = js.native
  
  val expm1Impl: SimpleUnaryImpl = js.native
  
  val floorImpl: SimpleUnaryImpl = js.native
  
  val logImpl: SimpleUnaryImpl = js.native
  
  def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = js.native
  
  val multiplyImpl: SimpleBinaryKernelImpl = js.native
  
  val notEqualImpl: SimpleBinaryKernelImpl = js.native
  
  val rsqrtImpl: SimpleUnaryImpl = js.native
  
  def simpleAbsImpl(vals: TypedArray): js.typedarray.Float32Array = js.native
  
  def sliceImpl(
    vals: TypedArray,
    begin: js.Array[Double],
    size: js.Array[Double],
    shape: js.Array[Double],
    dtype: DataType
  ): TypedArray = js.native
  
  val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
  
  val subImpl: SimpleBinaryKernelImpl = js.native
  
  def transposeImpl(
    xVals: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    perm: js.Array[Double],
    newShape: js.Array[Double]
  ): TypedArray = js.native
  
  def uniqueImpl(values: BackendValues, axis: Double, shape: js.Array[Double], dtype: DataType): Indices = js.native
}
