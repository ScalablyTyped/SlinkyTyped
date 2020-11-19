package typingsSlinky.three.webGLRendererMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends js.Object {
  
  var domElement: HTMLCanvasElement = js.native
  
  def render(scene: Object3D, camera: Camera): Unit = js.native
  
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, updateStyle: Boolean): Unit = js.native
}
