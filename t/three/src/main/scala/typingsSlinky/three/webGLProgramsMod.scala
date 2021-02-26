package typingsSlinky.three

import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLBindingStatesMod.WebGLBindingStates
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLClippingMod.WebGLClipping
import typingsSlinky.three.webGLCubeMapsMod.WebGLCubeMaps
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.webGLProgramMod.WebGLProgram
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLProgramsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLPrograms", "WebGLPrograms")
  @js.native
  class WebGLPrograms protected () extends StObject {
    def this(
      renderer: WebGLRenderer,
      cubemaps: WebGLCubeMaps,
      extensions: WebGLExtensions,
      capabilities: WebGLCapabilities,
      bindingStates: WebGLBindingStates,
      clipping: WebGLClipping
    ) = this()
    
    def acquireProgram(parameters: js.Any, cacheKey: String): WebGLProgram = js.native
    
    def getParameters(material: Material, lights: js.Any, shadows: js.Array[js.Object], scene: Scene, `object`: js.Any): js.Any = js.native
    
    def getProgramCacheKey(parameters: js.Any): String = js.native
    
    def getUniforms(material: Material): js.Object = js.native
    
    var programs: js.Array[WebGLProgram] = js.native
    
    def releaseProgram(program: WebGLProgram): Unit = js.native
  }
}
