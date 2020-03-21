package typingsSlinky.three.webGLRenderStatesMod

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderStates", "WebGLRenderStates")
@js.native
class WebGLRenderStates () extends js.Object {
  def dispose(): Unit = js.native
  def get(scene: Scene, camera: Camera): WebGLRenderState = js.native
}

