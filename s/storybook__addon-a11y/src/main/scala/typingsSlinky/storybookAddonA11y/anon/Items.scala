package typingsSlinky.storybookAddonA11y.anon

import slinky.core.facade.ReactElement
import typingsSlinky.axeCore.mod.Result
import typingsSlinky.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends js.Object {
  
  var items: js.Array[Result] = js.native
  
  var label: ReactElement = js.native
  
  var panel: ReactElement = js.native
  
  var `type`: RuleType = js.native
}
object Items {
  
  @scala.inline
  def apply(items: js.Array[Result], label: ReactElement, panel: ReactElement, `type`: RuleType): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Result*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Result]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: ReactElement): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RuleType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
