package typingsSlinky.semanticUiPopup.anon

import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.adjacent
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.opposite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'prefer'> */
@js.native
trait PickImplprefer extends StObject {
  
  var prefer: adjacent | opposite = js.native
}
object PickImplprefer {
  
  @scala.inline
  def apply(prefer: adjacent | opposite): PickImplprefer = {
    val __obj = js.Dynamic.literal(prefer = prefer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprefer]
  }
  
  @scala.inline
  implicit class PickImplpreferMutableBuilder[Self <: PickImplprefer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefer(value: adjacent | opposite): Self = StObject.set(x, "prefer", value.asInstanceOf[js.Any])
  }
}
