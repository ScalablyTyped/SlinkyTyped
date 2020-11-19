package typingsSlinky.three.webGLRenderListsMod

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLPropertiesMod.WebGLProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderLists")
@js.native
class WebGLRenderLists protected () extends js.Object {
  def this(properties: WebGLProperties) = this()
  
  def dispose(): Unit = js.native
  
  def get(scene: Scene, camera: Camera): WebGLRenderList = js.native
}
