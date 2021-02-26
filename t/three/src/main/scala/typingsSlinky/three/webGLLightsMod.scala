package typingsSlinky.three

import typingsSlinky.three.anon.Ambient
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLLightsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLLights", "WebGLLights")
  @js.native
  class WebGLLights protected () extends StObject {
    def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    
    def get(light: js.Any): js.Any = js.native
    
    def setup(lights: js.Any, shadows: js.Any, camera: js.Any): Unit = js.native
    
    var state: Ambient = js.native
  }
}
