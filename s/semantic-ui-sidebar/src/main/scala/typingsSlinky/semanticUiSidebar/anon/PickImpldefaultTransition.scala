package typingsSlinky.semanticUiSidebar.anon

import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'defaultTransition'> */
@js.native
trait PickImpldefaultTransition extends StObject {
  
  var defaultTransition: DefaultTransitionSettings = js.native
}
object PickImpldefaultTransition {
  
  @scala.inline
  def apply(defaultTransition: DefaultTransitionSettings): PickImpldefaultTransition = {
    val __obj = js.Dynamic.literal(defaultTransition = defaultTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultTransition]
  }
  
  @scala.inline
  implicit class PickImpldefaultTransitionMutableBuilder[Self <: PickImpldefaultTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultTransition(value: DefaultTransitionSettings): Self = StObject.set(x, "defaultTransition", value.asInstanceOf[js.Any])
  }
}
