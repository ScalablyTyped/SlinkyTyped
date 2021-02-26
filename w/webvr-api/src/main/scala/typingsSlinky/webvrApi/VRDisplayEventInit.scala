package typingsSlinky.webvrApi

import typingsSlinky.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRDisplayEventInit extends EventInit {
  
  var display: VRDisplay = js.native
  
  var reason: js.UndefOr[VRDisplayEventReasonDtAlias] = js.native
}
object VRDisplayEventInit {
  
  @scala.inline
  def apply(display: VRDisplay): VRDisplayEventInit = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayEventInit]
  }
  
  @scala.inline
  implicit class VRDisplayEventInitMutableBuilder[Self <: VRDisplayEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: VRDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: VRDisplayEventReasonDtAlias): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
