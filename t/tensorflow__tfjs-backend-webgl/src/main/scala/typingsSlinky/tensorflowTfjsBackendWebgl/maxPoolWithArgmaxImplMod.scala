package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolWithArgmaxImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPoolWithArgmax_impl", "maxPoolWithArgmaxImpl")
  @js.native
  def maxPoolWithArgmaxImpl(x: TensorInfo, includeBatchInIndex: Boolean, convInfo: Conv2DInfo, backend: MathBackendWebGL): js.Array[TensorInfo] = js.native
}
