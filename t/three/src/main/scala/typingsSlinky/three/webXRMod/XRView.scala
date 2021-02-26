package typingsSlinky.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRView extends StObject {
  
  val eye: XREye = js.native
  
  val projectionMatrix: js.typedarray.Float32Array = js.native
  
  val transform: XRRigidTransform = js.native
  
  val viewMatrix: js.typedarray.Float32Array = js.native
}
object XRView {
  
  @scala.inline
  def apply(
    eye: XREye,
    projectionMatrix: js.typedarray.Float32Array,
    transform: XRRigidTransform,
    viewMatrix: js.typedarray.Float32Array
  ): XRView = {
    val __obj = js.Dynamic.literal(eye = eye.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewMatrix = viewMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRView]
  }
  
  @scala.inline
  implicit class XRViewMutableBuilder[Self <: XRView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEye(value: XREye): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "viewMatrix", value.asInstanceOf[js.Any])
  }
}
