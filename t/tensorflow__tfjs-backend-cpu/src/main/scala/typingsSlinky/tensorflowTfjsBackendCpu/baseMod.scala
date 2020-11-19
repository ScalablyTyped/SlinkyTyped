package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  
  @JSName("version_cpu")
  val versionCpu: /* "2.0.1" */ String = js.native
  
  @js.native
  class MathBackendCPU ()
    extends typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
  
  @js.native
  object shared extends js.Object {
    
    def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = js.native
    
    def transposeImpl(
      xVals: TypedArray,
      xShape: js.Array[Double],
      dtype: DataType,
      perm: js.Array[Double],
      newShape: js.Array[Double]
    ): TypedArray = js.native
  }
}
