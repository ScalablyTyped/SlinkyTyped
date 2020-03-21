package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.constantsMod.ShadowMapType
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLShadowMap", JSImport.Namespace)
@js.native
object webGLShadowMapMod extends js.Object {
  @js.native
  class WebGLShadowMap protected () extends js.Object {
    def this(_renderer: WebGLRenderer, _lights: js.Array[_], _objects: js.Array[_], capabilities: js.Any) = this()
    var autoUpdate: Boolean = js.native
    /**
    	 * @deprecated Use {@link WebGLShadowMap#renderReverseSided .shadowMap.renderReverseSided} instead.
    	 */
    var cullFace: js.Any = js.native
    var enabled: Boolean = js.native
    var needsUpdate: Boolean = js.native
    var `type`: ShadowMapType = js.native
    def render(scene: Scene, camera: Camera): Unit = js.native
  }
  
}

