package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  /* was `typeof shared.simpleAbsImpl` */
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/shared", "simpleAbsImplCPU")
  @js.native
  def simpleAbsImplCPU(vals: TypedArray): js.typedarray.Float32Array = js.native
  
  type SimpleBinaryKernelImplCPU = SimpleBinaryKernelImpl
}
