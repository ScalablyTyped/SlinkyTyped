package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.eventDispatcherMod.EventDispatcher
import typingsSlinky.three.groupMod.Group
import typingsSlinky.three.webXRMod.XRFrameRequestCallback
import typingsSlinky.three.webXRMod.XRReferenceSpace
import typingsSlinky.three.webXRMod.XRReferenceSpaceType
import typingsSlinky.three.webXRMod.XRSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRManagerMod {
  
  @JSImport("three/src/renderers/webxr/WebXRManager", "WebXRManager")
  @js.native
  class WebXRManager protected () extends EventDispatcher {
    def this(renderer: js.Any, gl: WebGLRenderingContext) = this()
    
    def dispose(): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var enabled: Boolean = js.native
    
    def getCamera(camera: Camera): Camera = js.native
    
    def getController(id: Double): Group = js.native
    
    def getControllerGrip(id: Double): Group = js.native
    
    def getReferenceSpace(): XRReferenceSpace = js.native
    
    def getSession(): XRSession = js.native
    
    /**
    	 * @default false
    	 */
    var isPresenting: Boolean = js.native
    
    def setAnimationLoop(callback: XRFrameRequestCallback): Unit = js.native
    
    def setFramebufferScaleFactor(value: Double): Unit = js.native
    
    def setReferenceSpaceType(value: XRReferenceSpaceType): Unit = js.native
    
    def setSession(value: XRSession): Unit = js.native
  }
}
