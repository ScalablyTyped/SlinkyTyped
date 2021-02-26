package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsSliceAttrs
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Slice", "slice")
  @js.native
  def slice(args: AttrsSliceAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Slice", "sliceConfig")
  @js.native
  val sliceConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Slice", "sliceImpl")
  @js.native
  def sliceImpl(
    vals: TypedArray,
    begin: js.Array[Double],
    size: js.Array[Double],
    shape: js.Array[Double],
    dtype: DataType
  ): TypedArray = js.native
}
