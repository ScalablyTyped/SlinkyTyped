package typingsSlinky.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'item'> */
@js.native
trait PickImplitem extends StObject {
  
  var item: String = js.native
}
object PickImplitem {
  
  @scala.inline
  def apply(item: String): PickImplitem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplitem]
  }
  
  @scala.inline
  implicit class PickImplitemMutableBuilder[Self <: PickImplitem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
