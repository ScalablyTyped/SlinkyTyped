package typingsSlinky.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'focus'> */
@js.native
trait PickImplfocus extends StObject {
  
  var focus: String = js.native
}
object PickImplfocus {
  
  @scala.inline
  def apply(focus: String): PickImplfocus = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfocus]
  }
  
  @scala.inline
  implicit class PickImplfocusMutableBuilder[Self <: PickImplfocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
  }
}
