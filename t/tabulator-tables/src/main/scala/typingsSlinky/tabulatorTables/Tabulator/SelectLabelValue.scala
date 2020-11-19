package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectLabelValue extends js.Object {
  
  var label: String = js.native
  
  var value: String | Double | Boolean = js.native
}
object SelectLabelValue {
  
  @scala.inline
  def apply(label: String, value: String | Double | Boolean): SelectLabelValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectLabelValue]
  }
  
  @scala.inline
  implicit class SelectLabelValueOps[Self <: SelectLabelValue] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
