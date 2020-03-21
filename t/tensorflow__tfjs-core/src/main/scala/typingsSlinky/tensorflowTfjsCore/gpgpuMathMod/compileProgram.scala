package typingsSlinky.tensorflowTfjsCore.gpgpuMathMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_math", "compileProgram")
@js.native
object compileProgram extends js.Object {
  def apply[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): GPGPUBinary = js.native
}

