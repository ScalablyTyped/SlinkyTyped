package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.constantsMod.ShadowMapType
import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLObjectsMod.WebGLObjects
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLShadowMapMod {
  
  @JSImport("three/src/renderers/webgl/WebGLShadowMap", "WebGLShadowMap")
  @js.native
  class WebGLShadowMap protected () extends StObject {
    def this(_renderer: WebGLRenderer, _objects: WebGLObjects, maxTextureSize: Double) = this()
    
    /**
    	 * @default true
    	 */
    var autoUpdate: Boolean = js.native
    
    /**
    	 * @deprecated Use {@link Material#shadowSide} instead.
    	 */
    var cullFace: js.Any = js.native
    
    /**
    	 * @default false
    	 */
    var enabled: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var needsUpdate: Boolean = js.native
    
    def render(shadowsArray: js.Array[Light], scene: Scene, camera: Camera): Unit = js.native
    
    /**
    	 * @default THREE.PCFShadowMap
    	 */
    var `type`: ShadowMapType = js.native
  }
}
