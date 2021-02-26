package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.webGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLBufferRendererMod {
  
  @JSImport("three/src/renderers/webgl/WebGLBufferRenderer", "WebGLBufferRenderer")
  @js.native
  class WebGLBufferRenderer protected () extends StObject {
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
