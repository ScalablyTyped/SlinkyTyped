package typingsSlinky.three

import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.webGLProgramMod.WebGLProgram
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLPrograms", JSImport.Namespace)
@js.native
object webGLProgramsMod extends js.Object {
  
  @js.native
  class WebGLPrograms protected () extends js.Object {
    def this(renderer: WebGLRenderer, extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    
    def acquireProgram(parameters: js.Any, cacheKey: String): WebGLProgram = js.native
    
    def getParameters(
      material: Material,
      lights: js.Any,
      shadows: js.Array[js.Object],
      scene: Scene,
      nClipPlanes: Double,
      nClipIntersection: Double,
      `object`: js.Any
    ): js.Any = js.native
    
    def getProgramCacheKey(parameters: js.Any): String = js.native
    
    def getUniforms(material: Material): js.Object = js.native
    
    var programs: js.Array[WebGLProgram] = js.native
    
    def releaseProgram(program: WebGLProgram): Unit = js.native
  }
}
