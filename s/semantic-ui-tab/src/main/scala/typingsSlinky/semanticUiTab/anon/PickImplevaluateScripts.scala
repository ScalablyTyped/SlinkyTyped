package typingsSlinky.semanticUiTab.anon

import typingsSlinky.semanticUiTab.semanticUiTabStrings.once
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'evaluateScripts'> */
@js.native
trait PickImplevaluateScripts extends StObject {
  
  var evaluateScripts: once | Boolean = js.native
}
object PickImplevaluateScripts {
  
  @scala.inline
  def apply(evaluateScripts: once | Boolean): PickImplevaluateScripts = {
    val __obj = js.Dynamic.literal(evaluateScripts = evaluateScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplevaluateScripts]
  }
  
  @scala.inline
  implicit class PickImplevaluateScriptsMutableBuilder[Self <: PickImplevaluateScripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluateScripts(value: once | Boolean): Self = StObject.set(x, "evaluateScripts", value.asInstanceOf[js.Any])
  }
}
