package typingsSlinky.tensorflowTfjsCore.webglMod

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/webgl", "GPGPUContext")
@js.native
class GPGPUContext ()
  extends typingsSlinky.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext {
  def this(gl: WebGLRenderingContext) = this()
}

