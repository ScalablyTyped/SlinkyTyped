package typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_math", "compileProgram")
@js.native
object compileProgram extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): GPGPUBinary = js.native
}
