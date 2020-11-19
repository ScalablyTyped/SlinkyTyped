package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.groupMod.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webxr/WebXRManager", JSImport.Namespace)
@js.native
object webXRManagerMod extends js.Object {
  
  @js.native
  class WebXRManager protected () extends js.Object {
    def this(renderer: js.Any, gl: WebGLRenderingContext) = this()
    
    def dispose(): Unit = js.native
    
    var enabled: Boolean = js.native
    
    def getCamera(camera: Camera): Camera = js.native
    
    def getController(id: Double): Group = js.native
    
    def getControllerGrip(id: Double): Group = js.native
    
    def getReferenceSpace(): js.Any = js.native
    
    def getSession(): js.Any = js.native
    
    var isPresenting: Boolean = js.native
    
    def setAnimationLoop(callback: js.Function): Unit = js.native
    
    def setFramebufferScaleFactor(value: Double): Unit = js.native
    
    def setReferenceSpaceType(value: String): Unit = js.native
    
    def setSession(value: js.Any): Unit = js.native
  }
}
