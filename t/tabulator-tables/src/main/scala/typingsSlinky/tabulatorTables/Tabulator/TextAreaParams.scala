package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.editor
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.hybrid
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaParams
  extends SharedEditorParams
     with _EditorParams {
  
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
}
object TextAreaParams {
  
  @scala.inline
  def apply(): TextAreaParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaParams]
  }
  
  @scala.inline
  implicit class TextAreaParamsOps[Self <: TextAreaParams] (val x: Self) extends AnyVal {
    
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
    def setVerticalNavigation(value: editor | table | hybrid): Self = this.set("verticalNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalNavigation: Self = this.set("verticalNavigation", js.undefined)
  }
}
