package typingsSlinky.three.webGLRenderStatesMod

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLRenderStates", "WebGLRenderStates")
@js.native
class WebGLRenderStates protected () extends js.Object {
  def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
  
  def dispose(): Unit = js.native
  
  def get(scene: Scene, camera: Camera): WebGLRenderState = js.native
}
