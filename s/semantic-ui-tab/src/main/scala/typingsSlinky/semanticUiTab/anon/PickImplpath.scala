package typingsSlinky.semanticUiTab.anon

import typingsSlinky.semanticUiTab.semanticUiTabBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'path'> */
@js.native
trait PickImplpath extends StObject {
  
  var path: `false` | String = js.native
}
object PickImplpath {
  
  @scala.inline
  def apply(path: `false` | String): PickImplpath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpath]
  }
  
  @scala.inline
  implicit class PickImplpathMutableBuilder[Self <: PickImplpath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: `false` | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
