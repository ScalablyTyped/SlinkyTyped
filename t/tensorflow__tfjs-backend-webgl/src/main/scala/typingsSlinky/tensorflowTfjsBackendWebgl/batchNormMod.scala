package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.anon.Inputs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchNormMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchNorm", "batchNorm")
  @js.native
  def batchNorm(params: Inputs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchNorm", "batchNormConfig")
  @js.native
  val batchNormConfig: KernelConfig = js.native
}
