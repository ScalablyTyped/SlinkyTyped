package typingsSlinky.semanticUiDropdown.anon

import typingsSlinky.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'delimiter'> */
@js.native
trait PickImpldelimiter extends StObject {
  
  var delimiter: Double | `false` = js.native
}
object PickImpldelimiter {
  
  @scala.inline
  def apply(delimiter: Double | `false`): PickImpldelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelimiter]
  }
  
  @scala.inline
  implicit class PickImpldelimiterMutableBuilder[Self <: PickImpldelimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: Double | `false`): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
  }
}
