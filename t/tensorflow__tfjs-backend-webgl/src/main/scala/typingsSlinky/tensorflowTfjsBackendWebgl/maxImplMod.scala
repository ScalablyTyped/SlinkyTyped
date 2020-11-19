package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Max_impl", JSImport.Namespace)
@js.native
object maxImplMod extends js.Object {
  
  def maxImpl(
    x: TensorInfo,
    reduceShape: js.Array[Double],
    outShape: js.Array[Double],
    backend: MathBackendWebGL
  ): TensorInfo = js.native
}
