package typingsSlinky.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'checkOnRefresh'> */
@js.native
trait PickImplcheckOnRefresh extends StObject {
  
  var checkOnRefresh: Boolean = js.native
}
object PickImplcheckOnRefresh {
  
  @scala.inline
  def apply(checkOnRefresh: Boolean): PickImplcheckOnRefresh = {
    val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcheckOnRefresh]
  }
  
  @scala.inline
  implicit class PickImplcheckOnRefreshMutableBuilder[Self <: PickImplcheckOnRefresh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckOnRefresh(value: Boolean): Self = StObject.set(x, "checkOnRefresh", value.asInstanceOf[js.Any])
  }
}
