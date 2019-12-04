package typingsSlinky.three

import typingsSlinky.three.srcMathColorMod.Color
import typingsSlinky.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsSlinky.three.srcRenderersWebglWebGLObjectsMod.WebGLObjects
import typingsSlinky.three.srcRenderersWebglWebGLRenderListsMod.WebGLRenderLists
import typingsSlinky.three.srcRenderersWebglWebGLStateMod.WebGLState
import typingsSlinky.three.srcScenesSceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLBackground", JSImport.Namespace)
@js.native
object srcRenderersWebglWebGLBackgroundMod extends js.Object {
  @js.native
  class WebGLBackground protected () extends js.Object {
    def this(renderer: WebGLRenderer, state: WebGLState, objects: WebGLObjects, premultipliedAlpha: js.Any) = this()
    def getClearAlpha(): Unit = js.native
    def getClearColor(): Unit = js.native
    def render(renderList: WebGLRenderLists, scene: Scene, camera: js.Any, forceClear: js.Any): Unit = js.native
    def setClearAlpha(alpha: js.Any): Unit = js.native
    def setClearColor(color: Color, alpha: js.Any): Unit = js.native
  }
  
}

