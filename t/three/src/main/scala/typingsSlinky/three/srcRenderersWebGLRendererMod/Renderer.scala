package typingsSlinky.three.srcRenderersWebGLRendererMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.three.srcCamerasCameraMod.Camera
import typingsSlinky.three.srcScenesSceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var domElement: HTMLCanvasElement = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, updateStyle: Boolean): Unit = js.native
}

