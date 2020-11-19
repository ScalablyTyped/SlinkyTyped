package typingsSlinky.semanticUiTab.anon

import typingsSlinky.semanticUiTab.semanticUiTabStrings.hash
import typingsSlinky.semanticUiTab.semanticUiTabStrings.state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'historyType'> */
@js.native
trait PickImplhistoryType extends js.Object {
  
  var historyType: hash | state = js.native
}
object PickImplhistoryType {
  
  @scala.inline
  def apply(historyType: hash | state): PickImplhistoryType = {
    val __obj = js.Dynamic.literal(historyType = historyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhistoryType]
  }
  
  @scala.inline
  implicit class PickImplhistoryTypeOps[Self <: PickImplhistoryType] (val x: Self) extends AnyVal {
    
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
    def setHistoryType(value: hash | state): Self = this.set("historyType", value.asInstanceOf[js.Any])
  }
}
