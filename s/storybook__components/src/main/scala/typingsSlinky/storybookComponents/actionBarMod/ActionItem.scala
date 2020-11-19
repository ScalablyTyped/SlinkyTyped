package typingsSlinky.storybookComponents.actionBarMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionItem extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  def onClick(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  
  var title: String | ReactElement = js.native
}
object ActionItem {
  
  @scala.inline
  def apply(onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit, title: String | ReactElement): ActionItem = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionItem]
  }
  
  @scala.inline
  implicit class ActionItemOps[Self <: ActionItem] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
