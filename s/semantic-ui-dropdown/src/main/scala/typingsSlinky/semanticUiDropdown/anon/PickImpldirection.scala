package typingsSlinky.semanticUiDropdown.anon

import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.auto
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.downward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'direction'> */
@js.native
trait PickImpldirection extends StObject {
  
  var direction: auto | upward | downward = js.native
}
object PickImpldirection {
  
  @scala.inline
  def apply(direction: auto | upward | downward): PickImpldirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldirection]
  }
  
  @scala.inline
  implicit class PickImpldirectionMutableBuilder[Self <: PickImpldirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: auto | upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
