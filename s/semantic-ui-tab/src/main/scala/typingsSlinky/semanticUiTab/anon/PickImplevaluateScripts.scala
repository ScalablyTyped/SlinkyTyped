package typingsSlinky.semanticUiTab.anon

import typingsSlinky.semanticUiTab.semanticUiTabStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'evaluateScripts'> */
@js.native
trait PickImplevaluateScripts extends js.Object {
  
  var evaluateScripts: once | Boolean = js.native
}
object PickImplevaluateScripts {
  
  @scala.inline
  def apply(evaluateScripts: once | Boolean): PickImplevaluateScripts = {
    val __obj = js.Dynamic.literal(evaluateScripts = evaluateScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplevaluateScripts]
  }
  
  @scala.inline
  implicit class PickImplevaluateScriptsOps[Self <: PickImplevaluateScripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvaluateScripts(value: once | Boolean): Self = this.set("evaluateScripts", value.asInstanceOf[js.Any])
  }
}
