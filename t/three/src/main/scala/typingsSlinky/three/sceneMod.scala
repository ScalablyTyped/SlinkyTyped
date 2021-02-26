package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.fogMod.IFog
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTarget
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneMod {
  
  @JSImport("three/src/scenes/Scene", "Scene")
  @js.native
  class Scene () extends Object3D {
    
    /**
    	 * @default true
    	 */
    var autoUpdate: Boolean = js.native
    
    /**
    	 * @default null
    	 */
    var background: Null | Color | Texture | WebGLCubeRenderTarget = js.native
    
    /**
    	 * @default null
    	 */
    var environment: Null | Texture = js.native
    
    /**
    	 * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
    	 * @default null
    	 */
    var fog: IFog | Null = js.native
    
    val isScene: `true` = js.native
    
    /**
    	 * Calls after rendering scene
    	 */
    def onAfterRender(renderer: WebGLRenderer, scene: Scene, camera: Camera): Unit = js.native
    
    def onBeforeRender(renderer: WebGLRenderer, scene: Scene, camera: Camera, renderTarget: js.Any): Unit = js.native
    /**
    	 * Calls before rendering scene
    	 */
    def onBeforeRender(renderer: WebGLRenderer, scene: Scene, camera: Camera, renderTarget: WebGLRenderTarget): Unit = js.native
    
    /**
    	 * If not null, it will force everything in the scene to be rendered with that material. Default is null.
    	 * @default null
    	 */
    var overrideMaterial: Material | Null = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
    @JSName("type")
    var type_Scene: typingsSlinky.three.threeStrings.Scene = js.native
  }
}
