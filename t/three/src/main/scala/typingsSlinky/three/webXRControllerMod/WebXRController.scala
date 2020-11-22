package typingsSlinky.three.webXRControllerMod

import typingsSlinky.three.anon.Type
import typingsSlinky.three.groupMod.Group
import typingsSlinky.three.webXRMod.XRFrame
import typingsSlinky.three.webXRMod.XRInputSource
import typingsSlinky.three.webXRMod.XRReferenceSpace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webxr/WebXRController", "WebXRController")
@js.native
class WebXRController () extends js.Object {
  
  def disconnect(inputSource: XRInputSource): this.type = js.native
  
  def dispatchEvent(event: Type): this.type = js.native
  
  def getGripSpace(): Group = js.native
  
  def getTargetRaySpace(): Group = js.native
  
  def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native
}
