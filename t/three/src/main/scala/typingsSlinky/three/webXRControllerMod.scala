package typingsSlinky.three

import typingsSlinky.three.anon.Type
import typingsSlinky.three.groupMod.Group
import typingsSlinky.three.webXRMod.XRFrame
import typingsSlinky.three.webXRMod.XRInputSource
import typingsSlinky.three.webXRMod.XRReferenceSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRControllerMod {
  
  @JSImport("three/src/renderers/webxr/WebXRController", "WebXRController")
  @js.native
  class WebXRController () extends StObject {
    
    def disconnect(inputSource: XRInputSource): this.type = js.native
    
    def dispatchEvent(event: Type): this.type = js.native
    
    def getGripSpace(): Group = js.native
    
    def getTargetRaySpace(): Group = js.native
    
    def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.three.threeStrings.disconnected
    - typingsSlinky.three.threeStrings.connected
    - typingsSlinky.three.threeStrings.end
    - typingsSlinky.three.threeStrings.select
    - typingsSlinky.three.threeStrings.selectstart
    - typingsSlinky.three.threeStrings.selectend
    - typingsSlinky.three.threeStrings.squeeze
    - typingsSlinky.three.threeStrings.squeezestart
    - typingsSlinky.three.threeStrings.squeezeend
    - typingsSlinky.three.threeStrings.inputsourceschange
  */
  trait XRControllerEventType extends StObject
  object XRControllerEventType {
    
    @scala.inline
    def connected: typingsSlinky.three.threeStrings.connected = "connected".asInstanceOf[typingsSlinky.three.threeStrings.connected]
    
    @scala.inline
    def disconnected: typingsSlinky.three.threeStrings.disconnected = "disconnected".asInstanceOf[typingsSlinky.three.threeStrings.disconnected]
    
    @scala.inline
    def end: typingsSlinky.three.threeStrings.end = "end".asInstanceOf[typingsSlinky.three.threeStrings.end]
    
    @scala.inline
    def inputsourceschange: typingsSlinky.three.threeStrings.inputsourceschange = "inputsourceschange".asInstanceOf[typingsSlinky.three.threeStrings.inputsourceschange]
    
    @scala.inline
    def select: typingsSlinky.three.threeStrings.select = "select".asInstanceOf[typingsSlinky.three.threeStrings.select]
    
    @scala.inline
    def selectend: typingsSlinky.three.threeStrings.selectend = "selectend".asInstanceOf[typingsSlinky.three.threeStrings.selectend]
    
    @scala.inline
    def selectstart: typingsSlinky.three.threeStrings.selectstart = "selectstart".asInstanceOf[typingsSlinky.three.threeStrings.selectstart]
    
    @scala.inline
    def squeeze: typingsSlinky.three.threeStrings.squeeze = "squeeze".asInstanceOf[typingsSlinky.three.threeStrings.squeeze]
    
    @scala.inline
    def squeezeend: typingsSlinky.three.threeStrings.squeezeend = "squeezeend".asInstanceOf[typingsSlinky.three.threeStrings.squeezeend]
    
    @scala.inline
    def squeezestart: typingsSlinky.three.threeStrings.squeezestart = "squeezestart".asInstanceOf[typingsSlinky.three.threeStrings.squeezestart]
  }
}
