package typingsSlinky.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'searchButton'> */
@js.native
trait PickImplsearchButton extends StObject {
  
  var searchButton: String = js.native
}
object PickImplsearchButton {
  
  @scala.inline
  def apply(searchButton: String): PickImplsearchButton = {
    val __obj = js.Dynamic.literal(searchButton = searchButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchButton]
  }
  
  @scala.inline
  implicit class PickImplsearchButtonMutableBuilder[Self <: PickImplsearchButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchButton(value: String): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
  }
}
