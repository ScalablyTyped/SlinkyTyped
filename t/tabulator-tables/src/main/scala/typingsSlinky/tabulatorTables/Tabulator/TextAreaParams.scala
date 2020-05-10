package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.editor
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.hybrid
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withVerticalNavigation(value: editor | table | hybrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNavigation")(js.undefined)
        ret
    }
  }
  
}

