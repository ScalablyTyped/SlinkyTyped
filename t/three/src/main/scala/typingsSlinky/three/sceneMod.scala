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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/Scene", JSImport.Namespace)
@js.native
object sceneMod extends js.Object {
  @js.native
  class Scene () extends Object3D {
    var autoUpdate: Boolean = js.native
    var background: Null | Color | Texture | WebGLCubeRenderTarget = js.native
    var environment: Null | Texture = js.native
    /**
    	 * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
    	 */
    var fog: IFog | Null = js.native
    val isScene: `true` = js.native
    /**
    	 * If not null, it will force everything in the scene to be rendered with that material. Default is null.
    	 */
    var overrideMaterial: Material | Null = js.native
    @JSName("type")
    var type_Scene: typingsSlinky.three.threeStrings.Scene = js.native
    def dispose(): Unit = js.native
    /**
    	 * Calls after rendering scene
    	 */
    def onAfterRender(renderer: WebGLRenderer, scene: Scene, camera: Camera): Unit = js.native
    def onBeforeRender(renderer: WebGLRenderer, scene: Scene, camera: Camera, renderTarget: js.Any): Unit = js.native
    /**
    	 * Calls before rendering scene
    	 */
    def onBeforeRender(renderer: WebGLRenderer, scene: Scene, camera: Camera, renderTarget: WebGLRenderTarget): Unit = js.native
    def toJSON(meta: js.Any): js.Any = js.native
  }
  
}

