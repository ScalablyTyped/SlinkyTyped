package typingsSlinky.select2.mod

import org.scalajs.dom.raw.HTMLOptionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionData extends js.Object {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var disabled: Boolean = js.native
  
  var element: HTMLOptionElement = js.native
  
  var id: String = js.native
  
  var loading: js.UndefOr[scala.Nothing] = js.native
  
  var selected: Boolean = js.native
  
  var text: String = js.native
  
  var title: String = js.native
}
object OptionData {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    element: HTMLOptionElement,
    id: String,
    selected: Boolean,
    text: String,
    title: String
  ): OptionData = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
  
  @scala.inline
  implicit class OptionDataOps[Self <: OptionData] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLOptionElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
