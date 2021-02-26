package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.ConcatInputs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Concat_impl", "concatImpl")
  @js.native
  def concatImpl(inputs: ConcatInputs, axis: Double, backend: MathBackendWebGL): TensorInfo = js.native
}
