package typingsSlinky.semanticUiPopup.anon

import typingsSlinky.semanticUiPopup.JQuery
import typingsSlinky.semanticUiPopup.semanticUiPopupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'target'> */
@js.native
trait PickImpltarget extends StObject {
  
  var target: `false` | String | JQuery = js.native
}
object PickImpltarget {
  
  @scala.inline
  def apply(target: `false` | String | JQuery): PickImpltarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltarget]
  }
  
  @scala.inline
  implicit class PickImpltargetMutableBuilder[Self <: PickImpltarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: `false` | String | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
