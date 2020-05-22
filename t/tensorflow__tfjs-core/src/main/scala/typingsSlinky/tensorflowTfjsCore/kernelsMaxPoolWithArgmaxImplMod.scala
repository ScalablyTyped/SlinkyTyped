package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/kernels/MaxPoolWithArgmax_impl", JSImport.Namespace)
@js.native
object kernelsMaxPoolWithArgmaxImplMod extends js.Object {
  def maxPoolWithArgmaxImpl(x: TensorInfo, includeBatchInIndex: Boolean, convInfo: Conv2DInfo, backend: MathBackendWebGL): js.Array[TensorInfo] = js.native
}

