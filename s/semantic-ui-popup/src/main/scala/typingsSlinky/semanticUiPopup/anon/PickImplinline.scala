package typingsSlinky.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'inline'> */
@js.native
trait PickImplinline extends StObject {
  
  var `inline`: Boolean = js.native
}
object PickImplinline {
  
  @scala.inline
  def apply(`inline`: Boolean): PickImplinline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinline]
  }
  
  @scala.inline
  implicit class PickImplinlineMutableBuilder[Self <: PickImplinline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
  }
}
