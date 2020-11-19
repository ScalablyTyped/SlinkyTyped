package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Transpose_impl", JSImport.Namespace)
@js.native
object transposeImplMod extends js.Object {
  
  def transposeImpl(x: TensorInfo, perm: js.Array[Double], backend: MathBackendWebGL): TensorInfo = js.native
}
