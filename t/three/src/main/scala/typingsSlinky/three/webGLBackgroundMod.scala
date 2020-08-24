package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLObjectsMod.WebGLObjects
import typingsSlinky.three.webGLRenderListsMod.WebGLRenderList
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import typingsSlinky.three.webGLStateMod.WebGLState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLBackground", JSImport.Namespace)
@js.native
object webGLBackgroundMod extends js.Object {
  @js.native
  class WebGLBackground protected () extends js.Object {
    def this(renderer: WebGLRenderer, state: WebGLState, objects: WebGLObjects, premultipliedAlpha: Boolean) = this()
    def getClearAlpha(): Double = js.native
    def getClearColor(): Color = js.native
    def render(renderList: WebGLRenderList, scene: Scene, camera: Camera, forceClear: Boolean): Unit = js.native
    def setClearAlpha(alpha: Double): Unit = js.native
    def setClearColor(color: Color, alpha: Double): Unit = js.native
  }
  
}

