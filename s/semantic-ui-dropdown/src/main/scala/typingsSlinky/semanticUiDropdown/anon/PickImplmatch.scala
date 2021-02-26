package typingsSlinky.semanticUiDropdown.anon

import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'match'> */
@js.native
trait PickImplmatch extends StObject {
  
  var `match`: both | value | text = js.native
}
object PickImplmatch {
  
  @scala.inline
  def apply(`match`: both | value | text): PickImplmatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmatch]
  }
  
  @scala.inline
  implicit class PickImplmatchMutableBuilder[Self <: PickImplmatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(value: both | value | text): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
