package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT_impl", JSImport.Namespace)
@js.native
object fftImplMod extends js.Object {
  
  def fftImpl(x: TensorInfo, inverse: Boolean, backend: MathBackendWebGL): TensorInfo = js.native
}
