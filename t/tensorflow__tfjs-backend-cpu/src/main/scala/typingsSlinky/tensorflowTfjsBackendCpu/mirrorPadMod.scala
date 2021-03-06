package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsMirrorPadAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MirrorPad", "mirrorPad")
  @js.native
  def mirrorPad(args: AttrsMirrorPadAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MirrorPad", "mirrorPadConfig")
  @js.native
  val mirrorPadConfig: KernelConfig = js.native
}
