package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolWithArgmaxImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolWithArgmax_impl", "maxPoolWithArgmaxImpl")
  @js.native
  def maxPoolWithArgmaxImpl(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    includeBatchInIndex: Boolean,
    convInfo: Conv2DInfo
  ): js.Array[
    js.Array[String] | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array
  ] = js.native
}
