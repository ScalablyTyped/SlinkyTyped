package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.webGLInfoMod.WebGLInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLBufferRenderer", JSImport.Namespace)
@js.native
object webGLBufferRendererMod extends js.Object {
  @js.native
  class WebGLBufferRenderer protected () extends js.Object {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      info: WebGLInfo,
      capabilities: WebGLCapabilities
    ) = this()
    def render(start: js.Any, count: Double): Unit = js.native
    def renderInstances(start: js.Any, count: Double, primcount: Double): Unit = js.native
    def setMode(value: js.Any): Unit = js.native
  }
  
}

